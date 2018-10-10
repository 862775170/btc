package com.btc.app.service;
import java.util.List;
import com.btc.app.entity.StatsPoolMinute;

/**
 * <p>
 *  服务类
 * </p>
 *
 * @author cc
 * @since 2018-10-09
 */
public interface StatsPoolMinuteService  {
	List<StatsPoolMinute> getAll();
	
	void addStatsPoolMinute(StatsPoolMinute statsPoolMinute);
	
	void addStatsPoolMinuteList(List<StatsPoolMinute> list);
	
	void editStatsPoolMinute(StatsPoolMinute statsPoolMinute);
	
	void delStatsPoolMinute(Long minute);
	
	StatsPoolMinute findStatsPoolMinuteById(Long minute);
}
