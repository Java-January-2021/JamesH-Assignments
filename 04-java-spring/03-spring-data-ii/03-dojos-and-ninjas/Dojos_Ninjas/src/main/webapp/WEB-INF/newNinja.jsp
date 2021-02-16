<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>New Ninja</title>
</head>
<body>
	<h2>Add New Ninja</h2>
	<form:form action="/ninja" method="POST" modelAttribute="ninja">
		<div>
			<form:label path="dojo">Choose Dojo: </form:label>
			<form:errors path="dojo"/>
			<form:select path="dojo">
			<c:forEach items="${ dojo }" var="dojo">
				<option value="${ dojo.id }">${ dojo.name }</option>
			</c:forEach>
			</form:select>
		</div>
		<div>
			<form:label path="firstName">First Name: </form:label>
			<form:errors path="firstName"/>
			<form:input path="firstName"/>
		</div>
		<div>
			<form:label path="lastName">Last Name: </form:label>
			<form:errors path="lastName"/>
			<form:input path="lastName"/>
		</div>
		<div>
			<form:label path="age">Age: </form:label>
			<form:errors path="age"/>
			<form:input path="age"/>
		</div>
		<button>Submit</button>
	</form:form>
	<a href="/">back to home screen</a>
</body>
</html>