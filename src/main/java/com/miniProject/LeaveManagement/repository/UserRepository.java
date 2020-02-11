package com.miniProject.LeaveManagement.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.miniProject.LeaveManagement.model.User;

public interface UserRepository extends JpaRepository<User, String>{

	User findByEmail(String email);

	//List<User> findAll();

}
