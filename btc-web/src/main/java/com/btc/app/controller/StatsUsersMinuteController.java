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

import com.btc.app.service.StatsUsersMinuteService;
import com.btc.app.entity.StatsUsersMinute;

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
@RequestMapping("/statsUsersMinute")
@Api()
public class StatsUsersMinuteController {
	
	@Resource
	private StatsUsersMinuteService statsUsersMinuteService;
	
	
	@PostMapping()
	@ApiOperation(notes="StatsUsersMinuteController.addStatsUsersMinute", value = "addStatsUsersMinute")
	public Result addStatsUsersMinute(@RequestBody StatsUsersMinute statsUsersMinute){
		statsUsersMinuteService.addStatsUsersMinute(statsUsersMinute);
		return new Result();
	}
	
	@PutMapping()
	@ApiOperation(notes="StatsUsersMinuteController.editStatsUsersMinute", value = "editStatsUsersMinute")
	public Result editStatsUsersMinute(@RequestBody StatsUsersMinute statsUsersMinute){
		statsUsersMinuteService.editStatsUsersMinute(statsUsersMinute);
		return new Result();
	}
	
	@DeleteMapping()
	@ApiOperation(notes="StatsUsersMinuteController.delStatsUsersMinute", value = "delStatsUsersMinute")
	public Result delStatsUsersMinute(@RequestParam(value = "puid", required = false) Integer puid){
		statsUsersMinuteService.delStatsUsersMinute(puid);
		return new Result();
	}
	
	@GetMapping("getAll")
	@ApiOperation(notes="StatsUsersMinuteController.getAll()", value = "getAll")
	public Result getAll(){
		List<StatsUsersMinute> data = statsUsersMinuteService.getAll();
		return new Result(data);
	}
	
	@GetMapping("getBykey")
	@ApiOperation(notes="StatsUsersMinuteController.findStatsUsersMinuteById", value = "findStatsUsersMinuteById")
	public Result findStatsUsersMinuteById(@RequestParam(value = "puid", required = false) Integer puid){
		StatsUsersMinute data = statsUsersMinuteService.findStatsUsersMinuteById(puid);
		return new Result(data);
	}
}
