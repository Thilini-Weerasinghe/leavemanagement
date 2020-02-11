package com.miniProject.LeaveManagement.service;

import java.util.List;

import com.miniProject.LeaveManagement.model.User;


public interface UserService {

	List<User> findAllUser();

	void addUser(User user);

	void deleteUser(String id);

	boolean findUnique(String email);

	User findById(String id);
}
