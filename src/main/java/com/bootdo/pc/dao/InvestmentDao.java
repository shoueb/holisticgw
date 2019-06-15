package com.bootdo.pc.dao;


import java.util.List;
import java.util.Map;

import com.bootdo.pc.domain.InvestmentDO;
import org.apache.ibatis.annotations.Mapper;

/**
 * 
 * @author huyuangui
 * @email 648046866@qq.com
 * @date 2018-08-31 21:01:24
 */
@Mapper
public interface InvestmentDao {

	InvestmentDO get(Integer id);
	
	List<InvestmentDO> list(Map<String, Object> map);
	
	int count(Map<String, Object> map);
	
	int save(InvestmentDO investment);
	
	int update(InvestmentDO investment);
	
	int remove(Integer id);
	
	int batchRemove(Integer[] ids);
}
