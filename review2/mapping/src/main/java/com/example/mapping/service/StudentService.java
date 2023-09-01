package com.example.mapping.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.mapping.model.Student;
import com.example.mapping.repository.StudentRepository;

@Service
public class StudentService {

	@Autowired
	private StudentRepository StudentRepository;
	
	public Student saveStudent(Student student) {
		return StudentRepository.save(student);
	}
}