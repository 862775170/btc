package com.btc.app.service;
import java.util.List;
import com.btc.app.entity.StatsWorkersDay;

/**
 * <p>
 *  服务类
 * </p>
 *
 * @author cc
 * @since 2018-10-09
 */
public interface StatsWorkersDayService  {
	List<StatsWorkersDay> getAll();
	
	void addStatsWorkersDay(StatsWorkersDay statsWorkersDay);
	
	void addStatsWorkersDayList(List<StatsWorkersDay> list);
	
	void editStatsWorkersDay(StatsWorkersDay statsWorkersDay);
	
	void delStatsWorkersDay(Integer day);
	
	StatsWorkersDay findStatsWorkersDayById(Integer day);
}
