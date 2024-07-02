package com.service;

import com.model.User;

public interface UserService {

	 public User register(User user);
	 
	 public User login(String username, String password);
}
