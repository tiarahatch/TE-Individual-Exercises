<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

    
<c:import url="/WEB-INF/jsp/common/header.jsp">
	<c:param name="title" value="Favorite Food" />
</c:import>

<form method="POST" action="Page2">
	<label>What is your favorite food?</label>
	<input autofocus type="text" name="favoriteFood" value= "${favoriteFood}" id="food" class="input-field"><br>
	<button type="submit">Next >>></button>
</form>

<c:import url="/WEB-INF/jsp/common/footer.jsp" />