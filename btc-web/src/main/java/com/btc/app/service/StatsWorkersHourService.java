package com.btc.app.service;
import java.util.List;
import com.btc.app.entity.StatsWorkersHour;

/**
 * <p>
 *  服务类
 * </p>
 *
 * @author cc
 * @since 2018-10-09
 */
public interface StatsWorkersHourService  {
	List<StatsWorkersHour> getAll();
	
	void addStatsWorkersHour(StatsWorkersHour statsWorkersHour);
	
	void addStatsWorkersHourList(List<StatsWorkersHour> list);
	
	void editStatsWorkersHour(StatsWorkersHour statsWorkersHour);
	
	void delStatsWorkersHour(Integer hour);
	
	StatsWorkersHour findStatsWorkersHourById(Integer hour);
}
