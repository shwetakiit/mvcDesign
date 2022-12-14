<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
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
	<h3 class="text-center">Employee Portal Registration</h3>
	<div class="container mt-5">
		<form action="registrationProcess" method="post">
			<div class="form-group">
				<label for="exampleInputName">Name</label> <input type="text"
					class="form-control" id="exampleInputName"
					aria-describedby="emailHelp" placeholder="Enter Name" name="name">
			</div>
			<div class="form-group">
				<label for="exampleInputName">City </label> <input type="text"
					class="form-control" id="exampleInputName"
					aria-describedby="emailHelp" placeholder="Enter Job Location"
					name="jobLocation">
			</div>
			<div class="form-group">
				<label for="exampleInputEmail1">Email address</label> <input
					type="email" class="form-control" id="exampleInputEmail1"
					aria-describedby="emailHelp" placeholder="Enter email"
					name="emailId">
			</div>
			<div class="form-group">
				<label for="exampleInputPassword1">Password</label> <input
					type="password" class="form-control" id="exampleInputPassword1"
					placeholder="Password">
			</div>

			<div class="container text-center">
				<button type="submit" class="btn btn-success">Submit</button>
			</div>
		</form>
	</div>
</body>
</html>