<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>About</title>
</head>
<body>
<%
String name = (String) request.getAttribute("name");
%>
<h1> Name is :<%=name %></h1>
</body>
</html>