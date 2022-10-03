<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
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
<link href = "<c:url value="/resources/css/style.css" />">	
<script src="<c:url value="/resources/javascript/script.js"/>"></script>

<title>Hello, world!</title>
</head>
<body>
<img alt="my image" src="<c:url value="/resources/images/confluence.PNG" />"/>
	<div class="container">
		<div class="card max-auto mt-5 bg-success" style="width: 80;%">
			<div class="card-body">
				<h1 class="text-center text-white">My Search</h1>
				<form action="search" class="mt-5">
					<div class="form-group text-center">
						<input type="text" name="querybox"
							placeholder="Enter keyword to search" class="form-controller">

					</div>

					<div class="container text-center">
						<button class="btn btn-outline-light">Search</button>
					</div>

				</form>
			</div>
		</div>
	</div>
</body>
</html>