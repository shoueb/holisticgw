package com.bootdo.pc.controller;

import java.util.Date;
import java.util.List;
import java.util.Map;

import com.bootdo.common.utils.ShiroUtils;
import com.bootdo.pc.domain.PageDO;
import com.bootdo.pc.service.PageService;
import org.apache.commons.collections.map.HashedMap;
import org.apache.shiro.authz.annotation.RequiresPermissions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.bootdo.pc.domain.GwDO;
import com.bootdo.pc.service.GwService;
import com.bootdo.common.utils.PageUtils;
import com.bootdo.common.utils.Query;
import com.bootdo.common.utils.R;

import javax.servlet.http.HttpServletRequest;

/**
 * 
 * 
 * @author huyuangui
 * @email 1992lcg@163.com
 * @date 2018-08-11 10:33:49
 */
 
@Controller
@RequestMapping("/pc/gw")
public class GwController {
	@Autowired
	private GwService gwService;
	@Autowired
	private PageService pageService;


	@Autowired
	private HttpServletRequest request;
	@GetMapping()
	@RequiresPermissions("pc:gw:gw")
	String Gw(){
	    request.setAttribute("page",request.getParameter("page"));
		PageDO pageDO= pageService.getByPageType(request.getParameter("page"));
		Map<String, Object> params1 =new HashedMap();
		params1.put("pcPageId",pageDO.getId());
		params1.put("gwStatus","1");
		List  typeList= gwService.listDistinct(params1);
		request.setAttribute("typeList",typeList);
		return "pc/gw/gw";
	}
	
	@ResponseBody
	@PostMapping("/list")
	@RequiresPermissions("pc:gw:gw")
	public PageUtils list(@RequestBody Map<String, Object> params){

		PageDO pageDO= pageService.getByPageType(params.get("pageType").toString());


		//查询列表数据
		Query query = new Query(params);
		query.put("pcPageId",pageDO.getId());
		query.put("sort","gw_sort");
		query.put("order","asc");
		query.put("gwStatus","1");
		List<GwDO> gwList = gwService.list(query);
		int total = gwService.count(query);
		PageUtils pageUtils = new PageUtils(gwList, total);
		return pageUtils;
	}
	
	@GetMapping("/add")
	@RequiresPermissions("pc:gw:add")
	String add(){
		PageDO pageDO= pageService.getByPageType(request.getParameter("pageType").toString());
		request.setAttribute("pcPageId",pageDO.getId());
		request.setAttribute("page",pageDO);
		Map<String, Object> params =new HashedMap();
		params.put("pcPageId",pageDO.getId());
		params.put("gwStatus","1");
		List  typeList= gwService.listDistinct(params);
		request.setAttribute("typeList",typeList);
	    return "pc/gw/add";
	}

	@GetMapping("/edit/{id}")
	@RequiresPermissions("pc:gw:edit")
	String edit(@PathVariable("id") Integer id,Model model){
		GwDO gw = gwService.get(id);
		model.addAttribute("gw", gw);

		request.setAttribute("pcPageId",gw.getPcPageId());
		Map<String, Object> params =new HashedMap();
		params.put("pcPageId",gw.getPcPageId());
		params.put("gwStatus","1");
		List  typeList= gwService.listDistinct(params);
		request.setAttribute("typeList",typeList);

	    return "pc/gw/edit";
	}
	
	/**
	 * 保存
	 */
	@ResponseBody
	@PostMapping("/save")
	@RequiresPermissions("pc:gw:add")
	public R save( GwDO gw){
		if(gw.getId()==null){
			gw.setCreateby(ShiroUtils.getUser().getName());
			gw.setCreatetime(new Date());
			gw.setUpdateby(ShiroUtils.getUser().getName());
			gw.setUpdatetime(new Date());
		}else{
			gw.setUpdateby(ShiroUtils.getUser().getName());
			gw.setUpdatetime(new Date());
		}
		if(gwService.save(gw)>0){
			return R.ok();
		}
		return R.error();
	}
	/**
	 * 修改
	 */
	@ResponseBody
	@RequestMapping("/update")
	@RequiresPermissions("pc:gw:edit")
	public R update( GwDO gw){
		gw.setUpdateby(ShiroUtils.getUser().getName());
		gw.setUpdatetime(new Date());
		gwService.update(gw);
		return R.ok();
	}
	
	/**
	 * 删除
	 */
	@PostMapping( "/remove")
	@ResponseBody
	@RequiresPermissions("pc:gw:remove")
	public R remove( Integer id){
		if(gwService.remove(id)>0){
		return R.ok();
		}
		return R.error();
	}
	
	/**
	 * 删除
	 */
	@PostMapping( "/batchRemove")
	@ResponseBody
	@RequiresPermissions("pc:gw:batchRemove")
	public R remove(@RequestParam("ids[]") Integer[] ids){
		gwService.batchRemove(ids);
		return R.ok();
	}
	
}
