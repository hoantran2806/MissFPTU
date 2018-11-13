<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<link
	href="//netdna.bootstrapcdn.com/twitter-bootstrap/2.3.2/css/bootstrap-combined.min.css"
	rel="stylesheet" id="bootstrap-css">
<script
	src="//netdna.bootstrapcdn.com/twitter-bootstrap/2.3.2/js/bootstrap.min.js"></script>
<script src="//code.jquery.com/jquery-1.11.1.min.js"></script>
<c:url value="/static/css/all-uer.css" var="css"></c:url>
<link href="${css }" rel="stylesheet" type="text/css">
</head>
<body>
	<div class="span7">
		<div class="widget stacked widget-table action-table">

			<div class="widget-header">
				<i class="icon-th-list"></i>
				<h3>Table</h3>
			</div>
			<!-- /widget-header -->

			<div class="widget-content">

				<table class="table table-striped table-bordered">
					<thead>
						<tr>
							<th>ID</th>
							<th>User Name</th>
							<th>Email</th>
							<th>Password</th>
							<th>Role</th>
							<th>Action</th>
							<th class="td-actions"></th>
						</tr>
					</thead>
					<tbody>
						<tr>
							<c:forEach items="${userAll}" var="u">
								<td>1</td>
								<td>${u.username }</td>
								<td>${u.email }</td>
								<td>${u.password }</td>
								<td class="td-actions"><a href="javascript:;"
									class="btn btn-small btn-primary"> <i
										class="btn-icon-only icon-ok"></i>
								</a> <a href="javascript:;" class="btn btn-small"> <i
										class="btn-icon-only icon-remove"></i>
								</a></td>
							</c:forEach>


						</tr>

					</tbody>
				</table>

			</div>
			<!-- /widget-content -->

		</div>
		<!-- /widget -->
	</div>
</body>
</html>