<%@page language="java" import="java.sql.*"
	contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Add an Exercise</title>
</head>
<header>
<h1>Create Exercise</h1>
</header>
<a href="homePage.jsp">Home</a>
<form action="ExerciseServlet" method="post">
	<table>
		<tr>
			<td>User:</td>
			<td><input type="text" name="user"></td>
		</tr>
		<tr>
			<td><label for="type">Type of Exercise:</label></td>
			<td><select name="type" id="type">
					<option disabled selected value>-- select an option --</option>
					<option value="endurance">Endurance</option>
					<option value="strength">Strength</option>
					<option value="balance">Balance</option>
					<option value="flexibility">Flexibility</option>
			</select></td>
		</tr>
		<tr>
			<td><label for="intensity">Intensity of Exercise (1 is
					low, 5 is high):</label></td>
			<td><select name="intensity" id="intensity">
					<option disabled selected value>-- select an option --</option>
					<option value="1">1</option>
					<option value="2">2</option>
					<option value="3">3</option>
					<option value="4">4</option>
					<option value="5">5</option>
			</select></td>
		</tr>
		<tr>
			<td>Length of Time:</td>
			<td><input type="text" name="length"></td>
		</tr>
		<tr>
			<td>Date (MM/DD/YY):</td>
			<td><input type="text" name="date"></td>
		</tr>
		<tr>
			<td>Short description:</td>
			<td><input type="text" name="description"></td>
		</tr>
		<tr>
			<td><input type="submit" value="submit" /></td>
		</tr>
	</table>
</form>

<body>

</body>
</html>