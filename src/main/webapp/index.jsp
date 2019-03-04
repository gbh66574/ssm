<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ include file="common.jsp" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>学生列表</title>
<script type="text/javascript">
	
	$(function(){
		 	$("#nav a").click(function(){
			var title = $(this).text();
			var url = $(this).attr("url");
			if(title){
				if($('#tt').tabs('exists',title)){//选项页存在
					$('#tt').tabs('select',title);//选中
				}else{
					$('#tt').tabs('add',{    
					    title:title,    
					    content:"<iframe src='"+url+"' style='width: 100%;height: 100%' frameborder='0'></iframe>",
					    closable:true 
					});
				}
			}
		});
		
		/*  $("#nav").tree({
			 url:"menu/queryByUsername?username="+$("#user").html(),
			 onClick: function(node){// 在用户点击的时候提示
			 	var title = node.text;
				var url = node.attributes.url;
				if(title&&url!=''){
					if($('#tt').tabs('exists',title)){//选项页存在
						$('#tt').tabs('select',title);//选中
					}else{
						$('#tt').tabs('add',{    
						    title:title,    
						    content:"<iframe src='"+url+"' style='width: 100%;height: 100%' frameborder='0'></iframe>",
						    closable:true 
						});
					}
				}
			 }
		 }); */
	});	
</script>

</head>
<body>
	<div id="cc" class="easyui-layout" fit="true">   
	    <div data-options="region:'north',split:false,border:false" style="height:100px;">
	    	当前用户：【<span id="user">${user.username }</span>】
	    </div>   
	    <div data-options="region:'south',border:false,split:false" style="height:100px;">
	    	
	    </div>   
	    <div data-options="region:'west',title:'导航菜单',iconCls:'icon-save',split:false" style="width:150px;">
	    	<ul class="easyui-tree" fit="true" id="nav">
	          	<p><a href="#" url="student.jsp">学生管理系统</a></p>
	          	<p><a href="#" url="classes.jsp">班级管理系统</a></p>
          	</ul>
	    </div>   
	    <div data-options="region:'center'">
	    	<div id="tt" class="easyui-tabs" fit="true" border="false">   
			    <div title="欢迎页" style="text-align:center;font-size: 20px;">   
			         	欢迎使用XXX系统后台管理界面！ 
			    </div>
			</div>
	    </div>   
	</div>
</body>
</html>