package com.zhaohuo.controller;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.alibaba.dubbo.config.annotation.Reference;
import com.zhaohuo.model.UserModel;
import com.zhaohuo_dubbox.model.User;
import com.zhaohuo_dubbox.zhaohuo_api.contract.UserNewService;
import com.zhaohuo_dubbox.zhaohuo_api.contract.UserService;
import com.zhaohuo_dubbox.zhaohuo_entity.UserEntity;

@Controller  
@RequestMapping("/user") 
public class UserController {
		
	 private static final Logger logger = LoggerFactory.getLogger(UserController.class);  
     

	    @Reference  
	    private UserService userService;  
	    @Reference  
	    private UserNewService userNewService;  
	
	    @RequestMapping("/")  
	    public String goIndex(){  
	        return "index";  
	    }  
	    
	    @RequestMapping("/list")  
	    @ResponseBody  
	    public List<UserEntity> getUsers(){  
	        return userService.getUsers();  
	    }  
	    
	    @RequestMapping("/add")  
	    @ResponseBody  
	    public long addUser(UserModel user ){  
	    	User u = new User();
	    	u.setPwd(user.getPassword());
	    	u.setUserName(user.getUsername());;
	    	return userNewService.insert(u);
 
	    }  
	    
	    
	    @RequestMapping("/find")  
	    @ResponseBody  
	    public User findUserById(){  
	    	
	        return userNewService.selectById(1234l);  
	    } 
	    
	    
	    
	    @RequestMapping("/findAll")  
	    @ResponseBody  
	    public List<User> findAll(){  
	    	
	        return userNewService.getUsers();  
	    } 
	    
	    
	    @RequestMapping("/one")  
	    @ResponseBody  
	    public UserEntity getUserById(){  
	    	
	        return userService.getUserById(11l);  
	    }  
}
