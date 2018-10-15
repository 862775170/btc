package com.mpool.account.controller;


import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RequestBody;
import javax.annotation.Resource;

import com.mpool.common.Result;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import java.util.List;

import com.mpool.account.service.StatsWorkersDayService;
import com.mpool.account.entity.StatsWorkersDay;

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
@RequestMapping("/statsWorkersDay")
@Api()
public class StatsWorkersDayController {
	
	@Resource
	private StatsWorkersDayService statsWorkersDayService;
	
	
	@PostMapping()
	@ApiOperation(notes="StatsWorkersDayController.addStatsWorkersDay", value = "addStatsWorkersDay")
	public Result addStatsWorkersDay(@RequestBody StatsWorkersDay statsWorkersDay){
		statsWorkersDayService.addStatsWorkersDay(statsWorkersDay);
		return new Result();
	}
	
	@PutMapping()
	@ApiOperation(notes="StatsWorkersDayController.editStatsWorkersDay", value = "editStatsWorkersDay")
	public Result editStatsWorkersDay(@RequestBody StatsWorkersDay statsWorkersDay){
		statsWorkersDayService.editStatsWorkersDay(statsWorkersDay);
		return new Result();
	}
	
	@DeleteMapping()
	@ApiOperation(notes="StatsWorkersDayController.delStatsWorkersDay", value = "delStatsWorkersDay")
	public Result delStatsWorkersDay(@RequestParam(value = "day", required = false) Integer day){
		statsWorkersDayService.delStatsWorkersDay(day);
		return new Result();
	}
	
	@GetMapping("getAll")
	@ApiOperation(notes="StatsWorkersDayController.getAll()", value = "getAll")
	public Result getAll(){
		List<StatsWorkersDay> data = statsWorkersDayService.getAll();
		return new Result(data);
	}
	
	@GetMapping("getBykey")
	@ApiOperation(notes="StatsWorkersDayController.findStatsWorkersDayById", value = "findStatsWorkersDayById")
	public Result findStatsWorkersDayById(@RequestParam(value = "day", required = false) Integer day){
		StatsWorkersDay data = statsWorkersDayService.findStatsWorkersDayById(day);
		return new Result(data);
	}
}
