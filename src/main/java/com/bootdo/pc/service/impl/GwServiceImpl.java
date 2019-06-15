package com.bootdo.pc.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

import com.bootdo.pc.dao.GwDao;
import com.bootdo.pc.domain.GwDO;
import com.bootdo.pc.service.GwService;



@Service
public class GwServiceImpl implements GwService {
	@Autowired
	private GwDao gwDao;
	
	@Override
	public GwDO get(Integer id){
		return gwDao.get(id);
	}
	
	@Override
	public List<GwDO> list(Map<String, Object> map){
		return gwDao.list(map);
	}

	@Override
	public List<GwDO> listDistinct(Map<String, Object> map) {
		return gwDao.listDistinct(map);
	}

	@Override
	public int count(Map<String, Object> map){
		return gwDao.count(map);
	}
	
	@Override
	public int save(GwDO gw){
		return gwDao.save(gw);
	}
	
	@Override
	public int update(GwDO gw){
		return gwDao.update(gw);
	}
	
	@Override
	public int remove(Integer id){
		return gwDao.remove(id);
	}
	
	@Override
	public int batchRemove(Integer[] ids){
		return gwDao.batchRemove(ids);
	}
	
}
