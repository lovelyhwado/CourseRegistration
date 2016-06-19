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
	<h1>Course Registration System - Login</h1>
	<form action="login">
		<div class="form-group">
			<select class="form-control" name="type">
				<option value="student">Student</option>
				<option value="professor">Professor</option>
				<option value="registrar">Registrar</option>
			</select>
		</div>
	    <div class="form-group">
	      <label for="id">Id</label>
	      <input type="text" name="id" class="form-control" id="id" placeholder="Enter your Id" />
	    </div>
	    <button type="submit" class="btn btn-primary">Login</button>
	</form>
	<script src="https://code.jquery.com/jquery-2.2.4.min.js"></script>
	<script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.2/js/bootstrap.min.js"></script>
</body>
</html>
