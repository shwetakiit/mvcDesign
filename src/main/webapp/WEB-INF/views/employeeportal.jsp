<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ page isELIgnored = "false" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<meta name="viewport"
	content="width=device-width, initial-scale=1, shrink-to-fit=no">
<link rel="stylesheet"
	href="https://cdn.jsdelivr.net/npm/bootstrap@4.0.0/dist/css/bootstrap.min.css"
	integrity="sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm"
	crossorigin="anonymous">
	
</head>
<body>
<div  class="text-center"> 
<h3 style="color:green">${msg}</h3>

<h1>Employee Portal</h1>
<h3>Welcome !!! ${employeeDTO.name}</h3>
<h3>Employee ID ${employeeDTO.emplpyeeId}</h3>
<h3>Emaild : ${employeeDTO.emailId}</h3>

</div>

</body>
</html>