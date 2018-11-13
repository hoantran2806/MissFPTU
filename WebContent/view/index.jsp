<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>upanh.vn - Up ảnh miễn phí</title>
<link
	href="//netdna.bootstrapcdn.com/bootstrap/3.2.0/css/bootstrap.min.css"
	rel="stylesheet" id="bootstrap-css">
<script
	src="//netdna.bootstrapcdn.com/bootstrap/3.2.0/js/bootstrap.min.js"></script>
<script src="//code.jquery.com/jquery-1.11.1.min.js"></script>
<c:url value="/static/css/index.css" var="css"></c:url>
<link rel="stylesheet" type="text/css" href="${css }">


</head>
<body>
	<div class="site-wrapper">
		<div class="site-wrapper-inner">
			<div class="cover-container">
				<div class="masthead clearfix">
					<div class="inner">
						<h3 class="masthead-brand">Up Ảnh</h3>

						<jsp:include page="/view/menu.jsp"></jsp:include>
					</div>
				</div>

				<div class="inner cover">
					<h1 class="cover-heading">upanh.vn</h1>

					<p class="lead">Hình ảnh được upload lên sẽ được lưu trữ vĩnh
						viễn. Không thu phí, không cần tạo tài khoản.</p>

					<p class="lead">
						<a class="btn btn-lg btn-info" href="upload">Upload Now</a>
					</p>
				</div>

				<div class="mastfoot">
					<div class="inner">

						<p>
							Design and Development: <a href="#/">Mai Viên</a>
						</p>
					</div>
				</div>
			</div>
		</div>
	</div>

</body>
</html>