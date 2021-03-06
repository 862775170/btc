package com.mpool.account.service;
import java.util.List;
import com.mpool.account.entity.StatsUsersDay;

/**
 * <p>
 *  服务类
 * </p>
 *
 * @author cc
 * @since 2018-10-09
 */
public interface StatsUsersDayService  {
	List<StatsUsersDay> getAll();
	
	void addStatsUsersDay(StatsUsersDay statsUsersDay);
	
	void addStatsUsersDayList(List<StatsUsersDay> list);
	
	void editStatsUsersDay(StatsUsersDay statsUsersDay);
	
	void delStatsUsersDay(Integer puid);
	
	StatsUsersDay findStatsUsersDayById(Integer puid);
}
