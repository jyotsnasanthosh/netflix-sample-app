package com.netflix.studentdetails.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.netflix.studentdetails.model.StudentDetails;

public interface StudentDetailsDao extends JpaRepository<StudentDetails, String>{
	
}
