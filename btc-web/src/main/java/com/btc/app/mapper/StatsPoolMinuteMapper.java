package com.btc.app.mapper;

import com.btc.app.entity.StatsPoolMinute;
import org.apache.ibatis.annotations.Mapper;
import java.util.List;

/**
 * <p>
  *  Mapper 接口
 * </p>
 *
 * @author cc
 * @since 2018-09-26
 */
@Mapper
public interface StatsPoolMinuteMapper {	
	
	List<StatsPoolMinute> selectAll();
	
	void insert(StatsPoolMinute statsPoolMinute);
	
	void inserts(List<StatsPoolMinute> list);
	
	void update(StatsPoolMinute statsPoolMinute);

	void delete(Long minute);
	
	StatsPoolMinute findByPrimaryKey(Long minute);
	
}