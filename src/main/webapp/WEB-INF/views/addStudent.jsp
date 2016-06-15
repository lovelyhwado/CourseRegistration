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
	<h1>Course Registration System - Add/Update a Student</h1>
	<form>
    <div class="form-group">
      <label for="name">Name</label>
      <input type="text" name="name" class="form-control" id="name" placeholder="Enter your name" />
    </div>
    <div class="form-group">
      <label for="birthday">Date of Birth</label>
      <input type="date" name="birthday" class="form-control" id="birthday"/>
    </div>
    <div class="form-group">
      <label for="ssnumber">Social Security Number</label>
      <input type="text" name="ssnumber" class="form-control" id="ssnumber" placeholder="Enter your social security number" />
    </div>
    <div class="form-group">
      <label for="status">Status</label>
      <select type="text" name="status" class="form-control" id="status">
        <option value="under-graduate">Under Graduate</option>
        <option value="postgraduate">Post Graduate</option>
      </select>
    </div>
    <div class="form-group">
      <label for="graduation-date">Graduation Date</label>
      <input type="date" name="graduation-date" class="form-control" id="graduation-date"/>
    </div>
    <button type="submit" name="btn btn-primary">Add</button>
	</form>
	<script src="https://code.jquery.com/jquery-2.2.4.min.js"></script>
	<script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.2/js/bootstrap.min.js"></script>
</body>
</html>
