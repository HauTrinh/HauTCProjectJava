<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
    <%@page contentType="text/html" pageEncoding="UTF-8" %>
        <!DOCTYPE html>
        <html>

        <head>
            <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
            <meta http-equiv="X-UA-Compatible" content="IE=edge">
            <meta name="viewport" content="width=device-width, initial-scale=1.0">
            <link rel="stylesheet" href="style.css">
            <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/css/bootstrap.min.css">
            <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js"></script>
            <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/js/bootstrap.min.js"></script>
            <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/5.15.3/css/all.min.css"
                integrity="sha512-iBBXm8fW90+nuLcSKlbmrPcLa0OT92xO1BIsZ+ywDWZCvqsWgccV3gFoRBv0z+8dLJgyAHIhR35VZc2oM/gI1w=="
                crossorigin="anonymous" referrerpolicy="no-referrer" />
            <link href='https://unpkg.com/boxicons@2.1.2/css/boxicons.min.css' rel='stylesheet'>
            <title>SNEAKER</title>
        </head>

        <body>
            <section>
                <div class="bannerVideo" id="slideshow">
                    <video src="video/y2meta.com - Quảng cáo_ Nike Air Max 2017 - Nike.mp4" autoplay muted loop
                        class="active"></video>
                    <video src="video/y2meta.com - Video Quảng cáo giày Adidas.mp4" autoplay muted loop></video>
                    <video
                        src="video/y2meta.com - Sinh viên FPoly Cần Thơ sản xuất TVC quảng cáo giày Vans đầy ấn tượng.mp4"
                        autoplay muted loop></video>
                </div>
                <div class="container1">
                    <header class="navbar" id="navbar">
                        <a href="#" class="logo">SNEAKER</a>
                        <ul>
                            <li>
                                <a href="index.jsp" class="active">Home</a>
                            </li>
                            <li>
                                <a href="ListBrand">PRODUCT</a>
                            </li>
                            <c:if test="${sessionScope.acc.isSell == true}">
                                <li>
                                    <a href="seller">MANAGER SELLER</a>
                                </li>
                            </c:if>
                        </ul>
                        <span class="menuIcon" onclick="toggleMenu();"></span>
                    </header>
                    <div class="content">
                        <div class="bannerText" id="slideshowText">
                            <div class="active">
                                <h2>NIKES</h2>
                                <p>“Just do it” – Slogan 30 năm tuổi được lấy cảm hứng từ một lời trăn trối.</p>
                            </div>
                            <div>
                                <h2>ADIDAS</h2>
                                <p>Adidas là một thương hiệu chuyên về đồ thể thao.
                                    <br> Slogan “Impossible is nothing” đã gắn liền cùng Adidas ngay từ những ngày đầu
                                    thành lập.
                                </p>
                            </div>
                            <div>
                                <h2>VANS</h2>
                                <p>“This Is Off The Wall” – Thể hiện sự sáng tạo cùng Vans.</p>
                            </div>
                        </div>
                    </div>
                    <ul class="sci">
                        <li>
                            <a href="https://www.facebook.com/"><img src="image/fa-removebg-preview.png" alt=""></a>
                        </li>
                        <li>
                            <a href="https://www.instagram.com/"><img src="image/instagram-logo.png" alt=""></a>
                        </li>
                        <li>
                            <a href="https://twitter.com/?lang=vi"><img src="image/images.png" alt=""></a>
                        </li>
                    </ul>
                    <ul class="controls">
                        <li onclick="prevSlide();prevSlideText();">
                            <img src="image/angle-left-512.png" alt="">
                        </li>
                        <li onclick="nextSlide();nextSlideText();">
                            <img src="image/right.png" alt="">
                        </li>
                    </ul>
                </div>
            </section>
            <!--------start---------------------->
            <div class="container blogger">
                <div class="row">
                    <div class="col-12 col-sm-12 col-md-6 col-lg-6 col-xl-6 blogger-text">
                        <h1><span style="color: red;font-size: 80px;">WELCOME</span><br> TO SNEAKER SHOP<br>
                            SINCE <span style="color: red;">2022</span></h1>
                        <p>Lorem ipsum dolor sit amet, consectetur adipisicing elit, sed do eiusmod <br>
                            tempor incididu nt ut labore et dolore labore et dolore.</p>
                        <button>READ MORE</button>
                    </div>
                    <div class="col-12 col-sm-12 col-md-6 col-lg-6 col-xl-6 blogger-img">
                        <img src="image/banner1234.jpg" alt="">
                    </div>
                </div>
            </div>
            <!--------end---------------------->
            <!--------start---------------------->
            <div class="icon container">
                <div class="row">
                    <div class="col-3 col-sm-3 col-md-3 col-lg-3 col-xl-3 icon-img">
                        <img src="image/sale.png" alt="">
                        <h5>SALE</h5>
                    </div>
                    <div class="col-3 col-sm-3 col-md-3 col-lg-3 col-xl-3 icon-img">
                        <img src="image/ship.png" alt="">
                        <h5>FREE SHIP</h5>
                    </div>
                    <div class="col-3 col-sm-3 col-md-3 col-lg-3 col-xl-3 icon-img">
                        <img src="image/real-removebg-preview.png" alt="">
                        <h5>REAL 100%</h5>
                    </div>
                    <div class="col-3 col-sm-3 col-md-3 col-lg-3 col-xl-3 icon-img">
                        <img src="image/chamsoc-removebg-preview.png" alt="" style="height: 213px;">
                        <h5>CARE 100%</h5>
                    </div>
                </div>
            </div>
            <!--------end---------------------->
            <!--------start---------------------->

            <!--------end---------------------->
            <!--------start---------------------->
            <div class="container travel">
                <div class="row">
                    <div class="col-12 col-sm-12 col-md-12 col-lg-12 col-xl-12 title">
                        <h2>SNEAKER CARE <span>TIPS</span></h2>
                    </div>
                    <div class="col-12 col-sm-12 col-md-12 col-lg-12 col-xl-12 title-travel-1">
                        <div class="col-12 col-sm-12 col-md-6 col-lg-6 col-xl-6 title-travel-1-1">
                            <img src="image/banner21.jpg" alt="" style="width: 500px;;object-fit: contain;">
                        </div>
                        <div class="col-12 col-sm-12 col-md-6 col-lg-6 col-xl-6 title-travel-1-2">
                            <div>
                                <h4><i class="far fa-calendar-alt"></i> October 3, 2022 &ensp; <i
                                        class="fas fa-pen"></i> by
                                    ASIA
                                </h4>
                                <h1> SNEAKER <span style="color: red;">CLEANING</span></h1>
                                <p>Lorem ipsum dolor sit amet, consectetur adipisicing elit, sed do eiusmod tempor
                                    incididu nt
                                    ut labore et dolore magna
                                    aliqua. Ut enim. ad minim veniam</p>
                                <h3>READ MORE</h3>
                            </div>
                        </div>
                    </div>
                    <div class="col-12 col-sm-12 col-md-12 col-lg-12 col-xl-12 title-travel-2">
                        <div class="col-12 col-sm-12 col-md-6 col-lg-6 col-xl-6 title-travel-2-2">
                            <div>
                                <h4><i class="far fa-calendar-alt"></i> October 2, 2022 &ensp; <i
                                        class="fas fa-pen"></i> by
                                    ASIA
                                </h4>
                                <h1>IMPROPER CLEANING OF <span style="color: red;">SNEAKER</span></h1>
                                <p>Lorem ipsum dolor sit amet, consectetur adipisicing elit, sed do eiusmod tempor
                                    incididu nt
                                    ut labore et dolore magna
                                    aliqua. Ut enim. ad minim veniam</p>
                                <h3>READ MORE</h3>
                            </div>
                        </div>
                        <div class="col-12 col-sm-12 col-md-6 col-lg-6 col-xl-6 title-travel-2-1">
                            <img src="image/banner22.webp" alt="" style="width: 500px;;object-fit: contain;">
                        </div>
                    </div>
                </div>
            </div>
            <!--------end---------------------->
            <!--------start---------------------->
            <div class="email ">
                <div class="row">
                    <div class="col-12 col-sm-12 col-md-6 col-lg-6 col-xl-6 email-img">
                        <img src="image/banner2.webp" alt="" style="margin-top: 100px;">
                    </div>
                    <div class="col-12 col-sm-12 col-md-6 col-lg-6 col-xl-6 email-title">
                        <h3>Lorem ipsum dolor</h3>
                        <h1>FINDING THE PERFECT TRAILS TO HIKE IS <br> EASY WITH <span>NEWSLETTER</span></h1>
                        <p>Lorem ipsum dolor sit amet, consectetur adipisicing elit, sed do eiusmod tempor incididu nt
                            ut labore
                            et dolore minim
                            veniam, quism.</p>
                        <div class="email-from">
                            <input type="text" placeholder="Name" class="form-control">
                            <input type="text" placeholder="E-mail" class="form-control">
                            <button class="btn">SUBCRIBE</button>
                        </div>
                    </div>
                </div>
            </div>
            <!--------end---------------------->
            <!--------start---------------------->
            <div class="post container">
                <div class="row">
                    <div class="col-12 post-title">
                        <h1>FEATURED BLOG <span>POSTS</span></h1>
                    </div>
                    <div class="col-12 col-sm-12 col-md-4 col-lg-4 col-xl-4 post-card">
                        <img src="image/blog1.jpg" alt="">
                        <h5><i class="fas fa-pen"></i> by <span style="color: red;font-weight: 900;">DA NANG</span>
                        </h5>
                        <h1>ON THE SHORES OF A VANISHING ISLAND IN INDIA</h1>
                    </div>
                    <div class="col-12 col-sm-12 col-md-4 col-lg-4 col-xl-4 post-card">
                        <img src="image/blog2.jpg" alt="">
                        <h5><i class="fas fa-pen"></i> by <span style="color: red;font-weight: 900;">DA NANG</span>
                        </h5>
                        <h1>ON THE SHORES OF A VANISHING ISLAND IN INDIA</h1>
                    </div>
                    <div class="col-12 col-sm-12 col-md-4 col-lg-4 col-xl-4 post-card">
                        <img src="image/blog3.jpg" alt="">
                        <h5><i class="fas fa-pen"></i> by <span style="color: red;font-weight: 900;">DA NANG</span>
                        </h5>
                        <h1>ON THE SHORES OF A VANISHING ISLAND IN INDIA</h1>
                    </div>
                </div>
            </div>
            <!--------end---------------------->
            <!--------start---------------------->
            <footer class=" text-lg-start bg-light text-muted">
                <div class="col-12 col-sm-12 col-md-12 col-lg-12 col-xl-12 footer-text">
                    <div class="col-12 col-sm-12 col-md-3 col-lg-3 col-xl-3 footer-text-1">
                        <h1>SNEAKER</h1>
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
                    © 2022 Copyright:
                    <a class="text-white" href="">NVTHANG</a>
                </div>
            </footer>
            <!--------end---------------------->
            <div class="login">
                <a href="buy.jsp" class="bxuser">
                    <i class='bx bx-user'></i>
                    <c:if test="${sessionScope.acc != null}">
                        <a class="nav-link" href="#" style="background: #ddd">${sessionScope.acc.username}</a>
                        <a class="nav-link" href="Logout" style="background: graytext">Logout</a>
                    </c:if>
                    <c:if test="${sessionScope.acc == null}">
                        <a class="nav-link" href="login.jsp" style="background: graytext">Login</a>
                    </c:if>
                </a>
                <a href="CartProduct" class="bxcart">
                    <i class='bx bx-cart'></i>
                </a>
            </div>
            <script src="app.js"></script>
        </body>

        </html>