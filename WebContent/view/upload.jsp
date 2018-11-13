<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Up load ảnh</title>
<link
	href="//netdna.bootstrapcdn.com/bootstrap/3.2.0/css/bootstrap.min.css"
	rel="stylesheet" id="bootstrap-css">
<script
	src="//netdna.bootstrapcdn.com/bootstrap/3.2.0/js/bootstrap.min.js"></script>
<script src="//code.jquery.com/jquery-1.11.1.min.js"></script>
<c:url value="/static/js/upload.js" var="js"></c:url>
<script type="text/javascript" src="${js }"></script>
<c:url value="/static/css/upload.css" var="css"></c:url>
<link rel="stylesheet" type="text/css" href="${css }">
</head>
<body>

	<div class="container">

		<div class="panel panel-default">

			<div class="panel-heading">
				<strong>Upload Files</strong> <small>Up ảnh lên mạng miễn
					phí</small>
			</div>
			<div class="panel-body">

				<!-- Standar Form -->
				<h4>Chọn file từ máy tính</h4>
				<form action="upload" method="post" enctype="multipart/form-data"
					id="js-upload-form">
					<div class="form-inline">
						<div class="form-group">
							<input type="file" name="files[]" id="js-upload-files" multiple>
						</div>
						<button type="submit" class="btn btn-sm btn-primary"
							id="js-upload-submit">Upload files</button>
					</div>
				</form>

				<!-- Drop Zone -->
				<h4>Hoặc kéo thả ảnh vào đây</h4>
				<div class="upload-drop-zone" id="drop-zone">Just drag and
					drop files here</div>

				<!-- Progress Bar -->
				<div class="progress">
					<div class="progress-bar" role="progressbar" aria-valuenow="60"
						aria-valuemin="0" aria-valuemax="100" style="width: 60%;">
						<span class="sr-only">60% Complete</span>
					</div>
				</div>

				<!-- Upload Finished -->
				<div class="js-upload-finished">
					<h3>Processed files</h3>
					<div class="list-group">
						<a href="#" class="list-group-item list-group-item-success"><span
							class="badge alert-success pull-right">Success</span>image-01.jpg</a>
						<a href="#" class="list-group-item list-group-item-success"><span
							class="badge alert-success pull-right">Success</span>image-02.jpg</a>
					</div>
				</div>
			</div>
		</div>
	</div>
	<!-- /container -->

</body>
</html>