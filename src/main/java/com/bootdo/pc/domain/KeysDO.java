package com.bootdo.pc.domain;

import java.io.Serializable;
import java.util.Date;

/**
 * 
 * 
 * @author huyuangui
 * @date 2018-08-11 10:33:49
 */
public class KeysDO implements Serializable {
	private static final long serialVersionUID = 1L;
	
	private Integer id;
	private String keys;
	private String status;
	private Date createtime;
	private String createby;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getKeys() {
		return keys;
	}

	public void setKeys(String keys) {
		this.keys = keys;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public Date getCreatetime() {
		return createtime;
	}

	public void setCreatetime(Date createtime) {
		this.createtime = createtime;
	}

	public String getCreateby() {
		return createby;
	}

	public void setCreateby(String createby) {
		this.createby = createby;
	}
}
