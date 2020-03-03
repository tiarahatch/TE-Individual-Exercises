<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>

<c:import url="/WEB-INF/jsp/common/header.jsp">
<c:param name="pageTitle" value="Product Tile View" />
</c:import>

<div id="masonry-page">
<c:import url="/WEB-INF/jsp/common/filters.jsp">
<%-- Modify the baseRoute to apply filters to the current route. --%>
<c:param name="baseRoute" value="/products/tiles" />
</c:import>

<!-- Container for all of the Products -->
<!-- The list of products is available using the `products` variable -->
<div id="grid" class="main-content">

<c:forEach var="product" items="${products }">
                
    <div class="tile">
    
            

                <c:choose>
                <c:when test="${product.remainingStock == 0}">
                    <div class="tile sold-out ">
                    <span class="banner">Sold Out</span>
                    </div>
                </c:when>
                </c:choose>
                
                

        <c:url var="productDetailsPageHref" value="/products/detail">
            <c:param name="id">${product.id}</c:param>

        </c:url>
        <a class="product-image" href="${productDetailsPageHref }"> <img
            src="<c:url value= "/images/product-images/${product.imageName }" />" />
        </a>

        <div class="details">
            <p class="name">
                <c:out value="${product.name }" />
            
            
                
            
        <c:choose>
    <c:when
        test="${product.remainingStock <=5 && product.remainingStock > 0 }">
        <p class="alert-remaining">BUY NOW! Only
            ${product.remainingStock } left!</p>
    </c:when>
    <c:otherwise>
    </c:otherwise>
</c:choose>



            <!-- .filled will make the star solid -->
            <div class="rating">
                <c:choose>
                    <c:when test="${product.averageRating >= 4}">
                        <span class="filled">&#9734;</span> 
                        <span class="filled">&#9734;</span>
                        <span class="filled">&#9734;</span> 
                        <span class="filled">&#9734;</span>
                        <span class="filled">&#9734;</span>
                    </c:when>
                    <c:when
                        test="${product.averageRating >= 3.5 && product.averageRating <= 4.49}">
                        <span class="filled">&#9734;</span> 
                        <span class="filled">&#9734;</span>
                        <span class="filled">&#9734;</span> 
                        <span class="filled">&#9734;</span>
                        <span>&#9734;</span>
                    </c:when>
                    <c:when
                        test="${product.averageRating >= 2.5 && product.averageRating <= 3.49}">
                        <span class="filled">&#9734;</span> 
                        <span class="filled">&#9734;</span>
                        <span class="filled">&#9734;</span> 
                        <span>&#9734;</span>
                        <span>&#9734;</span>
                    </c:when>
                    <c:when
                        test="${product.averageRating >= 1.5 && product.averageRating <= 2.49}">
                        <span class="filled">&#9734;</span> 
                        <span class="filled">&#9734;</span>
                        <span>&#9734;</span>
                        <span>&#9734;</span>
                        <span>&#9734;</span>
                    </c:when>
                    <c:otherwise>
                        <span class="filled">&#9734;</span>
                        <span>&#9734;</span>
                        <span>&#9734;</span>
                        <span>&#9734;</span> 
                        <span>&#9734;</span>
                    </c:otherwise>
                </c:choose>
                
                
                <div class=" tile top-seller ">
                <c:choose> 
                <c:when test="${product.topSeller}">
                <span class="banner">Top Seller</span>
                </c:when>
                </c:choose>
                </div>
            
            </div>
        </div>
        <p class="price"><fmt:formatNumber type= "currency" currencySymbol="$" maxFractionDigits = "2" value = "${product.price }"/></p>
        </div>
            
            </c:forEach>
        </div>
    </div>
<c:import url="/WEB-INF/jsp/common/footer.jsp" />
keyboard_arrow_up
" class="embed__link-content-wrapper" target="_blank">