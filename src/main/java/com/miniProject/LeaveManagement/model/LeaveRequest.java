package com.miniProject.LeaveManagement.model;

import java.sql.Date;
import java.util.UUID;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

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
	
	@ManyToOne
	@JoinColumn(name="leaving_type")
	public LeaveType leaveType;
	
	@ManyToOne
	@JoinColumn(name="user_id")
	public User user;
	
	public String status;
	public Date startDate;
	public Date endDate;
	
 
}
