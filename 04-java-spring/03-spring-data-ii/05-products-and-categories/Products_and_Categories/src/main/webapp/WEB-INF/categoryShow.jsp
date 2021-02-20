<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Show Category</title>
</head>
<body>
<h2>${ category.name }</h2>
	<hr>
	<h3>Products</h3>
		<ul>
			<c:forEach items="${ category.products }" var="prod">
				<li>${ prod.name }</li>			
			</c:forEach>
		</ul>
	
	<form action="/category/${ category.id }" method="POST">
		<label>Choose Product: </label> 
		
		<select name="product">
			<c:forEach items="${ prodAssociation }" var="prod">
		        	<option value=${ prod.id }>${ prod.name }</option>
		    </c:forEach> 
		</select> 
		<button>Add</button>
	</form> 
	<a href="/">back to home screen</a>
</body>
</html>