package com.miniProject.LeaveManagement.service.impl;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.miniProject.LeaveManagement.model.LeaveType;
import com.miniProject.LeaveManagement.repository.LeaveTypeRepository;
import com.miniProject.LeaveManagement.service.LeaveTypeService;
@Service
@Transactional
public class LeaveTypeServiceImpl implements LeaveTypeService {

	@Autowired
	LeaveTypeRepository leaveTypeRepository;
	
	@Override
	public List<LeaveType> findAllLeaveType() {
		// TODO Auto-generated method stub
		return leaveTypeRepository.findAll();
	}

	@Override
	public void addLeaveType(LeaveType leaveType) {
		// TODO Auto-generated method stub
		leaveTypeRepository.save(leaveType);
	}

	@Override
	public void deleteLeaveType(String id) {
		// TODO Auto-generated method stub
		leaveTypeRepository.deleteById(id);
	}

	
}
