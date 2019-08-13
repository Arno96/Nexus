<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" isELIgnored="false"%>
   <%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>View Category</title>
</head>
<body>
<h2>View Category here</h2>
<hr/>

	<table>
		<tr>
			<th>Category Id</th>
			<th>Category Name</th>
			<th>Category desc</th>
			
		</tr>
		<c:forEach items="${l}" var="e">
			<tr>
				<td>${e.categoryId}</td>
				<td>${e.categoryName}</td>
				<td>${e.description}</td>
				
			</tr>
		</c:forEach>
</table>


</body>
</html>