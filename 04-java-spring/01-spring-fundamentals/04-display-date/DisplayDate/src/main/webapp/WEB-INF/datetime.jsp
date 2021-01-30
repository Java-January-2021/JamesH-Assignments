<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Date And Time</title>
<link rel="stylesheet" href="css/style.css" />
</head>
<body onload="alertPage('<c:out value="${dt}"/>')">
	<h1 class=<c:out value="${ dt }"/>><c:out value="${ dtFormat }" /></h1>
	<script defer type="text/javascript" src="js/alerter.js"></script>
</body>
</html>