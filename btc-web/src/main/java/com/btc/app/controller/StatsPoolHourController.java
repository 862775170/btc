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

import com.btc.app.service.StatsPoolHourService;
import com.btc.app.entity.StatsPoolHour;

import org.springframework.web.bind.annotation.RestController;

/**
 * <p>
 *  前端控制器
 * </p>
 *
 * @author cc
 * @since 2018-10-09
 */
@RestController
@RequestMapping("/statsPoolHour")
@Api()
public class StatsPoolHourController {
	
	@Resource
	private StatsPoolHourService statsPoolHourService;
	
	
	@PostMapping()
	@ApiOperation(notes="StatsPoolHourController.addStatsPoolHour", value = "addStatsPoolHour")
	public Result addStatsPoolHour(@RequestBody StatsPoolHour statsPoolHour){
		statsPoolHourService.addStatsPoolHour(statsPoolHour);
		return new Result();
	}
	
	@PutMapping()
	@ApiOperation(notes="StatsPoolHourController.editStatsPoolHour", value = "editStatsPoolHour")
	public Result editStatsPoolHour(@RequestBody StatsPoolHour statsPoolHour){
		statsPoolHourService.editStatsPoolHour(statsPoolHour);
		return new Result();
	}
	
	@DeleteMapping()
	@ApiOperation(notes="StatsPoolHourController.delStatsPoolHour", value = "delStatsPoolHour")
	public Result delStatsPoolHour(@RequestParam(value = "hour", required = false) Integer hour){
		statsPoolHourService.delStatsPoolHour(hour);
		return new Result();
	}
	
	@GetMapping("getAll")
	@ApiOperation(notes="StatsPoolHourController.getAll()", value = "getAll")
	public Result getAll(){
		List<StatsPoolHour> data = statsPoolHourService.getAll();
		return new Result(data);
	}
	
	@GetMapping("getBykey")
	@ApiOperation(notes="StatsPoolHourController.findStatsPoolHourById", value = "findStatsPoolHourById")
	public Result findStatsPoolHourById(@RequestParam(value = "hour", required = false) Integer hour){
		StatsPoolHour data = statsPoolHourService.findStatsPoolHourById(hour);
		return new Result(data);
	}
}
