package com.suman.internship.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.suman.internship.models.User;
import com.suman.internship.repositories.UserRepository;

@Service
public class UserService {
	
	@Autowired UserRepository userRepository;
	public void save(User user) {
		// TODO Auto-generated method stub
		userRepository.save(user);
	}

}
