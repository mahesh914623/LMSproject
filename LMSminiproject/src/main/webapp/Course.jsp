<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>LMS Platform</title>
<link href="Course.css" rel="stylesheet" type="text/css" />
<link rel="preconnect" href="https://fonts.googleapis.com">
<link rel="preconnect" href="https://fonts.gstatic.com" crossorigin>
<link
	href="https://fonts.googleapis.com/css2?family=Yeseva+One&display=swap"
	rel="stylesheet">
<script src="https://kit.fontawesome.com/6c7c19473b.js"
	crossorigin="anonymous"></script>

</head>
<body>
	<header>
		<nav>
			<h1>Learning Management System</h1>
			<span><i class="fa-solid fa-house"></i><a href="Home.jsp">Home</a></span>
			<span><i class="fa-solid fa-gear"></i> <select value="Service">
					<option>Service</option>
					<option>Full stack courses</option>
					<option>Course Detail</option>
			</select> </span> <span><i class="fa-solid fa-arrow-right-to-bracket"></i><a
				href="Login.jsp">Logout</a></span>
		</nav>
	</header>
	 <h1>Information of course</h1>
  <form action="/coursedata" method="post" enctype="multipart/form-data" class="course-form">
    <label>Course Title:</label>
    <input type="text" name="coursetitle" required="required"><br>
    <label>Course Teacher :</label>
    <input type="text" name="courseteacher" required="required"><br>
    <label>Course Description :</label>
    <input type="text" name="coursediscription" required="required"><br>
    <label>Course Material :</label>
    <input type="text" name="coursematerial" required="required"><br>
    <button type="submit">Save</button>
  </form>
</body>
</html>
