<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Show Dojo</title>
</head>
<body>
	<h2>${ dojo.name }</h2>
	<h3>Student List</h3>
	<table>
		<thead>
			<tr>
				<th>First Name </th> 
				<th>Last Name </th>
				<th>Age </th>
			</tr> 
		</thead>
		<tbody>
			<c:forEach items="${ninjas}" var="n">
			<tr>
				<td>${ n.firstName }</td>
				<td>${ n.lastName }</td>
				<td>${ n.age }</td>
			</tr>
			</c:forEach>
		</tbody>
	</table>
	<a href="/">back to home screen</a>
</body>
</html>