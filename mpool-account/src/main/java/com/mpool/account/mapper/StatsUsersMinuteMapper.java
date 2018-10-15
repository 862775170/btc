package com.mpool.account.mapper;

import com.mpool.account.entity.StatsUsersMinute;
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
public interface StatsUsersMinuteMapper {	
	
	List<StatsUsersMinute> selectAll();
	
	void insert(StatsUsersMinute statsUsersMinute);
	
	void inserts(List<StatsUsersMinute> list);
	
	void update(StatsUsersMinute statsUsersMinute);

	void delete(Integer puid);
	
	StatsUsersMinute findByPrimaryKey(Integer puid);
	
}