package com.btc.app.service.impl;

import com.btc.app.entity.BtcUser;
import com.btc.app.mapper.BtcUserMapper;
import com.btc.app.service.BtcUserService;
import com.btc.common.util.JWTUtil;

import org.apache.shiro.SecurityUtils;
import org.apache.shiro.authc.UsernamePasswordToken;
import org.apache.shiro.subject.Subject;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

/**
 * <p>
 * 服务实现类
 * </p>
 *
 * @author cc
 * @since 2018-10-09
 */
@Service
public class BtcUserServiceImpl implements BtcUserService {
	@Resource
	private BtcUserMapper btcUserMapper;

	@Override
	public List<BtcUser> getAll() {
		return btcUserMapper.selectAll();
	}

	@Override
	public void addBtcUser(BtcUser btcUser) {
		btcUserMapper.insert(btcUser);
	}

	@Override
	public void addBtcUserList(List<BtcUser> list) {
		btcUserMapper.inserts(list);
	}

	@Override
	public void editBtcUser(BtcUser btcUser) {
		btcUserMapper.update(btcUser);
	}

	@Override
	public void delBtcUser(String userId) {
		btcUserMapper.delete(userId);
	}

	@Override
	public BtcUser findBtcUserById(String userId) {
		return btcUserMapper.findByPrimaryKey(userId);
	}

	@Override
	public BtcUser findByUsername(String username) {
		return btcUserMapper.findByUsername(username);
	}

	@Override
	public String login(String username, String password) {
		Subject subject = SecurityUtils.getSubject();
		UsernamePasswordToken token = new UsernamePasswordToken(username, password);
		subject.login(token);
		Map<String, String> playload = new HashMap<>();
		playload.put("username", username);
		return JWTUtil.sign(playload);
	}
}
