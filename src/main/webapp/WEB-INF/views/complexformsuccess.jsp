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
<h1>Student Name is ${student.username}</h1>
<h1>Student id is ${student.userid }</h1>
<h3>DOB : ${student.dob}</h>
<h1>Student address....</h1>
<h3> City : ${student.address.cityname }</h3>
<h3> Street : ${student.address.street }</h3>

</body>
</html>