package com.miniProject.LeaveManagement.model;

import java.util.UUID;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Transient;

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
	
	@ManyToOne
	@JoinColumn(name="department_id")
	public Department department;
	
	public String phoneNo;
	@Transient
	public Boolean edit;
}
