<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>

<c:import url="/WEB-INF/jsp/common/header.jsp">
<c:param name="pageTitle" value="Product Details" />
</c:import>

<div id="product-detail">
<img
src="<c:url value= "/images/product-images/${product.imageName}" />" />
<div class="product-description">
${product.name }
<div class="rating">
<c:choose>
<c:when test="${product.averageRating > 4 }">
<span class="filled"></span>
<span class="filled"></span>
<span class="filled"></span>
<span class="filled"></span>
<span class="filled"></span>
</c:when>
<c:when test="${product.averageRating > 3}">
<span class="filled"></span>
<span class="filled"></span>
<span class="filled"></span>
<span class="filled"></span>
<span></span>

        </c:when>
        <c:when test="${product.averageRating > 2}">
            <span class="filled">&#9734;</span>
            <span class="filled">&#9734;</span>
            <span class="filled">&#9734;</span>
            <span>&#9734;</span>
            <span>&#9734;</span>


        </c:when>
        <c:when test="${product.averageRating >1}">
            <span class="filled">&#9734;</span>
            <span class="filled">&#9734;</span>
            <span>&#9734;</span>
            <span>&#9734;</span>
            <span>&#9734;</span>

        </c:when>
        <c:when test="${product.averageRating == 1}">
            <span class="filled">&#9734;</span>
            <span>&#9734;</span>
            <span>&#9734;</span>
            <span>&#9734;</span>
            <span>&#9734;</span>
        </c:when>
        <c:otherwise>
            <span>&#9734;</span>
            <span>&#9734;</span>
            <span>&#9734;</span>
            <span>&#9734;</span>
            <span>&#9734;</span>
        </c:otherwise>
    </c:choose>
</div>
<c:choose>
    <c:when
        test="${product.remainingStock <=5 && product.remainingStock > 0 }">
        <p class="alert-remaining">BUY NOW! Only
            ${product.remainingStock } left!</p>
    </c:when>
    <c:otherwise>
    </c:otherwise>
</c:choose>
<p class="description">${ product.description}</p>
<p class="price">
    <fmt:formatNumber value="${product.price }" type="currency" />
</p>
<c:choose>
    <c:when test="${product.remainingStock >0 }">
        <button class="action">Add to Cart</button>
    </c:when>
    <c:otherwise>
        <button disabled>Sold Out</button>
    </c:otherwise>
</c:choose>
</div>
</div>

<%-- <!-- Container for the Product -->
<!-- The current product is available using the product variable -->
<div id="product-detail">

<img src="<c:url value="/images/product-images/grey-sofa.jpg" />" />
<div class="product-description">
<h3>Grey Sofa</h3>

<!-- .filled will make the star solid -->
<div class="rating">
    <span class="filled">&#9734;</span> 
    <span class="filled">&#9734;</span>
    <span>&#9734;</span> 
    <span>&#9734;</span> 
    <span>&#9734;</span>
</div>

<!-- Include this if the product has a Remaining Stock of 5 or less -->
<p class="alert-remaining">BUY NOW! Only 4 left!</p>
<p class="description">Large four seater grey sofa.</p>
<p class="price">$939.00</p>

<!-- If item is in stock -->
<button class="action">Add to Cart</button>
<!-- OR if item is out of stock -->
<!--<button disabled>Sold Out</button>-->
</div>
</div> --%>

<c:import url="/WEB-INF/jsp/common/footer.jsp" />
keyboard_arrow_up
" class="embed__link-content-wrapper" target="_blank">