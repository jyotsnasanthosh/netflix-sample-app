package com.netflix.studentdetails.service;

import java.util.List;

import com.netflix.studentdetails.model.StudentDetails;

public interface StudentDetailsService {

	public void add(StudentDetails details);
	public void update(StudentDetails details);
	public void delete(String studentNo);
	public StudentDetails findById(String studentNo);
	public List<StudentDetails> getAll();
	public String getMessage(String name);
}
