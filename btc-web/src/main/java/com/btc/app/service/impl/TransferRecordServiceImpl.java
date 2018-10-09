package com.btc.app.service.impl;

import com.btc.app.entity.TransferRecord;
import com.btc.app.mapper.TransferRecordMapper;
import com.btc.app.service.TransferRecordService;
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
public class TransferRecordServiceImpl implements TransferRecordService { 	
	@Resource
	private TransferRecordMapper transferRecordMapper;
	
	@Override
	public List<TransferRecord> getAll(){
        return transferRecordMapper.selectAll();
	}
	
	@Override
	public void addTransferRecord(TransferRecord transferRecord){
		transferRecordMapper.insert(transferRecord);
	}
	
	@Override
	public void addTransferRecordList(List<TransferRecord> list){
		transferRecordMapper.inserts(list);
	}
	
	@Override
	public void editTransferRecord(TransferRecord transferRecord){
		transferRecordMapper.update(transferRecord);
	}
	
	@Override
	public void delTransferRecord(Integer puid){
		transferRecordMapper.delete(puid);
	}
	
	@Override
	public TransferRecord findTransferRecordById(Integer puid){
		return transferRecordMapper.findByPrimaryKey(puid);
	}
}
