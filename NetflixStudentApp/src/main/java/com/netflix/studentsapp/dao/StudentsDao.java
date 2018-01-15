package com.netflix.studentsapp.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.netflix.studentsapp.model.Students;

public interface StudentsDao extends JpaRepository<Students, String>{

}