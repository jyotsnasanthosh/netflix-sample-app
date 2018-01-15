package com.netflix.studentsapp.service;

import java.util.List;

import com.netflix.studentsapp.model.Students;

public interface StudentsService {

	public void add(Students marks);
	public void update(Students marks);
	public void delete(String studentId);
	public Students findById(String studentId);
	public List<Students> findAll();
}
