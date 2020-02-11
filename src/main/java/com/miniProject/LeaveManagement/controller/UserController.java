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
	public ResponseEntity<Map<String, Object>> addUser(@RequestBody User user){
		Map<String, Object> map = new HashMap<>();
		if(user.edit) {
//			if(userService.findUnique(user.get)) {
//				System.out.println("33333333333333333333333333333333"+userService.findUnique(user.getEmail()));
//			throw new NotAcceptableStatusException("user is exsit");
//		}else {
			User editUser = userService.findById(user.getId());
			//user.setAi(editUser.getAi());
			map.put("action", new String("saved"));
			map.put("user", user);		
			userService.addUser(user); 
			return new ResponseEntity<Map<String, Object>>(map , HttpStatus.OK);
//		}
		}else {
			
			map.put("action", new String("saved"));
			map.put("user", user);
			userService.addUser(user); 
			return new ResponseEntity<Map<String, Object>>(map, HttpStatus.OK);
		}
		
		
		
	}
	
//	Map<String, Object> map = new HashMap<>();
//	if(faculty.edit) {
//		if(facultyService.findUnique(faculty.getName(),faculty.getId())) {
//			throw new NotAcceptableStatusException("company is exsit");
//		}else {
//			Faculty editFaculty = facultyService.findById(faculty.getId());
//			faculty.setAi(editFaculty.getAi());
//			map.put("action", new String("saved"));
//			map.put("faculty", faculty);		
//			facultyService.addFaculty(faculty);
//			return new ResponseEntity<Map<String, Object>>(map , HttpStatus.OK);
//		}
//	}else {
//		
//		map.put("action", new String("saved"));
//		map.put("faculty", faculty);		
//		facultyService.addFaculty(faculty);
//    	return new ResponseEntity<Map<String, Object>>(map , HttpStatus.OK);
//	}
	
	@PostMapping("/deleteUser/{id}")
	public ResponseEntity<Response> deleteUser(@PathVariable String id){
		userService.deleteUser(id); 
		return new ResponseEntity<Response>(new Response("deleted user"), HttpStatus.OK);
	}
	
}
