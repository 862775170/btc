package com.mpool.account.controller;

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

import com.mpool.account.entity.MpoolUser;
import com.mpool.account.service.MpoolUserService;
import com.mpool.common.Result;
import com.mpool.common.util.EncryUtil;
import com.mpool.common.util.UUIDUtil;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;

import java.util.Date;
import java.util.List;

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
@RequestMapping("/mpoolUser")
@Api()
public class MpoolUserController {

	@Resource
	private MpoolUserService mpoolUserService;

	@PostMapping("/login")
	@ApiOperation(notes = "用户登录", value = "用户登录")
	public Result login(String username, String password) {
		String jwt = mpoolUserService.login(username, password);
		return new Result(jwt);
	}

	@PostMapping("/register")
	@ApiOperation(notes = "用户注册", value = "用户注册")
	public Result addmpoolUser(@Valid @RequestBody MpoolUser mpoolUser) {
		mpoolUser.setUserId(UUIDUtil.generateUUID());
		mpoolUser.setCreateAt(new Date());
		mpoolUser.setPassword(EncryUtil.encrypt(mpoolUser.getPassword()));
		mpoolUserService.addmpoolUser(mpoolUser);
		return new Result();
	}

	@PutMapping()
	@ApiOperation(notes = "mpoolUserController.editmpoolUser", value = "editmpoolUser")
	public Result editmpoolUser(@Valid @RequestBody MpoolUser mpoolUser) {

		mpoolUserService.editmpoolUser(mpoolUser);
		return new Result();
	}

	@DeleteMapping()
	@ApiOperation(notes = "mpoolUserController.delmpoolUser", value = "delmpoolUser")
	public Result delmpoolUser(@RequestParam(value = "userId", required = false) String userId) {
		mpoolUserService.delmpoolUser(userId);
		return new Result();
	}

	@GetMapping("getAll")
	@ApiOperation(notes = "mpoolUserController.getAll()", value = "getAll")
	public Result getAll() {
		List<MpoolUser> data = mpoolUserService.getAll();
		return new Result(data);
	}

	@GetMapping("getBykey")
	@ApiOperation(notes = "mpoolUserController.findmpoolUserById", value = "findmpoolUserById")
	public Result findmpoolUserById(@RequestParam(value = "userId", required = false) String userId) {
		MpoolUser data = mpoolUserService.findmpoolUserById(userId);
		return new Result(data);
	}
}
