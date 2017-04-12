package com.sx.service;

import java.util.List;

import com.sx.entity.User;

public interface IUserService {
	public User getUserById(String id);
	
	public User getUserByIdAndPsd(String id,String password);
	
	public List<User> getAllUser();
	
	public List<User> getUserByPage(int page,int rows);
	
	public int getCount();
	
	public int delUser(String id);
}
