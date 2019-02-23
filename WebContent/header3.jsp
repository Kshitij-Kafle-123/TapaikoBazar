
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
			<li class="nav-item active"><a class="nav-link" href="home.jsp">Home
					<span class="sr-only">(current)</span>
			</a></li>
			<li class="nav-item dropdown"><a
				class="nav-link dropdown-toggle" href="#" id="navbarDropdown"
				role="button" data-toggle="dropdown" aria-haspopup="true"
				aria-expanded="false"> Category </a>
				<div class="dropdown-menu" aria-labelledby="navbarDropdown">
					<a class="dropdown-item" href="food.jsp">Food</a> <a class="dropdown-item"
						href="cloth.jsp">Cloth</a> <a class="dropdown-item" href="electronic.jsp">Electronics</a>
					<a class="dropdown-item" href="book.jsp">Books</a>

				</div></li>
				<li class="nav-item"><a class="nav-link" href="add.jsp">Add Products
					
			</a></li>
			
		</ul>
		<form class="form-inline my-2 my-lg-0">
			<input class="form-control mr-sm-2" type="search"
				placeholder="Search" aria-label="Search">
			<button class="btn btn-outline-dark my-2 my-sm-0" type="submit">Search</button>
		</form>
	</div>
</nav>











