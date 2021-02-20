<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>New Category</title>
</head>
<body>
	<h2>Create New Category</h2>
	<form:form action="/create/category" method="POST" modelAttribute="category">
		<form:label path="name">Name: </form:label>
		<form:errors path="name"/>
		<form:input path="name"/>
		<button>Create</button>
	</form:form> 
	<a href="/">back to home screen</a>
</body>
</html>