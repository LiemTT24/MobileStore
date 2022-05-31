<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>  
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Products</title>
<style>
.pagination {
	display: flex;
	justify-content: center;
}

.pagination a {
	color: black;
	float: left;
	padding: 8px 16px;
	text-decoration: none;
	transition: background-color .3s;
	border: 1px solid #ddd;
}

.pagination a.active {
	background-color: #4CAF50;
	color: white;
	border: 1px solid #4CAF50;
}

.pagination a:hover:not(.active) {
	background-color: #ddd;
}
</style>
</head>
<body>
	<div class="well well-small">
		<div class="row">
			<span style="margin-left: 25px;">List Products</span> <select
				class="pull-right">
				<option>A - Z</option>
				<option>Low - High</option>
			</select>
		</div>
		<c:if test="${productsPaginate.size()>0 }">
			<div class="row-fluid">
				<ul class="thumbnails">
					<c:forEach var="item" items="${productsPaginate}" varStatus="loop">
						<li class="span4">
							<div class="thumbnail">
								<a href="<c:url value="/product-detail/${ item.product_id }" />"
									class="overlay"></a> <a class="zoomTool"
									href="<c:url value="/product-detail/${ item.product_id }" />
									title="addtocart"><span
									class="icon-search"></span> QUICK VIEW</a> <a
									href="<c:url value="/product-detail/${ item.product_id }" />"><img
									src="<c:url value="/assets/user/img/slides/${item.image}" />"
									alt=""></a>
								<div class="caption cntr">
									<p>${item.product_name}</p>
									<p>
										<strong><fmt:formatNumber type="number"
												groupingUsed="true" value="${item.price}" />VND</strong>
									</p>
									<h4>
										<a class="shopBtn" href="#" title="add to cart"> Add to
											cart </a>
									</h4>
									<div class="actionList">
										<a class="pull-left" href="#">Add to Wish List </a> <a
											class="pull-left" href="#"> Add to Compare </a>
									</div>
									<br class="clr">
								</div>
							</div>
						</li>
						<c:if
							test="${(loop.index+1) % 3 == 0 || (loop.index+1) == productsPaginate.size() }">
				</ul>
			</div>
			<c:if test="${ (loop.index+1) < productsPaginate.size() }">
				<div class="row-fluid">
					<ul class="thumbnails">
			</c:if>
		</c:if>
		</c:forEach>
		</c:if>
	</div>
	<div class="pagination">
		<a href="#">&laquo;</a>
		<c:forEach var="item" begin="1" end="${paginateInfo.totalPages}"
			varStatus="loop">
			<c:if test="${(loop.index) == paginateInfo.currentPage }">
				<a href="<c:url value="/product/${idCategory}/${loop.index}" />"
					class="active">${loop.index}</a>
			</c:if>

			<c:if test="${(loop.index) != paginateInfo.currentPage }">
				<a href="<c:url value="/product/${idCategory}/${loop.index}" />">${loop.index}</a>
			</c:if>
		</c:forEach>
		<a href="#">&raquo;</a>
	</div>
</body>
</html>