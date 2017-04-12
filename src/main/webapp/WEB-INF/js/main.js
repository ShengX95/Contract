/**
 * 主页JS
 */

var userpanel = 0;

function addPanel(url, tit) {
	$('#tabs').tabs('add', {
		title : tit,
		href : url,
		closable : true
	});
}

function destroyUser(){
	var row = $('#tt').datagrid('getSelected');
	if (row){
		$.messager.confirm('确认','你是否确认要删除id为'+row.id+"的用户？",function(r){
			if (r){
				$.post('/user/del',{id:row.id},function(result){
					if (result.success){
						$('#tt').datagrid('reload');	// reload the user data
					} else {
						$.messager.show({	// show error message
							title: 'Error',
							msg: result.errorMsg
						});
					}
				},'json');
			}
		});
	}
}