<%-- 
    Document   : seller
    Created on : 21-03-2022, 20:38:36
    Author     : MSII
--%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
        <meta name="viewport"
		content="width=device-width, height=device-height, initial-scale=1.0, user-scalable=0, minimum-scale=1.0, maximum-scale=1.0">
        <link rel="icon" type="image/png" href="image/logoshop.jpg" />

	<!-- Import lib -->
	<link rel="stylesheet" type="text/css" href="https://cdnjs.cloudflare.com/ajax/libs/Chart.js/2.9.3/Chart.min.css">
	<link rel="stylesheet" type="text/css" href="fontawesome-free/css/all.min.css">
	<link href="https://fonts.googleapis.com/css2?family=Roboto&display=swap" rel="stylesheet">
	<!-- End import lib -->
        <link href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/6.1.0/css/all.min.css">
	<link rel="stylesheet" type="text/css" href="style/sell.css">
</head>

<body class="overlay-scrollbar">
	<!-- navbar -->
	<div class="navbar">
		<!-- nav left -->
		<ul class="navbar-nav">
			<li class="nav-item">
				<a class="nav-link">
					<i class="fas fa-bars" onclick="collapseSidebar()"></i>
				</a>
			</li>
			<li class="nav-item">
                            <a href="index.jsp" class="logo">SNEAKER</a>
			</li>
		</ul>
		<!-- end nav left -->
		<!-- form -->
		<form class="navbar-search">
			<input type="text" name="Search" class="navbar-search-input" placeholder="What you looking for...">
			<i class="fas fa-search"></i>
		</form>
		<!-- end form -->
		<!-- nav right -->
		<ul class="navbar-nav nav-right">
			<li class="nav-item mode">
				<a class="nav-link" href="#" onclick="switchTheme()">
					<i class="fas fa-moon dark-icon"></i>
					<i class="fas fa-sun light-icon"></i>
				</a>
			</li>
			<li class="nav-item avt-wrapper">
				<div class="avt dropdown">
					<img src="image/chamsoc.png" alt="User image" class="dropdown-toggle" data-toggle="user-menu">
					<ul id="user-menu" class="dropdown-menu">
                                            <c:if test="${sessionScope.acc != null}">
						<li class="dropdown-menu-item">
							<a class="dropdown-menu-link">
								<div>
									<i class="fas fa-user-tie"></i>
								</div>
								
                                                            <span>Profile ${sessionScope.acc.username}</span>
                                                                
                                                                    
							</a>
						</li>
                                                </c:if>
						<li class="dropdown-menu-item">
							<a href="#" class="dropdown-menu-link">
								<div>
									<i class="fas fa-cog"></i>
								</div>
								<span>Settings</span>
							</a>
						</li>
						<li class="dropdown-menu-item">
							<a href="#" class="dropdown-menu-link">
								<div>
									<i class="far fa-credit-card"></i>
								</div>
								<span>Payments</span>
							</a>
						</li>
						<li class="dropdown-menu-item">
							<a href="#" class="dropdown-menu-link">
								<div>
									<i class="fas fa-spinner"></i>
								</div>
								<span>Projects</span>
							</a>
						</li>
						<li class="dropdown-menu-item">
							<a href="Logout" class="dropdown-menu-link">
								<div>
									<i class="fas fa-sign-out-alt"></i>
								</div>
								<span>Logout</span>
							</a>
						</li>
					</ul>
				</div>
			</li>
		</ul>
		<!-- end nav right -->
	</div>
	<!-- end navbar -->
	<!-- sidebar -->
	<div class="sidebar">
		<ul class="sidebar-nav">
			<li class="sidebar-nav-item">
				<a href="#" class="sidebar-nav-link">
					<div>
						<i class="fas fa-tachometer-alt"></i>
					</div>
					<span>
						Dashboard
					</span>
				</a>
			</li>
			<li class="sidebar-nav-item">
				<a href="seller" class="sidebar-nav-link">
					<div>
						<i class="fab fa-accusoft"></i>
					</div>
					<span>PRODUCT</span>
				</a>
			</li>
			<li class="sidebar-nav-item">
				<a href="addproduct" class="sidebar-nav-link">
					<div>
						<i class="fas fa-tasks"></i>
					</div>
					<span>ADD PRODUCT</span>
				</a>
			</li>
                        <c:if test="${sessionScope.acc.isAdmin == true}">
			<li class="sidebar-nav-item">
				<a href="listUser" class="sidebar-nav-link">
					<div>
						<i class="fas fa-spinner"></i>
					</div>
					
                                    <span>MANAGER ADMIN</span>
                                           
				</a>
			</li>
                        </c:if>
			<li class="sidebar-nav-item">
				<a href="listCart" class="sidebar-nav-link">
					<div>
						<i class="fas fa-check-circle"></i>
					</div>
					<span>BILL</span>
				</a>
			</li>
			<li class="sidebar-nav-item">
				<a href="#" class="sidebar-nav-link">
					<div>
						<i class="fas fa-bug"></i>
					</div>
					<span>Morbi</span>
				</a>
			</li>
			<li class="sidebar-nav-item">
				<a href="#" class="sidebar-nav-link">
					<div>
						<i class="fas fa-chart-line"></i>
					</div>
					<span>Praesent</span>
				</a>
			</li>
			<li class="sidebar-nav-item">
				<a href="#" class="sidebar-nav-link">
					<div>
						<i class="fas fa-book-open"></i>
					</div>
					<span>Pellentesque</span>
				</a>
			</li>
			<li class="sidebar-nav-item">
				<a href="#" class="sidebar-nav-link">
					<div>
						<i class="fas fa-adjust"></i>
					</div>
					<span>Morbi</span>
				</a>
			</li>
			<li class="sidebar-nav-item">
				<a href="#" class="sidebar-nav-link">
					<div>
						<i class="fab fa-algolia"></i>
					</div>
					<span>Praesent</span>
				</a>
			</li>
			<li class="sidebar-nav-item">
				<a href="#" class="sidebar-nav-link">
					<div>
						<i class="fas fa-audio-description"></i>
					</div>
					<span>Pellentesque</span>
				</a>
			</li>
		</ul>
	</div>
	<!-- end sidebar -->
	<!-- main content -->
	<div class="wrapper">
		<div class="row">
			<div class="col-8 col-m-12 col-sm-12">
                            <div class="card">
					<div class="card-header">
						<h3>
							Table
						</h3>
						<i class="fas fa-ellipsis-h"></i>
					</div>
					<div class="card-content">
						<table>
							<thead>
								<tr>
									<th>Product ID</th>
									<th>Product Name</th>
									<th>Images</th>
									<th>Number</th>
									<th>Price</th>
                                                                        <th>Status</th>
								</tr>
							</thead>
							<tbody>
                                                            <c:forEach items="${listP}" var="p">
								<tr>
									<td>${p.pID}</td>
									<td>${p.pName}</td>
                                                                        <td><img src="${p.imge}" alt="" style="width: 200px;"></td>
									<td>${p.number}</td>
                                                                        <td>${p.price}vnđ</td>
                                                                        <td><button><a href="editProduct?pid=${p.pID}">Edit</a></button>
                                                                            <button><a href="deletProduct?pid=${p.pID}">Delete</a></button>
                                                                        </td>
								</tr>
                                                         </c:forEach>
							</tbody>
						</table>
					</div>
				</div>
			</div>
			<div class="product-categories">
                        <h1>PRODUCT CATEGORIES</h1>
                        <ul class="list-group">
                            <c:forEach items="${listC}" var="c">
                            <li class="list-group-item text-white"><a href="listBrandseller?bName=${c.brandID}">${c.brandName}</a></li>
                            </c:forEach>
                        </ul>
                    </div>
		</div>
	</div>
	<!-- end main content -->
	<!-- import script -->
	<script src="https://cdnjs.cloudflare.com/ajax/libs/Chart.js/2.9.3/Chart.min.js"></script>
	<script src="js/index.js"></script>
        </body>
</html>
