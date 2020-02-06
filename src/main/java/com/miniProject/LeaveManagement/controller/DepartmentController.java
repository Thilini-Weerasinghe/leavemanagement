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

import com.miniProject.LeaveManagement.model.Department;
import com.miniProject.LeaveManagement.model.Response;
import com.miniProject.LeaveManagement.service.DepartmentService;

@Controller
@RequestMapping("/department")
public class DepartmentController {

	@Autowired
	DepartmentService departmentService;
	
	@GetMapping("/findAll")
	public ResponseEntity<List<Department>> findAllDepartment(){
		
		return new ResponseEntity<List<Department>>(departmentService.findAllDepartment(), HttpStatus.OK);
	}
	
	@PostMapping("/addDepartment")
	public ResponseEntity<Department> addDepartment(@RequestBody Department department){
		Department dep = departmentService.addDepartment(department); 
		return new ResponseEntity<Department>(dep, HttpStatus.OK);
	}
	
	@PostMapping("/deleteDepartment/{id}")
	public ResponseEntity<Response> deleteDepartment(@PathVariable String id){
		departmentService.deleteDepartment(id); 
		return new ResponseEntity<Response>(new Response("deleted Department"), HttpStatus.OK);
	} 
}
