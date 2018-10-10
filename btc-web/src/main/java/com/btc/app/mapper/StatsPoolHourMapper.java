package com.btc.app.mapper;

import com.btc.app.entity.StatsPoolHour;
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
public interface StatsPoolHourMapper {	
	
	List<StatsPoolHour> selectAll();
	
	void insert(StatsPoolHour statsPoolHour);
	
	void inserts(List<StatsPoolHour> list);
	
	void update(StatsPoolHour statsPoolHour);

	void delete(Integer hour);
	
	StatsPoolHour findByPrimaryKey(Integer hour);
	
}