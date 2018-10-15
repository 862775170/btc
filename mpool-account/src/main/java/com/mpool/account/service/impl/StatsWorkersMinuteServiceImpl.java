package com.mpool.account.service.impl;

import com.mpool.account.entity.StatsWorkersMinute;
import com.mpool.account.mapper.StatsWorkersMinuteMapper;
import com.mpool.account.service.StatsWorkersMinuteService;
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
public class StatsWorkersMinuteServiceImpl implements StatsWorkersMinuteService { 	
	@Resource
	private StatsWorkersMinuteMapper statsWorkersMinuteMapper;
	
	@Override
	public List<StatsWorkersMinute> getAll(){
        return statsWorkersMinuteMapper.selectAll();
	}
	
	@Override
	public void addStatsWorkersMinute(StatsWorkersMinute statsWorkersMinute){
		statsWorkersMinuteMapper.insert(statsWorkersMinute);
	}
	
	@Override
	public void addStatsWorkersMinuteList(List<StatsWorkersMinute> list){
		statsWorkersMinuteMapper.inserts(list);
	}
	
	@Override
	public void editStatsWorkersMinute(StatsWorkersMinute statsWorkersMinute){
		statsWorkersMinuteMapper.update(statsWorkersMinute);
	}
	
	@Override
	public void delStatsWorkersMinute(Long minute){
		statsWorkersMinuteMapper.delete(minute);
	}
	
	@Override
	public StatsWorkersMinute findStatsWorkersMinuteById(Long minute){
		return statsWorkersMinuteMapper.findByPrimaryKey(minute);
	}
}
