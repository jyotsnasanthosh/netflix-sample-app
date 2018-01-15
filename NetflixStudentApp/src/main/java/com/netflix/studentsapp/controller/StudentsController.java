package com.netflix.studentsapp.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.netflix.studentsapp.StudentDetailsClient;
import com.netflix.studentsapp.model.Details;
import com.netflix.studentsapp.model.StudentDetails;
import com.netflix.studentsapp.model.Students;
import com.netflix.studentsapp.service.StudentsService;

@RestController
@RequestMapping("/action")
public class StudentsController {

	@Autowired
	private StudentsService studentsService;
	
	@Autowired
	private StudentDetailsClient studentDetailsClient;

	@RequestMapping(value="/add", method=RequestMethod.POST)
	public void add(@RequestBody Students students) {
		studentsService.add(students);
	}
	
	@RequestMapping(value="/get", method=RequestMethod.GET)
	public Students findById(@RequestParam("id") String studentId) {
		return studentsService.findById(studentId);
	}
	
	@RequestMapping(value="/getAll", method=RequestMethod.GET)
	public List<Students> findAll() {
		return studentsService.findAll();
	}
	
	@RequestMapping(value="/update", method=RequestMethod.POST)
	public void update(@RequestBody Students students) {
		studentsService.update(students);
	}
	
	@RequestMapping(value="/delete", method=RequestMethod.GET)
	public void delete(@RequestParam("id") String studentId) {
		studentsService.delete(studentId);
	}
	
	@RequestMapping(value="/getDetail", method=RequestMethod.GET)
	public Details findDetails(@RequestParam("id") String studentId) {
		
		Students students = studentsService.findById(studentId);
		
		//Calling the findDetails service of NetflixStudentDetails application
		StudentDetails studentDetails = studentDetailsClient.findDetails(studentId);
		
		Details details = new Details();
		details.setStudentid(students.getStudentid());
		details.setName(students.getName());
		details.setDepartment(students.getDepartment());
		details.setGrade(studentDetails.getGrade());
		details.setScore(studentDetails.getScore());
		details.setSchool(studentDetails.getSchool());
		
		return details;
	}
}
