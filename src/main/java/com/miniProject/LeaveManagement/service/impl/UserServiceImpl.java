package com.miniProject.LeaveManagement.service.impl;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.miniProject.LeaveManagement.model.User;
import com.miniProject.LeaveManagement.repository.UserRepository;
import com.miniProject.LeaveManagement.service.UserService;

@Service
@Transactional
public class UserServiceImpl implements UserService {

	@Autowired
	UserRepository userRepository;
	
	@Override
	public List<User> findAllUser() {
		// TODO Auto-generated method stub
		return userRepository.findAll();
	}

	@Override
	public void addUser(User user) {
		// TODO Auto-generated method stub
		userRepository.save(user);	
	}

	@Override
	public void deleteUser(String id) {
		// TODO Auto-generated method stub
		userRepository.deleteById(id);;	
	}

	@Override
	public boolean findUnique(String email) {
		// TODO Auto-generated method stub
		//User user = userRepository.findByEmail(email);
		User user = userRepository.findByEmail(email);
		return user != null;
	}

	@Override
	public User findById(String id) {
		// TODO Auto-generated method stub
		return null;
	}

	
}
