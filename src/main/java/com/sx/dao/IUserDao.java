package com.sx.dao;

import com.sx.entity.User;

public interface IUserDao {
	public User getUser(User user);

	public void addUser(User user);

	public void updateUser(User user);

	public void deleteUser(String UserId);
	
	public User getUserById(String id);
	
}
