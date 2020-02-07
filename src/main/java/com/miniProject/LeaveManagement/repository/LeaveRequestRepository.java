package com.miniProject.LeaveManagement.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.miniProject.LeaveManagement.model.LeaveRequest;

public interface LeaveRequestRepository extends JpaRepository<LeaveRequest, String> {

}
