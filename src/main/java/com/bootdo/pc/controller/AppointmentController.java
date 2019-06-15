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

import com.bootdo.pc.domain.AppointmentDO;
import com.bootdo.pc.service.AppointmentService;
import com.bootdo.common.utils.PageUtils;
import com.bootdo.common.utils.Query;
import com.bootdo.common.utils.R;

/**
 * 
 * 
 * @author huyuangui
 * @email 648046866@qq.com
 * @date 2018-08-16 11:52:50
 */
 
@Controller
@RequestMapping("/pc/appointment")
public class AppointmentController {
	@Autowired
	private AppointmentService appointmentService;
	
	@GetMapping()
	@RequiresPermissions("pc:appointment:appointment")
	String Appointment(){
	    return "pc/appointment/appointment";
	}
	
	@ResponseBody
	@GetMapping("/list")
	@RequiresPermissions("pc:appointment:appointment")
	public PageUtils list(@RequestParam Map<String, Object> params){
		//查询列表数据
        Query query = new Query(params);
		query.put("sort","id");
		query.put("order","desc");
		List<AppointmentDO> appointmentList = appointmentService.list(query);
		int total = appointmentService.count(query);
		PageUtils pageUtils = new PageUtils(appointmentList, total);
		return pageUtils;
	}
	
	@GetMapping("/add")
	@RequiresPermissions("pc:appointment:add")
	String add(){
	    return "pc/appointment/add";
	}

	@GetMapping("/edit/{id}")
	@RequiresPermissions("pc:appointment:edit")
	String edit(@PathVariable("id") Integer id,Model model){
		AppointmentDO appointment = appointmentService.get(id);
		model.addAttribute("appointment", appointment);
	    return "pc/appointment/edit";
	}
	
	/**
	 * 保存
	 */
	@ResponseBody
	@PostMapping("/save")
	@RequiresPermissions("pc:appointment:add")
	public R save( AppointmentDO appointment){
		if(appointmentService.save(appointment)>0){
			return R.ok();
		}
		return R.error();
	}
	/**
	 * 修改
	 */
	@ResponseBody
	@RequestMapping("/update")
	@RequiresPermissions("pc:appointment:edit")
	public R update( AppointmentDO appointment){
		appointmentService.update(appointment);
		return R.ok();
	}
	
	/**
	 * 删除
	 */
	@PostMapping( "/remove")
	@ResponseBody
	@RequiresPermissions("pc:appointment:remove")
	public R remove( Integer id){
		if(appointmentService.remove(id)>0){
		return R.ok();
		}
		return R.error();
	}
	
	/**
	 * 删除
	 */
	@PostMapping( "/batchRemove")
	@ResponseBody
	@RequiresPermissions("pc:appointment:batchRemove")
	public R remove(@RequestParam("ids[]") Integer[] ids){
		appointmentService.batchRemove(ids);
		return R.ok();
	}
	
}
