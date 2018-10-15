package com.mpool.account.service;
import java.util.List;
import com.mpool.account.entity.StatsPoolDay;

/**
 * <p>
 *  服务类
 * </p>
 *
 * @author cc
 * @since 2018-10-09
 */
public interface StatsPoolDayService  {
	List<StatsPoolDay> getAll();
	
	void addStatsPoolDay(StatsPoolDay statsPoolDay);
	
	void addStatsPoolDayList(List<StatsPoolDay> list);
	
	void editStatsPoolDay(StatsPoolDay statsPoolDay);
	
	void delStatsPoolDay(Integer day);
	
	StatsPoolDay findStatsPoolDayById(Integer day);
}
