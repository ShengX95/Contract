<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<link rel="stylesheet" href="/css/page/login.css" />
<link rel="stylesheet" href="/css/bootstrap.min.css" />
<link rel="stylesheet" href="/css/icon.css" />
<link rel="stylesheet" href="/css/easyui.css" />
<script type="text/javascript" src="/js/jquery-3.2.0.min.js"></script>
<script type="text/javascript" src="/js/jquery.easyui.min.js"></script>
<script type="text/javascript">
	document.onkeydown = function(e) {
		var event = e || window.event;
		var code = event.keyCode || event.which || event.charCode;
		if (code == 13) {
			login();
		}
	}
	$(function() {
		$("input[name='login']").focus();
	});
	function cleardata() {
		$('#loginForm').form('clear');
		$('#showMsg').html('');
		$('#captcha').attr('src',
				'/captcha.jpg?' + Math.floor(Math.random() * 100));
	}
	function login() {
		if ($("input[name='username']").val() == ""
				|| $("input[name='password']").val() == "") {
			$("#showMsg").html("用户名或密码为空，请输入");
			$("input[name='username']").focus();
		} else {
			//ajax异步提交
			$.ajax({
				type : "POST", //post提交方式默认是get
				url : "/login",
				data : $("#loginForm").serialize(), //序列化
				error : function(request) { // 设置表单提交出错
					$("#showMsg").html(request); //登录错误提示信息
				},
				success : function(status) {
					if (status.status == 1)
						window.location = "/main";
					else
						$("#showMsg").html(status.message);
				}
			});
		}
	}
	function changeCaptcha() {
		$('#captcha').attr('src',
				'/captcha.jpg?' + Math.floor(Math.random() * 100));
	}
</script>
<title>登录页面</title>
</head>
<body>
	<div class="container">
		<div class="row">
			<div class="col-md-4"></div>
			<div class="col-md-4">
				<div id="panel-wapper">
					<div class="easyui-panel" title="登录框">
						<div id="form-wapper">
							<form id="loginForm" method="post">
								<table cellpadding="5">
									<tr>
										<td>用户名:</td>
										<td><input class="easyui-textbox" type="text"
											name="username" data-options="required:true" value="shengx"></input></td>
									</tr>
									<tr>
										<td>密码:</td>
										<td><input class="easyui-textbox" type="password"
											name="password" data-options="required:true" value="123456"></input></td>
									</tr>
									<tr>
										<td>验证码:</td>
										<td><input class="easyui-textbox" type="text"
											name="captcha" data-options="required:true" /><img
											id="captcha" src="/captcha.jpg" onclick="changeCaptcha()" /></td>
									</tr>
								</table>
							</form>
							<div id="showMsg"></div>
							<div id="botton-wapper">
								<a href="javascript:void(0)" class="easyui-linkbutton"
									onclick="login()">登录</a> <a href="javascript:void(0)"
									class="easyui-linkbutton" onclick="cleardata()">重置</a>
							</div>
						</div>
					</div>
				</div>
			</div>
			<div class="col-md-4"></div>
		</div>
	</div>
</body>
</html>