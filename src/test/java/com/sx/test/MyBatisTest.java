package com.sx.test;

import java.util.List;

import javax.annotation.Resource;

import org.apache.log4j.Logger;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.sx.dao.IUserDao;
import com.sx.entity.User;
import com.sx.service.IUserService;
@ContextConfiguration(locations={"classpath:spring-mybatis.xml"})
@RunWith(SpringJUnit4ClassRunner.class)
public class MyBatisTest {
	@Resource
	private IUserService userService = null;
	@Resource
	private IUserDao userDao=null;
	private static Logger logger = Logger.getLogger(MyBatisTest.class);
	@Test
	public void getUser(){
		User user=userService.getUserById("shengx");
		logger.info(user);
		assert user!=null:"获取用户1失败";
		User user2=userService.getUserByIdAndPsd("shengx", "123456");
		assert user2!=null:"登录失败";
	}
	
	@Test
	public void getAllUser(){
		List<User> users=userService.getAllUser();
		logger.info(users);
	}
	
	@Test
	public void getUserPage(){
		logger.info(userDao.count());
		logger.info(userService.getUserByPage(1, 10));
	}
	
	@Test
	public void delUser(){
		logger.info(userService.delUser("19"));
	}
}
