<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Welcome</title>
</head>
<body>
	<h2>Questions Dashboard</h2>
	<table>
		<thead>
			<tr>
				<th>Questions</th>
				<th>Tags</th>
			</tr>
		</thead> 
		<tbody>
			<c:forEach items="${ questions }" var="quest">
				<tr>
					<td><a href="/question/${ quest.id}">${ quest.question }</a></td>
					<td>${ quest.tags }</td>
				</tr>
			</c:forEach> 
		</tbody>
	</table>
	<a href="/question/new">New Question</a>
</body>
</html>