package com.zhaohuo_dubbox.model;

import java.io.Serializable;

public class Comment  implements Serializable {
    /**
	 * 
	 */
	private static final long serialVersionUID = 3500246268315024797L;

	private long id;

    private String content;

    private Integer state;

   

    public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content == null ? null : content.trim();
    }

    public Integer getState() {
        return state;
    }

    public void setState(Integer state) {
        this.state = state;
    }
}