<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<link rel="stylesheet" href="/css/bootstrap.min.css" />
<link rel="stylesheet" href="/css/icon.css" />
<link rel="stylesheet" href="/css/easyui.css" />
<script type="text/javascript" src="/js/jquery-3.2.0.min.js"></script>
<script type="text/javascript" src="/js/jquery.easyui.min.js"></script>
<link rel="stylesheet" href="/css/page/main.css" />
<script type="text/javascript" src="/js/main.js"></script>
<title>合同管理系统</title>
</head>
<body>
	<div class="container">
		<div class="row">
			<h3>合同管理系统</h3>
		</div>
		<div class="row">
			<div class="easyui-layout" style="width: 1275px; height: 520px;">
				<!-- 左侧菜单栏 -->
				<div data-options="region:'west',split:true" title="操作"
					style="width: 100px;">
					<div class="easyui-accordion" data-options="fit:true,border:false">
						<div title="用户管理" style="padding: 10px;">
							<a href="javascript:void(0)" class="easyui-linkbutton" data-options="plain:true" onclick="addPanel('/user/panel','查询用户')">查询用户</a>
							<a href="javascript:void(0)" class="easyui-linkbutton" data-options="plain:true" onclick="addPanel('about.html'),'添加用户'">添加用户</a>
						</div>
						<div title="合同管理" data-options="selected:true"
							style="padding: 10px;">content2</div>
						<div title="系统管理" style="padding: 10px">content3</div>
					</div>
				</div>
			    <!-- 内容区域 -->
				<div
					data-options="region:'center'">
					<div class="easyui-tabs" id="tabs"
						data-options="fit:true,border:false,plain:true">
						<div title="关于" data-options="href:'about.html'"
							style="padding: 10px"></div>
					</div>
				</div>
			</div>
		</div>
	</div>
</body>
</html>