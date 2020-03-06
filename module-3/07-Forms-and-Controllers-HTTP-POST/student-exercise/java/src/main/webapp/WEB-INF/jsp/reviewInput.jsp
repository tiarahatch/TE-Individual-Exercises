<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Squirrel Cigar Party</title>
</head>
<body>
	<header>
		<h1> Review Book: <br>
		Squirrel Cigar Party For Dummies</h1>
		<img src="etc/forDummies.png" class="centered" /><br>
		</header>
		
	<c:url var="reviewInputURL" value="/reviewInput" />
	
	<form action="${reviewInputURL}" method="POST">
		<label for = "userName">User Name</label>
		<input type="text" name="userName" /><br />
		<label for = "reviewTitle">Review Title </label>
		<input type = "text" name = "reviewTitle" /><br />
		<label for = "reviewText">Review</label>
		<input type="text" name="reviewText" /><br />
		<label for = "rating"> Rating</label><br />
		<input type="radio" name="rating" value="1">1
		<input type="radio" name="rating" value="2">2
		<input type="radio" name="rating" value="3">3
		<input type="radio" name="rating" value="4">4
		<input type="radio" name="rating" value="5">5<br />
		
		<input type="Submit" />
	</form>
	
</body>
</html>