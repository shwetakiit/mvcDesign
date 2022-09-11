<%@page import="java.util.List"%>
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
<h1>List of friends*****</h1>
<%
List<String> list =(List<String>) request.getAttribute("flist");
%>
<% for(String fName : list) { %>
<h2><%=fName %></h2>	
<%} %>

</body>
</html>