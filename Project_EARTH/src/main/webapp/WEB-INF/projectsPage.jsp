<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<link rel="stylesheet" href="css/soloStyle.css">
<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script>
<title>Projects</title>
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
	    		</ul>
		</div>
		<h1 class="header">Projects</h1>
		<div class="project_box">
			<h2 id="forest">Forest</h2>
			<div class="slide" id="forest_slide">
				<div>
					<p>The Forest Project asks the question: What is the best ecosystem for supporting life in general. The most obvious answer is a forest. Forests give the perfect environment for plant, animal, and fungal life to live. It provides shade from the harsh sun, a home for many animals, and it usually is accompanied by the most fertile soil on earth. Why is this, well the most logical answer is that there are trees, lots and lots of trees. Therefore, the aim of the Forest Project is to artificially create forest environments. As a result, we hope to improve land to its fullest potential for supporting life, a forest.</p>
					<a id="explore_forest" href="/forest">Explore</a>
				</div>
				<img src="images/forest.JPEG" alt="forest_photo">
			</div>
		</div>
		<div class="project_box">
			<h2 id="water">Water</h2>
			<div class="slide" id="water_slide">
				<div>
					<p>The Water Project asks the question: Why is a desert always dry, and a swamp always wet? What if I told you the Sahara Desert and Florida share the same latitude? So what makes these two environments so vastly different? And, can we do anything to change it? We consider many variables that could be at play, and try to come up with scenarios where we can change an environment from one to the other. To support abundant life, water must be present in abundance. Therefore, the aim of the Water Project is to find a way to increase the water available in a given ecosystem in a somewhat permanent way. </p>
					<a id="explore_water" href="/water">Explore</a>
				</div>	
				<img src="images/water.JPEG" alt="water_photo">
			</div>
		</div>
		<div class="project_box">
			<h2 id="animals">Animals</h2>
			<div class="slide" id="animals_slide">
				<div>
					<p>The Animals Project asks the question: What impact does an animal have on the environment? I think the answer is that animals have a huge impact on the environment. In fact, I theorize that animals can make or break an ecosystem depending on the complex relationships animals have with plants, other animals, soil, etc. At the Animal Project, we look into the possible affects various animals have on a given ecosystem. The aim of the Animals Project is to use animals to improve ecosystems. </p>
					<a id="explore_animals" href="/animals">Explore</a>
				</div>
				<img src="images/animals.JPEG" alt="animals_photo">
			</div>
		</div>
		<div class="project_box">
			<h2 id="soil">Soil</h2>
			<div class="slide" id="soil_slide">
				<div>
					<p>The Soil Project asks the question: What makes good soil? How did good soil become good? How did bad soil become bad? By answering these questions, it may be possible to improve bad soil, and prevent good soil from becoming bad. The aim of the Soil Project is to learn how soil changes, share our findings, and start taking control of the precious resource that is good soil. </p>
					<a id="explore_soil" href="/soil">Explore</a>
				</div>
				<img src="images/soil.JPEG" alt="soil_photo">
			</div>
		</div>
		
	</div>
	<script src="js/script.js"></script>
</body>
</html>