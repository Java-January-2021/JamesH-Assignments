<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>E.A.R.T.H.</title>
<link rel="stylesheet" href="css/soloStyle.css">
</head>
<body>
	<div class="wrapper">
		<div id="nav-bar">
			<ul>
	            <li><a href="/">Home</a></li>
	            <li><a href="/projects">Projects</a></li>
	            <li><a href="/getinvolved">Get Involved</a></li>
	            <c:if test="${ admin.id != null }"><li><a href="/adminhome">Admin Home</a></li></c:if> 
	            <c:if test="${ admin.id != null }"><li><a href="/logout">Log Out</a></li></c:if> 
	            <c:choose>
	            <c:when test="${ admin.id != null }"></c:when>
	            <c:otherwise><li><a id="admin_login" href="/adminlogin">Admin Login</a></li></c:otherwise>
	    		</c:choose>
	    	</ul>
		</div>
		<h1 class="header">E. A. R. T. H. </h1>
		<h2 class="header">Environmental Activism, Research, Teaching, and Habitats</h2>
		<img id="homePhoto" src="images/home_photo.JPG" alt="home_photo">
		<p>E. A. R. T. H. is an organization dedicated to protecting, managing, restoring, and enjoying this beautiful planet we call home. The Earth is extreamly unique and very special. is the only place that we know of, that can support life as we know it. Earth not only provides an environment that allows us to survive, but it offers a certain abundance that allows life to thrive. Earth is vastly beautiful, from the largest of mountains, to the smallest of ant hills. The ecosystems in place are complex, and interconnected in a way that makes them like a perfect cycle. A cycle of birth, life, death, and rebirth. A cycle of predictable repetition, circling around in space, day after day, month after month, and year after year. With so much to behold, it is easy to forget that planet Earth is not a perfect place. It is possible for cycles to be broken, ecosystems to be destroyed, plants and animals to go extinct, and resources to be deemed unfit for human consumption. In an effort to become aware of these problems, and do something to solve them, we started E. A. R. T. H. We engage in a variety of activities including environmental activism, research, teaching, and habitat management and restoration. We only have one home, lets work together to keep it well.</p>
		<a id="explore_btn" href="/projects">Explore</a>
	</div>
</body>
</html>