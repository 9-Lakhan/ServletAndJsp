<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

<form action ="./RegistrationServlet" method="Post">
<div class="container">

NAME :<br><input type= "text" placeholder="Enter Name" id = "name" name= "name"><br><br>
EMAIL :<br><input type= "text" placeholder="Enter Email" id = "email" name = "email"><br><br>
MOBILE :<br><input type= "text" placeholder="Enter Mobile" id = "mobile" name = "mobile"><br><br>
COLLAGE :<br><input type= "text" placeholder="Enter College" id = "collage"name = "collage"><br><br>
CITY :<br><input type= "text" placeholder="Enter City" id = "city" name =  "city"><br><br>
USERID :<br><input type= "text" placeholder="Enter Userid" id = "userid" name =  "userid"><br><br>
PASSWORD :<br><input type= "password" placeholder="Enter Password" id ="password" name =  "password"><br><br>

</div>
<button type="submit" class="registerbtn">Register</button>

</form>

</body>
</html>