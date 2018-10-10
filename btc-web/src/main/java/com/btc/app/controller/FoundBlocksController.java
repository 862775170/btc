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

import com.btc.app.service.FoundBlocksService;
import com.btc.app.entity.FoundBlocks;

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
@RequestMapping("/foundBlocks")
@Api()
public class FoundBlocksController {
	
	@Resource
	private FoundBlocksService foundBlocksService;
	
	
	@PostMapping()
	@ApiOperation(notes="FoundBlocksController.addFoundBlocks", value = "addFoundBlocks")
	public Result addFoundBlocks(@RequestBody FoundBlocks foundBlocks){
		foundBlocksService.addFoundBlocks(foundBlocks);
		return new Result();
	}
	
	@PutMapping()
	@ApiOperation(notes="FoundBlocksController.editFoundBlocks", value = "editFoundBlocks")
	public Result editFoundBlocks(@RequestBody FoundBlocks foundBlocks){
		foundBlocksService.editFoundBlocks(foundBlocks);
		return new Result();
	}
	
	@DeleteMapping()
	@ApiOperation(notes="FoundBlocksController.delFoundBlocks", value = "delFoundBlocks")
	public Result delFoundBlocks(@RequestParam(value = "id", required = false) Integer id){
		foundBlocksService.delFoundBlocks(id);
		return new Result();
	}
	
	@GetMapping("getAll")
	@ApiOperation(notes="FoundBlocksController.getAll()", value = "getAll")
	public Result getAll(){
		List<FoundBlocks> data = foundBlocksService.getAll();
		return new Result(data);
	}
	
	@GetMapping("getBykey")
	@ApiOperation(notes="FoundBlocksController.findFoundBlocksById", value = "findFoundBlocksById")
	public Result findFoundBlocksById(@RequestParam(value = "id", required = false) Integer id){
		FoundBlocks data = foundBlocksService.findFoundBlocksById(id);
		return new Result(data);
	}
}
