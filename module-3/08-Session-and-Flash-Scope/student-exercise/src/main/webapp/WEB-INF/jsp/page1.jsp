<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<c:import url="/WEB-INF/jsp/common/header.jsp">
	<c:param name="title" value="Favorite Color" />
</c:import>

<form method="POST" action="Page1">
	<label>What is your favorite color?</label>
	<input autofocus type="text" name="favoriteColor" value= "${favoriteColor}" id="color" class="input-field"><br>
	<button type="submit">Next >>></button>
</form>

<c:import url="/WEB-INF/jsp/common/footer.jsp" /> 

