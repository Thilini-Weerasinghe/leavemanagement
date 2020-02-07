package com.miniProject.LeaveManagement.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.miniProject.LeaveManagement.model.LeaveType;

public interface LeaveTypeRepository extends JpaRepository<LeaveType, String> {

}
