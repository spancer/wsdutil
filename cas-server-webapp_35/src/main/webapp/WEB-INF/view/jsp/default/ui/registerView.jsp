<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html; charset=UTF-8" %>
<!DOCTYPE html>
<html lang="zh">
<head>
<meta http-equiv="content-type" content="text/html; charset=UTF-8">
<meta charset="utf-8">
<meta http-equiv="X-UA-Compatible" content="IE=edge,chrome=1">
<title>绑定系统帐号</title>
<meta name="keywords" content="数据">
<meta name="description" content="晒晒自己想要的东西">
<link rel="stylesheet" href="<c:url value="/css/login.css"/>">
</head>
<body class="">
	<!-- page -->
	<div id="page">
		<a id="login_return"
			href="#">
			返回 
		</a>
		<div id="signup">
			<a href="#"><h1 id="login_logo"></h1></a>
			<div class="login_bar"></div>
			<h3>欢迎你！缘来等你，接下来只要简单设置以下信息就可以了</h3>
			<div class="avatar">
				<img id="current_avatar" src="<c:url value="/images/default_buddy_icon.jpg"/>">
			</div>
			<div class="signup_form">
				<form id="pageform" action="add.do" method="post" class="Form FancyForm AuthForm">
					<ul>
						<li>
							<div class="input">
								<input id="id_username" name="username" type="text" value="">
								<label>昵称</label>
								<span class="fff"></span>
								<div id="username_msgr" class="msgr left-arrow">
									<span class="txt"></span>
									<span class="arrow">◣</span>
									<span class="arrow-mask"></span>
								</div>
							</div>
						</li>
						<li>
							<div class="input">
								<input id="id_email" name="email" type="text" value="">
								<label>登陆邮箱地址</label>
								<span class="fff"></span>
								<div id="email_msgr" class="msgr left-arrow">
									<span class="txt"></span>
									<span class="arrow">◣</span>
									<span class="arrow-mask"></span>
								</div>
							</div>
						</li>
						<li>
							<div class="input">
								<input id="id_password" name="password" type="password" value="">
								<label>密码</label>
								<span class="fff"></span>
								<div id="password_msgr" class="msgr left-arrow">
									<span class="txt"></span>
									<span class="arrow">◣</span>
									<span class="arrow-mask"></span>
								</div>
							</div>
						</li>
					</ul>
					<div class="non_inputs">
						<a id="submitBtn" href="#" onclick="return false;" class="btn btn18 rbtn"><strong> 注册</strong><span></span></a>
					</div>
				</form>
			</div>
			
		</div>
	</div>
	<!-- // page -->
	<div class="clear"></div>
	<script type="text/javascript" src="<c:url value="/js/jquery-1.8.3.min.js" />"></script>
	<script type="text/javascript" src="<c:url value="/js/register.js" />"></script>
</body>
</html>