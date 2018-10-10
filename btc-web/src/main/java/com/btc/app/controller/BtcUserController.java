package com.btc.app.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.apache.shiro.SecurityUtils;
import org.apache.shiro.authc.UsernamePasswordToken;
import org.apache.shiro.subject.Subject;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RequestBody;
import javax.annotation.Resource;
import javax.validation.Valid;

import com.btc.common.Result;
import com.btc.common.util.EncryUtil;
import com.btc.common.util.UUIDUtil;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;

import java.util.Date;
import java.util.List;

import com.btc.app.service.BtcUserService;
import com.btc.app.entity.BtcUser;

import org.springframework.web.bind.annotation.RestController;

/**
 * <p>
 * 前端控制器
 * </p>
 *
 * @author cc
 * @since 2018-10-09
 */
@RestController
@RequestMapping("/btcUser")
@Api()
public class BtcUserController {

	@Resource
	private BtcUserService btcUserService;

	@PostMapping("/login")
	@ApiOperation(notes = "用户登录", value = "用户登录")
	public Result login(String username, String password) {
		String jwt = btcUserService.login(username, password);
		return new Result(jwt);
	}

	@PostMapping("/register")
	@ApiOperation(notes = "用户注册", value = "用户注册")
	public Result addBtcUser(@Valid @RequestBody BtcUser btcUser) {
		btcUser.setUserId(UUIDUtil.generateUUID());
		btcUser.setCreateAt(new Date());
		btcUser.setPassword(EncryUtil.encrypt(btcUser.getPassword()));
		btcUserService.addBtcUser(btcUser);
		return new Result();
	}

	@PutMapping()
	@ApiOperation(notes = "BtcUserController.editBtcUser", value = "editBtcUser")
	public Result editBtcUser(@Valid @RequestBody BtcUser btcUser) {

		btcUserService.editBtcUser(btcUser);
		return new Result();
	}

	@DeleteMapping()
	@ApiOperation(notes = "BtcUserController.delBtcUser", value = "delBtcUser")
	public Result delBtcUser(@RequestParam(value = "userId", required = false) String userId) {
		btcUserService.delBtcUser(userId);
		return new Result();
	}

	@GetMapping("getAll")
	@ApiOperation(notes = "BtcUserController.getAll()", value = "getAll")
	public Result getAll() {
		List<BtcUser> data = btcUserService.getAll();
		return new Result(data);
	}

	@GetMapping("getBykey")
	@ApiOperation(notes = "BtcUserController.findBtcUserById", value = "findBtcUserById")
	public Result findBtcUserById(@RequestParam(value = "userId", required = false) String userId) {
		BtcUser data = btcUserService.findBtcUserById(userId);
		return new Result(data);
	}
}
