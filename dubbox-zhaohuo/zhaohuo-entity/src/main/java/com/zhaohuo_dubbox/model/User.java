package com.zhaohuo_dubbox.model;

import java.io.Serializable;

public class User  implements Serializable{
    /**
	 * 
	 */
	private static final long serialVersionUID = -4637326662152017547L;

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
        this.userName = userName == null ? null : userName.trim();
    }

    public String getPwd() {
        return pwd;
    }

    public void setPwd(String pwd) {
        this.pwd = pwd == null ? null : pwd.trim();
    }
}