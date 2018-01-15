package com.netflix.studentdetails.service;

import java.util.ArrayList;
import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.netflix.studentdetails.dao.StudentDetailsDao;
import com.netflix.studentdetails.model.StudentDetails;

@Service
@Transactional
public class StudentDetailsServiceImpl implements StudentDetailsService{

	@Autowired
	private StudentDetailsDao studentDetailsDao;

	@Override
	public void add(StudentDetails details) {
		studentDetailsDao.save(details);
	}

	@Override
	public void update(StudentDetails details) {
		studentDetailsDao.save(details);
	}

	@Override
	public void delete(String studentNo) {
		studentDetailsDao.delete(studentNo);
	}

	@Override
	public StudentDetails findById(String studentNo) {
		return studentDetailsDao.findOne(studentNo);
	}

	@Override
	public List<StudentDetails> getAll() {
		List<StudentDetails> detailsList = new ArrayList<StudentDetails>();
		studentDetailsDao.findAll().forEach(detailsList::add);
		return detailsList;
	}
	
	@Override
	public String getMessage(String name) {
		return "Message with name is : "+name;
	}
	

}
