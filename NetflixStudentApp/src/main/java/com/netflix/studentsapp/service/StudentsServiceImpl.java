package com.netflix.studentsapp.service;

import java.util.ArrayList;
import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.netflix.studentsapp.dao.StudentsDao;
import com.netflix.studentsapp.model.Students;

@Service
@Transactional
public class StudentsServiceImpl implements StudentsService{

	@Autowired
	private StudentsDao studentsDao;

	@Override
	public void add(Students students) {
		studentsDao.save(students);
	}

	@Override
	public void update(Students marks) {
		studentsDao.save(marks);
	}

	@Override
	public void delete(String studentId) {
		studentsDao.delete(studentId);
	}

	@Override
	public Students findById(String studentId) {
	    return studentsDao.findOne(studentId);
	}
	
	@Override
	public List<Students> findAll() {
		List<Students> studentList = new ArrayList<Students>();
		studentsDao.findAll().forEach(studentList::add);
		return studentList;
	}
}
