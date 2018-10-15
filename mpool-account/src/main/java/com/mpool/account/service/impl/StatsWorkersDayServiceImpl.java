package com.mpool.account.service.impl;

import com.mpool.account.entity.StatsWorkersDay;
import com.mpool.account.mapper.StatsWorkersDayMapper;
import com.mpool.account.service.StatsWorkersDayService;
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
public class StatsWorkersDayServiceImpl implements StatsWorkersDayService { 	
	@Resource
	private StatsWorkersDayMapper statsWorkersDayMapper;
	
	@Override
	public List<StatsWorkersDay> getAll(){
        return statsWorkersDayMapper.selectAll();
	}
	
	@Override
	public void addStatsWorkersDay(StatsWorkersDay statsWorkersDay){
		statsWorkersDayMapper.insert(statsWorkersDay);
	}
	
	@Override
	public void addStatsWorkersDayList(List<StatsWorkersDay> list){
		statsWorkersDayMapper.inserts(list);
	}
	
	@Override
	public void editStatsWorkersDay(StatsWorkersDay statsWorkersDay){
		statsWorkersDayMapper.update(statsWorkersDay);
	}
	
	@Override
	public void delStatsWorkersDay(Integer day){
		statsWorkersDayMapper.delete(day);
	}
	
	@Override
	public StatsWorkersDay findStatsWorkersDayById(Integer day){
		return statsWorkersDayMapper.findByPrimaryKey(day);
	}
}
