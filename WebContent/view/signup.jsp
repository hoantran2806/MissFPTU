<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Sign Up</title>
<link
	href="//maxcdn.bootstrapcdn.com/bootstrap/4.1.1/css/bootstrap.min.css"
	rel="stylesheet" id="bootstrap-css">
<script
	src="//maxcdn.bootstrapcdn.com/bootstrap/4.1.1/js/bootstrap.min.js"></script>
<script
	src="//cdnjs.cloudflare.com/ajax/libs/jquery/3.2.1/jquery.min.js"></script>
<c:url value="/static/css/signup.css" var="css"></c:url>
<link href="${css }" rel="stylesheet" type="text/css" />
</head>
<body>

	<div class="page-container">
	<h1>${alertMsg }</h1>
		<form action="signup" method="POST">
			<h1>Sign Up</h1>
			<input type="text" name="name" class="Name" placeholder="username">
			<input type="text" name="email"	class="Email" placeholder="email">
			<input type="password" name="password" class="Address" placeholder="password">
			<button type="submit" value="Add" name="submit">Submit</button>
		</form>
	</div>

</body>
</html>