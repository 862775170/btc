package com.btc.app.service.impl;

import com.btc.app.entity.FoundBlocks;
import com.btc.app.mapper.FoundBlocksMapper;
import com.btc.app.service.FoundBlocksService;
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
public class FoundBlocksServiceImpl implements FoundBlocksService { 	
	@Resource
	private FoundBlocksMapper foundBlocksMapper;
	
	@Override
	public List<FoundBlocks> getAll(){
        return foundBlocksMapper.selectAll();
	}
	
	@Override
	public void addFoundBlocks(FoundBlocks foundBlocks){
		foundBlocksMapper.insert(foundBlocks);
	}
	
	@Override
	public void addFoundBlocksList(List<FoundBlocks> list){
		foundBlocksMapper.inserts(list);
	}
	
	@Override
	public void editFoundBlocks(FoundBlocks foundBlocks){
		foundBlocksMapper.update(foundBlocks);
	}
	
	@Override
	public void delFoundBlocks(Integer id){
		foundBlocksMapper.delete(id);
	}
	
	@Override
	public FoundBlocks findFoundBlocksById(Integer id){
		return foundBlocksMapper.findByPrimaryKey(id);
	}
}
