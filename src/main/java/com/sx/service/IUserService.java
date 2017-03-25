package com.sx.service;

import com.sx.entity.User;

public interface IUserService {
	public User getUserById(String id);
	
	public User getUserByIdAndPsd(String id,String password);
}
