package com.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.controller.UserController;
import com.model.User;

public interface UserRepository extends JpaRepository<UserController, Long> {
    public User findByUsername(String username);

	public User save(User user);
}
