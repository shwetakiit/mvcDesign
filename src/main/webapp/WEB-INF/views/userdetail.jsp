<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@page isELIgnored="false" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<% 
String name=(String)request.getAttribute("header"); 
%>
<h1><%=name %></h1>
<h1>Welcome !!, ${user.user}</h1>
<h1>Your email id ,${user.emailId }</h1>
</body>
</html>