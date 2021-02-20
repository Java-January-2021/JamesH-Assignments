<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Welcome Page</title>
</head>
<body>
	<h2>Welcome!</h2>
	<h3><a href="/new/product">Add new product</a> | <a href="/new/category">Add new category</a></h3>
	<div>
		<p>Click the PRODUCT below to view </p> 
		<ul>
			<c:forEach items="${ products }" var="product">
				<li><a href="/product/${ product.id }">${ product.name }</a></li>
			</c:forEach>
		</ul>
		<hr>
		<p>Click the CATEGORY below to view </p> 
		<ul>
			<c:forEach items="${ categories }" var="category">
				<li><a href="/category/${ category.id }">${ category.name }</a></li>
			</c:forEach>
		</ul>
	</div>
</body>
</html>