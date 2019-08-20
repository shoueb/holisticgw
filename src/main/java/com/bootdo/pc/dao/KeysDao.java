package com.bootdo.pc.dao;

import com.bootdo.pc.domain.KeysDO;
import org.apache.ibatis.annotations.Mapper;
/**
 * 
 * @author huyuangui
 * @date 2018-08-11 10:33:49
 */
@Mapper
public interface KeysDao {
	KeysDO get(Integer id);
}
