<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %> 
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Selected Book</title>
</head>
<body>
	<p><c:out value="${book.title}"/></p>
	<p><c:out value="${book.description}"/></p>
	<p><c:out value="${book.language}"/></p>
	<p><c:out value="${book.numberOfPages}"/></p>
	<a href="/books/edit/${book.id}">Edit Book</a>
	<a href="/books/delete/${book.id}">Delete Book</a>
</body>
</html>