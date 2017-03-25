package com.sx.service.impl;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.sx.dao.IUserDao;
import com.sx.entity.User;
import com.sx.service.IUserService;
@Service("userService")
public class UserServiceImpl implements IUserService {
	@Resource
	private IUserDao userdao;
	@Override
	public User getUserById(String id) {
		return userdao.getUserById(id);
	}
	@Override
	public User getUserByIdAndPsd(String id, String password) {
		return userdao.getUser(new User(id, "", password));
	}
}
