package com.sx.test;

import javax.annotation.Resource;
import org.apache.log4j.Logger;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import com.sx.entity.User;
import com.sx.service.IUserService;
@ContextConfiguration(locations={"classpath:spring-mybatis.xml"})
@RunWith(SpringJUnit4ClassRunner.class)
public class MyBatisTest {
	@Resource
	private IUserService userService = null;
	private static Logger logger = Logger.getLogger(MyBatisTest.class);
	@Test
	public void getUser(){
		User user=userService.getUserById("shengx");
		logger.info(user);
		assert user!=null:"获取用户1失败";
		User user2=userService.getUserByIdAndPsd("shengx", "123456");
		assert user2!=null:"登录失败";
	}
}
