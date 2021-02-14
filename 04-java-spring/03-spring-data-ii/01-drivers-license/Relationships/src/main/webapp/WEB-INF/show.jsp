<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Show</title>
</head>
<body>
	<h2>${ person.firstName } ${ person.lastName }</h2>
	<c:choose>
	<c:when test="${ person.license != null }">
		<p>License Number: ${ person.license.number }</p>
		<p>State: ${ person.license.state }</p>
		<p>Expiration Date: ${ person.license.expiration_date }</p>
	</c:when>
	<c:otherwise>
		<p>Has No License.<p>
	</c:otherwise>
	</c:choose>
	<a href="/">back to home screen</a>

</body>
</html>