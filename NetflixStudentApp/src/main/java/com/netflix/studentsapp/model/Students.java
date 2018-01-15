package com.netflix.studentsapp.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="students")
public class Students {

	@Id
	@Column(name="studentid")
	private String studentid; 
	
	@Column(name="name")
	private String name;
	
	@Column(name="department")
	private String department;

	public String getStudentid() {
		return studentid;
	}
	public void setStudentid(String studentid) {
		this.studentid = studentid;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDepartment() {
		return department;
	}
	public void setDepartment(String department) {
		this.department = department;
	}
	@Override
	public String toString() {
		return "Students [studentid=" + studentid + ", name=" + name + ", department=" + department + "]";
	}
}
