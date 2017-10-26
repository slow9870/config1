package com.sbi.ins.GHBasicDetailsController;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.sbi.ins.GHBasicDetailsEntity.GHBasicDetailsEntity;
import com.sbi.ins.IGHBasicDetailsService.GHBasicDetailsService;
import com.sbi.ins.IGHBasicDetailsService.IGHBasicDetailsService;

@RestController
@RequestMapping ("ghBasicDetails")
public class GHBasicDetailsController {
	@Autowired
private IGHBasicDetailsService ghBasicService;
	@RequestMapping (method=RequestMethod.GET,value="/all")
	public ResponseEntity<List<GHBasicDetailsEntity>> getAllData(){
		List<GHBasicDetailsEntity> data=ghBasicService.getAll();
		ResponseEntity< List<GHBasicDetailsEntity>> response= new ResponseEntity<>(data,HttpStatus.OK);
		return response;
		
	}
}
