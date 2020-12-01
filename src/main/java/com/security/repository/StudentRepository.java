package com.security.repository;

import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.security.model.Student;

@Repository
public class StudentRepository {

	private static List<Student> students = Arrays.asList(new Student(101, "Mahesh"), new Student(102, "Sachin"),
			new Student(103, "Rahul"));

	public Student getStudent(int studentId) {
		return students.stream().filter(student -> studentId == student.getStudentId()).findAny().orElse(null);
	}
}
