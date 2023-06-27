package com.example.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.example.entity.College;
import com.example.repository.CollegeRepository;

@Service
@Transactional

public class CollegeService {
	
		@Autowired
		private CollegeRepository repo;
		
		public List<College> allColleges()
		{
			return repo.findAll();
		}
		
		public void saveCollege(College s)
		{
			repo.save(s);
		}
		
		public College get(Long id)
		{
			return repo.findById(id).get();
		}
		
		public void delete(Long id)
		{
			repo.deleteById(id);
		}
		

}