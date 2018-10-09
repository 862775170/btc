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

import com.btc.app.service.StatsWorkersMinuteService;
import com.btc.app.entity.StatsWorkersMinute;

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
@RequestMapping("/statsWorkersMinute")
@Api()
public class StatsWorkersMinuteController {
	
	@Resource
	private StatsWorkersMinuteService statsWorkersMinuteService;
	
	
	@PostMapping()
	@ApiOperation(notes="StatsWorkersMinuteController.addStatsWorkersMinute", value = "addStatsWorkersMinute")
	public Result addStatsWorkersMinute(@RequestBody StatsWorkersMinute statsWorkersMinute){
		statsWorkersMinuteService.addStatsWorkersMinute(statsWorkersMinute);
		return new Result();
	}
	
	@PutMapping()
	@ApiOperation(notes="StatsWorkersMinuteController.editStatsWorkersMinute", value = "editStatsWorkersMinute")
	public Result editStatsWorkersMinute(@RequestBody StatsWorkersMinute statsWorkersMinute){
		statsWorkersMinuteService.editStatsWorkersMinute(statsWorkersMinute);
		return new Result();
	}
	
	@DeleteMapping()
	@ApiOperation(notes="StatsWorkersMinuteController.delStatsWorkersMinute", value = "delStatsWorkersMinute")
	public Result delStatsWorkersMinute(@RequestParam(value = "minute", required = false) Long minute){
		statsWorkersMinuteService.delStatsWorkersMinute(minute);
		return new Result();
	}
	
	@GetMapping("getAll")
	@ApiOperation(notes="StatsWorkersMinuteController.getAll()", value = "getAll")
	public Result getAll(){
		List<StatsWorkersMinute> data = statsWorkersMinuteService.getAll();
		return new Result(data);
	}
	
	@GetMapping("getBykey")
	@ApiOperation(notes="StatsWorkersMinuteController.findStatsWorkersMinuteById", value = "findStatsWorkersMinuteById")
	public Result findStatsWorkersMinuteById(@RequestParam(value = "minute", required = false) Long minute){
		StatsWorkersMinute data = statsWorkersMinuteService.findStatsWorkersMinuteById(minute);
		return new Result(data);
	}
}
