
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Upload ảnh</title>
<c:url value="/static/css/upload1.css" var="css"></c:url>
<link rel="stylesheet" href="${css }">
</head>
<body>
	<script class="jsbin"
		src="https://ajax.googleapis.com/ajax/libs/jquery/1/jquery.min.js"></script>

	<jsp:include page="/view/menu.jsp"></jsp:include>
	<div class="file-upload">

		<form action="upload" method="post" enctype="multipart/form-data">
			<input class="file-upload-btn" type="submit" value="Upload">
			<div class="image-upload-wrap">
				<input class="file-upload-input" type='file'
					onchange="readURL(this);" accept="image/*" name="files[]" />
				<div class="drag-text">
					<h3>kéo và thả ảnh hoặc click để chọn</h3>
				</div>
			</div>
			<div class="file-upload-content">
				<img class="file-upload-image" src="#" alt="your image" />
				<div class="image-title-wrap">
					<button type="button" onclick="removeUpload()" class="remove-image">
						Remove <span class="image-title">Upload Ảnh</span>
					</button>
				</div>

			</div>
	</div>



	<script src="http://localhost:8080/MissFPTU/js/upload1.js"></script>

	</form>



</body>
</html>