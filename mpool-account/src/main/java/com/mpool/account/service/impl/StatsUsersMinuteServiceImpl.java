package com.mpool.account.service.impl;

import com.mpool.account.entity.StatsUsersMinute;
import com.mpool.account.mapper.StatsUsersMinuteMapper;
import com.mpool.account.service.StatsUsersMinuteService;
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
public class StatsUsersMinuteServiceImpl implements StatsUsersMinuteService { 	
	@Resource
	private StatsUsersMinuteMapper statsUsersMinuteMapper;
	
	@Override
	public List<StatsUsersMinute> getAll(){
        return statsUsersMinuteMapper.selectAll();
	}
	
	@Override
	public void addStatsUsersMinute(StatsUsersMinute statsUsersMinute){
		statsUsersMinuteMapper.insert(statsUsersMinute);
	}
	
	@Override
	public void addStatsUsersMinuteList(List<StatsUsersMinute> list){
		statsUsersMinuteMapper.inserts(list);
	}
	
	@Override
	public void editStatsUsersMinute(StatsUsersMinute statsUsersMinute){
		statsUsersMinuteMapper.update(statsUsersMinute);
	}
	
	@Override
	public void delStatsUsersMinute(Integer puid){
		statsUsersMinuteMapper.delete(puid);
	}
	
	@Override
	public StatsUsersMinute findStatsUsersMinuteById(Integer puid){
		return statsUsersMinuteMapper.findByPrimaryKey(puid);
	}
}
