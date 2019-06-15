package com.bootdo.pc.domain;

import java.io.Serializable;
import java.util.Date;



/**
 * 
 * 
 * @author huyuangui
 * @email 648046866@qq.com
 * @date 2018-08-11 16:35:59
 */
public class PageDO implements Serializable {
	private static final long serialVersionUID = 1L;
	
	//
	private Integer id;
	//页面类型index 、about、coreTech、techSystem、news、investment 、taiwan
	private String pageType;
	//标题
	private String title;
	//副标题
	private String pcSubtitle;
	//seo关键字
	private String seoKeywords;
	//seo描述
	private String seoDescription;
	//页面内容
	private String pageContext;
	//页面背景
	private String pageGbPic;
	//状态0正常1冻结
	private String status;
	//创建时间
	private Date createtime;
	//创建人
	private String createby;
	//修改时间
	private Date updatetime;
	//修改人
	private String updateby;

	public PageDO() {
	}

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
	 * 设置：页面类型index 、about、coreTech、techSystem、news、investment 、taiwan
	 */
	public void setPageType(String pageType) {
		this.pageType = pageType;
	}
	/**
	 * 获取：页面类型index 、about、coreTech、techSystem、news、investment 、taiwan
	 */
	public String getPageType() {
		return pageType;
	}
	/**
	 * 设置：标题
	 */
	public void setTitle(String title) {
		this.title = title;
	}
	/**
	 * 获取：标题
	 */
	public String getTitle() {
		return title;
	}
	/**
	 * 设置：seo关键字
	 */
	public void setSeoKeywords(String seoKeywords) {
		this.seoKeywords = seoKeywords;
	}
	/**
	 * 获取：seo关键字
	 */
	public String getSeoKeywords() {
		return seoKeywords;
	}
	/**
	 * 设置：seo描述
	 */
	public void setSeoDescription(String seoDescription) {
		this.seoDescription = seoDescription;
	}
	/**
	 * 获取：seo描述
	 */
	public String getSeoDescription() {
		return seoDescription;
	}
	/**
	 * 设置：页面内容
	 */
	public void setPageContext(String pageContext) {
		this.pageContext = pageContext;
	}
	/**
	 * 获取：页面内容
	 */
	public String getPageContext() {
		return pageContext;
	}
	/**
	 * 设置：页面背景
	 */
	public void setPageGbPic(String pageGbPic) {
		this.pageGbPic = pageGbPic;
	}
	/**
	 * 获取：页面背景
	 */
	public String getPageGbPic() {
		return pageGbPic;
	}
	/**
	 * 设置：状态0正常1冻结
	 */
	public void setStatus(String status) {
		this.status = status;
	}
	/**
	 * 获取：状态0正常1冻结
	 */
	public String getStatus() {
		return status;
	}
	/**
	 * 设置：创建时间
	 */
	public void setCreatetime(Date createtime) {
		this.createtime = createtime;
	}
	/**
	 * 获取：创建时间
	 */
	public Date getCreatetime() {
		return createtime;
	}
	/**
	 * 设置：创建人
	 */
	public void setCreateby(String createby) {
		this.createby = createby;
	}
	/**
	 * 获取：创建人
	 */
	public String getCreateby() {
		return createby;
	}
	/**
	 * 设置：修改时间
	 */
	public void setUpdatetime(Date updatetime) {
		this.updatetime = updatetime;
	}
	/**
	 * 获取：修改时间
	 */
	public Date getUpdatetime() {
		return updatetime;
	}
	/**
	 * 设置：修改人
	 */
	public void setUpdateby(String updateby) {
		this.updateby = updateby;
	}
	/**
	 * 获取：修改人
	 */
	public String getUpdateby() {
		return updateby;
	}

	public String getPcSubtitle() {
		return pcSubtitle;
	}

	public void setPcSubtitle(String pcSubtitle) {
		this.pcSubtitle = pcSubtitle;
	}
}
