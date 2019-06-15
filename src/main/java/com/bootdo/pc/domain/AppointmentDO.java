package com.bootdo.pc.domain;

import java.io.Serializable;
import java.util.Date;



/**
 * 
 * 
 * @author huyuangui
 * @email 648046866@qq.com
 * @date 2018-08-16 11:52:50
 */
public class AppointmentDO implements Serializable {
	private static final long serialVersionUID = 1L;
	
	//
	private Integer id;
	//宝宝名字
	private String babyName;
	//宝贝年龄
	private Integer babyAge;
	//联系手机
	private String tel;
	//微信号
	private String wxNum;
	//渠道
	private String fromChannel;
	//状态0未联系1意向客户2确定客户4犹豫客户5未知del删除
	private String appointStatus;
	//
	private Date createtime;
	//
	private String createby;
	//
	private Date updatetime;
	//
	private String updateby;

	/**
	 * 设置：
	 */
	public void setId(Integer id) {
		this.id = id;
	}
	/**
	 * 获取：
	 */
	public Integer getId() {
		return id;
	}
	/**
	 * 设置：宝宝名字
	 */
	public void setBabyName(String babyName) {
		this.babyName = babyName;
	}
	/**
	 * 获取：宝宝名字
	 */
	public String getBabyName() {
		return babyName;
	}
	/**
	 * 设置：宝贝年龄
	 */
	public void setBabyAge(Integer babyAge) {
		this.babyAge = babyAge;
	}
	/**
	 * 获取：宝贝年龄
	 */
	public Integer getBabyAge() {
		return babyAge;
	}
	/**
	 * 设置：联系手机
	 */
	public void setTel(String tel) {
		this.tel = tel;
	}
	/**
	 * 获取：联系手机
	 */
	public String getTel() {
		return tel;
	}
	/**
	 * 设置：微信号
	 */
	public void setWxNum(String wxNum) {
		this.wxNum = wxNum;
	}
	/**
	 * 获取：微信号
	 */
	public String getWxNum() {
		return wxNum;
	}
	/**
	 * 设置：渠道
	 */
	public void setFromChannel(String fromChannel) {
		this.fromChannel = fromChannel;
	}
	/**
	 * 获取：渠道
	 */
	public String getFromChannel() {
		return fromChannel;
	}
	/**
	 * 设置：
	 */
	public void setCreatetime(Date createtime) {
		this.createtime = createtime;
	}
	/**
	 * 获取：
	 */
	public Date getCreatetime() {
		return createtime;
	}
	/**
	 * 设置：
	 */
	public void setCreateby(String createby) {
		this.createby = createby;
	}
	/**
	 * 获取：
	 */
	public String getCreateby() {
		return createby;
	}
	/**
	 * 设置：
	 */
	public void setUpdatetime(Date updatetime) {
		this.updatetime = updatetime;
	}
	/**
	 * 获取：
	 */
	public Date getUpdatetime() {
		return updatetime;
	}
	/**
	 * 设置：
	 */
	public void setUpdateby(String updateby) {
		this.updateby = updateby;
	}
	/**
	 * 获取：
	 */
	public String getUpdateby() {
		return updateby;
	}

	public String getAppointStatus() {
		return appointStatus;
	}

	public void setAppointStatus(String appointStatus) {
		this.appointStatus = appointStatus;
	}
}
