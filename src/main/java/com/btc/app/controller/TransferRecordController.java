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

import com.btc.app.service.TransferRecordService;
import com.btc.app.entity.TransferRecord;

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
@RequestMapping("/transferRecord")
@Api()
public class TransferRecordController {
	
	@Resource
	private TransferRecordService transferRecordService;
	
	
	@PostMapping()
	@ApiOperation(notes="TransferRecordController.addTransferRecord", value = "addTransferRecord")
	public Result addTransferRecord(@RequestBody TransferRecord transferRecord){
		transferRecordService.addTransferRecord(transferRecord);
		return new Result();
	}
	
	@PutMapping()
	@ApiOperation(notes="TransferRecordController.editTransferRecord", value = "editTransferRecord")
	public Result editTransferRecord(@RequestBody TransferRecord transferRecord){
		transferRecordService.editTransferRecord(transferRecord);
		return new Result();
	}
	
	@DeleteMapping()
	@ApiOperation(notes="TransferRecordController.delTransferRecord", value = "delTransferRecord")
	public Result delTransferRecord(@RequestParam(value = "puid", required = false) Integer puid){
		transferRecordService.delTransferRecord(puid);
		return new Result();
	}
	
	@GetMapping("getAll")
	@ApiOperation(notes="TransferRecordController.getAll()", value = "getAll")
	public Result getAll(){
		List<TransferRecord> data = transferRecordService.getAll();
		return new Result(data);
	}
	
	@GetMapping("getBykey")
	@ApiOperation(notes="TransferRecordController.findTransferRecordById", value = "findTransferRecordById")
	public Result findTransferRecordById(@RequestParam(value = "puid", required = false) Integer puid){
		TransferRecord data = transferRecordService.findTransferRecordById(puid);
		return new Result(data);
	}
}
