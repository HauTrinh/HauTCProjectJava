package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class product_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_c_forEach_var_items;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_c_if_test;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _jspx_tagPool_c_forEach_var_items = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_c_if_test = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
  }

  public void _jspDestroy() {
    _jspx_tagPool_c_forEach_var_items.release();
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
      out.write("<!--        <link rel=\"stylesheet\" href=\"style.css\">-->\n");
      out.write("        <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\n");
      out.write("        <link rel=\"stylesheet\" href=\"https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/css/bootstrap.min.css\">\n");
      out.write("        <script src=\"https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js\"></script>\n");
      out.write("        <script src=\"https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/js/bootstrap.min.js\"></script>\n");
      out.write("        <link rel=\"stylesheet\" href=\"https://cdnjs.cloudflare.com/ajax/libs/font-awesome/5.15.3/css/all.min.css\"\n");
      out.write("            integrity=\"sha512-iBBXm8fW90+nuLcSKlbmrPcLa0OT92xO1BIsZ+ywDWZCvqsWgccV3gFoRBv0z+8dLJgyAHIhR35VZc2oM/gI1w==\"\n");
      out.write("            crossorigin=\"anonymous\" referrerpolicy=\"no-referrer\" />\n");
      out.write("        <link rel=\"stylesheet\" href=\"style/product.css\">\n");
      out.write("        <link href='https://unpkg.com/boxicons@2.1.2/css/boxicons.min.css' rel='stylesheet'>\n");
      out.write("        <link rel=\"stylesheet\" href=\"css/hw1.css\">\n");
      out.write("        <title>PRODUCT</title>\n");
      out.write("    </head>\n");
      out.write("\n");
      out.write("    <body>\n");
      out.write("        <section>\n");
      out.write("            <div class=\"bannerVideo\" id=\"slideshow\">\n");
      out.write("                <img src=\"image/banner123.jpg\" alt=\"\">\n");
      out.write("                <h2>SNEAKER</h2>\n");
      out.write("            </div>\n");
      out.write("            <div class=\"container1\">\n");
      out.write("                <header class=\"navbar\" id=\"navbar\">\n");
      out.write("                    <a href=\"#\" class=\"logo\">SNEAKER</a>\n");
      out.write("                    <ul>\n");
      out.write("                        <li>\n");
      out.write("                            <a href=\"index.jsp\">Home</a>\n");
      out.write("                        </li>\n");
      out.write("                        <li>\n");
      out.write("                            <a href=\"ListBrand\" class=\"active\">RPODUCT</a>\n");
      out.write("                        </li>\n");
      out.write("                      \n");
      out.write("                        ");
      if (_jspx_meth_c_if_0(_jspx_page_context))
        return;
      out.write("\n");
      out.write("                        \n");
      out.write("                    </ul>\n");
      out.write("                    <span class=\"menuIcon\" onclick=\"toggleMenu();\"></span>\n");
      out.write("                </header>\n");
      out.write("            </div>\n");
      out.write("        </section>\n");
      out.write("        <div class=\"product-list container\">\n");
      out.write("            <div class=\"row\">\n");
      out.write("              \n");
      out.write("                <div class=\"col-12 col-sm-12 col-md-9 col-lg-9 col-xl-9 product-left1\">\n");
      out.write("                    <h5>Showing 1–9 of 20 results</h5>\n");
      out.write("                    <div class=\"product-left container\">\n");
      out.write("                        <div class=\"col-12 col-sm-12 col-md-12 col-lg-12 col-xl-12\" >\n");
      out.write("                            <div class=\"row\">\n");
      out.write("                                  ");
      if (_jspx_meth_c_forEach_0(_jspx_page_context))
        return;
      out.write("\n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("                <div class=\"col-12 col-sm-12 col-md-3 col-lg-3 col-xl-3 product-list-right\">\n");
      out.write("                    <form action=\"SearchProduct\" method=\"POST\">\n");
      out.write("                    <div class=\"input-group col-12 col-sm-12 col-md-12 col-lg-12 col-xl-12\">\n");
      out.write("                        <div class=\"form-outline\">\n");
      out.write("                            <input name=\"txt\" type=\"text\" id=\"form1\" class=\"form-control\" placeholder=\"search\" />\n");
      out.write("                        </div>\n");
      out.write("                        <button type=\"submit\" class=\"btn btn-primary\">\n");
      out.write("                            <i class=\"fas fa-search\"></i>\n");
      out.write("                        </button>\n");
      out.write("                    </div>\n");
      out.write("                        </form>\n");
      out.write("                    <div class=\"product-categories\">\n");
      out.write("                        <h1>PRODUCT CATEGORIES</h1>\n");
      out.write("                        <ul class=\"list-group\">\n");
      out.write("                            ");
      if (_jspx_meth_c_forEach_1(_jspx_page_context))
        return;
      out.write("\n");
      out.write("                        </ul>\n");
      out.write("                    </div>\n");
      out.write("                    <div class=\"products\">\n");
      out.write("                        <h1>NEW PRODUCT</h1>\n");
      out.write("                        <div class=\"col-12 col-sm-12 col-md-12 col-lg-12 col-xl-12 products-1\">\n");
      out.write("                            <div class=\"col-5 col-sm-5 col-md-5 col-lg-5 col-xl-5\">\n");
      out.write("                                <img src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${p.imge}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\" alt=\"\">\n");
      out.write("                            </div>\n");
      out.write("                            <div class=\"col-7 col-sm-7 col-md-7 col-lg-7 col-xl-7\">\n");
      out.write("                                <h4>");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${p.pName}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("</h4>\n");
      out.write("                                <div>\n");
      out.write("                                    <i class=\"far fa-star\"></i>\n");
      out.write("                                    <i class=\"far fa-star\"></i>\n");
      out.write("                                    <i class=\"far fa-star\"></i>\n");
      out.write("                                    <i class=\"far fa-star\"></i>\n");
      out.write("                                    <i class=\"far fa-star\"></i>\n");
      out.write("                                </div>\n");
      out.write("                                <h5>");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${p.price}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("</h5>\n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                    <div class=\"product-tags\">\n");
      out.write("                        <h1>PRODUCT TAGS</h1>\n");
      out.write("                        <p>Hiking Gear/ Outdoor/ Travel</p>\n");
      out.write("                        <p>Hiking Gear/ Outdoor/ Travel</p>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("        <footer class=\" text-lg-start bg-light text-muted\">\n");
      out.write("            <div class=\"col-12 col-sm-12 col-md-12 col-lg-12 col-xl-12 footer-text\">\n");
      out.write("                <div class=\"col-12 col-sm-12 col-md-3 col-lg-3 col-xl-3 footer-text-1\">\n");
      out.write("                    <h1>TRAVEL</h1>\n");
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
      out.write("                © 2020 Copyright:\n");
      out.write("                <a class=\"text-white\" href=\"https://mdbootstrap.com/\">MDBootstrap.com</a>\n");
      out.write("            </div>\n");
      out.write("        </footer>\n");
      out.write("            <div class=\"login\">\n");
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
      out.write("        <script>\n");
      out.write("            window.addEventListener(\"scroll\", function () {\n");
      out.write("                var header = this.document.querySelector('header');\n");
      out.write("                header.classList.toggle('sticky', window.scrollY > 0);\n");
      out.write("            });\n");
      out.write("            function toggleMenu() {\n");
      out.write("                const menuIcon = document.querySelector('.menuIcon');\n");
      out.write("                const navbar = document.getElementById('navbar');\n");
      out.write("                menuIcon.classList.toggle('active');\n");
      out.write("                navbar.classList.toggle('active');\n");
      out.write("            }\n");
      out.write("        </script>\n");
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

  private boolean _jspx_meth_c_forEach_0(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:forEach
    org.apache.taglibs.standard.tag.rt.core.ForEachTag _jspx_th_c_forEach_0 = (org.apache.taglibs.standard.tag.rt.core.ForEachTag) _jspx_tagPool_c_forEach_var_items.get(org.apache.taglibs.standard.tag.rt.core.ForEachTag.class);
    _jspx_th_c_forEach_0.setPageContext(_jspx_page_context);
    _jspx_th_c_forEach_0.setParent(null);
    _jspx_th_c_forEach_0.setItems((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${listP}", java.lang.Object.class, (PageContext)_jspx_page_context, null));
    _jspx_th_c_forEach_0.setVar("p");
    int[] _jspx_push_body_count_c_forEach_0 = new int[] { 0 };
    try {
      int _jspx_eval_c_forEach_0 = _jspx_th_c_forEach_0.doStartTag();
      if (_jspx_eval_c_forEach_0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("\n");
          out.write("                                <div class=\"col-12 col-sm-12 col-md-4 col-lg-4 col-xl-4 product-left-1\" >\n");
          out.write("                                    <img src=\"");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${p.imge}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("\" alt=\"\">\n");
          out.write("                                    <div class=\"product-left-text\">\n");
          out.write("                                        <h5>");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${p.price}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("vnđ</h5>\n");
          out.write("                                        <div>\n");
          out.write("                                            <i class=\"far fa-star\"></i>\n");
          out.write("                                            <i class=\"far fa-star\"></i>\n");
          out.write("                                            <i class=\"far fa-star\"></i>\n");
          out.write("                                            <i class=\"far fa-star\"></i>\n");
          out.write("                                            <i class=\"far fa-star\"></i>\n");
          out.write("                                        </div>\n");
          out.write("                                        <h4>");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${p.pName}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("</h4>\n");
          out.write("                                    </div>\n");
          out.write("                                    <button><a href=\"ShowProductToCart?pID=");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${p.pID}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("\">ADD TO CART</a></button>\n");
          out.write("                                </div>\n");
          out.write("                                ");
          int evalDoAfterBody = _jspx_th_c_forEach_0.doAfterBody();
          if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
            break;
        } while (true);
      }
      if (_jspx_th_c_forEach_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
    } catch (Throwable _jspx_exception) {
      while (_jspx_push_body_count_c_forEach_0[0]-- > 0)
        out = _jspx_page_context.popBody();
      _jspx_th_c_forEach_0.doCatch(_jspx_exception);
    } finally {
      _jspx_th_c_forEach_0.doFinally();
      _jspx_tagPool_c_forEach_var_items.reuse(_jspx_th_c_forEach_0);
    }
    return false;
  }

  private boolean _jspx_meth_c_forEach_1(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:forEach
    org.apache.taglibs.standard.tag.rt.core.ForEachTag _jspx_th_c_forEach_1 = (org.apache.taglibs.standard.tag.rt.core.ForEachTag) _jspx_tagPool_c_forEach_var_items.get(org.apache.taglibs.standard.tag.rt.core.ForEachTag.class);
    _jspx_th_c_forEach_1.setPageContext(_jspx_page_context);
    _jspx_th_c_forEach_1.setParent(null);
    _jspx_th_c_forEach_1.setItems((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${listC}", java.lang.Object.class, (PageContext)_jspx_page_context, null));
    _jspx_th_c_forEach_1.setVar("c");
    int[] _jspx_push_body_count_c_forEach_1 = new int[] { 0 };
    try {
      int _jspx_eval_c_forEach_1 = _jspx_th_c_forEach_1.doStartTag();
      if (_jspx_eval_c_forEach_1 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("\n");
          out.write("                            <li class=\"list-group-item text-white\"><a href=\"ListProduct?bName=");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${c.brandID}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write('"');
          out.write('>');
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${c.brandName}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("</a></li>\n");
          out.write("                            ");
          int evalDoAfterBody = _jspx_th_c_forEach_1.doAfterBody();
          if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
            break;
        } while (true);
      }
      if (_jspx_th_c_forEach_1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
    } catch (Throwable _jspx_exception) {
      while (_jspx_push_body_count_c_forEach_1[0]-- > 0)
        out = _jspx_page_context.popBody();
      _jspx_th_c_forEach_1.doCatch(_jspx_exception);
    } finally {
      _jspx_th_c_forEach_1.doFinally();
      _jspx_tagPool_c_forEach_var_items.reuse(_jspx_th_c_forEach_1);
    }
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
