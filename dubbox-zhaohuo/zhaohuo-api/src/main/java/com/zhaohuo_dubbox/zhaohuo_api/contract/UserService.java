package com.zhaohuo_dubbox.zhaohuo_api.contract;

import java.util.List;

import com.zhaohuo_dubbox.zhaohuo_entity.UserEntity;

public interface UserService {
	
	List<UserEntity> getUsers();  
	UserEntity getUserById (long id);  
	
}
