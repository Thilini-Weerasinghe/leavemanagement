package com.miniProject.LeaveManagement.model;

import java.sql.Date;
import java.util.UUID;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import lombok.Data;

@Entity
@Data
@JsonIgnoreProperties({"hibernatelazyinitializer", "handler"})
public class LeaveRequest {

	@Id
	private String id = UUID.randomUUID().toString();
	
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int ai;
	public String description;
	public String leaveType;
	public String userId;
	public String status;
	public Date startDate;
	public Date endDate;
	
 
}
