package com.mpool.account.service.impl;

import com.mpool.account.entity.StatsUsersDay;
import com.mpool.account.mapper.StatsUsersDayMapper;
import com.mpool.account.service.StatsUsersDayService;
import org.springframework.stereotype.Service;

import java.util.List;

import javax.annotation.Resource;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author cc
 * @since 2018-10-09
 */
@Service
public class StatsUsersDayServiceImpl implements StatsUsersDayService { 	
	@Resource
	private StatsUsersDayMapper statsUsersDayMapper;
	
	@Override
	public List<StatsUsersDay> getAll(){
        return statsUsersDayMapper.selectAll();
	}
	
	@Override
	public void addStatsUsersDay(StatsUsersDay statsUsersDay){
		statsUsersDayMapper.insert(statsUsersDay);
	}
	
	@Override
	public void addStatsUsersDayList(List<StatsUsersDay> list){
		statsUsersDayMapper.inserts(list);
	}
	
	@Override
	public void editStatsUsersDay(StatsUsersDay statsUsersDay){
		statsUsersDayMapper.update(statsUsersDay);
	}
	
	@Override
	public void delStatsUsersDay(Integer puid){
		statsUsersDayMapper.delete(puid);
	}
	
	@Override
	public StatsUsersDay findStatsUsersDayById(Integer puid){
		return statsUsersDayMapper.findByPrimaryKey(puid);
	}
}
