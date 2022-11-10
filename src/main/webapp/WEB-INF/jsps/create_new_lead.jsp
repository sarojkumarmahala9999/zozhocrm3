<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ include file="menu.jsp" %>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Create Lead</title>
</head>
<body>
	<h2>Create New Lead</h2>
	<form action="save" method="post">
		<pre>
		First Name <input type = "text" name = "firstName"/>
		Last Name <input type = "text" name = "lastName"/>
		Email <input type = "text" name = "email"/>
		Mobile<input type = "text" name = "mobile"/>
		Source: <select name="source" >
				  <option value="radio">Radio</option>
				  <option value="tv ads">TV Ads</option>
				  <option value="news paper">News Paper</option>
				  <option value="website">Website</option>
				</select>
		<input type = "Submit" value = "SAVE"/>
		</pre>
	</form>
</body>
</html>