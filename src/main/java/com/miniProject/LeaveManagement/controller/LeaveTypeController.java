package com.miniProject.LeaveManagement.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

import com.miniProject.LeaveManagement.model.LeaveType;
import com.miniProject.LeaveManagement.model.Response;
import com.miniProject.LeaveManagement.service.LeaveTypeService;

@Controller
@RequestMapping("/leaveType")
public class LeaveTypeController {

	@Autowired
	LeaveTypeService leaveTypeService;
	
	@GetMapping("/findAll")
	public ResponseEntity<List<LeaveType>> findAllLeaveType(){
		return new ResponseEntity<List<LeaveType>>(leaveTypeService.findAllLeaveType(), HttpStatus.OK);
	}
	
	@PostMapping("/addLeaveType")
	public ResponseEntity<Response> addLeaveType(@RequestBody LeaveType leaveType){
		leaveTypeService.addLeaveType(leaveType); 
		return new ResponseEntity<Response>(new Response("added leaveType"), HttpStatus.OK);
	}
	
	@PostMapping("/deleteLeaveType/{id}")
	public ResponseEntity<Response> deleteLeaveType(@PathVariable String id){
		leaveTypeService.deleteLeaveType(id); 
		return new ResponseEntity<Response>(new Response("deleted leaveType"), HttpStatus.OK);
	}
}
