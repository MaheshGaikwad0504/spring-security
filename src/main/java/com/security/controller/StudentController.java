package com.security.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.security.model.Student;
import com.security.service.StudentService;

@RestController
public class StudentController {

	@Autowired
	StudentService studentService;

	@GetMapping("students/{studentId}")
	public Student getStudent(@PathVariable("studentId") int studentId) {
		return studentService.getStudent(studentId);
	}

	@GetMapping("/")
	public String test() {
		return "Welcome to spring security";
	}
}
