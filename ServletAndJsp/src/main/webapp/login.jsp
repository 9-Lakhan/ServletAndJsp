<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Login Crediatials</title>
</head>
<body>
<form action="./LoginSevlet" method="get">
<input type = "text" placeholder="Enter the userid" name="userid">
<input type = "password" placeholder="Enter the password" name="password">
<input type = "submit" value="login">
<a href="register.jsp">SignUP</a>
</form>
</body>
</html>