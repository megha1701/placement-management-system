package com.app.controller;

import java.util.List;
import java.util.NoSuchElementException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.app.entity.User;
import com.app.service.UserService;

@CrossOrigin(allowedHeaders="*",origins="*")
@RestController
public class UserController {
	@Autowired
	private UserService service;

	// RESTful API methods for Retrieval operations
	@GetMapping("/user")
	public List<User> list() {
		return service.allUser();
	}

	@GetMapping("/user/{Id}")
	public ResponseEntity<User> get(@PathVariable long Id) {
		try {
			User User = service.get(Id);
			return new ResponseEntity<User>(User, HttpStatus.OK);
		} catch (NoSuchElementException e) {
			return new ResponseEntity<User>(HttpStatus.NOT_FOUND);
		}
	}

	// RESTful API method for Create operation
	@PostMapping("/user")
	public void add(@RequestBody User user) {
		service.saveUser(user);
	}

	// RESTful API method for Update operation
	@PutMapping("/user/{Id}")
	public ResponseEntity<?> update(@RequestBody User user, @PathVariable long Id) {
		try {
			User existUser = service.get(Id);
			System.out.println(existUser);
			service.saveUser(user);
			return new ResponseEntity<>(HttpStatus.OK);
		} catch (NoSuchElementException e) {
			return new ResponseEntity<>(HttpStatus.NOT_FOUND);
		}
	}

	// RESTful API method for Delete operation
	@DeleteMapping("/user/{Id}")
	public ResponseEntity<?> delete(@PathVariable long Id) {
		try
		{
		service.delete(Id);
		return new ResponseEntity<>(HttpStatus.OK);
		}
	catch (Exception e) {
		System.err.println("Student record not found");
		return new ResponseEntity<>(HttpStatus.NOT_FOUND);
	}
	}

}
