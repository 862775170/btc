package com.btc.app.service.impl;

import com.btc.app.entity.StatsPoolDay;
import com.btc.app.mapper.StatsPoolDayMapper;
import com.btc.app.service.StatsPoolDayService;
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
public class StatsPoolDayServiceImpl implements StatsPoolDayService { 	
	@Resource
	private StatsPoolDayMapper statsPoolDayMapper;
	
	@Override
	public List<StatsPoolDay> getAll(){
        return statsPoolDayMapper.selectAll();
	}
	
	@Override
	public void addStatsPoolDay(StatsPoolDay statsPoolDay){
		statsPoolDayMapper.insert(statsPoolDay);
	}
	
	@Override
	public void addStatsPoolDayList(List<StatsPoolDay> list){
		statsPoolDayMapper.inserts(list);
	}
	
	@Override
	public void editStatsPoolDay(StatsPoolDay statsPoolDay){
		statsPoolDayMapper.update(statsPoolDay);
	}
	
	@Override
	public void delStatsPoolDay(Integer day){
		statsPoolDayMapper.delete(day);
	}
	
	@Override
	public StatsPoolDay findStatsPoolDayById(Integer day){
		return statsPoolDayMapper.findByPrimaryKey(day);
	}
}
