<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%
	String path = request.getContextPath();
	String basePath = request.getScheme() + "://"
			+ request.getServerName() + ":" + request.getServerPort()
			+ path + "/";
%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
<head>
 <base href="<%=basePath%>">
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<link href="assets/css/bootstrap.min.css" rel="stylesheet" />
<link rel="stylesheet" href="assets/css/font-awesome.min.css" />
<link rel="stylesheet" href="assets/css/ace.min.css" />
<link rel="stylesheet" href="assets/css/ace-rtl.min.css" />
<link rel="stylesheet" href="assets/css/ace-skins.min.css" />
<link rel="stylesheet" href="css/style.css" />

<script src="assets/js/ace-extra.min.js"></script>
<script src="js/jquery-1.9.1.min.js"></script>
<script src="assets/layer/layer.js" type="text/javascript"></script>
<title>登陆</title>
<style>
	.blue-border {
	border:3px solid #428BCA;
	}
</style>
</head>
   <base href="<%=basePath%>">
<body class="login-layout Reg_log_style">
	<div class="logintop">
		<span>欢迎后台管理界面平台</span>
	</div>
	<div class="loginbody">
		<div class="login-container">
			<div class="center">
				
			</div>

			<div class="space-6"></div>

			<div class="position-relative">
				<div id="login-box" class="login-box no-border visible">
					<div class="widget-body">
						<div class="widget-main">
							<h4 class="header blue lighter bigger">
								<i class="icon-coffee green"></i> 管理员登陆
							</h4>

							<div class="login_icon">
								<img src="images/login.png" />
							</div>

							<form action="${pageContext.request.contextPath}/Admin/login.action" method="post">
								<fieldset>
									<ul>
										<li class="frame_style form_error"><label
											class="user_icon"></label><input name="Cname" type="text"
											id="username" placeholder="用户名" /></li>
										<li class="frame_style form_error"><label
											class="password_icon"></label><input name="Cpwd"
											type="password" id="userpwd" placeholder="密码"/></li>										
									</ul>
									
									<div class="space"></div>
								<div id="msg"><%-- ${message } --%></div>
									<div class="clearfix">


										<button type="submit"
											class="width-35 pull-right btn btn-sm btn-primary"
											id="login_btn">
											<i class="icon-key"></i> 登陆
										</button>
									</div>
									<div class="space-4"></div>
								</fieldset>
							</form>
						</div>
						<!-- /widget-main -->

						<div class="toolbar clearfix"></div>
					</div>
					<!-- /widget-body -->
				</div>
				<!-- /login-box -->
			</div>
			<!-- /position-relative -->
		</div>
	</div>
</body>
</html>
<script>
$("#msg").hide();
if('${message}' !== ''){
				layer.alert('${message}', {
					title : '提示框',
					icon : 1,	
				});
			}
	 $('#login_btn').on('click', function(event) {
	 	const ev = window.event || event;
	 //	ev.preventDefault();
		var num = 0;
		var str = "";
		$("input[type$='text'],input[type$='password']").each(function(n) {
			if ($(this).val() == "") {

				layer.alert("请输入用户名和密码！\r\n", {
					title : '提示框',
					icon : 0,
				});
				num++;
				return false;
			}
		});
		if (num > 0) {
			
			return false;
		}  else {
			
		 	 
			$("#msg").show();
			/* location.href = "index.html"; */ 
	}
	});
	$(document).ready(
			function() {
				$("input[type='text'],input[type='password']").blur(
						function() {
							var $el = $(this);
							var $parent = $el.parent();
							$parent.attr('class', 'frame_style').removeClass(
									' form_error');
							if ($el.val() == '') {
								$parent.attr('class', 'frame_style').addClass(
										' form_error');
							}
						});
				$("input[type='text'],input[type='password']").focus(
						function() {
							var $el = $(this);
							var $parent = $el.parent();
							$parent.attr('class', 'frame_style').removeClass(
									' form_errors');
							if ($el.val() == '') {
								$parent.attr('class', 'frame_style').addClass(
										' form_errors');
							} else {
								$parent.attr('class', 'frame_style')
										.removeClass(' form_errors');
							}
						});
						
						$("#login-box").addClass('blue-border');
			})
			
</script>