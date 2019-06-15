package com.bootdo.pc.dao;

import com.bootdo.pc.domain.GwDO;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Mapper;

/**
 * 
 * @author huyuangui
 * @email 1992lcg@163.com
 * @date 2018-08-11 10:33:49
 */
@Mapper
public interface GwDao {

	GwDO get(Integer id);

	List<GwDO> list(Map<String, Object> map);
	
	int count(Map<String, Object> map);
	
	int save(GwDO gw);
	
	int update(GwDO gw);
	
	int remove(Integer id);
	
	int batchRemove(Integer[] ids);

    List<GwDO> listDistinct(Map<String, Object> map);
}
