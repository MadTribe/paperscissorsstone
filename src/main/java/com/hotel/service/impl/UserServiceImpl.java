package com.hotel.service.impl;

 
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hotel.entity.User;
import com.hotel.repository.RegistrationRepository;
import com.hotel.repository.UserRepository;
import com.hotel.service.UserService;
@Service
public class UserServiceImpl implements UserService {

	@Autowired
	private UserRepository  userRepository;
	
	@Override
	public User saveAccount(User registration) {
		// TODO Auto-generated method stub
		return userRepository.saveAndFlush(registration);
	}

	@Override
	public List<User> findByUserName(String name) {
		// TODO Auto-generated method stub
		return userRepository.findByUserName(name);
	}
	
}
