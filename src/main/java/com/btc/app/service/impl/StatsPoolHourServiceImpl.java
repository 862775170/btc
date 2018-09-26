package com.btc.app.service.impl;

import com.btc.app.entity.StatsPoolHour;
import com.btc.app.mapper.StatsPoolHourMapper;
import com.btc.app.service.StatsPoolHourService;
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
public class StatsPoolHourServiceImpl implements StatsPoolHourService { 	
	@Resource
	private StatsPoolHourMapper statsPoolHourMapper;
	
	@Override
	public List<StatsPoolHour> getAll(){
        return statsPoolHourMapper.selectAll();
	}
	
	@Override
	public void addStatsPoolHour(StatsPoolHour statsPoolHour){
		statsPoolHourMapper.insert(statsPoolHour);
	}
	
	@Override
	public void addStatsPoolHourList(List<StatsPoolHour> list){
		statsPoolHourMapper.inserts(list);
	}
	
	@Override
	public void editStatsPoolHour(StatsPoolHour statsPoolHour){
		statsPoolHourMapper.update(statsPoolHour);
	}
	
	@Override
	public void delStatsPoolHour(Integer hour){
		statsPoolHourMapper.delete(hour);
	}
	
	@Override
	public StatsPoolHour findStatsPoolHourById(Integer hour){
		return statsPoolHourMapper.findByPrimaryKey(hour);
	}
}
