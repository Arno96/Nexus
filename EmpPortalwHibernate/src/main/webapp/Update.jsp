<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<fieldset>
		<legend>Update Hero</legend>
		<form action="UpControl">	
			<table>
				
				<tr>
					<td>Hero Id : </td>
					<td>
						<input type="text" name="hi" placeholder="Enter id" required/>
					</td>
				</tr>
				<tr>
					<td>Hero Name : </td>
					<td>
						<input type="text" name="hn" placeholder="Enter name" required/>
					</td>
				</tr>
				<tr>
					<td>Hero age : </td>
					<td>
						<input type="text" name="ha" placeholder="Enter age" required/>
					</td>
				</tr>
				<tr>
					<td colspan="2">
						<input type="submit" value="Update"/>
 					</td>
				</tr>
			</table>
		</form>
	</fieldset>
</body>
</html>