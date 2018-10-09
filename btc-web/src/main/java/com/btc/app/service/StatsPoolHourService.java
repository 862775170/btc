package com.btc.app.service;
import java.util.List;
import com.btc.app.entity.StatsPoolHour;

/**
 * <p>
 *  服务类
 * </p>
 *
 * @author cc
 * @since 2018-10-09
 */
public interface StatsPoolHourService  {
	List<StatsPoolHour> getAll();
	
	void addStatsPoolHour(StatsPoolHour statsPoolHour);
	
	void addStatsPoolHourList(List<StatsPoolHour> list);
	
	void editStatsPoolHour(StatsPoolHour statsPoolHour);
	
	void delStatsPoolHour(Integer hour);
	
	StatsPoolHour findStatsPoolHourById(Integer hour);
}
