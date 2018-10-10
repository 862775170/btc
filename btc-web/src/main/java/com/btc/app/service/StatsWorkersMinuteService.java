package com.btc.app.service;
import java.util.List;
import com.btc.app.entity.StatsWorkersMinute;

/**
 * <p>
 *  服务类
 * </p>
 *
 * @author cc
 * @since 2018-10-09
 */
public interface StatsWorkersMinuteService  {
	List<StatsWorkersMinute> getAll();
	
	void addStatsWorkersMinute(StatsWorkersMinute statsWorkersMinute);
	
	void addStatsWorkersMinuteList(List<StatsWorkersMinute> list);
	
	void editStatsWorkersMinute(StatsWorkersMinute statsWorkersMinute);
	
	void delStatsWorkersMinute(Long minute);
	
	StatsWorkersMinute findStatsWorkersMinuteById(Long minute);
}
