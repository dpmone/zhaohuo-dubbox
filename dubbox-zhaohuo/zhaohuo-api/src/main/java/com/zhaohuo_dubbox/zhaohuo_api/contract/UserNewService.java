package com.zhaohuo_dubbox.zhaohuo_api.contract;

import java.util.List;

import com.zhaohuo_dubbox.model.User;

public interface UserNewService {
	   int deleteByPrimaryKey(Integer id);  
	   
	    long insert(User u);  
	  
	    long insertSelective(User u);  
	  
	    User selectById(long id);  
	  
	    int update(User u);  
 	      
	    //自定义  
	    List<User> getUsers(); 
}
