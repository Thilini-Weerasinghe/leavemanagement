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

import com.miniProject.LeaveManagement.model.Response;
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
	public ResponseEntity<Response> addUserRole(@RequestBody UserRole userRole){
		userRoleSerivce.addRole(userRole); 
		return new ResponseEntity<Response>(new Response("aded user"), HttpStatus.OK);
	}
	
	@PostMapping("/deleteUser/{id}")
	public ResponseEntity<Response> deleteUserRole(@PathVariable String id){
		userRoleSerivce.deleteRole(id); 
		return new ResponseEntity<Response>(new Response("aded user"), HttpStatus.OK);
	}
}
