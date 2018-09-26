package com.btc.app.service.impl;

import com.btc.app.entity.StatsWorkersMinute;
import com.btc.app.mapper.StatsWorkersMinuteMapper;
import com.btc.app.service.StatsWorkersMinuteService;
import org.springframework.stereotype.Service;

import java.util.List;

import javax.annotation.Resource;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author cc
 * @since 2018-09-26
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
