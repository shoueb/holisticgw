package com.bootdo.pc.service.impl;

import com.bootdo.pc.dao.InvestmentDao;
import com.bootdo.pc.domain.InvestmentDO;
import com.bootdo.pc.service.InvestmentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;




@Service
public class InvestmentServiceImpl implements InvestmentService {
	@Autowired
	private InvestmentDao investmentDao;
	
	@Override
	public InvestmentDO get(Integer id){
		return investmentDao.get(id);
	}
	
	@Override
	public List<InvestmentDO> list(Map<String, Object> map){
		return investmentDao.list(map);
	}
	
	@Override
	public int count(Map<String, Object> map){
		return investmentDao.count(map);
	}
	
	@Override
	public int save(InvestmentDO investment){
		return investmentDao.save(investment);
	}
	
	@Override
	public int update(InvestmentDO investment){
		return investmentDao.update(investment);
	}
	
	@Override
	public int remove(Integer id){
		return investmentDao.remove(id);
	}
	
	@Override
	public int batchRemove(Integer[] ids){
		return investmentDao.batchRemove(ids);
	}
	
}
