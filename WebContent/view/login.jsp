<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Login</title>
<link
	href="//netdna.bootstrapcdn.com/bootstrap/3.1.0/css/bootstrap.min.css"
	rel="stylesheet" id="bootstrap-css">
<script
	src="//netdna.bootstrapcdn.com/bootstrap/3.1.0/js/bootstrap.min.js"></script>
<script src="//code.jquery.com/jquery-1.11.1.min.js"></script>
<c:url value="/static/js/forgot.js" var="js"></c:url>
<script type="text/javascript" src="${js }"></script>
<c:url value="/static/css/login.css" var="css"></c:url>
<link rel="stylesheet" type="text/css" href="${css }">
</head>
<body>
	<div class="container">

		<div class="row">
			<div class="col-md-12">
				<div class="pr-wrap">
					<div class="pass-reset">
						<label> Enter the email you Login up with</label> <input
							type="email" placeholder="Email" /> <input type="submit"
							value="Submit" class="pass-reset-submit btn btn-success btn-sm" />
					</div>
				</div>

				<div class="wrap">

					<jsp:include page="/view/menu.jsp"></jsp:include>
					<p class="form-title">Login System</p>

					<form class="login" action="${login }" method="post">
						<input type="text" placeholder="Username" name="username" /> <input
							type="password" placeholder="Password" name="password" /> <input
							type="submit" value="Login" class="btn btn-success btn-sm" />
						<div class="remember-forgot">
							<div class="row">
								<div class="col-md-6">
									<div class="checkbox">
										<label> <input type="checkbox" /> Remember Me
										</label>
									</div>
								</div>
								<div class="col-md-6 forgot-pass-content">
									<a href="javascription:void(0)" class="forgot-pass">Forgot
										Password</a>
								</div>
							</div>
						</div>
					</form>
				</div>
			</div>
		</div>
	</div>


</body>
</html>