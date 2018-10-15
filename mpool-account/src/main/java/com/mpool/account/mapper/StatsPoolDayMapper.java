package com.mpool.account.mapper;

import com.mpool.account.entity.StatsPoolDay;
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
public interface StatsPoolDayMapper {	
	
	List<StatsPoolDay> selectAll();
	
	void insert(StatsPoolDay statsPoolDay);
	
	void inserts(List<StatsPoolDay> list);
	
	void update(StatsPoolDay statsPoolDay);

	void delete(Integer day);
	
	StatsPoolDay findByPrimaryKey(Integer day);
	
}