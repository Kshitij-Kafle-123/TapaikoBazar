<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
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


<div class="container">

		<div class="row">
			
					<div class="row m-2">

						<div class="col-md-10 col-sm-10">



							<div class="card">
								<img class="card-img-top" src="images/book.jpg" alt="Products">
								<div class="card-body" style="height: 16rem">
									<h4 class="card-title">
										<a href="#" title="View Product"><c:out
												value="${product.productName}" /></a>
									</h4>
									<p class="card-text">
										<c:out value="${product.description}" />
									</p>
									<div class="card-footer row">
										<div class="col">
											<p class="btn btn-danger btn-block">
												Rs.
												<c:out value="${product.price}" />
											</p>
										</div>
										<div class="col">
											<a href="#" class="btn btn-success btn-block">Buy</a>
										</div>
									</div>
								</div>
							</div>

						</div>
					</div>


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
