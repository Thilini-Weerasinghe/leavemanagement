package com.miniProject.LeaveManagement.model;

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
public class User {
	@Id
	private String id = UUID.randomUUID().toString();
	
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int ai;
	public String firstName;
	public String lastName;
	public String email;
	public String employeeId;
	public String address;
	public String departmentId;
	public int phoneNo;
}
