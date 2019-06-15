package com.bootdo.pc.controller;

import java.util.List;
import java.util.Map;

import com.bootdo.pc.domain.InvestmentDO;
import com.bootdo.pc.service.InvestmentService;
import org.apache.shiro.authz.annotation.RequiresPermissions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.bootdo.common.utils.PageUtils;
import com.bootdo.common.utils.Query;
import com.bootdo.common.utils.R;

/**
 * 
 * 
 * @author huyuangui
 * @email 648046866@qq.com
 * @date 2018-08-31 21:01:24
 */
 
@Controller
@RequestMapping("/pc/investmentAdmin")
public class InvestmentAdminController {
	@Autowired
	private InvestmentService investmentService;
	
	@GetMapping()
	@RequiresPermissions("pc:investment:investment")
	String Investment(){
	    return "pc/investment/investment";
	}
	
	@ResponseBody
	@GetMapping("/list")
	@RequiresPermissions("pc:investment:investment")
	public PageUtils list(@RequestParam Map<String, Object> params){
		//查询列表数据
        Query query = new Query(params);
		List<InvestmentDO> investmentList = investmentService.list(query);
		int total = investmentService.count(query);
		PageUtils pageUtils = new PageUtils(investmentList, total);
		return pageUtils;
	}
	
	@GetMapping("/add")
	@RequiresPermissions("pc:investment:add")
	String add(){
	    return "pc/investment/add";
	}

	@GetMapping("/edit/{id}")
	@RequiresPermissions("pc:investment:edit")
	String edit(@PathVariable("id") Integer id,Model model){
		InvestmentDO investment = investmentService.get(id);
		model.addAttribute("investment", investment);
	    return "pc/investment/edit";
	}
	
	/**
	 * 保存
	 */
	@ResponseBody
	@PostMapping("/save")
	@RequiresPermissions("pc:investment:add")
	public R save( InvestmentDO investment){
		if(investmentService.save(investment)>0){
			return R.ok();
		}
		return R.error();
	}
	/**
	 * 修改
	 */
	@ResponseBody
	@RequestMapping("/update")
	@RequiresPermissions("pc:investment:edit")
	public R update( InvestmentDO investment){
		investmentService.update(investment);
		return R.ok();
	}
	
	/**
	 * 删除
	 */
	@PostMapping( "/remove")
	@ResponseBody
	@RequiresPermissions("pc:investment:remove")
	public R remove( Integer id){
		InvestmentDO investment=investmentService.get(id);
		investment.setStatus("1");
		if(investmentService.update(investment)>0){
		return R.ok();
		}
		return R.error();
	}
	
	/**
	 * 删除
	 */
	@PostMapping( "/batchRemove")
	@ResponseBody
	@RequiresPermissions("pc:investment:batchRemove")
	public R remove(@RequestParam("ids[]") Integer[] ids){
		investmentService.batchRemove(ids);
		return R.ok();
	}
	
}
