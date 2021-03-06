package com.mpool.account.service.impl;

import com.mpool.account.entity.StatsPoolHour;
import com.mpool.account.mapper.StatsPoolHourMapper;
import com.mpool.account.service.StatsPoolHourService;
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
