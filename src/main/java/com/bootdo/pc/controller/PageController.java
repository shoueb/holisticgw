package com.bootdo.pc.controller;

import java.util.List;
import java.util.Map;

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

import com.bootdo.pc.domain.PageDO;
import com.bootdo.pc.service.PageService;
import com.bootdo.common.utils.PageUtils;
import com.bootdo.common.utils.Query;
import com.bootdo.common.utils.R;

/**
 * 
 * 
 * @author huyuangui
 * @email 648046866@qq.com
 * @date 2018-08-11 16:35:59
 */
 
@Controller
@RequestMapping("/pc/page")
public class PageController {
	@Autowired
	private PageService pageService;
	
	@GetMapping()
	@RequiresPermissions("pc:page:page")
	String Page(){
	    return "pc/page/page";
	}

	@ResponseBody
	@PostMapping("/list")
	@RequiresPermissions("pc:page:page")
	public PageUtils list(@RequestBody Map<String, Object> params){
		//查询列表数据
        Query query = new Query(params);
		List<PageDO> pageList = pageService.list(query);
		int total = pageService.count(query);
		PageUtils pageUtils = new PageUtils(pageList, total);
		return pageUtils;
	}
	
	@GetMapping("/add")
	@RequiresPermissions("pc:page:add")
	String add(){
	    return "pc/page/add";
	}

	@GetMapping("/edit/{id}")
	@RequiresPermissions("pc:page:edit")
	String edit(@PathVariable("id") Integer id,Model model){
		PageDO page = pageService.get(id);
		model.addAttribute("page", page);
	    return "pc/page/edit";
	}
	
	/**
	 * 保存
	 */
	@ResponseBody
	@PostMapping("/save")
	@RequiresPermissions("pc:page:add")
	public R save( PageDO page){
		if(pageService.save(page)>0){
			return R.ok();
		}
		return R.error();
	}
	/**
	 * 修改
	 */
	@ResponseBody
	@RequestMapping("/update")
	@RequiresPermissions("pc:page:edit")
	public R update( PageDO page){
		pageService.update(page);
		return R.ok();
	}
	
	/**
	 * 删除
	 */
	@PostMapping( "/remove")
	@ResponseBody
	@RequiresPermissions("pc:page:remove")
	public R remove( Integer id){
		if(pageService.remove(id)>0){
		return R.ok();
		}
		return R.error();
	}
	
	/**
	 * 删除
	 */
	@PostMapping( "/batchRemove")
	@ResponseBody
	@RequiresPermissions("pc:page:batchRemove")
	public R remove(@RequestParam("ids[]") Integer[] ids){
		pageService.batchRemove(ids);
		return R.ok();
	}
	
}
