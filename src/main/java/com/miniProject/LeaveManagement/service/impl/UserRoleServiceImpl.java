package com.miniProject.LeaveManagement.service.impl;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.miniProject.LeaveManagement.model.UserRole;
import com.miniProject.LeaveManagement.repository.UserRoleRepository;
import com.miniProject.LeaveManagement.service.UserRoleService;

@Service
@Transactional
public class UserRoleServiceImpl implements UserRoleService {
 
	@Autowired
	UserRoleRepository userRoleRepository; 

	@Override
	public List<UserRole> findAllUserRole() {
		// TODO Auto-generated method stub
		return userRoleRepository.findAll();
	}

	@Override
	public void addRole(UserRole userRole) {
		// TODO Auto-generated method stub
		userRoleRepository.save(userRole);
	}

	@Override
	public void deleteRole(String id) {
		// TODO Auto-generated method stub
		
		userRoleRepository.deleteById(id);;
		
	}


}
