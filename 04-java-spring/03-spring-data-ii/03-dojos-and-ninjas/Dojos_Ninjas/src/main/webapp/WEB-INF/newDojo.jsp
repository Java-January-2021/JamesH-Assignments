<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>New Dojo</title>
</head>
<body>
	<h2>Add New Dojo</h2>
	<form:form action="/dojo" method="POST" modelAttribute="dojo">
		<form:label path="name">Dojo Name: </form:label>
		<form:errors path="name"/>
		<form:input path="name"/>
		<button>Submit</button>
	</form:form>
	<a href="/">back to home screen</a>
</body>
</html>