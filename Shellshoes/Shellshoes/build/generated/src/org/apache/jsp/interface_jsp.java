package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class interface_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("        <title>JSP Page</title>\n");
      out.write("        <link rel=\"icon\" type=\"image/x-icon\" href=\"images/logoshop.jpg\">\n");
      out.write("        <link href=\"css/bootstrap.css\" rel=\"stylesheet\">\n");
      out.write("        <link href=\"css/styleindex.css\" rel=\"stylesheet\">\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("    <div class=\"flexContainer-header\">\n");
      out.write("        <div class=\"container-fluid\">\n");
      out.write("            <div class=\"header\">\n");
      out.write("                <div class=\"col-md-12\">\n");
      out.write("                    <h1> K.O.H </h1>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("\n");
      out.write("\n");
      out.write("            <div class=\"container-fluid\">\n");
      out.write("                <!--- vùng chứa kéo dài toàn màn hình  --->\n");
      out.write("\n");
      out.write("                <div class=\"row\">\n");
      out.write("\n");
      out.write("                    <nav class=\"navbar navbar-inverse bg-primary\" role=\"navigation\">\n");
      out.write("                        <div class=\"container-fluid\">\n");
      out.write("                            <!-- Brand and toggle get grouped for better mobile display -->\n");
      out.write("                            <div class=\"navbar-header\">\n");
      out.write("                                <button type=\"button\" class=\"navbar-toggle\" data-toggle=\"collapse\" data-target=\"#bs-example-navbar-collapse-1\">\n");
      out.write("                                <span class=\"sr-only\">Toggle navigation</span>\n");
      out.write("                                <span class=\"icon-bar\"></span>\n");
      out.write("                                <span class=\"icon-bar\"></span>\n");
      out.write("                                <span class=\"icon-bar\"></span>\n");
      out.write("                            </button>\n");
      out.write("\n");
      out.write("                            </div>\n");
      out.write("\n");
      out.write("\n");
      out.write("                            <div class=\"collapse navbar-collapse\" id=\"bs-example-navbar-collapse-1\">\n");
      out.write("                                <ul class=\"nav navbar-nav\">\n");
      out.write("\n");
      out.write("                                    <li class=\"active\">\n");
      out.write("                                        <a href=\"ListBrand\"> <span class=\"glyphicon glyphicon-home\"></span> Home\n");
      out.write("                                        </a>\n");
      out.write("                                    </li>\n");
      out.write("\n");
      out.write("                                    <li><a href=\"#\">Collections</a></li>\n");
      out.write("                                    <li><a href=\"#\">Services</a></li>\n");
      out.write("                                        ");
      if (_jspx_meth_c_if_0(_jspx_page_context))
        return;
      out.write("\n");
      out.write("                                        ");
      if (_jspx_meth_c_if_1(_jspx_page_context))
        return;
      out.write("\n");
      out.write("                                    \n");
      out.write("                                </ul>\n");
      out.write("\n");
      out.write("\n");
      out.write("                                <form class=\"navbar-form navbar-right\" role=\"search\">\n");
      out.write("                                    <div class=\"form-group\">\n");
      out.write("                                        <input type=\"text\" class=\"form-control\" placeholder=\"Search\">\n");
      out.write("                                    </div>\n");
      out.write("                                    <button type=\"submit\" class=\"btn btn-default\">Search</button>\n");
      out.write("<!--                                    <a href=\"User.jsp\"> <span class=\"glyphicon glyphicon-user\"></span>-->\n");
      out.write("                                    </a>\n");
      out.write("                                    <span class=\"glyphicon glyphicon-shopping-cart\"></span>\n");
      out.write("                                </form>\n");
      out.write("\n");
      out.write("                            </div>\n");
      out.write("                            <!-- /.navbar-collapse -->\n");
      out.write("                        </div>\n");
      out.write("                        <!-- /.container-fluid -->\n");
      out.write("                    </nav>\n");
      out.write("\n");
      out.write("                </div>\n");
      out.write("\n");
      out.write("\n");
      out.write("                <div class=\"row\">\n");
      out.write("                    <div class=\"col-md-12\">\n");
      out.write("                        <!--Bắt đầu slider-->\n");
      out.write("                        <div id=\"carousel-example-generic\" class=\"carousel slide\" data-ride=\"carousel\">\n");
      out.write("                            <!-- Indicators -->\n");
      out.write("                            <ol class=\"carousel-indicators\">\n");
      out.write("                                <li data-target=\"#carousel-example-generic\" data-slide-to=\"0\" class=\"active\"></li>\n");
      out.write("                                <li data-target=\"#carousel-example-generic\" data-slide-to=\"1\"></li>\n");
      out.write("                                <li data-target=\"#carousel-example-generic\" data-slide-to=\"2\"></li>\n");
      out.write("                                <li data-target=\"#carousel-example-generic\" data-slide-to=\"3\"></li>\n");
      out.write("                            </ol>\n");
      out.write("                            <div class=\"carousel-inner\">\n");
      out.write("                                <div class=\"item active\">\n");
      out.write("\n");
      out.write("                                    <img src=\"images/slide2.jfif\" />\n");
      out.write("                                </div>\n");
      out.write("                                <div class=\"item\">\n");
      out.write("\n");
      out.write("                                    <img src=\"images/slide3.jfif\" />\n");
      out.write("\n");
      out.write("                                </div>\n");
      out.write("                                <div class=\"item\">\n");
      out.write("\n");
      out.write("                                    <img src=\"images/slide4.jfif\" />\n");
      out.write("\n");
      out.write("                                </div>\n");
      out.write("                                <div class=\"item\">\n");
      out.write("\n");
      out.write("                                    <img src=\"images/slide5.jfif\" />\n");
      out.write("\n");
      out.write("                                </div>\n");
      out.write("\n");
      out.write("                            </div>\n");
      out.write("                            <a class=\"left carousel-control\" href=\"#carousel-example-generic\" role=\"button\" data-slide=\"prev\">\n");
      out.write("                                <span class=\"glyphicon glyphicon-chevron-left\"></span>\n");
      out.write("                                <span class=\"sr-only\">Previous</span>\n");
      out.write("                            </a>\n");
      out.write("                            <a class=\"right carousel-control\" href=\"#carousel-example-generic\" role=\"button\" data-slide=\"next\">\n");
      out.write("                                <span class=\"glyphicon glyphicon-chevron-right\"></span>\n");
      out.write("                                <span class=\"sr-only\">Next</span>\n");
      out.write("                            </a>\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("                <!--Kết thúc container-fluid-->\n");
      out.write("\n");
      out.write("                <div class=\"container\">\n");
      out.write("\n");
      out.write("                    <div class=\"row center\">\n");
      out.write("\n");
      out.write("                        <div class=\"col-md-12\">\n");
      out.write("\n");
      out.write("                            <h2>Types of shoes of the shop</h2>\n");
      out.write("\n");
      out.write("                        </div>\n");
      out.write("\n");
      out.write("                    </div>\n");
      out.write("\n");
      out.write("                    <div class=\"row\">\n");
      out.write("                        ");
      if (_jspx_meth_c_forEach_0(_jspx_page_context))
        return;
      out.write("\n");
      out.write("                    </div>\n");
      out.write("\n");
      out.write("                    <div class=\"row center\">\n");
      out.write("\n");
      out.write("                        <div class=\"col-md-12\">\n");
      out.write("\n");
      out.write("                            <h2>HUGE PROMOTION COMBO</h2>\n");
      out.write("                            <p>During the promotion period, let's buy your shoes!</p>\n");
      out.write("                        </div>\n");
      out.write("\n");
      out.write("                    </div>\n");
      out.write("\n");
      out.write("                    <div class=\"row\">\n");
      out.write("\n");
      out.write("                        <div class=\"col-md-4 col-xs-12\">\n");
      out.write("\n");
      out.write("                            <div>\n");
      out.write("                                <a href=\"infcombo01.html\">\n");
      out.write("                                    <img class=\"img-responsive\" src=\"images/combo01.PNG\" />\n");
      out.write("                                    <div class=\"block\">\n");
      out.write("                                        <p>Discount locations:<span style=\"font-weight: bold;margin-left: 10px;\">Cam le District\n");
      out.write("                                    Branch</span> </p>\n");
      out.write("                                        <p>Price: <del> 200.000 vnđ </del> <span style=\"color: #F72B2F; margin-left:10px; \">150.000\n");
      out.write("                                    vnđ</span></p>\n");
      out.write("\n");
      out.write("                                    </div>\n");
      out.write("                                </a>\n");
      out.write("                            </div>\n");
      out.write("\n");
      out.write("                        </div>\n");
      out.write("\n");
      out.write("                        <div class=\"col-md-4 col-xs-12\">\n");
      out.write("\n");
      out.write("                            <div>\n");
      out.write("                                <a href=\"infcombo02.html\">\n");
      out.write("                                    <img class=\"img-responsive\" src=\"images/combo02.PNG\" />\n");
      out.write("                                    <div class=\"block\">\n");
      out.write("\n");
      out.write("                                        <p>Discount locations:<span style=\"font-weight: bold;margin-left: 10px;\">Cam le District\n");
      out.write("                                    Branch</span> </p>\n");
      out.write("                                        <p>Price: <del>500.000 vnđ </del> <span style=\"color: #F72B2F; margin-left:10px; \">450.000\n");
      out.write("                                    vnđ</span></p>\n");
      out.write("                                    </div>\n");
      out.write("                                </a>\n");
      out.write("\n");
      out.write("                            </div>\n");
      out.write("\n");
      out.write("                        </div>\n");
      out.write("\n");
      out.write("                        <div class=\"col-md-4 col-xs-12\">\n");
      out.write("\n");
      out.write("                            <div>\n");
      out.write("                                <a href=\"infcombo03.html\">\n");
      out.write("                                    <img class=\"img-responsive\" src=\"images/combo03.PNG\" />\n");
      out.write("                                    <div class=\"block\">\n");
      out.write("\n");
      out.write("                                        <p>Discount locations:<span style=\"font-weight: bold;margin-left: 10px;\">Cam le District\n");
      out.write("                                    Branch</span> </p>\n");
      out.write("                                        <p>Price: <del>150.000 vnđ </del> <span style=\"color: #F72B2F; margin-left:10px; \">100.000\n");
      out.write("                                    vnđ</span></p>\n");
      out.write("\n");
      out.write("                                    </div>\n");
      out.write("                                </a>\n");
      out.write("                            </div>\n");
      out.write("\n");
      out.write("                        </div>\n");
      out.write("\n");
      out.write("\n");
      out.write("                    </div>\n");
      out.write("\n");
      out.write("\n");
      out.write("                    <div class=\"row center\">\n");
      out.write("\n");
      out.write("                        <div class=\"col-md-12 \">\n");
      out.write("\n");
      out.write("                            <h2>SPECIAL ORDER ONLINE</h2>\n");
      out.write("                            <p>Surprisingly cheap and freeship</p>\n");
      out.write("                        </div>\n");
      out.write("\n");
      out.write("                    </div>\n");
      out.write("\n");
      out.write("                    <div class=\"row\">\n");
      out.write("\n");
      out.write("                        <div class=\"col-md-6 col-xs-12\">\n");
      out.write("\n");
      out.write("                            <div>\n");
      out.write("\n");
      out.write("                                <img class=\"img-responsive\" src=\"images/orderOnline.jpg\" />\n");
      out.write("\n");
      out.write("                            </div>\n");
      out.write("\n");
      out.write("                        </div>\n");
      out.write("\n");
      out.write("                        <div class=\"col-md-3 col-xs-12\">\n");
      out.write("\n");
      out.write("                            <div>\n");
      out.write("\n");
      out.write("                                <img class=\"img-responsive\" src=\"images/sale20.png\" />\n");
      out.write("                                <div class=\"block\">\n");
      out.write("                                    <p>Order online 20% off</p>\n");
      out.write("                                    <p>Discount locations:<span style=\"font-weight: bold;margin-left: 10px;\">Tan Phu District\n");
      out.write("                                    Branch</span> </p>\n");
      out.write("                                    <p><del>100% </del> <span style=\"color: #F72B2F; margin-left:10px; \">80%</span></p>\n");
      out.write("                                </div>\n");
      out.write("\n");
      out.write("                            </div>\n");
      out.write("\n");
      out.write("                        </div>\n");
      out.write("\n");
      out.write("                        <div class=\"col-md-3 col-xs-12\">\n");
      out.write("\n");
      out.write("                            <div>\n");
      out.write("\n");
      out.write("                                <img class=\"img-responsive\" src=\"images/camau.jpg\" />\n");
      out.write("                                <div class=\"block\">\n");
      out.write("                                    <p>Free shipping under 3km</p>\n");
      out.write("                                    <p>Discount locations:<span style=\"font-weight: bold;margin-left: 10px;\">Tan Phu District\n");
      out.write("                                    Branch</span> </p>\n");
      out.write("                                    <p><del>60.000 vnđ </del> <span style=\"color: #F72B2F; margin-left:10px; \">0 vnđ</span></p>\n");
      out.write("                                </div>\n");
      out.write("\n");
      out.write("                            </div>\n");
      out.write("\n");
      out.write("                        </div>\n");
      out.write("\n");
      out.write("\n");
      out.write("                    </div>\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("                </div>\n");
      out.write("\n");
      out.write("                <div class=\"container-fluid footer\">\n");
      out.write("\n");
      out.write("                    <div class=\"row\">\n");
      out.write("\n");
      out.write("                        <div>\n");
      out.write("\n");
      out.write("                            <p>Email : thaihoa25082001@gmail.com</p>\n");
      out.write("                            <p>Address: 994 Truong Chinh, Cam Le District, DaNang City</p>\n");
      out.write("\n");
      out.write("                        </div>\n");
      out.write("\n");
      out.write("                    </div>\n");
      out.write("\n");
      out.write("                </div>\n");
      out.write("\n");
      out.write("                <script src=\"js/Jquery.js\"></script>\n");
      out.write("                <script src=\"js/bootstrap.min.js\"></script>\n");
      out.write("                <script src=\"js/mycode.js\"></script>\n");
      out.write("</body>\n");
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
    _jspx_th_c_if_0.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${sessionScope.acc == null}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null)).booleanValue());
    int _jspx_eval_c_if_0 = _jspx_th_c_if_0.doStartTag();
    if (_jspx_eval_c_if_0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\n");
        out.write("                                            <li><a href=\"#\">Login out</a></li>\n");
        out.write("                                        ");
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
    _jspx_th_c_if_1.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${sessionScope.acc == null}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null)).booleanValue());
    int _jspx_eval_c_if_1 = _jspx_th_c_if_1.doStartTag();
    if (_jspx_eval_c_if_1 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\n");
        out.write("                                        <li><a class=\"nav-link\" href=\"User.jsp\">Login in</a></li>\n");
        out.write("                                        ");
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

  private boolean _jspx_meth_c_forEach_0(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:forEach
    org.apache.taglibs.standard.tag.rt.core.ForEachTag _jspx_th_c_forEach_0 = (org.apache.taglibs.standard.tag.rt.core.ForEachTag) _jspx_tagPool_c_forEach_var_items.get(org.apache.taglibs.standard.tag.rt.core.ForEachTag.class);
    _jspx_th_c_forEach_0.setPageContext(_jspx_page_context);
    _jspx_th_c_forEach_0.setParent(null);
    _jspx_th_c_forEach_0.setItems((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${brandS}", java.lang.Object.class, (PageContext)_jspx_page_context, null));
    _jspx_th_c_forEach_0.setVar("s");
    int[] _jspx_push_body_count_c_forEach_0 = new int[] { 0 };
    try {
      int _jspx_eval_c_forEach_0 = _jspx_th_c_forEach_0.doStartTag();
      if (_jspx_eval_c_forEach_0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("\n");
          out.write("                        <div class=\"col-md-3 col-xs-12\">\n");
          out.write("                            <div class=\"vans.jsp\">\n");
          out.write("\n");
          out.write("                                <img class=\"img-responsive\" src=\"");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${s.anh}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("\" />\n");
          out.write("                                <div class=\"pos\">\n");
          out.write("                                    <a href=\"ListProduct?bName=");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${s.brandName}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("\"><h3>");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${s.brandName}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("</h3></a>\n");
          out.write("                                </div>\n");
          out.write("                            </div>\n");
          out.write("                        </div>\n");
          out.write("                        ");
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
}
