<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>New License</title>
</head>
<body>
	<h1>Add New License</h1>
	<form:form action="/license" method="POST" modelAttribute="license">
		<div>
			<form:label path="person">Person: </form:label>
			<form:errors path="person"/>
			<form:select path="person">
			<c:forEach items="${ people }" var="peeps">
				<option value="${ peeps.id }">${ peeps.firstName } ${ peeps.lastName }</option>
			</c:forEach>
			</form:select>
		</div>
		<div>
			<form:label path="state">State: </form:label>
			<form:errors path="state"/>
			<form:input path="state"/>
		</div>
		<div>
			<form:label path="expiration_date">Expiration Date: </form:label>
			<form:errors path="expiration_date"/>
			<form:input type="date" path="expiration_date"/>
		</div>
		<button>Submit</button>
	</form:form>
	<a href="/">back to home screen</a>
</body>
</html>