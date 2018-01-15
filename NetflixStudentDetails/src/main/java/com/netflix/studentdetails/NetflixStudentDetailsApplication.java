package com.netflix.studentdetails;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class NetflixStudentDetailsApplication {

	public static void main(String[] args) {
		SpringApplication.run(NetflixStudentDetailsApplication.class, args);
	}
}
