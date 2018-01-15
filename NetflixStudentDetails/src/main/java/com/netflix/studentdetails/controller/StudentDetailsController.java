package com.netflix.studentdetails.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.netflix.studentdetails.model.StudentDetails;
import com.netflix.studentdetails.service.StudentDetailsService;

@RestController
public class StudentDetailsController {

	@Autowired
	private StudentDetailsService studentDetailsService;
	
	@RequestMapping(value="/add", method=RequestMethod.POST)
	public void add(@RequestBody StudentDetails studentDetails) {
		studentDetailsService.add(studentDetails);
	}
	
	@RequestMapping(value="/get", method=RequestMethod.GET)
	public StudentDetails findById(@RequestParam("id") String studentNo) {
		return studentDetailsService.findById(studentNo);
	}
	
	@RequestMapping(value="/getAll", method=RequestMethod.GET)
	public List<StudentDetails> getAll() {
		return studentDetailsService.getAll();
	}
	
	@RequestMapping(value="/update", method=RequestMethod.POST)
	public void update(@RequestBody StudentDetails studentDetails) {
		studentDetailsService.update(studentDetails);
	}
	
	@RequestMapping(value="/delete", method=RequestMethod.GET)
	public void delete(@RequestParam("id") String studentNo) {
		studentDetailsService.delete(studentNo);
	}
	
	@RequestMapping(value="/getDetails", method=RequestMethod.GET)
	public StudentDetails findDetails(@RequestParam("id") String studentNo) {
		return studentDetailsService.findById(studentNo);
	}
}
