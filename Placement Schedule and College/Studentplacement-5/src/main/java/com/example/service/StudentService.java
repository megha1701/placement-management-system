package com.example.service;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.example.entity.Student;
import com.example.repository.StudentRepository;

@Service
@Transactional
public class StudentService {
	@Autowired
	private StudentRepository repo;
	
	public List<Student> allStudents()
	{
		return repo.findAll();
	}
	
	public void saveStudent(Student s)
	{
		repo.save(s);
	}
	
	public Student get(Date date)
	{
		return repo.findById(date).get();
	}
	
	public void delete(Date date)
	{
		repo.deleteById(date);
	}
	

}
