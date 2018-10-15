package com.mpool.account.mapper;

import com.mpool.account.entity.StatsWorkersDay;
import org.apache.ibatis.annotations.Mapper;
import java.util.List;

/**
 * <p>
  *  Mapper 接口
 * </p>
 *
 * @author cc
 * @since 2018-10-09
 */
@Mapper
public interface StatsWorkersDayMapper {	
	
	List<StatsWorkersDay> selectAll();
	
	void insert(StatsWorkersDay statsWorkersDay);
	
	void inserts(List<StatsWorkersDay> list);
	
	void update(StatsWorkersDay statsWorkersDay);

	void delete(Integer day);
	
	StatsWorkersDay findByPrimaryKey(Integer day);
	
}