package com.example.controller;

import java.util.Date;
import java.util.List;
import java.util.NoSuchElementException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.entity.Student;
import com.example.service.StudentService;

@RestController
public class StudentController {
	@Autowired
	private StudentService service;

	// RESTful API methods for Retrieval operations
	@GetMapping("/students")
	public List<Student> list() {
		return service.allStudents();
	}

	@GetMapping("/students/{date}")
	public ResponseEntity<Student> get(@PathVariable Date date) {
		try {
			Student Student = service.get(date);
			return new ResponseEntity<Student>(Student, HttpStatus.OK);
		} catch (NoSuchElementException e) {
			return new ResponseEntity<Student>(HttpStatus.NOT_FOUND);
		}
	}

	// RESTful API method for Create operation
	@PostMapping("/students")
	public void add(@RequestBody Student student) {
		service.saveStudent(student);
	}

	// RESTful API method for Update operation
	@PutMapping("/students/{date}")
	public ResponseEntity<?> update(@RequestBody Student student, @PathVariable Date date) {
		try {
			Student existStudent = service.get(date);
			System.out.println(existStudent);
			service.saveStudent(student);
			return new ResponseEntity<>(HttpStatus.OK);
		} catch (NoSuchElementException e) {
			return new ResponseEntity<>(HttpStatus.NOT_FOUND);
		}
	}

	// RESTful API method for Delete operation
	@DeleteMapping("/students/{date}")
	public ResponseEntity<?> delete(@PathVariable Date date) {
		try
		{
		service.delete(date);
		return new ResponseEntity<>(HttpStatus.OK);
		}
	catch (Exception e) {
		System.err.println("Student record not found");
		return new ResponseEntity<>(HttpStatus.NOT_FOUND);
	}
	}
	

}
