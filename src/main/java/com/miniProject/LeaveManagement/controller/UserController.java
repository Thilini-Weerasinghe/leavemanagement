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
import com.miniProject.LeaveManagement.model.User;
import com.miniProject.LeaveManagement.service.UserService;

@Controller
@RequestMapping("/user")
public class UserController {

	@Autowired
	UserService userService;
	
	@GetMapping("/findAll")
	public ResponseEntity<List<User>> findAllUser(){
		
		return new ResponseEntity<List<User>>(userService.findAllUser(), HttpStatus.OK);
	}
	
	@PostMapping("/addUser")
	public ResponseEntity<Response> addUser(@RequestBody User user){
		userService.addUser(user); 
		return new ResponseEntity<Response>(new Response("added user"), HttpStatus.OK);
	}
	
	@PostMapping("/deleteUser/{id}")
	public ResponseEntity<Response> deleteUser(@PathVariable String id){
		userService.deleteUser(id); 
		return new ResponseEntity<Response>(new Response("deleted user"), HttpStatus.OK);
	}
	
}
