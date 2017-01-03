package com.zhaohuo_dubbox.zhaohuo_entity;

import java.io.Serializable;

public class UserEntity implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 5689614819466798025L;
	private long id;
	private String userName;
	private String pwd;
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getPwd() {
		return pwd;
	}
	public void setPwd(String pwd) {
		this.pwd = pwd;
	}
	
	
	
}
