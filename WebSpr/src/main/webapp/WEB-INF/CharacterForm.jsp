<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Add Character</title>
</head>
<body>
<h2>Add Character here</h2>
<hr/>
<form:form action="getCharacter" modelAttribute="chObj" method="post">
	<table>
	<tr>
	<td>Character ID:</td>
	<td><form:input path="characterId"/></td>
	</tr>
	 <tr>
	<td>Character Name:</td>
	<td><form:input path="characterName"/></td>
	</tr>
	<tr>
	<td>Character Description:</td>
	<td><form:input path="desc"/></td>
	</tr>
	<tr>
					<td colspan="2">
						<input type="submit" value="Add"/>
 					</td>
				</tr>
</table>
</form:form>
</body>
</html>