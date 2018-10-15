package com.mpool.account.service.impl;

import com.mpool.account.entity.StatsPoolDay;
import com.mpool.account.mapper.StatsPoolDayMapper;
import com.mpool.account.service.StatsPoolDayService;
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
