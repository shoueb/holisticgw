package com.bootdo.pc.service;

import com.bootdo.pc.domain.GwDO;

import java.util.List;
import java.util.Map;

/**
 * 
 * 
 * @author huyuangui
 * @email 1992lcg@163.com
 * @date 2018-08-11 10:33:49
 */
public interface GwService {
	
	GwDO get(Integer id);
	
	List<GwDO> list(Map<String, Object> map);


	List<GwDO> listDistinct(Map<String, Object> map);

	int count(Map<String, Object> map);
	
	int save(GwDO gw);
	
	int update(GwDO gw);
	
	int remove(Integer id);
	
	int batchRemove(Integer[] ids);
}
