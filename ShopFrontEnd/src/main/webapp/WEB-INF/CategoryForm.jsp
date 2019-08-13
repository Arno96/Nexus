<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
    <%@taglib prefix="f" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Add Category</title>
</head>
<body>
<div align="center">
	<fieldset>
		<legend>${frmLabel}</legend>
		<f:form action="${pageContext.request.contextPath}/submitCategory" method="post" modelAttribute="cObj">
			<table>
				<c:if test="${cObj.categoryId ne 0}">
				<tr>
					<td>Category Id : </td>
					<td><f:input type="text" path="categoryId" />
				</tr>
					
				</c:if>
				<tr>
					<td>Category Name : </td>
					<td><f:input type="text" path="categoryName"/>
				</tr>
				<tr>
					<td>Category Desc : </td>
					<td><f:input type="text" path="description"/>
				</tr>
				<tr>
					<td>
						<input type="submit" value="${btnLabel}">
					</td>
				</tr>
			</table>
		</f:form>
	</fieldset>
</div>
</html>