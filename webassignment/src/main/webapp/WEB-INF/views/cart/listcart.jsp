<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>  
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<head>
<meta charset="UTF-8">
<title>List-Cart</title>

</head>
<body>
	<div class="row">
		<div class="span12">
			<ul class="breadcrumb">
				<li><a href="index.html">Home</a> <span class="divider">/</span></li>
				<li class="active">Check Out</li>
			</ul>
			<div class="well well-small">
				<h1>
					Check Out <small class="pull-right"> ${totalQuantityCart}
						items are in the cart </small>
				</h1>
				<hr class="soften" />

				<table class="table table-bordered table-condensed">
					<thead>
						<tr>
							<th>Product Image</th>
							<th>Name</th>
							<th>Description</th>
							<th>Color</th>
							<th>Unit price</th>
							<th>Quantity</th>
							<th>Edit</th>
							<th>Remove</th>
							<th>Total</th>
						</tr>
					</thead>
					<tbody>
						<c:forEach var="item" items="${ Cart }">
							<tr>
								<td><img width="100"
									src="<c:url value="/assets/user/img/slides/${item.value.product.image }" />"
									alt=""></td>
								<td>${item.value.product.product_name }</td>
								<td>${item.value.product.product_info}</td>
								<td><span>${item.value.product.name_color}</span></td>
								<td><fmt:formatNumber type="number" groupingUsed="true"
										value="${item.value.product.price}" /> VND</td>
								<td><input min="0" max="1000" class="span1"
									style="max-width: 55px" placeholder="1"
									id="quantity-cart-${item.key }" size="16" type="number"
									value="${item.value.quantity }"></td>
								<td><button data-id="${item.key }"
										class="btn btn-mini btn-danger edit-cart" type="button">
										<span class="icon-edit"></span>
									</button></td>
								<td><a href="<c:url value="/DeleteCart/${item.key }" />"
									class="btn btn-mini btn-danger" type="button"> <span
										class="icon-remove"></span>
								</a></td>
								<td><fmt:formatNumber type="number" groupingUsed="true"
										value="${item.value.totalPrice}" /> VND</td>
							</tr>
						</c:forEach>
					</tbody>
				</table>
				<div>
					<h2 style="float: right; margin-right: 3%">
						Total:
						<fmt:formatNumber type="number" groupingUsed="true"
							value="${totalPriceCart }" />
						VND
					</h2>
				</div>
				<hr>
				<hr>
				<hr>
				<br /> <a href="products.html" class="shopBtn btn-large"><span
					class="icon-arrow-left"></span> Continue Shopping </a> <a
					href="login.html" class="shopBtn btn-large pull-right">Next <span
					class="icon-arrow-right"></span></a>

			</div>
		</div>
	</div>
	<content tag="script"> <script>
		$(".edit-cart").on("click", function() {
			let id = $(this).data("id");
			let quantity = $("#quantity-cart-" + id).val();
			window.location = "EditCart/" + id + "/" + quantity;
		});
	</script> </content>
</body>
