package com.mpool.account.service;
import java.util.List;
import com.mpool.account.entity.FoundBlocks;

/**
 * <p>
 *  服务类
 * </p>
 *
 * @author cc
 * @since 2018-10-09
 */
public interface FoundBlocksService  {
	List<FoundBlocks> getAll();
	
	void addFoundBlocks(FoundBlocks foundBlocks);
	
	void addFoundBlocksList(List<FoundBlocks> list);
	
	void editFoundBlocks(FoundBlocks foundBlocks);
	
	void delFoundBlocks(Integer id);
	
	FoundBlocks findFoundBlocksById(Integer id);
}
