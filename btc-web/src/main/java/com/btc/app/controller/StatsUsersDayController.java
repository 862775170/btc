package com.btc.app.controller;


import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RequestBody;
import javax.annotation.Resource;

import com.btc.common.Result;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import java.util.List;

import com.btc.app.service.StatsUsersDayService;
import com.btc.app.entity.StatsUsersDay;

import org.springframework.web.bind.annotation.RestController;

/**
 * <p>
 *  前端控制器
 * </p>
 *
 * @author cc
 * @since 2018-09-26
 */
@RestController
@RequestMapping("/statsUsersDay")
@Api()
public class StatsUsersDayController {
	
	@Resource
	private StatsUsersDayService statsUsersDayService;
	
	
	@PostMapping()
	@ApiOperation(notes="StatsUsersDayController.addStatsUsersDay", value = "addStatsUsersDay")
	public Result addStatsUsersDay(@RequestBody StatsUsersDay statsUsersDay){
		statsUsersDayService.addStatsUsersDay(statsUsersDay);
		return new Result();
	}
	
	@PutMapping()
	@ApiOperation(notes="StatsUsersDayController.editStatsUsersDay", value = "editStatsUsersDay")
	public Result editStatsUsersDay(@RequestBody StatsUsersDay statsUsersDay){
		statsUsersDayService.editStatsUsersDay(statsUsersDay);
		return new Result();
	}
	
	@DeleteMapping()
	@ApiOperation(notes="StatsUsersDayController.delStatsUsersDay", value = "delStatsUsersDay")
	public Result delStatsUsersDay(@RequestParam(value = "puid", required = false) Integer puid){
		statsUsersDayService.delStatsUsersDay(puid);
		return new Result();
	}
	
	@GetMapping("getAll")
	@ApiOperation(notes="StatsUsersDayController.getAll()", value = "getAll")
	public Result getAll(){
		List<StatsUsersDay> data = statsUsersDayService.getAll();
		return new Result(data);
	}
	
	@GetMapping("getBykey")
	@ApiOperation(notes="StatsUsersDayController.findStatsUsersDayById", value = "findStatsUsersDayById")
	public Result findStatsUsersDayById(@RequestParam(value = "puid", required = false) Integer puid){
		StatsUsersDay data = statsUsersDayService.findStatsUsersDayById(puid);
		return new Result(data);
	}
}
