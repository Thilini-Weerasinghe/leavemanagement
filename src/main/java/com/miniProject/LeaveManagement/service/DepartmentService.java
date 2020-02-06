package com.miniProject.LeaveManagement.service;

import java.util.List;

import com.miniProject.LeaveManagement.model.Department;

public interface DepartmentService{

	List<Department> findAllDepartment();

	Department addDepartment(Department department);

	void deleteDepartment(String id); 
}
