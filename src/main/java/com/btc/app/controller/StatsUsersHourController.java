package com.btc.app.controller;


import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RequestBody;
import javax.annotation.Resource;

import com.btc.app.common.Result;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import java.util.List;

import com.btc.app.service.StatsUsersHourService;
import com.btc.app.entity.StatsUsersHour;

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
@RequestMapping("/statsUsersHour")
@Api()
public class StatsUsersHourController {
	
	@Resource
	private StatsUsersHourService statsUsersHourService;
	
	
	@PostMapping()
	@ApiOperation(notes="StatsUsersHourController.addStatsUsersHour", value = "addStatsUsersHour")
	public Result addStatsUsersHour(@RequestBody StatsUsersHour statsUsersHour){
		statsUsersHourService.addStatsUsersHour(statsUsersHour);
		return new Result();
	}
	
	@PutMapping()
	@ApiOperation(notes="StatsUsersHourController.editStatsUsersHour", value = "editStatsUsersHour")
	public Result editStatsUsersHour(@RequestBody StatsUsersHour statsUsersHour){
		statsUsersHourService.editStatsUsersHour(statsUsersHour);
		return new Result();
	}
	
	@DeleteMapping()
	@ApiOperation(notes="StatsUsersHourController.delStatsUsersHour", value = "delStatsUsersHour")
	public Result delStatsUsersHour(@RequestParam(value = "puid", required = false) Integer puid){
		statsUsersHourService.delStatsUsersHour(puid);
		return new Result();
	}
	
	@GetMapping("getAll")
	@ApiOperation(notes="StatsUsersHourController.getAll()", value = "getAll")
	public Result getAll(){
		List<StatsUsersHour> data = statsUsersHourService.getAll();
		return new Result(data);
	}
	
	@GetMapping("getBykey")
	@ApiOperation(notes="StatsUsersHourController.findStatsUsersHourById", value = "findStatsUsersHourById")
	public Result findStatsUsersHourById(@RequestParam(value = "puid", required = false) Integer puid){
		StatsUsersHour data = statsUsersHourService.findStatsUsersHourById(puid);
		return new Result(data);
	}
}
