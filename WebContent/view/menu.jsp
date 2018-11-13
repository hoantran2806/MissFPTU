<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<c:url value="/static/css/index.css" var="css"></c:url>
<link rel="stylesheet" type="text/css" href="${css }">
<ul class="nav masthead-nav">
	<li class="active"><a href="./">Home</a></li>

	<li><a href="./login">Login</a></li>

	<li><a href="./signup">Signup</a></li>

	<li><a href="./contact" target="_blank">Contact</a></li>
</ul>