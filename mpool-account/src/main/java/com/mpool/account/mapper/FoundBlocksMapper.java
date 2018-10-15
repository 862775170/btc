package com.mpool.account.mapper;

import com.mpool.account.entity.FoundBlocks;
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
public interface FoundBlocksMapper {	
	
	List<FoundBlocks> selectAll();
	
	void insert(FoundBlocks foundBlocks);
	
	void inserts(List<FoundBlocks> list);
	
	void update(FoundBlocks foundBlocks);

	void delete(Integer id);
	
	FoundBlocks findByPrimaryKey(Integer id);
	
}