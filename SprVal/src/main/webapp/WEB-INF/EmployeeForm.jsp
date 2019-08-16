<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" isELIgnored="false"%>
<%@taglib prefix="f" uri="http://www.springframework.org/tags/form" %>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Category Form</title>
</head>
<body>

<div align="center">
	<fieldset>
		<legend>employee form</legend>
		<f:form action="${pageContext.request.contextPath}/empView" method="get" modelAttribute="empObj">
			<table>
				
				<tr>
					<td>Employee Id : </td>
					<td><f:input type="text" path="employeeId" />
					<td><f:errors path="employeeId"/></td>
				</tr>
					
				
				<tr>
					<td>Employee Name : </td>
					<td><f:input type="text" path="employeeName"/>
					<td><f:errors path="employeeName"/></td>
				</tr>
				<tr>
					<td>Employee email : </td>
					<td><f:input type="text" path="email"/>
					<td><f:errors path="email"/></td>
				</tr>
				<tr>
					<td>Employee contact : </td>
					<td><f:input type="text" path="contactNum"/>
					<td><f:errors path="contactNum"/></td>
				</tr>
				<tr>
					<td>
						<input type="submit" value="enter">
					</td>
				</tr>
			</table>
		</f:form>
	</fieldset>
</div>
	
</body>
</html>