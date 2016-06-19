<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Course Registration System</title>
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.2/css/bootstrap.min.css">
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.2/css/bootstrap-theme.min.css">
<link rel="stylesheet" href="/css/index.css">
</head>
<body>
	<h1>Course Registration System - Student (${name})</h1>
	<div class="panel panel-default">
		<div class="panel-body">
			<ul class="nav nav-tabs">
			  <li role="presentation" value="schedule" class="active"><a href="#">Schedule</a></li>
			  <li role="presentation" value="register"><a href="#">Register</a></li>
			  <li role="presentation" value="cancel"><a href="#">Cancel</a></li>
			</ul>
			<table class="table schedule">
				<tr></tr>
				<tr></tr>
				<tr></tr>
				<tr></tr>
				<tr></tr>
				<tr></tr>
				<tr></tr>
				<tr></tr>
				<tr></tr>
				<tr></tr>
			</table>
			<table class="register hidden">
				<tr>
					<th></th>
					<th>CourseOfferingId</th>
					<th>CourseName</th>
					<th>Lecturer</th>
					<th>Day</th>
					<th>Period</th>
				</tr>
			<c:forEach items="${list}" var="CourseOffering">
				<tr>
					<td></td>
				</tr>
			</c:forEach>
			</table>
			<div class="cancel hidden">
				<input type="text" />
				<button>Cancel</button>
			</div>
		</div>
		
	</div>
	<script src="https://code.jquery.com/jquery-2.2.4.min.js"></script>
	<script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.2/js/bootstrap.min.js"></script>
</body>
</html>
