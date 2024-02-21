<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Edit | ${mob.name}</title>

<style>
        body {
            font-family: Arial, sans-serif;
            background-color: #f4f4f4;
            margin: 0;
            padding: 0;
            display: flex;
            align-items: center;
            justify-content: center;
            height: 100vh;
        }

        form {
            background-color: #fff;
            padding: 20px;
            border-radius: 8px;
            box-shadow: 0 0 10px rgba(0, 0, 0, 0.1);
            width: 300px;
        }

        label {
            display: block;
            margin-bottom: 8px;
            font-weight: bold;
        }

        input {
            width: 100%;
            padding: 8px;
            margin-bottom: 16px;
            box-sizing: border-box;
            border: 1px solid #ccc;
            border-radius: 4px;
        }

        button {
            background-color: #4caf50;
            color: #fff;
            padding: 10px;
            border: none;
            border-radius: 4px;
            margin: 5px 5px;
            cursor: pointer;
            width: 100%;
        }

        button:hover {
            background-color: #45a049;
        }
    </style>
</head>
<body>
	<form action="/addMobile" method="post">
		<div class="modal-header">
			<h4 class="modal-title">Edit Mobile</h4>
			
		</div>
		<div class="modal-body">
			<input type="hidden" name="imei" id="imei" value="${mob.imei}" />
			<div class="form-group">
				<label>Name</label> <input type="text" class="form-control"
					name="name" value="${mob.name}" required>
			</div>
			<div class="form-group">
				<label>company</label> <input type="text" class="form-control"
					name="company" value="${mob.company}" required>
			</div>
			<div class="form-group">
				<label>Camera</label> <input type="text" class="form-control"
					name="campix" value="${mob.campix}" required>
			</div>
			<div class="form-group">
				<label>Ram</label> <input type="text" class="form-control"
					name="ram" value="${mob.ram}" required>
			</div>
			<div class="form-group">
				<label>Rom</label> <input type="text" class="form-control"
					name="rom" value="${mob.rom}" required>
			</div>
			<div class="form-group">
				<label>Processor</label> <input type="text" class="form-control"
					name="processor" value="${mob.processor}" required>
			</div>
			<div class="form-group">
				<label>Display</label> <input type="text" class="form-control"
					name="display" value="${mob.display}" required>
			</div>
		</div>
		<div class="modal-footer">
			<a href="/mobile"><button type="button" class="close btn btn-danger" data-dismiss="modal"
				aria-hidden="true">Dismiss</button></a>
			<button type="submit" class="close btn btn-success">Update</button>
		</div>
	</form>
	
	
	
</body>
</html>