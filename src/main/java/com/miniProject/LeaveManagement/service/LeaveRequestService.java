package com.miniProject.LeaveManagement.service;

import java.util.List;

import com.miniProject.LeaveManagement.model.LeaveRequest;

public interface LeaveRequestService {

List<LeaveRequest> findAllLeaveRequest();
	
	void addLeaveRequest(LeaveRequest leaveRequest);

	void deleteLeaveRequest(String id);
}
