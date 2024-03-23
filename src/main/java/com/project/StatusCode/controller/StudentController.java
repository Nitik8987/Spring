package com.project.StatusCode.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.http.HttpStatus;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.project.StatusCode.model.Student;

@RestController
public class StudentController {

	@GetMapping("/getStu")
	public ResponseEntity<Student> getStudent() {

		Student stu = new Student();

		stu.setId(12);
		stu.setName("Checking");
		stu.setAdress("Mumbai");

		return new ResponseEntity<Student>(stu, HttpStatus.OK);

	}

	@GetMapping("/student")
	public ResponseEntity<List<Student>> getAllStu() {

		Student stu = new Student();

		stu.setId(13);
		stu.setName("Checking");
		stu.setAdress("Mumbai"); 

		Student stu1 = new Student();

		stu1.setId(14);
		stu1.setName("Checking");
		stu1.setAdress("Mumbai"); 

		ArrayList<Student> al = new ArrayList<Student>();
		
		al.add(stu);
		al.add(stu1);
		
		return new ResponseEntity<List<Student>>(al,HttpStatus.OK);

	}
}
