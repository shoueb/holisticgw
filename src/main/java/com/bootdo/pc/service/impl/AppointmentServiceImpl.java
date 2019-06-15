package com.bootdo.pc.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

import com.bootdo.pc.dao.AppointmentDao;
import com.bootdo.pc.domain.AppointmentDO;
import com.bootdo.pc.service.AppointmentService;



@Service
public class AppointmentServiceImpl implements AppointmentService {
	@Autowired
	private AppointmentDao appointmentDao;
	
	@Override
	public AppointmentDO get(Integer id){
		return appointmentDao.get(id);
	}
	
	@Override
	public List<AppointmentDO> list(Map<String, Object> map){
		return appointmentDao.list(map);
	}
	
	@Override
	public int count(Map<String, Object> map){
		return appointmentDao.count(map);
	}
	
	@Override
	public int save(AppointmentDO appointment){
		return appointmentDao.save(appointment);
	}
	
	@Override
	public int update(AppointmentDO appointment){
		return appointmentDao.update(appointment);
	}
	
	@Override
	public int remove(Integer id){
		return appointmentDao.remove(id);
	}
	
	@Override
	public int batchRemove(Integer[] ids){
		return appointmentDao.batchRemove(ids);
	}
	
}
