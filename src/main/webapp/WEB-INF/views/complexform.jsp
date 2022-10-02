<%@page import="kumari.shweta.model.Student"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!doctype html>
<html lang="en">
<head>
<!-- Required meta tags -->
<meta charset="utf-8">
<meta name="viewport" content="width=device-width, initial-scale=1">

<!-- Bootstrap CSS -->
<link
	href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css"
	rel="stylesheet"
	integrity="sha384-EVSTQN3/azprG1Anm3QDgpJLIm9Nao0Yz1ztcQTwFspd3yD65VohhpuuCOmLASjC"
	crossorigin="anonymous">

<title>Hello, world!</title>
</head>
<body>
	<div class="container mt-6">
		<div class="row">
			<h3>Complex Form</h3>
			<!-- Form validation error message display on  UI with Spring form tag -->
			<%
				String isError = (String) request.getAttribute("validationerror");
			if (Boolean.valueOf(isError)) {
			%>
			<div class="alert alert-danger" role="alert">
				<form:errors path="student.*" />
				<%
					}
				%>
			</div>
			<!-- end of error message display on UI  -->
			<form action="complexProcessForm" method="post">
				<div class="form-group">
					<label for="name">Your Name </label> <input type="text"
						class="form-control" id="candidatename"
						aria-describedby="emailHelp" name="username"
						placeholder="Enter your name">
				</div>

				<div class="form-group">
					<label for="ID">Your Id</label> <input type="text"
						class="form-control" id="candidateId" placeholder="Enter your Id"
						name="userid">
				</div>
				<!-- input type "date" will diplay calendar to choose date for dob -->
				<div class="form-group">
					<label for="dob">Your DOB</label><input type="date"
						class="form-control" id="dob" placeholder="dd/mm/yyyy" name="dob">
				</div>

				<div class="card">
					<div class="card-body">
						<p>Your Address</p>
						<div class="form-group">
							<input type="text" class="form-controller"
								placeholder="Enter you city" name="address.cityname" /> <br />
							<input type="text" class="form-controller"
								placeholder="Enter you street" name="address.street" />
						</div>
					</div>
				</div>

				<div>
					<button type="submit" class="btn btn-primary">Submit</button>
				</div>
			</form>
		</div>
	</div>
</body>
</html>