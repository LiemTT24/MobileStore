<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>  
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<head>
<meta charset="UTF-8">
<title>Product-Detail</title>
<style type="text/css">
.product-content {
	overflow-x: hidden;
}
</style>
</head>
<body>
	<!-- body session -->
	<div class="row product-content">
		<div id="sidebar" class="span3">
			<div class="well well-small">
				<ul class="nav nav-list">
					<c:forEach var="item" items="${ categories }">
						<li><a href='<c:url value="/product/${item.id }" />'><span
								class="icon-circle-blank"></span> ${item.name}</a></li>
					</c:forEach>
					<li><a class="totalInCart" href="cart.html"><strong>Total
								<span class="badge badge-warning pull-right"
								style="line-height: 18px;"><fmt:formatNumber
										type="number" groupingUsed="true" value="${totalPriceCart}" />
									VND </span>
						</strong></a></li>
				</ul>
			</div>

			<div class="well well-small alert alert-warning cntr">
				<h2>50% Discount</h2>
				<p>
					only valid for online order. <br> <br> <a
						class="defaultBtn" href="#">Click here </a>
				</p>
			</div>
			<div class="well well-small">
				<a href="#"><img
					src="<c:url value="/assets/user/img/paypal.jpg" />"
					alt="payment method paypal"></a>
			</div>


			<a class="shopBtn btn-block" href="#">Upcoming products <br>
				<small>Click to view</small></a> <br> <br>
			<ul class="nav nav-list promowrapper">
				<li>
					<div class="thumbnail">
						<a class="zoomTool" href="product_details.html"
							title="add to cart"><span class="icon-search"></span> QUICK
							VIEW</a> <img src="assets/img/bootstrap-ecommerce-templates.png"
							alt="bootstrap ecommerce templates">
						<div class="caption">
							<h4>
								<a class="defaultBtn" href="product_details.html">VIEW</a> <span
									class="pull-right">$22.00</span>
							</h4>
						</div>
					</div>
				</li>
				<li style="border: 0">&nbsp;</li>
				<li>
					<div class="thumbnail">
						<a class="zoomTool" href="product_details.html"
							title="add to cart"><span class="icon-search"></span> QUICK
							VIEW</a> <img src="assets/img/shopping-cart-template.png"
							alt="shopping cart template">
						<div class="caption">
							<h4>
								<a class="defaultBtn" href="product_details.html">VIEW</a> <span
									class="pull-right">$22.00</span>
							</h4>
						</div>
					</div>
				</li>
				<li style="border: 0">&nbsp;</li>
				<li>
					<div class="thumbnail">
						<a class="zoomTool" href="product_details.html"
							title="add to cart"><span class="icon-search"></span> QUICK
							VIEW</a> <img src="#"
							alt="bootstrap template">
						<div class="caption">
							<h4>
								<a class="defaultBtn" href="product_details.html">VIEW</a> <span
									class="pull-right">$22.00</span>
							</h4>
						</div>
					</div>
				</li>
			</ul>

		</div>
		<div class="span9">
			<ul class="breadcrumb">
				<li><a href="index.html">Home</a> <span class="divider">/</span></li>
				<li><a href="products.html">Products</a> <span class="divider">/</span></li>
				<li class="active">Product details</li>
			</ul>
			<div class="well well-small">
				<div class="row-fluid">
					<div class="span5">
						<div id="myCarousel" class="carousel slide cntr">
							<div class="carousel-inner">
								<div class="item active">
									<a href="#"> <img src="<c:url value="/assets/user/img/slides/${ product.image }" />" alt=""
										style="width: 100%"></a>
								</div>
								<div class="item">
									<a href="#"> <img src="assets/img/b.jpg" alt=""
										style="width: 100%"></a>
								</div>
								<div class="item">
									<a href="#"> <img src="assets/img/e.jpg" alt=""
										style="width: 100%"></a>
								</div>
							</div>
							<a class="left carousel-control" href="#myCarousel"
								data-slide="prev">‹</a> <a class="right carousel-control"
								href="#myCarousel" data-slide="next">›</a>
						</div>
					</div>
					<div class="span7">
						<h3>${product.product_name}</h3>
						<hr class="soft" />

						<form class="form-horizontal qtyFrm" method="get" action="<c:url value="/AddCart/${ product.product_id }" />">
							<div class="control-group">
								<label class="control-label"><span>Item code</span></label>
								<h4>&emsp;${product.product_code}</h4>
							</div>
							<div class="control-group">
								<label class="control-label"><span><fmt:formatNumber
												type="number" groupingUsed="true" value="${product.price}" />VND</span></label>
								<div class="controls">
									<input type="number" min="1" class="span6" value="1">
								</div>
							</div>
							<div class="control-group">
								<label class="control-label"><span>Color</span></label>
								<div class="controls">
									<select class="span11">
										<option>White</option>
										<option>Violet</option>
										<option>Red</option>
										<option>Black</option>
										<option>Gray</option>
									</select>
								</div>
							</div>
							<h4>${product.sale} items in stock</h4>
							<p>${product.product_info}</p>
								<button type="submit" class="shopBtn">
									<span class=" icon-shopping-cart"></span> Add to cart
								</button>
						</form>
					</div>
				</div>


			</div>
		</div>
	</div>
</body>