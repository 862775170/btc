package com.mpool.account.mapper;

import com.mpool.account.entity.StatsUsersHour;
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
public interface StatsUsersHourMapper {	
	
	List<StatsUsersHour> selectAll();
	
	void insert(StatsUsersHour statsUsersHour);
	
	void inserts(List<StatsUsersHour> list);
	
	void update(StatsUsersHour statsUsersHour);

	void delete(Integer puid);
	
	StatsUsersHour findByPrimaryKey(Integer puid);
	
}