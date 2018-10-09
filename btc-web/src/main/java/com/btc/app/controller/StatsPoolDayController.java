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

import com.btc.app.service.StatsPoolDayService;
import com.btc.app.entity.StatsPoolDay;

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
@RequestMapping("/statsPoolDay")
@Api()
public class StatsPoolDayController {
	
	@Resource
	private StatsPoolDayService statsPoolDayService;
	
	
	@PostMapping()
	@ApiOperation(notes="StatsPoolDayController.addStatsPoolDay", value = "addStatsPoolDay")
	public Result addStatsPoolDay(@RequestBody StatsPoolDay statsPoolDay){
		statsPoolDayService.addStatsPoolDay(statsPoolDay);
		return new Result();
	}
	
	@PutMapping()
	@ApiOperation(notes="StatsPoolDayController.editStatsPoolDay", value = "editStatsPoolDay")
	public Result editStatsPoolDay(@RequestBody StatsPoolDay statsPoolDay){
		statsPoolDayService.editStatsPoolDay(statsPoolDay);
		return new Result();
	}
	
	@DeleteMapping()
	@ApiOperation(notes="StatsPoolDayController.delStatsPoolDay", value = "delStatsPoolDay")
	public Result delStatsPoolDay(@RequestParam(value = "day", required = false) Integer day){
		statsPoolDayService.delStatsPoolDay(day);
		return new Result();
	}
	
	@GetMapping("getAll")
	@ApiOperation(notes="StatsPoolDayController.getAll()", value = "getAll")
	public Result getAll(){
		List<StatsPoolDay> data = statsPoolDayService.getAll();
		return new Result(data);
	}
	
	@GetMapping("getBykey")
	@ApiOperation(notes="StatsPoolDayController.findStatsPoolDayById", value = "findStatsPoolDayById")
	public Result findStatsPoolDayById(@RequestParam(value = "day", required = false) Integer day){
		StatsPoolDay data = statsPoolDayService.findStatsPoolDayById(day);
		return new Result(data);
	}
}
