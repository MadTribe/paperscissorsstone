package com.hotel.service;

import java.util.List;

import com.hotel.entity.User;

public interface UserService {
	User saveAccount(User registration);
	List<User> findByUserName(String name);
}
