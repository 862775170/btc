package com.mpool.account.service.impl;

import com.mpool.account.entity.StatsWorkersHour;
import com.mpool.account.mapper.StatsWorkersHourMapper;
import com.mpool.account.service.StatsWorkersHourService;
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
