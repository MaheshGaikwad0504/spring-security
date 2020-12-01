package com.security.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.security.model.Student;
import com.security.repository.StudentRepository;

@Service
public class StudentService {

	@Autowired
	StudentRepository studentRepo;

	public Student getStudent(int studentId) {
		return studentRepo.getStudent(studentId);
	}
}
