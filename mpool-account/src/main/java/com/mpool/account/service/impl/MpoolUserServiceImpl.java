package com.mpool.account.service.impl;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import org.apache.shiro.SecurityUtils;
import org.apache.shiro.authc.UsernamePasswordToken;
import org.apache.shiro.subject.Subject;
import org.springframework.stereotype.Service;

import com.mpool.account.entity.MpoolUser;
import com.mpool.account.mapper.MpoolUserMapper;
import com.mpool.account.service.MpoolUserService;
import com.mpool.common.util.JWTUtil;

/**
 * <p>
 * 服务实现类
 * </p>
 *
 * @author cc
 * @since 2018-10-09
 */
@Service
public class MpoolUserServiceImpl implements MpoolUserService {
	@Resource
	private MpoolUserMapper mpoolUserMapper;

	@Override
	public List<MpoolUser> getAll() {
		return mpoolUserMapper.selectAll();
	}

	@Override
	public void addmpoolUser(MpoolUser mpoolUser) {
		mpoolUserMapper.insert(mpoolUser);
	}

	@Override
	public void addmpoolUserList(List<MpoolUser> list) {
		mpoolUserMapper.inserts(list);
	}

	@Override
	public void editmpoolUser(MpoolUser mpoolUser) {
		mpoolUserMapper.update(mpoolUser);
	}

	@Override
	public void delmpoolUser(String userId) {
		mpoolUserMapper.delete(userId);
	}

	@Override
	public MpoolUser findmpoolUserById(String userId) {
		return mpoolUserMapper.findByPrimaryKey(userId);
	}

	@Override
	public MpoolUser findByUsername(String username) {
		return mpoolUserMapper.findByUsername(username);
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
