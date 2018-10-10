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

import com.btc.app.service.StatsWorkersHourService;
import com.btc.app.entity.StatsWorkersHour;

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
@RequestMapping("/statsWorkersHour")
@Api()
public class StatsWorkersHourController {
	
	@Resource
	private StatsWorkersHourService statsWorkersHourService;
	
	
	@PostMapping()
	@ApiOperation(notes="StatsWorkersHourController.addStatsWorkersHour", value = "addStatsWorkersHour")
	public Result addStatsWorkersHour(@RequestBody StatsWorkersHour statsWorkersHour){
		statsWorkersHourService.addStatsWorkersHour(statsWorkersHour);
		return new Result();
	}
	
	@PutMapping()
	@ApiOperation(notes="StatsWorkersHourController.editStatsWorkersHour", value = "editStatsWorkersHour")
	public Result editStatsWorkersHour(@RequestBody StatsWorkersHour statsWorkersHour){
		statsWorkersHourService.editStatsWorkersHour(statsWorkersHour);
		return new Result();
	}
	
	@DeleteMapping()
	@ApiOperation(notes="StatsWorkersHourController.delStatsWorkersHour", value = "delStatsWorkersHour")
	public Result delStatsWorkersHour(@RequestParam(value = "hour", required = false) Integer hour){
		statsWorkersHourService.delStatsWorkersHour(hour);
		return new Result();
	}
	
	@GetMapping("getAll")
	@ApiOperation(notes="StatsWorkersHourController.getAll()", value = "getAll")
	public Result getAll(){
		List<StatsWorkersHour> data = statsWorkersHourService.getAll();
		return new Result(data);
	}
	
	@GetMapping("getBykey")
	@ApiOperation(notes="StatsWorkersHourController.findStatsWorkersHourById", value = "findStatsWorkersHourById")
	public Result findStatsWorkersHourById(@RequestParam(value = "hour", required = false) Integer hour){
		StatsWorkersHour data = statsWorkersHourService.findStatsWorkersHourById(hour);
		return new Result(data);
	}
}
