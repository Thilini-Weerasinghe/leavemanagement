package com.miniProject.LeaveManagement.service.impl;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.miniProject.LeaveManagement.model.LeaveRequest;
import com.miniProject.LeaveManagement.repository.LeaveRequestRepository;
import com.miniProject.LeaveManagement.service.LeaveRequestService;

@Service
@Transactional
public class LeaveRequestServiceImpl implements LeaveRequestService {

	@Autowired
	LeaveRequestRepository leaveRequestRepository;
	
	@Override
	public List<LeaveRequest> findAllLeaveRequest() {
		// TODO Auto-generated method stub
		return leaveRequestRepository.findAll();
	}

	@Override
	public void addLeaveRequest(LeaveRequest leaveRequest) {
		// TODO Auto-generated method stub
		leaveRequestRepository.save(leaveRequest);
		
	}

	@Override
	public void deleteLeaveRequest(String id) {
		// TODO Auto-generated method stub
		leaveRequestRepository.deleteById(id);
	}

}
