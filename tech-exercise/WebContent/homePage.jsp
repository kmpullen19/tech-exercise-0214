<%@ page language="java" import="java.sql.*"
	contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Home</title>
</head>
<header>
<h1>Welcome To My Exercise Tracking App!</h1>
</header>

<a href="addExercise.jsp">Add Exercise</a>

<body>
	<h3>Search User To View Workout History</h2>
	<form action="SearchServlet" method="post">
		<table>
			<tr>
				<td>User:</td>
				<td><input type="text" name="user"></td>
			</tr>
			<tr>
				<td><input type="submit" value="submit" /></td>
			</tr>
		</table>
	</form>
</body>
</html>