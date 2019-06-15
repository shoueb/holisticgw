package com.bootdo.pc.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

import com.bootdo.pc.dao.PageDao;
import com.bootdo.pc.domain.PageDO;
import com.bootdo.pc.service.PageService;



@Service
public class PageServiceImpl implements PageService {
	@Autowired
	private PageDao pageDao;
	
	@Override
	public PageDO get(Integer id){
		return pageDao.get(id);
	}

	@Override
	public PageDO getByPageType(String pageType){
		return pageDao.getByPageType(pageType);
	}

	@Override
	public List<PageDO> list(Map<String, Object> map){
		return pageDao.list(map);
	}
	
	@Override
	public int count(Map<String, Object> map){
		return pageDao.count(map);
	}
	
	@Override
	public int save(PageDO page){
		return pageDao.save(page);
	}
	
	@Override
	public int update(PageDO page){
		return pageDao.update(page);
	}
	
	@Override
	public int remove(Integer id){
		return pageDao.remove(id);
	}
	
	@Override
	public int batchRemove(Integer[] ids){
		return pageDao.batchRemove(ids);
	}
	
}
