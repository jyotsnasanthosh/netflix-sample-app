package com.netflix.hystrix.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;

@RestController
public class NetflixHystrixController {

	@Autowired
	RestTemplate restTemplate;
	
	@Bean
	public RestTemplate getRestTemplate() {
		return new RestTemplate();
	}
	
	@RequestMapping(value="/circuitBreaker", method=RequestMethod.GET)
	@HystrixCommand(fallbackMethod="fallbackMethod")
	public String ciruitBreaker() {
		return this.restTemplate.getForObject("http://localhost:8675/students/action/getAll", String.class);
	}
	
	public String fallbackMethod() {
		return "This is the fallback method executing";
	}
}
