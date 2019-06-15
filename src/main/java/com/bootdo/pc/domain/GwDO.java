package com.bootdo.pc.domain;

import java.io.Serializable;
import java.util.Date;

/**
 * 
 * 
 * @author huyuangui
 * @email 1992lcg@163.com
 * @date 2018-08-11 10:33:49
 */
public class GwDO implements Serializable {
	private static final long serialVersionUID = 1L;
	
	//
	private Integer id;
	//
	private Integer gwCount;

	private Integer pcPageId;
	private String seoKeywords;
	private String seoDescription;
	//是否在首页展示1展示 0不展示
	private String gwHomePageShow;
	//官网类型
	private String gwType;
	//按序号排序
	private String gwSerialNum;
	//标题
	private String gwTitle;
	//副标题
	private String gwSubtitle;
	//简介
	private String gwMem;
	//内容
	private String gwContext;
	//
	private String gwImg1;
	//
	private String gwImg2;
	//
	private String gwImg3;
	//
	private String gwImg4;
	//
	private String gwImg5;
	//
	private String gwImg6;
	//
	private String gwImg7;
	//事件发生开始时间
	private Date gwChangeStartTime;
	//事件发生结束时间
	private Date gwChangeEndTime;
	//排序
	private Integer gwSort;

	private String gwStatus;
	//
	private Date createtime;
	//
	private String createby;
	//
	private Date updatetime;
	//
	private String updateby;

	private String author;
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
	 * 设置：
	 */
	public void setPcPageId(Integer pcPageId) {
		this.pcPageId = pcPageId;
	}
	/**
	 * 获取：
	 */
	public Integer getPcPageId() {
		return pcPageId;
	}
	/**
	 * 设置：是否在首页展示1展示 0不展示
	 */
	public void setGwHomePageShow(String gwHomePageShow) {
		this.gwHomePageShow = gwHomePageShow;
	}
	/**
	 * 获取：是否在首页展示1展示 0不展示
	 */
	public String getGwHomePageShow() {
		return gwHomePageShow;
	}
	/**
	 * 设置：官网类型
	 */
	public void setGwType(String gwType) {
		this.gwType = gwType;
	}
	/**
	 * 获取：官网类型
	 */
	public String getGwType() {
		return gwType;
	}
	/**
	 * 设置：按序号排序
	 */
	public void setGwSerialNum(String gwSerialNum) {
		this.gwSerialNum = gwSerialNum;
	}
	/**
	 * 获取：按序号排序
	 */
	public String getGwSerialNum() {
		return gwSerialNum;
	}
	/**
	 * 设置：标题
	 */
	public void setGwTitle(String gwTitle) {
		this.gwTitle = gwTitle;
	}
	/**
	 * 获取：标题
	 */
	public String getGwTitle() {
		return gwTitle;
	}
	/**
	 * 设置：副标题
	 */
	public void setGwSubtitle(String gwSubtitle) {
		this.gwSubtitle = gwSubtitle;
	}
	/**
	 * 获取：副标题
	 */
	public String getGwSubtitle() {
		return gwSubtitle;
	}
	/**
	 * 设置：简介
	 */
	public void setGwMem(String gwMem) {
		this.gwMem = gwMem;
	}
	/**
	 * 获取：简介
	 */
	public String getGwMem() {
		return gwMem;
	}
	/**
	 * 设置：内容
	 */
	public void setGwContext(String gwContext) {
		this.gwContext = gwContext;
	}
	/**
	 * 获取：内容
	 */
	public String getGwContext() {
		return gwContext;
	}
	/**
	 * 设置：
	 */
	public void setGwImg1(String gwImg1) {
		this.gwImg1 = gwImg1;
	}
	/**
	 * 获取：
	 */
	public String getGwImg1() {
		return gwImg1;
	}
	/**
	 * 设置：
	 */
	public void setGwImg2(String gwImg2) {
		this.gwImg2 = gwImg2;
	}
	/**
	 * 获取：
	 */
	public String getGwImg2() {
		return gwImg2;
	}
	/**
	 * 设置：
	 */
	public void setGwImg3(String gwImg3) {
		this.gwImg3 = gwImg3;
	}
	/**
	 * 获取：
	 */
	public String getGwImg3() {
		return gwImg3;
	}
	/**
	 * 设置：
	 */
	public void setGwImg4(String gwImg4) {
		this.gwImg4 = gwImg4;
	}
	/**
	 * 获取：
	 */
	public String getGwImg4() {
		return gwImg4;
	}
	/**
	 * 设置：事件发生开始时间
	 */
	public void setGwChangeStartTime(Date gwChangeStartTime) {
		this.gwChangeStartTime = gwChangeStartTime;
	}
	/**
	 * 获取：事件发生开始时间
	 */
	public Date getGwChangeStartTime() {
		return gwChangeStartTime;
	}
	/**
	 * 设置：事件发生结束时间
	 */
	public void setGwChangeEndTime(Date gwChangeEndTime) {
		this.gwChangeEndTime = gwChangeEndTime;
	}
	/**
	 * 获取：事件发生结束时间
	 */
	public Date getGwChangeEndTime() {
		return gwChangeEndTime;
	}
	/**
	 * 设置：排序
	 */
	public void setGwSort(Integer gwSort) {
		this.gwSort = gwSort;
	}
	/**
	 * 获取：排序
	 */
	public Integer getGwSort() {
		return gwSort;
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

	public String getGwStatus() {
		return gwStatus;
	}

	public void setGwStatus(String gwStatus) {
		this.gwStatus = gwStatus;
	}

	public String getSeoDescription() {
		return seoDescription;
	}

	public void setSeoDescription(String seoDescription) {
		this.seoDescription = seoDescription;
	}

	public String getSeoKeywords() {
		return seoKeywords;
	}

	public void setSeoKeywords(String seoKeywords) {
		this.seoKeywords = seoKeywords;
	}

	public Integer getGwCount() {
		return gwCount;
	}

	public void setGwCount(Integer gwCount) {
		this.gwCount = gwCount;
	}

	public String getGwImg5() {
		return gwImg5;
	}

	public void setGwImg5(String gwImg5) {
		this.gwImg5 = gwImg5;
	}

	public String getGwImg6() {
		return gwImg6;
	}

	public void setGwImg6(String gwImg6) {
		this.gwImg6 = gwImg6;
	}

	public String getGwImg7() {
		return gwImg7;
	}

	public void setGwImg7(String gwImg7) {
		this.gwImg7 = gwImg7;
	}

	@Override
	public String toString() {
		return "GwDO{" +
				"id=" + id +
				", gwCount=" + gwCount +
				", pcPageId=" + pcPageId +
				", seoKeywords='" + seoKeywords + '\'' +
				", seoDescription='" + seoDescription + '\'' +
				", gwHomePageShow='" + gwHomePageShow + '\'' +
				", gwType='" + gwType + '\'' +
				", gwSerialNum='" + gwSerialNum + '\'' +
				", gwTitle='" + gwTitle + '\'' +
				", gwSubtitle='" + gwSubtitle + '\'' +
				", gwMem='" + gwMem + '\'' +
				", gwContext='" + gwContext + '\'' +
				", gwImg1='" + gwImg1 + '\'' +
				", gwImg2='" + gwImg2 + '\'' +
				", gwImg3='" + gwImg3 + '\'' +
				", gwImg4='" + gwImg4 + '\'' +
				", gwImg5='" + gwImg5 + '\'' +
				", gwImg6='" + gwImg6 + '\'' +
				", gwImg7='" + gwImg7 + '\'' +
				", gwChangeStartTime=" + gwChangeStartTime +
				", gwChangeEndTime=" + gwChangeEndTime +
				", gwSort=" + gwSort +
				", gwStatus='" + gwStatus + '\'' +
				", createtime=" + createtime +
				", createby='" + createby + '\'' +
				", updatetime=" + updatetime +
				", updateby='" + updateby + '\'' +
				'}';
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}
}
