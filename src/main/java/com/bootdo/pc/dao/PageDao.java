package com.bootdo.pc.dao;

import com.bootdo.pc.domain.PageDO;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Mapper;

/**
 * 
 * @author huyuangui
 * @email 648046866@qq.com
 * @date 2018-08-11 16:35:59
 */
@Mapper
public interface PageDao {

	PageDO get(Integer id);

	PageDO getByPageType(String pageType);

	List<PageDO> list(Map<String, Object> map);
	
	int count(Map<String, Object> map);
	
	int save(PageDO page);
	
	int update(PageDO page);
	
	int remove(Integer id);
	
	int batchRemove(Integer[] ids);
}
