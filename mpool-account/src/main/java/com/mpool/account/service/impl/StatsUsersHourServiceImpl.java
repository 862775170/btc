package com.mpool.account.service.impl;

import com.mpool.account.entity.StatsUsersHour;
import com.mpool.account.mapper.StatsUsersHourMapper;
import com.mpool.account.service.StatsUsersHourService;
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
public class StatsUsersHourServiceImpl implements StatsUsersHourService { 	
	@Resource
	private StatsUsersHourMapper statsUsersHourMapper;
	
	@Override
	public List<StatsUsersHour> getAll(){
        return statsUsersHourMapper.selectAll();
	}
	
	@Override
	public void addStatsUsersHour(StatsUsersHour statsUsersHour){
		statsUsersHourMapper.insert(statsUsersHour);
	}
	
	@Override
	public void addStatsUsersHourList(List<StatsUsersHour> list){
		statsUsersHourMapper.inserts(list);
	}
	
	@Override
	public void editStatsUsersHour(StatsUsersHour statsUsersHour){
		statsUsersHourMapper.update(statsUsersHour);
	}
	
	@Override
	public void delStatsUsersHour(Integer puid){
		statsUsersHourMapper.delete(puid);
	}
	
	@Override
	public StatsUsersHour findStatsUsersHourById(Integer puid){
		return statsUsersHourMapper.findByPrimaryKey(puid);
	}
}
