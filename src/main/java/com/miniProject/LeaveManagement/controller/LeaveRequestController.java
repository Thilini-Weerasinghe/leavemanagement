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

import com.miniProject.LeaveManagement.model.LeaveRequest;
import com.miniProject.LeaveManagement.model.Response;
import com.miniProject.LeaveManagement.service.LeaveRequestService;


@Controller
@RequestMapping("/leaveRequest")
public class LeaveRequestController {
	
	@Autowired
	LeaveRequestService leaveRequestService;
	
	@GetMapping("/findAll")
	public ResponseEntity<List<LeaveRequest>> findAllLeaveRequest(){
		return new ResponseEntity<List<LeaveRequest>>(leaveRequestService.findAllLeaveRequest(), HttpStatus.OK);
	}
	
	@PostMapping("/addLeaveRequest")
	public ResponseEntity<Response> addLeaveRequest(@RequestBody LeaveRequest leaveRequest){
		leaveRequestService.addLeaveRequest(leaveRequest); 
		return new ResponseEntity<Response>(new Response("added leaveRequest"), HttpStatus.OK);
	}
	
	@PostMapping("/deleteLeaveRequest/{id}")
	public ResponseEntity<Response> deleteLeaveRequest(@PathVariable String id){
		leaveRequestService.deleteLeaveRequest(id); 
		return new ResponseEntity<Response>(new Response("deleted leaveRequest"), HttpStatus.OK);
	}
	
	

}
