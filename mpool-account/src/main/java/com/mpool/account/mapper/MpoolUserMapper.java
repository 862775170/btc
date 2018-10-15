package com.mpool.account.mapper;

import com.mpool.account.entity.MpoolUser;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * <p>
 * Mapper 接口
 * </p>
 *
 * @author cc
 * @since 2018-10-09
 */
@Mapper
public interface MpoolUserMapper {

	List<MpoolUser> selectAll();

	void insert(MpoolUser mpoolUser);

	void inserts(List<MpoolUser> list);

	void update(MpoolUser mpoolUser);

	void delete(String userId);

	MpoolUser findByPrimaryKey(String userId);

	MpoolUser findByUsername(@Param("username") String username);

}