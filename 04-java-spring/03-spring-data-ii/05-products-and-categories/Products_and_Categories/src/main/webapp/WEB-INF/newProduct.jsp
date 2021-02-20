<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>New Product</title>
</head>
<body>
	<h2>Create New Product</h2>
	<form:form action="/create/product" method="POST" modelAttribute="product">
		<form:label path="name">Name: </form:label>
		<form:errors path="name"/>
		<form:input path="name"/>
		
		<form:label path="description">Description: </form:label>
		<form:errors path="description"/>
		<form:input path="description"/>
		
		<form:label path="price">Price: </form:label>
		<form:errors path="price"/>
		<form:input path="price"/>
		<button>Create</button>
	</form:form> 
	<a href="/">back to home screen</a>
</body>
</html>