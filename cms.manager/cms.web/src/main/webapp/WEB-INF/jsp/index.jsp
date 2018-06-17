<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<html>
<head>
	<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
	<title>押品管理系统</title>
	<link href="/css/bootstrap.min.css" rel="stylesheet"/>
	<link href="/css/index.css" rel="stylesheet"/>
	<script type="text/javascript" src="/js/jquery-3.3.1.min.js"></script>
	<script type="text/javascript" src="/js/bootstrap.min.js"></script>
</head>
<body>
	<nav class="navbar navbar-inverse navbar-fixed-top" role="navigation">
			<div class="container-fluid">
				<div class="navbar-header">
					<a href="#" class="navbar-brand ">CMS</a>
				</div>
				<ul class="nav navbar-nav navbar-right">
					<li><a href="#"><span class="glyphicon glyphicon-home"></span> 主页</a> </li>
					<li><a href="#"><span class="glyphicon glyphicon-user"></span> 用户信息</a></li>
					<li><a href="#"><span class="glyphicon glyphicon-log-out"></span> 退出登录</a></li>
				</ul>
			</div>
		</nav>
		<!--菜单栏-->
		<div class="pageContainer">
			<div class="pageSidebar">
				<ul class="nav nav-stacked nav-pills">
					<li role="presentation">
						<a href="/jsp/main" target="mainframe" >押品政策管理</a>
					</li>
				</ul>
			</div>
		</div>
		<!--导航栏与内容之间分分割线-->
		<div class="splitter"></div>
		<!--正文内容-->
		<div class="pageContent" id="pageContent">
			<iframe src="" name="mainframe" frameborder="0" width="100%" height="100%"></iframe>
		</div>
		<!-- 底部页脚部分 -->
		<div class="footer">
			<p class="text-center" >
				<font color="red"> Design By Esther-Gao & ch3nwe1 </font>
			</p>
		</div>
</body>
</html>