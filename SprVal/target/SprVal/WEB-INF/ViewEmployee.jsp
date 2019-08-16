<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" isELIgnored="false"%>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Employee Form</title>
</head>
<body>

<div align="center">

	
	

	<h1>View employee</h1>
	<table border="1">
		<tr>
			<th>Employee Name</th>
			<th>Employee id</th>
			<th>Employee email</th>
			<th>Employee contact</th>
			
		</tr>
		
			<tr>
				<td>${empObj.employeeName}</td>
				<td>${empObj.employeeId }</td>
				<td>${empObj.email }</td>
				<td>${empObj.contactNum }</td>
			
			</tr>
	
	</table>
</div>
	
</body>
</html>