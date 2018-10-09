package com.btc.app.controller;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.btc.app.entity.BtcUser;
import com.btc.app.service.BtcUserService;
import com.btc.common.Result;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;

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

	@PostMapping()
	@ApiOperation(notes = "BtcUserController.addBtcUser", value = "addBtcUser")
	public Result addBtcUser(@RequestBody BtcUser btcUser) {
		btcUserService.addBtcUser(btcUser);
		return new Result();
	}

	@PutMapping()
	@ApiOperation(notes = "BtcUserController.editBtcUser", value = "editBtcUser")
	public Result editBtcUser(@RequestBody BtcUser btcUser) {
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
