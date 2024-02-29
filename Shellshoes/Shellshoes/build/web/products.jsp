
<js
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <jsp:useBean id="c" class="DAO.SellShoesDao" scope="request"/>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <meta http-equiv="X-UA-Compatible" content="IE=edge">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
        <title>PRODUCT</title>
        <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/css/bootstrap.min.css">
        <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js"></script>
        <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/js/bootstrap.min.js"></script>
        <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/5.15.3/css/all.min.css"
            integrity="sha512-iBBXm8fW90+nuLcSKlbmrPcLa0OT92xO1BIsZ+ywDWZCvqsWgccV3gFoRBv0z+8dLJgyAHIhR35VZc2oM/gI1w=="
            crossorigin="anonymous" referrerpolicy="no-referrer" />
        <link rel="stylesheet" href="style/products.css">
        <link href='https://unpkg.com/boxicons@2.1.2/css/boxicons.min.css' rel='stylesheet'>
    </head>

    <body>
        <section>
            <div class="bannerVideo" id="slideshow">
                <img src="image/banner123.jpg" alt="">
                <h2>PRODUCTS</h2>
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
        <form action="CartProduct" method="POST">
        <div class="product container">
            <div class="row">
                <div class="col-12 col-sm-12 col-md-6 col-lg-6 col-xl-6">
                    <img src="${s.imge}" alt="">
                </div>
                <div class="col-12 col-sm-12 col-md-6 col-lg-6 col-xl-6 product-text">
                    <h1>${s.pName}</h1>
                    <h5>${s.price}vnđ</h5>
                    <div class="start">
                        <i class="far fa-star"></i>
                        <i class="far fa-star"></i>
                        <i class="far fa-star"></i>
                        <i class="far fa-star"></i>
                        <i class="far fa-star"></i>
                    </div>
                    <div class="size">
                            <h2>Size</h2>
                            <select class="choosesize" id="sizeProduct" style="padding: 10px 20px;border: none">
                                <c:forEach items="${c.size}" var="o">
                                    <option value="${o.sID}">${o.sNumber}</option>
                                </c:forEach>
                              </select>                          
	                            <div class="cart">
                                        <button onclick="addToCart()" style="padding: 10px 40px;border: none;margin: 30px 0px;" href="cart.jsp">Add To Cart</button>
	                                <script>
	                                function addToCart() {
	                                	var ctx = "${pageContext.request.contextPath}"
	                                	var sizeId = document.getElementById("sizeProduct").value;
	                                	
	                                	location.href = ctx + "/AddCart?pID=${s.pID}&sId=" + sizeId;
	                                }
	                                
	                                $( document ).ready(function() {
	                                    var messageError = "${messageError}"
	                                    if (messageError != "") {
	                                    	alert(messageError);
	                                    }
	                                });
	                                
	                                </script>
	                            </div>	                      
                        </div>
                    <h5>Category: Shoes</h5>
                </div>
                    
            </div>
        </div>
        </form>
        <div class="tabs container">
            <ul class="nav nav-tabs">
                <li class="nav-item">
                    <a class="nav-link active" data-toggle="tab" href="#home">DESCRIPTION</a>
                </li>
                <li class="nav-item">
                    <a class="nav-link" data-toggle="tab" href="#menu1">ADDITIONAL INFORMATION</a>
                </li>
                <li class="nav-item">
                    <a class="nav-link" data-toggle="tab" href="#menu2">REVIEWS (1)</a>
                </li>
            </ul>

            <!-- Tab panes -->
            <div class="tab-content">
                <div class="tab-pane container active" id="home">
                    <p style="padding-top: 30px;padding-bottom: 30px;">Lorem ipsum dolor sit amet, consectetur adipisicing
                        elit sed. Eiusmod
                        tempor. incididu nt ut labore
                        et dolore magna
                        aliqua. Ut enim. ad minim veniam, uis nostrud exerc itation ullamco. Laboris nisi. ut aliquip ex ea
                        commodo consequat.
                        Duis aute irure dolr. inreprehen derit in voluptate velit esse cillum dolore. eu fugiat nulla
                        pariatur. Excep teur sint
                        occaecat non proident, sunt in culpa qui officia.</p>
                </div>
                <div class="tab-pane container fade" id="menu1">
                    <h5 style="padding-top: 30px;">Weight</h5>
                    <h5 style="padding-bottom: 30px;">Dimensions 60 × 40 × 60 cm</h5>
                </div>
                <div class="tab-pane container fade" id="menu2">..3.</div>
            </div>
        </div>
        <!-- end -->
        <!-- start -->
        <div class="product-list container">
            <div class="row">
                <form action="ShowProductToCart" method="post">
                <div class="col-12 col-sm-12 col-md-3 col-lg-3 col-xl-3 product-left-1">
                    <img src="${p.imge}" alt="">
                    <div class="product-left-text">
                        <h5>${p.price}</h5>
                        <div>
                            <i class="far fa-star"></i>
                            <i class="far fa-star"></i>
                            <i class="far fa-star"></i>
                            <i class="far fa-star"></i>
                            <i class="far fa-star"></i>
                        </div>
                        <h4>${p.pName}</h4>
                    </div>
                        <button><a href="ShowProductToCart?pID=${p.pID}">ADD TO CART</a></button>
                </div>
                </form>
            </div>
        </div>
        <!-- end -->
        <!-- start -->
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
        <!-- end -->
        <div class="login">
            <a href="buy.jsp" class="bxuser">
                <i class='bx bx-user'></i>
                <c:if test="${sessionScope.acc != null}">
                    <a class="nav-link" href="#" style="background: #ddd">${sessionScope.acc.username}</a>
                    <a class="nav-link" href="Logout" style="background: graytext">Logout</a>
                </c:if>
                <c:if test="${sessionScope.acc == null}">
                    <a class="nav-link" href="login.jsp" style="background: graytext" style="background: graytext">Login</a>
                </c:if>
            </a>
            <a href="CartProduct" class="bxcart">
                <i class='bx bx-cart'></i>
            </a>
        </div>
        
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
        </script>
    </body>
</html>
