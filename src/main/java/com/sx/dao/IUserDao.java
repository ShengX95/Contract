package com.sx.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.sx.entity.User;

public interface IUserDao {
	public User getUser(User user);

	public void addUser(User user);

	public void updateUser(User user);

	public int deleteUser(String UserId);
	
	public User getUserById(String id);
	
	public List<User> getAll();
	
	public List<User> getUserByPage(@Param("start")int start,@Param("end")int end);
	
	public int count();
}
