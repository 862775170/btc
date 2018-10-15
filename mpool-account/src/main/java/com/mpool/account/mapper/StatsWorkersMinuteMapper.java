package com.mpool.account.mapper;

import com.mpool.account.entity.StatsWorkersMinute;
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
public interface StatsWorkersMinuteMapper {	
	
	List<StatsWorkersMinute> selectAll();
	
	void insert(StatsWorkersMinute statsWorkersMinute);
	
	void inserts(List<StatsWorkersMinute> list);
	
	void update(StatsWorkersMinute statsWorkersMinute);

	void delete(Long minute);
	
	StatsWorkersMinute findByPrimaryKey(Long minute);
	
}