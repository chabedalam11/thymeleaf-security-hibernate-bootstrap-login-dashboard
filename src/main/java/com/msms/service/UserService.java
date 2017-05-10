package com.msms.service;

import com.msms.model.User;

public interface UserService {
	public User findUserByEmail(String email);
	public void saveUser(User user);
}
