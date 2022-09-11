<%@page import="java.time.LocalDateTime"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
 <%@ page isELIgnored = "false" %> <!-- For expression langugage ${Time} -->
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<%
String name=(String)request.getAttribute("aname"); 
//LocalDateTime time=(LocalDateTime)request.getAttribute("Time");
%>
<h1>name is :<%=name %></h1>
${Time};
</body>
</html>