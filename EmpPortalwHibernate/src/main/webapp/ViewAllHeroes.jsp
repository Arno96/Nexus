<%@page import="java.util.List,com.frame.Hero" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" isELIgnored="false"%>
   
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>All Heroes</title>
</head>
<body>
	<table>
		<tr>
			<th>Hero Id</th>
			<th>Hero Name</th>
			<th>Hero Age</th>
			
		</tr>
		<c:forEach items="${elist}" var="e">
			<tr>
				<td>${e.id}</td>
				<td>${e.name}</td>
				<td>${e.age}</td>
				
			</tr>
		</c:forEach>
	</table>
</body>
</html>