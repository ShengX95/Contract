package com.sx.controller;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import org.apache.log4j.Logger;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.google.code.kaptcha.Constants;
import com.sx.context.Page;
import com.sx.entity.User;
import com.sx.http.LoginStatus;
import com.sx.service.IUserService;

@Controller
@RequestMapping("/")
public class LoginController {
	@Resource
	private IUserService userService;
	Logger logger = Logger.getLogger(LoginController.class);

	@RequestMapping(path = "/login", method = RequestMethod.GET)
	public String toIndex(HttpServletRequest request) {
		return Page.LOGIN_PAGE;
	}

	@RequestMapping(path = "/login", method = RequestMethod.POST)
	@ResponseBody
	public LoginStatus login(HttpServletRequest request, Model model) {
		String id = request.getParameter("username");
		String password = request.getParameter("password");
		String captcha = request.getParameter("captcha");
		String captcha2 = (String) request.getSession().getAttribute(Constants.KAPTCHA_SESSION_KEY);
		LoginStatus status = new LoginStatus();
		//验证码
//		if(!captcha.equals(captcha2)){
//			status.errorCaptcha();
//			return status;
//		}
		User user = userService.getUserByIdAndPsd(id, password);
		logger.info(user);
		
		if (user != null) {
			status.success();
			request.getSession().setAttribute("user", user);
		} else
			status.fail();
		logger.info(status);
		return status;
		
	}

	@RequestMapping(path = "/main")
	public String toMain(HttpServletRequest request) {
		if(request.getSession().getAttribute("user")!=null)
			return Page.MAIN_PAGE;
		else
			return "redirect:"+Page.LOGIN_PAGE;
	}
}
