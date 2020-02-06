package com.miniProject.LeaveManagement.service.impl;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.miniProject.LeaveManagement.model.Department;
import com.miniProject.LeaveManagement.repository.DepartmentRepository;
import com.miniProject.LeaveManagement.service.DepartmentService;

@Service
@Transactional
public class DepartmentServiceImpl implements DepartmentService  {

	@Autowired
	DepartmentRepository departmentRepository;
	
	@Override
	public List<Department> findAllDepartment() {
		// TODO Auto-generated method stub
		return departmentRepository.findAll();
	}

	@Override
	public Department addDepartment(Department department) {
		// TODO Auto-generated method stub
		return departmentRepository.save(department);
	}

	@Override
	public void deleteDepartment(String id) {
		// TODO Auto-generated method stub
		
		departmentRepository.deleteById(id);
		
	}



}
