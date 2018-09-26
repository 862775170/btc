package com.btc.app.service.impl;

import com.btc.app.entity.StatsWorkersHour;
import com.btc.app.mapper.StatsWorkersHourMapper;
import com.btc.app.service.StatsWorkersHourService;
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
public class StatsWorkersHourServiceImpl implements StatsWorkersHourService { 	
	@Resource
	private StatsWorkersHourMapper statsWorkersHourMapper;
	
	@Override
	public List<StatsWorkersHour> getAll(){
        return statsWorkersHourMapper.selectAll();
	}
	
	@Override
	public void addStatsWorkersHour(StatsWorkersHour statsWorkersHour){
		statsWorkersHourMapper.insert(statsWorkersHour);
	}
	
	@Override
	public void addStatsWorkersHourList(List<StatsWorkersHour> list){
		statsWorkersHourMapper.inserts(list);
	}
	
	@Override
	public void editStatsWorkersHour(StatsWorkersHour statsWorkersHour){
		statsWorkersHourMapper.update(statsWorkersHour);
	}
	
	@Override
	public void delStatsWorkersHour(Integer hour){
		statsWorkersHourMapper.delete(hour);
	}
	
	@Override
	public StatsWorkersHour findStatsWorkersHourById(Integer hour){
		return statsWorkersHourMapper.findByPrimaryKey(hour);
	}
}
