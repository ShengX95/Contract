<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<script type="text/javascript" src="/js/jquery-3.2.0.min.js"></script>
<link rel="stylesheet" href="/css/bootstrap.min.css"/>
<script type="text/javascript" src="/js/bootstrap.min.js"></script>
<title>登录页面</title>
</head>
<body>
<h1>登录页面</h1>
<form action="login" method="post">
	<p>用户名:<input type="text" name="username" id="username"/></p>
	<p>密码:<input type="password" name="password" id="password"/></p>
	<button class="btn btn-default" type="submit">Button</button>
</form>
</body>
</html>