package com.btc.app.service.impl;

import com.btc.app.entity.BtcUser;
import com.btc.app.mapper.BtcUserMapper;
import com.btc.app.service.BtcUserService;
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
public class BtcUserServiceImpl implements BtcUserService { 	
	@Resource
	private BtcUserMapper btcUserMapper;
	
	@Override
	public List<BtcUser> getAll(){
        return btcUserMapper.selectAll();
	}
	
	@Override
	public void addBtcUser(BtcUser btcUser){
		btcUserMapper.insert(btcUser);
	}
	
	@Override
	public void addBtcUserList(List<BtcUser> list){
		btcUserMapper.inserts(list);
	}
	
	@Override
	public void editBtcUser(BtcUser btcUser){
		btcUserMapper.update(btcUser);
	}
	
	@Override
	public void delBtcUser(String userId){
		btcUserMapper.delete(userId);
	}
	
	@Override
	public BtcUser findBtcUserById(String userId){
		return btcUserMapper.findByPrimaryKey(userId);
	}
}
