<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<meta charset="UTF-8">
<link href="//maxcdn.bootstrapcdn.com/bootstrap/3.3.0/css/bootstrap.min.css"	rel="stylesheet" id="bootstrap-css">
<script
	src="//maxcdn.bootstrapcdn.com/bootstrap/3.3.0/js/bootstrap.min.js"></script>
<script src="//code.jquery.com/jquery-1.11.1.min.js"></script>
<link href="css/bootstrap.min.css" rel="stylesheet">
<link href="css/style.css" rel="stylesheet" type="text/css">
<c:url value="/static/css/index-admin.css" var="css"></c:url>
<link rel="stylesheet" type="text/css" href="${css }">
<c:url value="/admin/all-user" var="listuser"></c:url>

<nav class="navbar navbar-default">
		<div class="container">
			<div class="navbar-header">
				<button type="button" class="navbar-toggle collapsed"
					data-toggle="collapse" data-target="#navbar" aria-expanded="false"
					aria-controls="navbar">
					<span class="sr-only">Toggle navigation</span> <span
						class="icon-bar"></span> <span class="icon-bar"></span> <span
						class="icon-bar"></span>
				</button>
				<a class="navbar-brand" href="./">upanh.vn</a>
			</div>
			<div id="navbar" class="collapse navbar-collapse">
				<ul class="nav navbar-nav">
					<li class="active"><a href="login">Dashboard</a></li>
					<li><a href="pages.html">Pages</a></li>
					<li><a href="posts.html">Posts</a></li>
					<li><a href="${listuser }">Users</a></li>
				</ul>

				<ul class="nav navbar-nav navbar-right">
					<li class="active"><a href="index.html">Welcome,
							${username }</a></li>
					<li><a href="logout">Logout</a></li>

				</ul>
			</div>
			<!--/.nav-collapse -->
		</div>
	</nav>
	
	<header id="header">
		<div class="container">
			<div class="row">
				<div class="col-md-10">
					<h1>
						<span class="glyphicon glyphicon-cog" aria-hidden="true"></span>
						Dashboard <small>Trang Quản Trị</small>
					</h1>
				</div>
				<div class="col-md-2">
					<div class="dropdown">
						<button class="btn btn-primary dropdown-toggle" type="button"
							data-toggle="dropdown">
							Create Content <span class="caret"></span>
						</button>
						<ul class="dropdown-menu">
							<li><a href="#">Add Pages</a></li>
							<li><a href="#">Add Posts</a></li>
							<li><a href="#">Add Users</a></li>
						</ul>
					</div>
				</div>
			</div>
		</div>
	</header>
	<br>
