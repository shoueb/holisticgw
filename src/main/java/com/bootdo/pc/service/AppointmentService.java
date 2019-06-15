package com.bootdo.pc.service;

import com.bootdo.pc.domain.AppointmentDO;

import java.util.List;
import java.util.Map;

/**
 * 
 * 
 * @author huyuangui
 * @email 648046866@qq.com
 * @date 2018-08-16 11:52:50
 */
public interface AppointmentService {
	
	AppointmentDO get(Integer id);
	
	List<AppointmentDO> list(Map<String, Object> map);
	
	int count(Map<String, Object> map);
	
	int save(AppointmentDO appointment);
	
	int update(AppointmentDO appointment);
	
	int remove(Integer id);
	
	int batchRemove(Integer[] ids);
}
