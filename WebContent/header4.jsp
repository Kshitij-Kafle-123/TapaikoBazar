
<link rel="stylesheet" href="resources/bootstrap/css/bootstrap.min.css">

<script type="text/javascript" src="resources/js/jquery-3.3.1.min.js"></script>
<script type="text/javascript"
	src="resources/bootstrap/js/bootstrap.min.js"></script>
<!--  navbar-light bg-light-->

<nav class="navbar navbar-expand-lg navbar-dark bg-info">
	<a class="navbar-brand" href="welcome.jsp"> <img src="images/cart.svg"
		width="30" height="30" class="d-inline-block align-top" alt="">
		Bazar
	</a>
	<button class="navbar-toggler" type="button" data-toggle="collapse"
		data-target="#navbarSupportedContent"
		aria-controls="navbarSupportedContent" aria-expanded="false"
		aria-label="Toggle navigation">
		<span class="navbar-toggler-icon"></span>
	</button>

	<div class="collapse navbar-collapse" id="navbarSupportedContent">
		<ul class="navbar-nav mr-auto">
			<!-- <li class="nav-item active"><a class="nav-link" href="registration.jsp">Admin
					<span class="sr-only">(current)</span>
			</a></li> -->
			<li class="nav-item active"><a class="nav-link" href="ProductController?actions=product_list">Product_List
					<span class="sr-only">(current)</span>
			</a></li>
			
			<li class="nav-item active"><a class="nav-link" href="CustomerController?actions=customer_list">Customer
					<span class="sr-only">(current)</span>
			</a></li>
			
			<li class="nav-item active"><a class="nav-link" href="ProductController?actions=sells_list">Sells Record
					<span class="sr-only">(current)</span>
			</a></li>
		</ul>
		
	
</nav>











