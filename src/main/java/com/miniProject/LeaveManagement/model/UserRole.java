package com.miniProject.LeaveManagement.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import lombok.Data;

@Entity
@Data
@JsonIgnoreProperties({"hibernatelazyinitializer", "handler"})
public class UserRole {
	
	@Id
	public String id;
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int ai;
	private String role;
	private String userId;
	private String password;

}
