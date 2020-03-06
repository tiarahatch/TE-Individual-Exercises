<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<c:import url="/WEB-INF/jsp/common/header.jsp">
	<c:param name="title" value="Favorite Season" />
</c:import>

<form method =  "POST" action= "page3">
<label>What is your favorite season?</label>
	<ul>
	<li class="radio"><input name="favoriteSeason" value="Spring"  type="radio"><label for= "Spring">Spring</label></li>
    <li class="radio"><input name="favoriteSeason" value="Summer"  type="radio"><label for= "Summer">Summer</label></li>
    <li class="radio"><input name="favoriteSeason" value="Fall"  type="radio"><label for= "Fall">Fall</label></li>
    <li class="radio"><input name="favoriteSeason" value="Winter"  type="radio"><label for= "Winter">winter</label></li><br>
    </ul>
    
    <button type="submit">Next >>></button>
    
    
    </form>

<c:import url="/WEB-INF/jsp/common/footer.jsp" />