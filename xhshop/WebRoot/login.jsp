<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>登陆 孝和商城</title>
    
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">
	<!--
	<link rel="stylesheet" type="text/css" href="styles.css">
	-->

  </head>
  
  <body>
   	 <center>
   	 	<h1>
   	 		<form id="indexform" name="indexForm" action="user/userLogin" method="post">
   	 			<table border="0">
   	 				<tr>
   	 					<td>账号：</td>
   	 					<td><input type="text" name="uname"></td>
   	 				</tr>
   	 				<tr>
   	 					<td>密码：</td>
   	 					<td><input type="password" name="upwd"></td>
   	 				</tr>
   	 			</table>
   	 			<br>
   	 				<input type="submit" value="登陆">
   	 		</form>
   	 		<!-- <form action="">
   	 			<input type="submit" value="注册">
			</form> -->
   	 	</h1>
   	 </center>
  </body>
</html>
