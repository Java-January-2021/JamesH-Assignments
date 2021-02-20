<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Show Product</title>
</head>
<body>
	<h2>${ product.name }</h2>
	<p>${ product.description }</p>
	<hr>
	<h3>Categories</h3>
		<ul>
			<c:forEach items="${ product.categories }" var="cat">
				<li>${ cat.name }</li>			
			</c:forEach>
		</ul>
	
	<form action="/product/${ product.id }" method="POST">
		<label>Choose Category: </label> 
		
		<select name="category">
			<c:forEach items="${ catAssociation }" var="cat">
		        	<option value=${ cat.id }>${ cat.name }</option>
		    </c:forEach> 
		</select> 
		<button>Add</button>
	</form> 
	<a href="/">back to home screen</a>
</body>
</html>