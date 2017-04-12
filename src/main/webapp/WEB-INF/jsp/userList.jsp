<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<table id="tt" title="用户列表" class="easyui-datagrid"
	style="width: 1172px; height: 488px" url="/user/all" toolbar="#toolbar"
	pagination="true" rownumbers="true" fitColumns="true"
	singleSelect="true" method="get" >
	<thead>
		<tr>
			<th field="id" width="50">id</th>
			<th field="username" width="50">用户名</th>
			<th field="password" width="50">密码</th>
		</tr>
	</thead>
</table>
<div id="toolbar">
	<a href="javascript:void(0)" class="easyui-linkbutton"
		iconCls="icon-add" plain="true" onclick="newUser()">添加用户</a>
	<a
		href="javascript:void(0)" class="easyui-linkbutton"
		iconCls="icon-edit" plain="true" onclick="editUser()">修改用户</a> 
	<a
		href="javascript:void(0)" class="easyui-linkbutton"
		iconCls="icon-remove" plain="true" onclick="destroyUser()">删除用户</a>
</div>