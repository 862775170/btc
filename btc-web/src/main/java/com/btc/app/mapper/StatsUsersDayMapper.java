package com.btc.app.mapper;

import com.btc.app.entity.StatsUsersDay;
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
public interface StatsUsersDayMapper {	
	
	List<StatsUsersDay> selectAll();
	
	void insert(StatsUsersDay statsUsersDay);
	
	void inserts(List<StatsUsersDay> list);
	
	void update(StatsUsersDay statsUsersDay);

	void delete(Integer puid);
	
	StatsUsersDay findByPrimaryKey(Integer puid);
	
}