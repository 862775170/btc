package com.mpool.account.service;
import java.util.List;
import com.mpool.account.entity.TransferRecord;

/**
 * <p>
 *  服务类
 * </p>
 *
 * @author cc
 * @since 2018-10-09
 */
public interface TransferRecordService  {
	List<TransferRecord> getAll();
	
	void addTransferRecord(TransferRecord transferRecord);
	
	void addTransferRecordList(List<TransferRecord> list);
	
	void editTransferRecord(TransferRecord transferRecord);
	
	void delTransferRecord(Integer puid);
	
	TransferRecord findTransferRecordById(Integer puid);
}
