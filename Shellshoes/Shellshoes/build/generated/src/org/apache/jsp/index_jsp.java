package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class index_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_c_if_test;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _jspx_tagPool_c_if_test = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
  }

  public void _jspDestroy() {
    _jspx_tagPool_c_if_test.release();
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    PageContext pageContext = null;
    HttpSession session = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;

    try {
      response.setContentType("text/html;charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <meta http-equiv=\"X-UA-Compatible\" content=\"IE=edge\">\n");
      out.write("        <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\n");
      out.write("        <link rel=\"stylesheet\" href=\"style.css\">\n");
      out.write("        <link rel=\"stylesheet\" href=\"https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/css/bootstrap.min.css\">\n");
      out.write("        <script src=\"https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js\"></script>\n");
      out.write("        <script src=\"https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/js/bootstrap.min.js\"></script>\n");
      out.write("        <link rel=\"stylesheet\" href=\"https://cdnjs.cloudflare.com/ajax/libs/font-awesome/5.15.3/css/all.min.css\"\n");
      out.write("            integrity=\"sha512-iBBXm8fW90+nuLcSKlbmrPcLa0OT92xO1BIsZ+ywDWZCvqsWgccV3gFoRBv0z+8dLJgyAHIhR35VZc2oM/gI1w==\"\n");
      out.write("            crossorigin=\"anonymous\" referrerpolicy=\"no-referrer\" />\n");
      out.write("        <link href='https://unpkg.com/boxicons@2.1.2/css/boxicons.min.css' rel='stylesheet'>\n");
      out.write("        <title>SNEAKER</title>\n");
      out.write("    </head>\n");
      out.write("\n");
      out.write("    <body>\n");
      out.write("        <section>\n");
      out.write("            <div class=\"bannerVideo\" id=\"slideshow\">\n");
      out.write("                <video src=\"video/y2meta.com - Quảng cáo_ Nike Air Max 2017 - Nike.mp4\" autoplay muted loop\n");
      out.write("                    class=\"active\"></video>\n");
      out.write("                <video src=\"video/y2meta.com - Video Quảng cáo giày Adidas.mp4\" autoplay muted\n");
      out.write("                    loop></video>\n");
      out.write("                <video src=\"video/y2meta.com - Sinh viên FPoly Cần Thơ sản xuất TVC quảng cáo giày Vans đầy ấn tượng.mp4\" autoplay muted loop></video>\n");
      out.write("            </div>\n");
      out.write("            <div class=\"container1\">\n");
      out.write("                <header class=\"navbar\" id=\"navbar\">\n");
      out.write("                    <a href=\"#\" class=\"logo\">SNEAKER</a>\n");
      out.write("                    <ul>\n");
      out.write("                        <li>\n");
      out.write("                            <a href=\"index.jsp\" class=\"active\">Home</a>\n");
      out.write("                        </li>\n");
      out.write("                        <li>\n");
      out.write("                            <a href=\"ListBrand\">PRODUCT</a>\n");
      out.write("                        </li>\n");
      out.write("                        ");
      if (_jspx_meth_c_if_0(_jspx_page_context))
        return;
      out.write("\n");
      out.write("                    </ul>\n");
      out.write("                    <span class=\"menuIcon\" onclick=\"toggleMenu();\"></span>\n");
      out.write("                </header>\n");
      out.write("                <div class=\"content\">\n");
      out.write("                    <div class=\"bannerText\" id=\"slideshowText\">\n");
      out.write("                        <div class=\"active\">\n");
      out.write("                            <h2>NIKES</h2>\n");
      out.write("                            <p>“Just do it” – Slogan 30 năm tuổi được lấy cảm hứng từ một lời trăn trối.</p>\n");
      out.write("                        </div>\n");
      out.write("                        <div>\n");
      out.write("                            <h2>ADIDAS</h2>\n");
      out.write("                            <p>Adidas là một thương hiệu chuyên về đồ thể thao. \n");
      out.write("                           <br> Slogan “Impossible is nothing” đã gắn liền cùng Adidas ngay từ những ngày đầu thành lập.</p>\n");
      out.write("                        </div>\n");
      out.write("                        <div>\n");
      out.write("                            <h2>VANS</h2>\n");
      out.write("                            <p>“This Is Off The Wall” – Thể hiện sự sáng tạo cùng Vans.</p>\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("                <ul class=\"sci\">\n");
      out.write("                    <li>\n");
      out.write("                        <a href=\"https://www.facebook.com/\"><img src=\"image/fa-removebg-preview.png\" alt=\"\"></a>\n");
      out.write("                    </li>\n");
      out.write("                    <li>\n");
      out.write("                        <a href=\"https://www.instagram.com/\"><img src=\"image/instagram-logo.png\" alt=\"\"></a>\n");
      out.write("                    </li>\n");
      out.write("                    <li>\n");
      out.write("                        <a href=\"https://twitter.com/?lang=vi\"><img src=\"image/images.png\" alt=\"\"></a>\n");
      out.write("                    </li>\n");
      out.write("                </ul>\n");
      out.write("                <ul class=\"controls\">\n");
      out.write("                    <li onclick=\"prevSlide();prevSlideText();\">\n");
      out.write("                        <img src=\"image/angle-left-512.png\" alt=\"\">\n");
      out.write("                    </li>\n");
      out.write("                    <li onclick=\"nextSlide();nextSlideText();\">\n");
      out.write("                        <img src=\"image/right.png\" alt=\"\">\n");
      out.write("                    </li>\n");
      out.write("                </ul>\n");
      out.write("            </div>\n");
      out.write("        </section>\n");
      out.write("        <!--------start---------------------->\n");
      out.write("        <div class=\"container blogger\">\n");
      out.write("            <div class=\"row\">\n");
      out.write("                <div class=\"col-12 col-sm-12 col-md-6 col-lg-6 col-xl-6 blogger-text\">\n");
      out.write("                    <h1><span style=\"color: red;font-size: 80px;\">WELCOME</span><br> TO SNEAKER SHOP<br>\n");
      out.write("                        SINCE <span style=\"color: red;\">2022</span></h1>\n");
      out.write("                    <p>Lorem ipsum dolor sit amet, consectetur adipisicing elit, sed do eiusmod <br>\n");
      out.write("                        tempor incididu nt ut labore et dolore labore et dolore.</p>\n");
      out.write("                    <button>READ MORE</button>\n");
      out.write("                </div>\n");
      out.write("                <div class=\"col-12 col-sm-12 col-md-6 col-lg-6 col-xl-6 blogger-img\">\n");
      out.write("                    <img src=\"image/banner1234.jpg\" alt=\"\">\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("        <!--------end---------------------->\n");
      out.write("        <!--------start---------------------->\n");
      out.write("        <div class=\"icon container\">\n");
      out.write("            <div class=\"row\">\n");
      out.write("                <div class=\"col-3 col-sm-3 col-md-3 col-lg-3 col-xl-3 icon-img\">\n");
      out.write("                    <img src=\"image/sale.png\" alt=\"\">\n");
      out.write("                    <h5>SALE</h5>\n");
      out.write("                </div>\n");
      out.write("                <div class=\"col-3 col-sm-3 col-md-3 col-lg-3 col-xl-3 icon-img\">\n");
      out.write("                    <img src=\"image/ship.png\" alt=\"\">\n");
      out.write("                    <h5>FREE SHIP</h5>\n");
      out.write("                </div>\n");
      out.write("                <div class=\"col-3 col-sm-3 col-md-3 col-lg-3 col-xl-3 icon-img\">\n");
      out.write("                    <img src=\"image/real-removebg-preview.png\" alt=\"\">\n");
      out.write("                    <h5>REAL 100%</h5>\n");
      out.write("                </div>\n");
      out.write("                <div class=\"col-3 col-sm-3 col-md-3 col-lg-3 col-xl-3 icon-img\" >\n");
      out.write("                    <img src=\"image/chamsoc-removebg-preview.png\" alt=\"\" style=\"height: 213px;\">\n");
      out.write("                    <h5>CARE 100%</h5>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("        <!--------end---------------------->\n");
      out.write("        <!--------start---------------------->\n");
      out.write("\n");
      out.write("        <!--------end---------------------->\n");
      out.write("        <!--------start---------------------->\n");
      out.write("        <div class=\"container travel\">\n");
      out.write("            <div class=\"row\">\n");
      out.write("                <div class=\"col-12 col-sm-12 col-md-12 col-lg-12 col-xl-12 title\">\n");
      out.write("                    <h2>SNEAKER CARE <span>TIPS</span></h2>\n");
      out.write("                </div>\n");
      out.write("                <div class=\"col-12 col-sm-12 col-md-12 col-lg-12 col-xl-12 title-travel-1\">\n");
      out.write("                    <div class=\"col-12 col-sm-12 col-md-6 col-lg-6 col-xl-6 title-travel-1-1\">\n");
      out.write("                        <img src=\"image/banner21.jpg\" alt=\"\" style=\"width: 500px;;object-fit: contain;\">\n");
      out.write("                    </div>\n");
      out.write("                    <div class=\"col-12 col-sm-12 col-md-6 col-lg-6 col-xl-6 title-travel-1-2\">\n");
      out.write("                        <div>\n");
      out.write("                            <h4><i class=\"far fa-calendar-alt\"></i> October 3, 2022 &ensp; <i class=\"fas fa-pen\"></i> by\n");
      out.write("                                ASIA\n");
      out.write("                            </h4>\n");
      out.write("                            <h1> SNEAKER <span style=\"color: red;\">CLEANING</span></h1>\n");
      out.write("                            <p>Lorem ipsum dolor sit amet, consectetur adipisicing elit, sed do eiusmod tempor incididu nt\n");
      out.write("                                ut labore et dolore magna\n");
      out.write("                                aliqua. Ut enim. ad minim veniam</p>\n");
      out.write("                            <h3>READ MORE</h3>\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("                <div class=\"col-12 col-sm-12 col-md-12 col-lg-12 col-xl-12 title-travel-2\">\n");
      out.write("                    <div class=\"col-12 col-sm-12 col-md-6 col-lg-6 col-xl-6 title-travel-2-2\">\n");
      out.write("                        <div>\n");
      out.write("                            <h4><i class=\"far fa-calendar-alt\"></i> October 2, 2022 &ensp; <i class=\"fas fa-pen\"></i> by\n");
      out.write("                                ASIA\n");
      out.write("                            </h4>\n");
      out.write("                            <h1>IMPROPER CLEANING OF <span style=\"color: red;\">SNEAKER</span></h1>\n");
      out.write("                            <p>Lorem ipsum dolor sit amet, consectetur adipisicing elit, sed do eiusmod tempor incididu nt\n");
      out.write("                                ut labore et dolore magna\n");
      out.write("                                aliqua. Ut enim. ad minim veniam</p>\n");
      out.write("                            <h3>READ MORE</h3>\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                    <div class=\"col-12 col-sm-12 col-md-6 col-lg-6 col-xl-6 title-travel-2-1\">\n");
      out.write("                        <img src=\"image/banner22.webp\" alt=\"\" style=\"width: 500px;;object-fit: contain;\">\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("        <!--------end---------------------->\n");
      out.write("        <!--------start---------------------->\n");
      out.write("        <div class=\"email \">\n");
      out.write("            <div class=\"row\">\n");
      out.write("                <div class=\"col-12 col-sm-12 col-md-6 col-lg-6 col-xl-6 email-img\">\n");
      out.write("                    <img src=\"image/banner2.webp\" alt=\"\" style=\"margin-top: 100px;\">\n");
      out.write("                </div>\n");
      out.write("                <div class=\"col-12 col-sm-12 col-md-6 col-lg-6 col-xl-6 email-title\">\n");
      out.write("                    <h3>Lorem ipsum dolor</h3>\n");
      out.write("                    <h1>FINDING THE PERFECT TRAILS TO HIKE IS <br> EASY WITH <span>NEWSLETTER</span></h1>\n");
      out.write("                    <p>Lorem ipsum dolor sit amet, consectetur adipisicing elit, sed do eiusmod tempor incididu nt ut labore\n");
      out.write("                        et dolore minim\n");
      out.write("                        veniam, quism.</p>\n");
      out.write("                    <div class=\"email-from\">\n");
      out.write("                        <input type=\"text\" placeholder=\"Name\" class=\"form-control\">\n");
      out.write("                        <input type=\"text\" placeholder=\"E-mail\" class=\"form-control\">\n");
      out.write("                        <button class=\"btn\">SUBCRIBE</button>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("        <!--------end---------------------->\n");
      out.write("        <!--------start---------------------->\n");
      out.write("        <div class=\"post container\">\n");
      out.write("            <div class=\"row\">\n");
      out.write("                <div class=\"col-12 post-title\">\n");
      out.write("                    <h1>FEATURED BLOG <span>POSTS</span></h1>\n");
      out.write("                </div>\n");
      out.write("                <div class=\"col-12 col-sm-12 col-md-4 col-lg-4 col-xl-4 post-card\">\n");
      out.write("                    <img src=\"image/blog1.jpg\" alt=\"\">\n");
      out.write("                    <h5><i class=\"fas fa-pen\"></i> by <span style=\"color: red;font-weight: 900;\">DA NANG</span> </h5>\n");
      out.write("                    <h1>ON THE SHORES OF A VANISHING ISLAND IN INDIA</h1>\n");
      out.write("                </div>\n");
      out.write("                <div class=\"col-12 col-sm-12 col-md-4 col-lg-4 col-xl-4 post-card\">\n");
      out.write("                    <img src=\"image/blog2.jpg\" alt=\"\">\n");
      out.write("                    <h5><i class=\"fas fa-pen\"></i> by <span style=\"color: red;font-weight: 900;\">DA NANG</span> </h5>\n");
      out.write("                    <h1>ON THE SHORES OF A VANISHING ISLAND IN INDIA</h1>\n");
      out.write("                </div>\n");
      out.write("                <div class=\"col-12 col-sm-12 col-md-4 col-lg-4 col-xl-4 post-card\">\n");
      out.write("                    <img src=\"image/blog3.jpg\" alt=\"\">\n");
      out.write("                    <h5><i class=\"fas fa-pen\"></i> by <span style=\"color: red;font-weight: 900;\">DA NANG</span> </h5>\n");
      out.write("                    <h1>ON THE SHORES OF A VANISHING ISLAND IN INDIA</h1>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("        <!--------end---------------------->\n");
      out.write("        <!--------start---------------------->\n");
      out.write("        <footer class=\" text-lg-start bg-light text-muted\">\n");
      out.write("            <div class=\"col-12 col-sm-12 col-md-12 col-lg-12 col-xl-12 footer-text\">\n");
      out.write("                <div class=\"col-12 col-sm-12 col-md-3 col-lg-3 col-xl-3 footer-text-1\">\n");
      out.write("                    <h1>SNEAKER</h1>\n");
      out.write("                </div>\n");
      out.write("                <div class=\"col-12 col-sm-12 col-md-9 col-lg-9 col-xl-9 footer-text-2\">\n");
      out.write("                    <h3>Based in Utah, USA, Wanderland is a blog by Markus <span>Thompson</span>. His posts <br>\n");
      out.write("                        explore outdoor experiences through photos and diaries with tips & tricks.</h3>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("            <div class=\"col-12 col-sm-12 col-md-12 col-lg-12 col-xl-12 footer-texts-1\">\n");
      out.write("                <div class=\"col-12 col-sm-12 col-md-3 col-lg-3 col-xl-3 footer-texts\">\n");
      out.write("                    <h2>ABOUT THE BLOG</h2>\n");
      out.write("                    <p>Lorem ipsum dolor sit amet, conse ctetur adipisicing elit, sed do eiusmod mas.</p>\n");
      out.write("                </div>\n");
      out.write("                <div class=\"col-12 col-sm-12 col-md-3 col-lg-3 col-xl-3 footer-texts\">\n");
      out.write("                    <h2>SUBSCRIBE TO NEWSLETTER</h2>\n");
      out.write("                </div>\n");
      out.write("                <div class=\"col-12 col-sm-12 col-md-3 col-lg-3 col-xl-3 footer-texts-2\">\n");
      out.write("                    <h2>RECENT NEWS</h2>\n");
      out.write("                    <h5><i class=\"far fa-calendar-alt\"></i> <span>October 2, 2019</span> Trip to Iceland</h5>\n");
      out.write("                    <h5><i class=\"far fa-calendar-alt\"></i> <span>October 2, 2019</span> Trip to Iceland</h5>\n");
      out.write("                    <h5><i class=\"far fa-calendar-alt\"></i> <span>October 2, 2019</span> Trip to Iceland</h5>\n");
      out.write("                </div>\n");
      out.write("                <div class=\"col-12 col-sm-12 col-md-3 col-lg-3 col-xl-3 footer-texts\">\n");
      out.write("                    <h2>INSTAGRAM FEED</h2>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("            <div class=\"text-center p-3\" style=\"background-color: rgba(0, 0, 0, 0.2);\">\n");
      out.write("                © 2022 Copyright:\n");
      out.write("                <a class=\"text-white\" href=\"\">NVTHANG</a>\n");
      out.write("            </div>\n");
      out.write("        </footer>\n");
      out.write("        <!--------end---------------------->\n");
      out.write("        <div class=\"login\">\n");
      out.write("            <a href=\"buy.jsp\" class=\"bxuser\">\n");
      out.write("                <i class='bx bx-user'></i>\n");
      out.write("                ");
      if (_jspx_meth_c_if_1(_jspx_page_context))
        return;
      out.write("\n");
      out.write("                ");
      if (_jspx_meth_c_if_2(_jspx_page_context))
        return;
      out.write("\n");
      out.write("            </a>\n");
      out.write("            <a href=\"CartProduct\" class=\"bxcart\">\n");
      out.write("                <i class='bx bx-cart'></i>\n");
      out.write("            </a>\n");
      out.write("        </div>\n");
      out.write("        <script src=\"app.js\"></script>\n");
      out.write("    </body>\n");
      out.write("</html>\n");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          out.clearBuffer();
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }

  private boolean _jspx_meth_c_if_0(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:if
    org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_c_if_0 = (org.apache.taglibs.standard.tag.rt.core.IfTag) _jspx_tagPool_c_if_test.get(org.apache.taglibs.standard.tag.rt.core.IfTag.class);
    _jspx_th_c_if_0.setPageContext(_jspx_page_context);
    _jspx_th_c_if_0.setParent(null);
    _jspx_th_c_if_0.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${sessionScope.acc.isSell == true}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null)).booleanValue());
    int _jspx_eval_c_if_0 = _jspx_th_c_if_0.doStartTag();
    if (_jspx_eval_c_if_0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\n");
        out.write("                        <li>\n");
        out.write("                            <a href=\"seller\">MANAGER SELLER</a>\n");
        out.write("                        </li>\n");
        out.write("                       ");
        int evalDoAfterBody = _jspx_th_c_if_0.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_c_if_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_if_test.reuse(_jspx_th_c_if_0);
      return true;
    }
    _jspx_tagPool_c_if_test.reuse(_jspx_th_c_if_0);
    return false;
  }

  private boolean _jspx_meth_c_if_1(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:if
    org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_c_if_1 = (org.apache.taglibs.standard.tag.rt.core.IfTag) _jspx_tagPool_c_if_test.get(org.apache.taglibs.standard.tag.rt.core.IfTag.class);
    _jspx_th_c_if_1.setPageContext(_jspx_page_context);
    _jspx_th_c_if_1.setParent(null);
    _jspx_th_c_if_1.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${sessionScope.acc != null}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null)).booleanValue());
    int _jspx_eval_c_if_1 = _jspx_th_c_if_1.doStartTag();
    if (_jspx_eval_c_if_1 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\n");
        out.write("                    <a class=\"nav-link\" href=\"#\" style=\"background: #ddd\">");
        out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${sessionScope.acc.username}", java.lang.String.class, (PageContext)_jspx_page_context, null));
        out.write("</a>\n");
        out.write("                    <a class=\"nav-link\" href=\"Logout\" style=\"background: graytext\">Logout</a>\n");
        out.write("                ");
        int evalDoAfterBody = _jspx_th_c_if_1.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_c_if_1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_if_test.reuse(_jspx_th_c_if_1);
      return true;
    }
    _jspx_tagPool_c_if_test.reuse(_jspx_th_c_if_1);
    return false;
  }

  private boolean _jspx_meth_c_if_2(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:if
    org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_c_if_2 = (org.apache.taglibs.standard.tag.rt.core.IfTag) _jspx_tagPool_c_if_test.get(org.apache.taglibs.standard.tag.rt.core.IfTag.class);
    _jspx_th_c_if_2.setPageContext(_jspx_page_context);
    _jspx_th_c_if_2.setParent(null);
    _jspx_th_c_if_2.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${sessionScope.acc == null}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null)).booleanValue());
    int _jspx_eval_c_if_2 = _jspx_th_c_if_2.doStartTag();
    if (_jspx_eval_c_if_2 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\n");
        out.write("                    <a class=\"nav-link\" href=\"login.jsp\" style=\"background: graytext\">Login</a>\n");
        out.write("                ");
        int evalDoAfterBody = _jspx_th_c_if_2.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_c_if_2.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_if_test.reuse(_jspx_th_c_if_2);
      return true;
    }
    _jspx_tagPool_c_if_test.reuse(_jspx_th_c_if_2);
    return false;
  }
}
