<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h2>i am lakhan solanke</h2>

<%!                          
// ----------------- Declaration Tag ------------------
int a=100;
String name="lakhan ";
%>

<%
//----------------- Scriplet Tag ------------------
if(a<100){
	out.print("100 is bigger than a");
	
}
else{
	out.print("100 is less than a");
}
%>

<%= a %> 
//----------------- Expression Tag ------------------
<%= name %>


</body>
</html>