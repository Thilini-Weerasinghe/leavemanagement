package com.miniProject.LeaveManagement.service;

import java.util.List;

import com.miniProject.LeaveManagement.model.UserRole;

public interface UserRoleService {

	List<UserRole> findAllUserRole();

	void addRole(UserRole userRole);

	void deleteRole(String id);

}
