package com.example.controller;

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
import org.springframework.web.bind.annotation.RestController;

import com.example.entity.College;
import com.example.service.CollegeService;
@RestController
public class CollegeController {

		@Autowired
		private CollegeService service;

		// RESTful API methods for Retrieval operations
		@GetMapping("/colleges")
		public List<College> list() {
			return service.allColleges();
		}

		@GetMapping("/students/{id}")
		public ResponseEntity<College> get(@PathVariable Long id) {
			try {
				College college = service.get(id);
				return new ResponseEntity<College>(college, HttpStatus.OK);
			} catch (NoSuchElementException e) {
				return new ResponseEntity<College>(HttpStatus.NOT_FOUND);
			}
		}

		// RESTful API method for Create operation
		@PostMapping("/colleges")
		public void add(@RequestBody College college) {
			service.saveCollege(college);
		}

		// RESTful API method for Update operation
		@PutMapping("/colleges/{id}")
		public ResponseEntity<?> update(@RequestBody College college, @PathVariable Long id) {
			try {
					College existCollege = service.get(id);
				System.out.println(existCollege);
				service.saveCollege(college);
				return new ResponseEntity<>(HttpStatus.OK);
			} catch (NoSuchElementException e) {
				return new ResponseEntity<>(HttpStatus.NOT_FOUND);
			}
		}

		// RESTful API method for Delete operation
		@DeleteMapping("/colleges/{id}")
		public ResponseEntity<?> delete(@PathVariable Long id) {
			try
			{
			service.delete(id);
			return new ResponseEntity<>(HttpStatus.OK);
			}
		catch (Exception e) {
			System.err.println("Student record not found");
			return new ResponseEntity<>(HttpStatus.NOT_FOUND);
		}
		}
		

	}
