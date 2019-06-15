package com.bootdo.pc.dao;

import com.bootdo.pc.domain.AppointmentDO;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Mapper;

/**
 * 
 * @author huyuangui
 * @email 648046866@qq.com
 * @date 2018-08-16 11:52:50
 */
@Mapper
public interface AppointmentDao {

	AppointmentDO get(Integer id);
	
	List<AppointmentDO> list(Map<String, Object> map);
	
	int count(Map<String, Object> map);
	
	int save(AppointmentDO appointment);
	
	int update(AppointmentDO appointment);
	
	int remove(Integer id);
	
	int batchRemove(Integer[] ids);
}
