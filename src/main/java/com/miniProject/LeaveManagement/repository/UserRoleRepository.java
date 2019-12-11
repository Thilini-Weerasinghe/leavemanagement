package com.miniProject.LeaveManagement.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.miniProject.LeaveManagement.model.UserRole;

public interface UserRoleRepository extends JpaRepository<UserRole, String> {

}
