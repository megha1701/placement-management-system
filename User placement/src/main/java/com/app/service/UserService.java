package com.app.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.app.entity.User;
import com.app.repository.UserRepository;



@Service
@Transactional
public class UserService {
	@Autowired
	private UserRepository repo;
	
	public List<User> allUser()
	{
		return repo.findAll();
	}
	
	public void saveUser(User s)
	{
		repo.save(s);
	}
	
	public User get(long Id)
	{
		return repo.findById(Id).get();
	}
	
	public void delete(long Id)
	{
		repo.deleteById(Id);
	}

	
}
