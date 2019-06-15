package com.bootdo.pc.service;

import com.bootdo.pc.domain.PageDO;

import java.util.List;
import java.util.Map;

/**
 * 
 * 
 * @author huyuangui
 * @email 648046866@qq.com
 * @date 2018-08-11 16:35:59
 */
public interface PageService {
	
	PageDO get(Integer id);

	PageDO getByPageType(String pageType);

	List<PageDO> list(Map<String, Object> map);
	
	int count(Map<String, Object> map);
	
	int save(PageDO page);
	
	int update(PageDO page);
	
	int remove(Integer id);
	
	int batchRemove(Integer[] ids);
}
