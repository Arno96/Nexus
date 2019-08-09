<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" isELIgnored="false"%>
   
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>View Character</title>
</head>
<body>
<h2>View Character here</h2>
<hr/>

	<table>
	<tr>
	<td>Character ID:</td>
	<td>${chObj.characterId}</td>
	</tr>
	 <tr>
	<td>Character Name:</td>
	<td>${chObj.characterName}</td>
	</tr>
	<tr>
	<td>Character Description:</td>
	<td>${chObj.desc}</td>
	</tr>
</table>


</body>
</html>