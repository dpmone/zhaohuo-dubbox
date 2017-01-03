package com.zhaohuo_dubbox.zhaohuo_server.service.impl;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.alibaba.dubbo.common.json.JSON;
import com.alibaba.dubbo.config.annotation.Service;
import com.zhaohuo_dubbox.zhaohuo_api.contract.UserService;
import com.zhaohuo_dubbox.zhaohuo_entity.UserEntity;

@Service
public class UserServiceImpl implements UserService {
	private static final Logger logger = LoggerFactory.getLogger(UserServiceImpl.class);

	public List<UserEntity> getUsers() {
		logger.info("开始查询所有用户信息");

		List<UserEntity> listUser = new ArrayList<UserEntity>();
		UserEntity user1 = new UserEntity();
		UserEntity user2 = new UserEntity();
		user1.setId(111l);
		user1.setPwd("1212");
		user1.setUserName("哈哈");

		user2.setId(111l);
		user2.setPwd("1212");
		user2.setUserName("哈哈");

		listUser.add(user1);
		listUser.add(user2);
		try {
			logger.info("查询结果：" + JSON.json(listUser));
		} catch (IOException e) {
			e.printStackTrace();
		}
		logger.info("查询结束");
		return listUser;
	}

	public UserEntity getUserById(long id) {
		UserEntity user = new UserEntity();
		user.setId(111l);
		user.setPwd("1212");
		user.setUserName("哈哈");
		logger.info("开始查询用户信息，查询条件ID为:" + id);
		logger.info("查询结果：" + user.toString());
		return user;
	}

}
