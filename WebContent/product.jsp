<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
	<%@ page import="product.dao.ProductDaoImpl" %>
	
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>


<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Products</title>
<link
	href="//maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css"
	rel="stylesheet" id="bootstrap-css">
<script
	src="//maxcdn.bootstrapcdn.com/bootstrap/4.0.0/js/bootstrap.min.js"></script>
<script
	src="//cdnjs.cloudflare.com/ajax/libs/jquery/3.2.1/jquery.min.js"></script>
<!---- Include the above in your HEAD tag -------->

<link
	href="https://maxcdn.bootstrapcdn.com/font-awesome/4.7.0/css/font-awesome.min.css"
	rel="stylesheet"
	integrity="sha384-wvfXpqpZZVQGK6TAh5PVlGOfQNHSoD2xbE+QkPxCAFlNEevoEH3Sl0sibVcOQVnN"
	crossorigin="anonymous">
</head>
<body>

	<nav class="navbar navbar-expand-md navbar-dark bg-info">
		<div class="container">
			<a class="navbar-brand" href="welcome.jsp">Bazar</a> <a
				class="navbar-brand" href="home.jsp">Home</a>




			<button class="navbar-toggler" type="button" data-toggle="collapse"
				data-target="#navbarsExampleDefault"
				aria-controls="navbarsExampleDefault" aria-expanded="false"
				aria-label="Toggle navigation">
				<span class="navbar-toggler-icon"></span>
			</button>


			<div class="collapse navbar-collapse" id="navbarSupportedContent">
				<ul class="navbar-nav mr-auto">

					<div class="container">

						<div class="btn-group">
							<button type="button" class="btn btn-primary"
								onclick="location.href='food.jsp'">Food</button>
							<button type="button" class="btn btn-primary"
								onclick="location.href='cloth.jsp'">Cloth</button>
							<button type="button" class="btn btn-primary"
								onclick="location.href='electronic.jsp'">Electronic</button>
							<button type="button" class="btn btn-primary"
								onclick="location.href='book.jsp'">Book</button>



						</div>
						</div>
				</ul>


				<form class="form-inline my-2 my-lg-0"  action="ProductController?actions=search">
				
				<input type="text" name="ppname">
				<input type="submit" value="search">
				</form>
					<!-- <div class="input-group input-group-sm">
						<input type="text" class="form-control" name="ppname"
							aria-label="Small" aria-describedby="inputGroup-sizing-sm"
							placeholder="Search..."><input type="submit" value="search">
							
							 -->
						<!-- <div class="input-group-append">
							<button type="button" class="btn btn-secondary btn-number"
								onclick="location.href='ProductController?actions=search'">
								<i class="fa fa-search"></i>
							</button>
						</div>
					 -->
					
					
					<form class="form-inline my-2 my-lg-0" method="get" action="ProductController">
					<a class="btn btn-success btn-sm ml-3" href="cart.jsp"> <i
						class="fa fa-shopping-cart"></i> Cart <span
						class="badge badge-light">0</span>
					</a>
				</form>
			</div>
	
	</nav>

	<section class="jumbotron text-center">
		<h1 class="jumbotron-heading">Products</h1>
		<a href="ProductController?actions=product_view">Show Product</a>
	</section>
	<!-- col-md-6 col-lg-4 -->


	<div class="container">

		<div class="row">
			<c:if test="${!empty product}">
				<c:forEach items="${product}" var="p" varStatus="d">

					<div class="row m-2">

						<div class="col-md-10 col-sm-10">



							<div class="card">
								<img class="card-img-top" src="images/book.jpg" alt="Products">
								<div class="card-body" style="height: 16rem">
									<h4 class="card-title">
										<a href="#" title="View Product"><c:out
												value="${p.productName}" /></a>
									</h4>
									<p class="card-text">
										<c:out value="${p.description}" />
									</p>
									<div class="card-footer row">
										<div class="col">
											<p class="btn btn-danger btn-block">
												Rs.
												<c:out value="${p.price}" />
											</p>
										</div>
										<div class="col">
											<a href="ProductController?actions=shop&id=${p.id}&pname=${p.productName}" class="btn btn-success btn-block">Buy</a>
										</div>
									</div>
								</div>
							</div>

						</div>
					</div>

				</c:forEach>
			</c:if>

		</div>
	</div>




	<!-- Footer -->
	<footer class="text-light">


		<div class="col-12 copyright mt-3">
			<p class="float-left">
				<a href="#">Back to top</a>
			</p>

		</div>

	</footer>
</body>