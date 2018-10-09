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

import com.btc.app.service.StatsPoolMinuteService;
import com.btc.app.entity.StatsPoolMinute;

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
@RequestMapping("/statsPoolMinute")
@Api()
public class StatsPoolMinuteController {
	
	@Resource
	private StatsPoolMinuteService statsPoolMinuteService;
	
	
	@PostMapping()
	@ApiOperation(notes="StatsPoolMinuteController.addStatsPoolMinute", value = "addStatsPoolMinute")
	public Result addStatsPoolMinute(@RequestBody StatsPoolMinute statsPoolMinute){
		statsPoolMinuteService.addStatsPoolMinute(statsPoolMinute);
		return new Result();
	}
	
	@PutMapping()
	@ApiOperation(notes="StatsPoolMinuteController.editStatsPoolMinute", value = "editStatsPoolMinute")
	public Result editStatsPoolMinute(@RequestBody StatsPoolMinute statsPoolMinute){
		statsPoolMinuteService.editStatsPoolMinute(statsPoolMinute);
		return new Result();
	}
	
	@DeleteMapping()
	@ApiOperation(notes="StatsPoolMinuteController.delStatsPoolMinute", value = "delStatsPoolMinute")
	public Result delStatsPoolMinute(@RequestParam(value = "minute", required = false) Long minute){
		statsPoolMinuteService.delStatsPoolMinute(minute);
		return new Result();
	}
	
	@GetMapping("getAll")
	@ApiOperation(notes="StatsPoolMinuteController.getAll()", value = "getAll")
	public Result getAll(){
		List<StatsPoolMinute> data = statsPoolMinuteService.getAll();
		return new Result(data);
	}
	
	@GetMapping("getBykey")
	@ApiOperation(notes="StatsPoolMinuteController.findStatsPoolMinuteById", value = "findStatsPoolMinuteById")
	public Result findStatsPoolMinuteById(@RequestParam(value = "minute", required = false) Long minute){
		StatsPoolMinute data = statsPoolMinuteService.findStatsPoolMinuteById(minute);
		return new Result(data);
	}
}
