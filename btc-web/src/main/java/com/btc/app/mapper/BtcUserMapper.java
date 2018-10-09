package com.btc.app.mapper;

import com.btc.app.entity.BtcUser;
import org.apache.ibatis.annotations.Mapper;
import java.util.List;

/**
 * <p>
  *  Mapper 接口
 * </p>
 *
 * @author cc
 * @since 2018-10-09
 */
@Mapper
public interface BtcUserMapper {	
	
	List<BtcUser> selectAll();
	
	void insert(BtcUser btcUser);
	
	void inserts(List<BtcUser> list);
	
	void update(BtcUser btcUser);

	void delete(String userId);
	
	BtcUser findByPrimaryKey(String userId);
	
}