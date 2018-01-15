package com.netflix.studentdetails.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="student_details")
public class StudentDetails {

	@Id
	@Column(name="studentno")
	private String studentNo;
	
	@Column(name="score")
	private int score;
	
	@Column(name="grade")
	private String grade;
	
	@Column(name="school")
	private String school;

	public String getStudentNo() {
		return studentNo;
	}
	public void setStudentNo(String studentNo) {
		this.studentNo = studentNo;
	}
	public int getScore() {
		return score;
	}
	public void setScore(int score) {
		this.score = score;
	}
	public String getGrade() {
		return grade;
	}
	public void setGrade(String grade) {
		this.grade = grade;
	}
	public String getSchool() {
		return school;
	}
	public void setSchool(String school) {
		this.school = school;
	}
	@Override
	public String toString() {
		return "StudentDetails [studentNo=" + studentNo + ", score=" + score + ", grade=" + grade + ", school=" + school
				+ "]";
	}
}
