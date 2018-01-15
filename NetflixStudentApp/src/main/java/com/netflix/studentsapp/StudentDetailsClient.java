package com.netflix.studentsapp;

import java.util.List;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.netflix.studentsapp.model.StudentDetails;

//FeignClient to call the NetflixStudentDetails application services from NetflixStudentApp
@FeignClient("NetflixStudentDetails")
public interface StudentDetailsClient {

	@RequestMapping(value="/add", method=RequestMethod.POST)
	public void add(@RequestBody StudentDetails studentDetails);
	
	@RequestMapping(value="/get", method=RequestMethod.GET)
	public StudentDetails findById(@RequestParam("id") String studentNo);
	
	@RequestMapping(value="/getAll", method=RequestMethod.GET)
	public List<StudentDetails> getAll();
	
	@RequestMapping(value="/update", method=RequestMethod.POST)
	public void update(@RequestBody StudentDetails studentDetails);
	
	@RequestMapping(value="/delete", method=RequestMethod.GET)
	public void delete(@RequestParam("id") String studentNo);
	
	@RequestMapping(value="/getDetails", method=RequestMethod.GET)
	public StudentDetails findDetails(@RequestParam("id") String studentNo);
}
