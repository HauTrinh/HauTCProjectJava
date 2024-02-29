<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
	<%@page contentType="text/html" pageEncoding="UTF-8" %>
		<!DOCTYPE html>
		<html>

		<head>
			<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
			<meta http-equiv="X-UA-Compatible" content="IE=edge">
			<!--        <link rel="stylesheet" href="style.css">-->
			<meta name="viewport" content="width=device-width, initial-scale=1.0">
			<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/css/bootstrap.min.css">
			<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js"></script>
			<script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/js/bootstrap.min.js"></script>
			<link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/5.15.3/css/all.min.css"
				integrity="sha512-iBBXm8fW90+nuLcSKlbmrPcLa0OT92xO1BIsZ+ywDWZCvqsWgccV3gFoRBv0z+8dLJgyAHIhR35VZc2oM/gI1w=="
				crossorigin="anonymous" referrerpolicy="no-referrer" />
			<link rel="stylesheet" href="style/Giohang.css">
			<link rel="stylesheet" href="style/product.css">
			<link href='https://unpkg.com/boxicons@2.1.2/css/boxicons.min.css' rel='stylesheet'>
			<title>Document</title>
		</head>

		<body>
			<section>
				<div class="bannerVideo" id="slideshow">
					<img src="image/banner123.jpg" alt="">
					<h2>SNEAKER</h2>
				</div>
				<div class="container1">
					<header class="navbar" id="navbar">
						<a href="#" class="logo">SNEAKER</a>
						<ul>
							<li>
								<a href="index.jsp">Home</a>
							</li>
							<li>
								<a href="ListBrand" class="active">RPODUCT</a>
							</li>
							<c:if test="${sessionScope.acc.isSell == true}">
								<li>
									<a href="seller">MANAGER SELLER</a>
								</li>
							</c:if>

						</ul>
						<span class="menuIcon" onclick="toggleMenu();"></span>
					</header>
				</div>
			</section>
			<div class="h1-g">
			</div>

			<div style="margin-left: 120px;font-size: 20px;color: green;">
				<span>GIỎ HÀNG</span>
				<hr>
			</div>
			<div class="card-content" style="display: flex;  position: relative;">
				<table class="table" style="width: 700px;margin-left: 120px;margin-bottom: 100px;">
					<thead>
						<tr>
							<th scope="col">Hình ảnh</th>
							<th scope="col">Size</th>
							<th scope="col">name</th>
							<th scope="col">Giá</th>
							<th scope="col">Số Lượng</th>
							<th scope="col">Xóa</th>
						</tr>
					</thead>
					<tbody>
						<c:forEach items="${listCart}" var="cart">
							<tr>
								<td style="width: 200px">
									<img src="${cart.image}" alt="" style="width: 200px" />
								</td>
								<td style="width: 100px;">
									<h5 class="product-titles" style="text-align: center;">${cart.sizeProduct}</h5>
								</td>
								<td style="width: 100px;">
									<h5 class="product-titles" style="text-align: center;">${cart.nameProduct}</h5>
								</td>
								<td style="width: 100px;">
									<h5 class="product-titles" style="text-align: center;">${cart.price}</h5>
								</td>
								<td style="width: 100px;">
									<h5 class="product-titles" style="text-align: center;">${cart.amount}</h5>
								</td>
								<td style="width: 100px;">
									<button onclick="deleteCart(${cart.pID}, ${cart.sizeId})" value="DELETE"
										style="text-align: center;">DELETE</button>
								</td>
							</tr>
						</c:forEach>
					</tbody>
				</table>
				<script>
					function deleteCart(pID, sizeId) {
						var ctx = "${pageContext.request.contextPath}"
						location.href = ctx + "/DeleteCart?pID=" + pID + "&sizeId=" + sizeId;
					}
				</script>
				<div class="totalprice" style="margin-top: 50px;">
					<h2 style="color: #000; font-size: 50px;">Total Price :<span style="color: red">${totalPrice}
							VND</span></h2>
					<button class="btn btn-success">Thanh toán</button>

				</div>

			</div>


			<!-- The Modal -->
			<div class="modal fade" id="modal-delete" style="padding-top: 200px;">
				<div class="modal-dialog modal-sm">
					<div class="modal-content">

						<!-- Modal Header -->
						<div class="modal-header">
							<h4 class="modal-title">Xóa</h4>
							<button type="button" class="close" data-dismiss="modal">&times;</button>
						</div>

						<!-- Modal body -->
						<div class="modal-body">
							Bạn có chắc chắn xóa không?
						</div>

						<!-- Modal footer -->
						<div class="modal-footer">
							<button type="button" class="btn btn-secondary" data-dismiss="modal">Đóng</button>
							<button type="button" class="btn btn-secondary" id="button-delete"
								data-dismiss="modal">Xóa</button>
						</div>

					</div>
				</div>
			</div>

			<div class="modal fade" id="modal-delete-all" style="padding-top: 200px;">
				<div class="modal-dialog modal-sm">
					<div class="modal-content">

						<!-- Modal Header -->
						<div class="modal-header">
							<h4 class="modal-title">Xóa tất cả</h4>
							<button type="button" class="close" data-dismiss="modal">&times;</button>
						</div>

						<!-- Modal body -->
						<div class="modal-body">
							Bạn có chắc chắn xóa tất cả sản phẩm không?
						</div>

						<!-- Modal footer -->
						<div class="modal-footer">
							<button type="button" class="btn btn-secondary" data-dismiss="modal">Đóng</button>
							<button type="button" class="btn btn-secondary" data-dismiss="modal"
								onclick="DeleteAll()">Xóa</button>
						</div>

					</div>
				</div>
			</div>
			<!-- The Modal -->
			<div class="modal fade" id="modal-delete" style="padding-top: 200px;">
				<div class="modal-dialog modal-sm">
					<div class="modal-content">

						<!-- Modal Header -->
						<div class="modal-header">
							<h4 class="modal-title">Xóa</h4>
							<button type="button" class="close" data-dismiss="modal">&times;</button>
						</div>

						<!-- Modal body -->
						<div class="modal-body">
							Bạn có chắc chắn xóa không?
						</div>

						<!-- Modal footer -->
						<div class="modal-footer">
							<button type="button" class="btn btn-secondary" data-dismiss="modal">Đóng</button>
							<button type="button" class="btn btn-secondary" id="button-delete"
								data-dismiss="modal">Xóa</button>
						</div>

					</div>
				</div>
			</div>

			<div class="modal fade" id="modal-delete-all" style="padding-top: 200px;">
				<div class="modal-dialog modal-sm">
					<div class="modal-content">

						<!-- Modal Header -->
						<div class="modal-header">
							<h4 class="modal-title">Xóa tất cả</h4>
							<button type="button" class="close" data-dismiss="modal">&times;</button>
						</div>

						<!-- Modal body -->
						<div class="modal-body">
							Bạn có chắc chắn xóa tất cả sản phẩm không?
						</div>

						<!-- Modal footer -->
						<div class="modal-footer">
							<button type="button" class="btn btn-secondary" data-dismiss="modal">Đóng</button>
							<button type="button" class="btn btn-secondary" data-dismiss="modal"
								onclick="DeleteAll()">Xóa</button>
						</div>

					</div>
				</div>
			</div>
			<footer class=" text-lg-start bg-light text-muted">
				<div class="col-12 col-sm-12 col-md-12 col-lg-12 col-xl-12 footer-text">
					<div class="col-12 col-sm-12 col-md-3 col-lg-3 col-xl-3 footer-text-1">
						<h1>TRAVEL</h1>
					</div>
					<div class="col-12 col-sm-12 col-md-9 col-lg-9 col-xl-9 footer-text-2">
						<h3>Based in Utah, USA, Wanderland is a blog by Markus <span>Thompson</span>. His posts <br>
							explore outdoor experiences through photos and diaries with tips & tricks.</h3>
					</div>
				</div>
				<div class="col-12 col-sm-12 col-md-12 col-lg-12 col-xl-12 footer-texts-1">
					<div class="col-12 col-sm-12 col-md-3 col-lg-3 col-xl-3 footer-texts">
						<h2>ABOUT THE BLOG</h2>
						<p>Lorem ipsum dolor sit amet, conse ctetur adipisicing elit, sed do eiusmod mas.</p>
					</div>
					<div class="col-12 col-sm-12 col-md-3 col-lg-3 col-xl-3 footer-texts">
						<h2>SUBSCRIBE TO NEWSLETTER</h2>
					</div>
					<div class="col-12 col-sm-12 col-md-3 col-lg-3 col-xl-3 footer-texts-2">
						<h2>RECENT NEWS</h2>
						<h5><i class="far fa-calendar-alt"></i> <span>October 2, 2019</span> Trip to Iceland</h5>
						<h5><i class="far fa-calendar-alt"></i> <span>October 2, 2019</span> Trip to Iceland</h5>
						<h5><i class="far fa-calendar-alt"></i> <span>October 2, 2019</span> Trip to Iceland</h5>
					</div>
					<div class="col-12 col-sm-12 col-md-3 col-lg-3 col-xl-3 footer-texts">
						<h2>INSTAGRAM FEED</h2>
					</div>
				</div>
				<div class="text-center p-3" style="background-color: rgba(0, 0, 0, 0.2);">
					© 2020 Copyright:
					<a class="text-white" href="https://mdbootstrap.com/">MDBootstrap.com</a>
				</div>
			</footer>
			<div class="login">
				<a href="login.jsp" class="bxuser">
					<i class='bx bx-user'></i>
					<c:if test="${sessionScope.acc != null}">
						<a class="nav-link" href="#" style="background: #ddd">${sessionScope.acc.username}</a>
						<a class="nav-link" href="Logout" style="background: graytext">Logout</a>
					</c:if>
					<c:if test="${sessionScope.acc == null}">
						<a class="nav-link" href="login.jsp" style="background: graytext">Login</a>
					</c:if>
				</a>
				<a href="cart.jsp" class="bxcart">
					<i class='bx bx-cart'></i>
				</a>
			</div>
			<script src="Giohang.js"></script>
			<script>
				window.addEventListener("scroll", function () {
					var header = this.document.querySelector('header');
					header.classList.toggle('sticky', window.scrollY > 0);
				});
				function toggleMenu() {
					const menuIcon = document.querySelector('.menuIcon');
					const navbar = document.getElementById('navbar');
					menuIcon.classList.toggle('active');
					navbar.classList.toggle('active');
				}

				function getThis(e) {
					var buttonDelete = e.parentElement.parentElement.parentElement.parentElement;
					var x = document.getElementById('button-delete');
					x.onclick = function () {
						Delete(buttonDelete);
					}
				}

				function DeleteAll() {
					let productContainer = document.querySelector(".products");
					productContainer.innerHTML = '';

					localStorage.removeItem('productsInCart');
					localStorage.removeItem('totalCost');
					localStorage.removeItem('cartNumbers');

					var cart = document.getElementsByClassName('count-item')[0];
					cart.innerText = 0;

				}

				function Delete(e) {
					var totalPrice = e.getElementsByClassName('product-total')[0];
					e.remove();

					updateCost(totalPrice);
					updateCart(e);
				}

				function updateCost(e) {
					var price = parseInt(e.innerText.replace('Thành tiền : ', ''));
					var totalElement = document.getElementsByClassName('totalprice')[0];
					var total = parseInt(totalElement.innerText.replace('đ', ''));
					total = total - price;
					document.getElementsByClassName('totalprice')[0].innerText = total + "đ";
				}

				function increase(e) {
					var cart = e.parentElement.parentElement.parentElement;
					var quantityElement = cart.getElementsByClassName('product-quantity')[0];
					var quantity = parseInt(quantityElement.innerText);
					quantity += 1;
					quantityElement.innerText = quantity;

					var cartNumbers = document.getElementsByClassName('count-item')[0];
					var carts = parseInt(cartNumbers.innerText);
					carts = carts + 1;
					document.getElementsByClassName('count-item')[0].innerText = carts;

					var totalPriceElement = cart.getElementsByClassName('product-total')[0];
					var totalPrice = parseInt(totalPriceElement.innerText.replace('Thành tiền : ', ''));

					var priceElement = cart.getElementsByClassName('product-price')[0];
					var price = parseInt(priceElement.innerText.replace('Đơn giá : ', ''));

					var newTotalPrice = totalPrice + price;
					totalPriceElement.innerText = "Thành tiền : " + newTotalPrice + "đ";

					var sumElement = document.getElementsByClassName('totalprice')[0];
					var sum = parseInt(sumElement.innerText.replace('đ', ''));
					var newSum = sum + price;
					sumElement.innerText = newSum + 'đ';

				}

				function decrease(e) {
					var cart = e.parentElement.parentElement.parentElement;
					var quantityElement = cart.getElementsByClassName('product-quantity')[0];
					var quantity = parseInt(quantityElement.innerText);
					quantity = quantity - 1;
					quantityElement.innerText = quantity;

					if (quantity > 0) {

						var cartNumbers = document.getElementsByClassName('count-item')[0];
						var carts = parseInt(cartNumbers.innerText);
						carts = carts - 1;
						document.getElementsByClassName('count-item')[0].innerText = carts;

						var totalPriceElement = cart.getElementsByClassName('product-total')[0];
						var totalPrice = parseInt(totalPriceElement.innerText.replace('Thành tiền : ', ''));

						var priceElement = cart.getElementsByClassName('product-price')[0];
						var price = parseInt(priceElement.innerText.replace('Đơn giá : ', ''));

						var newTotalPrice = totalPrice - price;
						totalPriceElement.innerText = "Thành tiền : " + newTotalPrice + "đ";

						var sumElement = document.getElementsByClassName('totalprice')[0];
						var sum = parseInt(sumElement.innerText.replace('đ', ''));
						var newSum = sum - price;
						sumElement.innerText = newSum + 'đ';

					} else {
						var quantityElements = cart.getElementsByClassName('product-quantity')[0];
						var quantity = parseInt(quantityElements.innerText);
						quantityElements.innerText = 1;
					}

				}

				function updateCart(e) {
					var productQuantity = e.getElementsByClassName('product-quantity')[0];
					var quantity = parseInt(productQuantity.innerText);
					var cartNumbers = document.getElementsByClassName('count-item')[0];
					var cart = parseInt(cartNumbers.innerText);
					cart = cart - quantity;
					document.getElementsByClassName('count-item')[0].innerText = cart;
				}

				onLoadCartNumbers();
				displayCart();



			</script>
		</body>

		</html>