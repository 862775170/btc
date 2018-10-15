package com.mpool.account.service;

import java.util.List;

import com.mpool.account.entity.MpoolUser;

/**
 * <p>
 * 服务类
 * </p>
 *
 * @author cc
 * @since 2018-10-09
 */
public interface MpoolUserService {
	List<MpoolUser> getAll();

	void addmpoolUser(MpoolUser mpoolUser);

	void addmpoolUserList(List<MpoolUser> list);

	void editmpoolUser(MpoolUser mpoolUser);

	void delmpoolUser(String userId);

	MpoolUser findmpoolUserById(String userId);

	MpoolUser findByUsername(String username);

	String login(String username, String password);
}
