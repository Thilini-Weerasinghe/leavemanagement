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
import org.springframework.web.bind.annotation.RestController;

import com.miniProject.LeaveManagement.model.UserRole;
import com.miniProject.LeaveManagement.service.UserRoleService;

@Controller
@RequestMapping("/userRole")
public class UserRoleController {

	@Autowired
	UserRoleService userRoleSerivce; 
	
	@GetMapping("/findAll")
	public ResponseEntity<List<UserRole>> findAllUserRole(){
		
		return new ResponseEntity<List<UserRole>>(userRoleSerivce.findAllUserRole(), HttpStatus.OK);
	}
	
	@PostMapping("/addUserRole")
	public String addUserRole(@RequestBody UserRole userRole){
		userRoleSerivce.addRole(userRole); 
		return "done";
	}
	
	@PostMapping("/deleteUser/{id}")
	public String deleteUserRole(@PathVariable String id){
		userRoleSerivce.deleteRole(id); 
		return "done";
	}
}
