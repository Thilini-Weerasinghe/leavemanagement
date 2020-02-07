package com.miniProject.LeaveManagement.service;

import java.util.List;

import com.miniProject.LeaveManagement.model.LeaveType;

public interface LeaveTypeService {

	List<LeaveType> findAllLeaveType();
	
	void addLeaveType(LeaveType leaveType);

	void deleteLeaveType(String id);
}
