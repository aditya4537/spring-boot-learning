<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Mobile Data</title>
<link
	href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css"
	rel="stylesheet"
	integrity="sha384-EVSTQN3/azprG1Anm3QDgpJLIm9Nao0Yz1ztcQTwFspd3yD65VohhpuuCOmLASjC"
	crossorigin="anonymous">
<link rel="stylesheet"
	href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/6.0.0/css/all.min.css">

<style>
.center {
	margin: auto;
	width: 50%;
	border: 3px solid orange;
	padding: 10px;
}

.back {
	background-image:
		url('https://images.freecreatives.com/wp-content/uploads/2016/04/Website-Backgrounds-For-Desktop.jpg');
	height: 100%;
	background-size: cover;
	background-repeat: no-repeat;
}
button:hover {
            background-color: #45a049;
}

.edit-btn,
.delete-btn {
	position: absolute;
	background: none;
	border: none;
	cursor: pointer;
	color: #ff0000; /* Red color for delete icon */
}

.edit-color{
	color: green;
}

.mobiles-icon {
    font-size: 24px; /* Adjust the font size for the mobiles icon */
    margin-right: 10px; /* Add some spacing to the right of the icon */
}

</style>

</head>
<body class="bg-dark back">
	<script
		src="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/js/bootstrap.bundle.min.js"
		integrity="sha384-MrcW6ZMFYlzcLA8Nl+NtUVF0sA7MsXsP1UyJoMp4YLEuNSfAP+JcXn/tWtIaxVXM"
		crossorigin="anonymous"></script>

	<nav class="navbar navbar-expand-lg navbar-dark fs-4">
		<div class="container-fluid">
			<a class="navbar-brand" href="/mobile">
            <i class="fas fa-mobile-alt mobiles-icon">APMobs</i></a>
            
			<button class="navbar-toggler" type="button" data-bs-toggle="collapse" data-bs-target="#navbarSupportedContent" aria-controls="navbarSupportedContent" aria-expanded="false" aria-label="Toggle navigation">
				<span class="navbar-toggler-icon"></span>
			</button>
			<div class="collapse navbar-collapse" id="navbarSupportedContent">
				<ul class="navbar-nav me-auto mb-2 mb-lg-0">
					<li class="nav-item"><a class="nav-link active"	aria-current="page" href="#">Home</a></li>
					<li class="nav-item"><a class="nav-link" href="/add">Add Mobile</a></li>
					<li class="nav-item dropdown">
					<a class="nav-link dropdown-toggle" href="#" id="navbarDropdown"role="button" data-bs-toggle="dropdown" aria-expanded="false">Mobiles </a>
						<ul class="dropdown-menu" aria-labelledby="navbarDropdown">
							<li><a class="dropdown-item" href="#">Apple</a></li>
							<li><a class="dropdown-item" href="#">Samsung</a></li>
							<li><hr class="dropdown-divider"></li>
							<li><a class="dropdown-item" href="#">Others</a></li>
						</ul></li>
				</ul>
				<form class="d-flex">
					<input class="form-control me-2" type="search" placeholder="Search" aria-label="Search">
					<button class="btn btn-outline-success" type="submit">Search</button>
				</form>
			</div>
		</div>
	</nav>

	<div class="center p-3 mb-2 text-white hover-overlay"
		style="background: linear-gradient(45deg, hsla(168, 85%, 52%, 0.5), hsla(263, 88%, 45%, 0.5) 100%);"
		style="margin-top: 50px; box-shadow:10px 10px 8px #888888;">

		<div style="display:flex; align-items:inline; justify-content: space-between;">
			<p class="display-6 fst-italic fw-bolder">Mobile Data</p>
			<a href="/add">
				<button type="button" class="btn" style="background-color:#87BEEA">
					<i class="fas fa-plus">Add Mobile</i> 
				</button>
			</a>
		</div>
		
				
		<table
			class="table table-success table-bordered table-striped table-hover"
			style="margin-top: 30px;">
			<tr class="table-danger fw-bolder">
				<th>IMEI</th>
				<th>Name</th>
				<th>Company</th>
				<th>Camera MegaPixel</th>
				<th>Ram</th>
				<th>Rom</th>
				<th>Processor</th>
				<th>Display</th>
				<th>Actions</th>
			</tr>

			<c:forEach var="mob" items="${mobile}">
				<tr class="table-success">
					<td>${mob.imei}</td>
					<td>${mob.name}</td>
					<td>${mob.company}</td>
					<td>${mob.campix}</td>
					<td>${mob.ram}GB</td>
					<td>${mob.rom}GB</td>
					<td>${mob.processor}</td>
					<td>${mob.display}</td>
					<td >
						<a href="/edit?imei=${mob.imei}" style="margin-right:20px;">
							<button type="button" class="edit-btn edit-color" onclick="editData()">
            					<i class="fas fa-edit"></i>
        					</button>
						</a>
						<a href="/delete?imei=${mob.imei}" style="margin-left:20px;">
							<button	type="button" class="delete-btn" onclick="deleteData()">
								<i class="fas fa-trash"></i>
							</button>
						</a>
					</td>
				</tr>
			</c:forEach>
		</table>
	</div>
	<script>
		function deleteData() {
			// Add your delete functionality here
			alert('Deleting data...');
		}
		function editData() {
            // Add your edit functionality here
            alert('Editing data...');
        }
	</script>
</body>
</html>