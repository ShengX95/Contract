package com.sx.service.impl;

import java.util.List;

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
	@Override
	public List<User> getAllUser() {
		return userdao.getAll();
	}
	
	@Override
	public List<User> getUserByPage(int page, int rows) {
		int start = (page-1)*rows;
		int end = start + rows;
		return userdao.getUserByPage(start, end);
	}
	
	@Override
	public int getCount() {
		return userdao.count();
	}
	@Override
	public int delUser(String id) {
		return userdao.deleteUser(id);
	}
}
