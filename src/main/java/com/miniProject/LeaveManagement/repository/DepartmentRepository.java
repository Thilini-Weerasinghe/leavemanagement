package com.miniProject.LeaveManagement.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.miniProject.LeaveManagement.model.Department;

public interface DepartmentRepository extends JpaRepository <Department, String> {

	//Department findByName(String departmentName);

	Department findByName(String departmentName);

	

}
