package com.mpool.account.service.impl;

import com.mpool.account.entity.StatsPoolMinute;
import com.mpool.account.mapper.StatsPoolMinuteMapper;
import com.mpool.account.service.StatsPoolMinuteService;
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
public class StatsPoolMinuteServiceImpl implements StatsPoolMinuteService { 	
	@Resource
	private StatsPoolMinuteMapper statsPoolMinuteMapper;
	
	@Override
	public List<StatsPoolMinute> getAll(){
        return statsPoolMinuteMapper.selectAll();
	}
	
	@Override
	public void addStatsPoolMinute(StatsPoolMinute statsPoolMinute){
		statsPoolMinuteMapper.insert(statsPoolMinute);
	}
	
	@Override
	public void addStatsPoolMinuteList(List<StatsPoolMinute> list){
		statsPoolMinuteMapper.inserts(list);
	}
	
	@Override
	public void editStatsPoolMinute(StatsPoolMinute statsPoolMinute){
		statsPoolMinuteMapper.update(statsPoolMinute);
	}
	
	@Override
	public void delStatsPoolMinute(Long minute){
		statsPoolMinuteMapper.delete(minute);
	}
	
	@Override
	public StatsPoolMinute findStatsPoolMinuteById(Long minute){
		return statsPoolMinuteMapper.findByPrimaryKey(minute);
	}
}
