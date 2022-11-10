<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ include file="menu.jsp" %>
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>List Of All Contacts</title>
</head>
<body>
	<h3>List Of All Contacts</h3>
	<table border="2">
		<tr>
			<th>First Name</th>
			<th>Last Name</th>
			<th>Email</th>
			<th>Mobile</th>
			<th>Source</th>
			<th>Billing</th>
		</tr>
		<c:forEach var="contacts" items="${contacts}">
		<tr>
			<td>${contacts.firstName}</td>
			<td>${contacts.lastName}</td>
			<td>${contacts.email}</td>
			<td>${contacts.mobile}</td>
			<td>${contacts.source}</td>
			<td><a href="billingContact?id=${contacts.id}">Billing?</a></td>
		</tr>
		</c:forEach>
	</table>
</body>
</html>