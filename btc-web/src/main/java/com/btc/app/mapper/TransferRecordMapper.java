package com.btc.app.mapper;

import com.btc.app.entity.TransferRecord;
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
public interface TransferRecordMapper {	
	
	List<TransferRecord> selectAll();
	
	void insert(TransferRecord transferRecord);
	
	void inserts(List<TransferRecord> list);
	
	void update(TransferRecord transferRecord);

	void delete(Integer puid);
	
	TransferRecord findByPrimaryKey(Integer puid);
	
}