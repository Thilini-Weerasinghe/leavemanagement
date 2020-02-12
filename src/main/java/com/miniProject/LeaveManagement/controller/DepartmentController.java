package com.miniProject.LeaveManagement.controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.server.NotAcceptableStatusException;

import com.miniProject.LeaveManagement.model.Department;
import com.miniProject.LeaveManagement.model.Response;
import com.miniProject.LeaveManagement.model.User;
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
	public ResponseEntity<Map<String, Object>> addDepartment(@RequestBody Department department){
		//Department dep = departmentService.addDepartment(department); 
		//return new ResponseEntity<Department>(dep, HttpStatus.OK);
		Map<String, Object> map = new HashMap<>();
		if(department.edit) {
//			if(userService.findUnique(user.get)) {
//				System.out.println("33333333333333333333333333333333"+userService.findUnique(user.getEmail()));
//			throw new NotAcceptableStatusException("user is exsit");
//		}else {
			Department editDept = departmentService.findById(department.getId());
			//user.setAi(editUser.getAi());
			map.put("action", new String("saved"));
			map.put("department", department);		
			departmentService.addDepartment(department); 
			return new ResponseEntity<Map<String, Object>>(map , HttpStatus.OK);
//		}
		}else {
			if(departmentService.findUnique(department.getDepartmentName())) {
				System.out.println("33333333333333333333333333333333"+departmentService.findUnique(department.getDepartmentName()));
			throw new NotAcceptableStatusException("department is exsit");
		}else {
			map.put("action", new String("saved"));
			map.put("department", department);
			departmentService.addDepartment(department); 
			return new ResponseEntity<Map<String, Object>>(map, HttpStatus.OK);
		}
		}
		
	}
	
	@PostMapping("/deleteDepartment/{id}")
	public ResponseEntity<Response> deleteDepartment(@PathVariable String id){
		departmentService.deleteDepartment(id); 
		return new ResponseEntity<Response>(new Response("deleted Department"), HttpStatus.OK);
	} 
}
