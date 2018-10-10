package com.btc.app.mapper;

import com.btc.app.entity.StatsWorkersHour;
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
public interface StatsWorkersHourMapper {	
	
	List<StatsWorkersHour> selectAll();
	
	void insert(StatsWorkersHour statsWorkersHour);
	
	void inserts(List<StatsWorkersHour> list);
	
	void update(StatsWorkersHour statsWorkersHour);

	void delete(Integer hour);
	
	StatsWorkersHour findByPrimaryKey(Integer hour);
	
}