package com.btc.app.service;

import java.util.List;
import com.btc.app.entity.BtcUser;

/**
 * <p>
 * 服务类
 * </p>
 *
 * @author cc
 * @since 2018-10-09
 */
public interface BtcUserService {
	List<BtcUser> getAll();

	void addBtcUser(BtcUser btcUser);

	void addBtcUserList(List<BtcUser> list);

	void editBtcUser(BtcUser btcUser);

	void delBtcUser(String userId);

	BtcUser findBtcUserById(String userId);

	BtcUser findByUsername(String username);

	String login(String username, String password);
}
