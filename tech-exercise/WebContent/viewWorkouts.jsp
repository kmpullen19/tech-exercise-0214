<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ page language="java" import="java.sql.*"
	contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Workouts</title>
<style>
table {
	border-collapse: separate;
	border-spacing: 0 15px;
}

th {
	background-color: #4287f5;
	color: white;
}

th, td {
	width: 150px;
	text-align: center;
	border: 1px solid black;
	padding: 5px;
}

h2 {
	color: #4287f5;
}
</style>
</head>
<header>
<h1>Welcome To My Exercise Tracking App!</h1>
</header>

<a href="homePage.jsp">Home</a>
<a href="addExercise.jsp">Add Exercise</a>

<body>
	<c:if test="${empty exercises}">
	<br>
		<h3>No exercises exist for that user.</h3> 
	</c:if>


	<c:if test="${not empty exercises}">
		<table>
			<tr>
				<th>Name</th>
				<th>Exercise</th>
				<th>Length</th>
				<th>Intensity</th>
				<th>Date</th>
				<th>Description</th>
			</tr>
			<c:forEach items="${exercises}" var="exercise">
				<tr>
					<td>${exercise.userName}</td>
					<td>${exercise.type}</td>
					<td>${exercise.length}</td>
					<td>${exercise.intensity}</td>
					<td>${exercise.date}</td>
					<td>${exercise.description}</td>
				</tr>

				<br>
			</c:forEach>
		</table>
	</c:if>


</body>
</html>