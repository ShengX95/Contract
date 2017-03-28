package com.sx.http;

public class LoginStatus {
	private int status;
	private String message;
	public int getStatus() {
		return status;
	}

	public void setStatus(int status) {
		this.status = status;
	}
	
	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public void success(){
		status = 1;
		message = "登录成功!";
	}
	
	public void fail(){
		status = -1;
		message = "用户名或密码错误!";
	}
	
	public void errorCaptcha(){
		status = 0;
		message = "验证码错误！";
	}

	@Override
	public String toString() {
		return "LoginStatus [status=" + status + ", message=" + message + "]";
	}
}
