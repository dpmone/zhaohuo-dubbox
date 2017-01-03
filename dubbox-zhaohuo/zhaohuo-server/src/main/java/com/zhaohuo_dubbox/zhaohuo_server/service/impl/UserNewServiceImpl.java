package com.zhaohuo_dubbox.zhaohuo_server.service.impl;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;

import com.alibaba.dubbo.config.annotation.Service;
import com.zhaohuo_dubbox.model.User;
import com.zhaohuo_dubbox.zhaohuo_api.contract.UserNewService;
import com.zhaohuo_dubbox.zhaohuo_server.dao.UserMapper;
import com.zhaohuo_dubbox.zhaohuo_server.utils.IDHelper;

@Service
public class UserNewServiceImpl implements UserNewService {
	private static final Logger logger = LoggerFactory.getLogger(UserNewServiceImpl.class);

	@Autowired
	private UserMapper userMapper;

	public int deleteByPrimaryKey(Integer id) {
		// TODO Auto-generated method stub
		return 0;
	}

	public long insert(User u) {
		
		long id =u.getId();
		if(id==0l){
			try {
				id=IDHelper.getUniqueID();
				u.setId(id);
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		 return userMapper.insert(u);  
	}

	public long insertSelective(User u) {
		long id =u.getId();
		if(id==0l){
			try {
				id=IDHelper.getUniqueID();
				u.setId(id);
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
        return userMapper.insertSelective(u);  
	}

	public User selectById(long id) {
		// TODO Auto-generated method stub
		 return userMapper.selectByPrimaryKey(id);  
	 }

	public int update(User u) {
		// TODO Auto-generated method stub
        return userMapper.updateByPrimaryKeySelective(u);  
	}

	public List<User> getUsers() {
		logger.info("开始查询所有用户信息");  
        
        logger.info("查询结束");  
        return userMapper.selectAll();  
	}

}
