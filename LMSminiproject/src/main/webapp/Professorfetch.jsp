<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>LMS Platform</title>
<link href="Professorfetch.css" rel="stylesheet" type="text/css" />
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
	  <div>
        <c:forEach var="emp" items="${data}">
            <div>
                <table>
                    <thead>
                        <tr>
                            <th class="heading-color">Id</th>
                            <th>Name</th>
                            <th>EmailId</th>
                            <th>Mobile number</th>
                            <th>Password</th>
                            <th>Department</th>
                            <th>Delete</th>
                            <th>Add Course Detail</th>
                        </tr>
                    </thead>
                    <tbody>
                        <tr>
                            <td>${emp.id}</td>
                            <td>${emp.name}</td>
                            <td>${emp.emailId}</td>
                            <td>${emp.mobilenumber}</td>
                            <td>${emp.password}</td>
                            <td>${emp.department}</td>
                            <td><a href="<c:url value='/deleteProf/${emp.id}'/>" class="delete-link">Delete</a></td>
                            <td><a href="Course.jsp" class="delete-link">add</a></td>
                        </tr>
                    </tbody>
                </table>
            </div>
            <div class="update-form">
                <strong>Update Form</strong>
                <form action="/edit/${emp.id}" method="post">
                    <input type="hidden" name="id" value="${emp.id}">
                    <input type="text" name="name" value="${emp.name}" class="update-input" placeholder="Name">
                    <input type="email" name="emailId" value="${emp.emailId}" class="update-input" placeholder="Email">
                    <input type="text" name="mobilenumber" value="${emp.mobilenumber}" class="update-input" placeholder="Mobile number">
                    <input type="password" name="password" value="${emp.password}" class="update-input" placeholder="Password">
                    <input type="text" name="department" value="${emp.department}" class="update-input" placeholder="Department">
                    <button type="submit" class="update-button">Update</button>
                </form>
            </div>
        </c:forEach>
    </div>
</body>
</html>
