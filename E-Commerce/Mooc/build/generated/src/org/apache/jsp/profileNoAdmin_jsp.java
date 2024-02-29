package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class profileNoAdmin_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html lang=\"en\">\n");
      out.write("\n");
      out.write("<head>\n");
      out.write("    <meta charset=\"UTF-8\">\n");
      out.write("\n");
      out.write("    <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\n");
      out.write("    <meta http-equiv=\"X-UA-Compatible\" content=\"ie=edge\">\n");
      out.write("    <title>F-Market</title>\n");
      out.write("\n");
      out.write("    <!-- Google Font -->\n");
      out.write("    <link href=\"https://fonts.googleapis.com/css2?family=Cairo:wght@200;300;400;600;900&display=swap\" rel=\"stylesheet\">\n");
      out.write("\n");
      out.write("    <!-- Css Styles -->\n");
      out.write("    <link rel=\"stylesheet\" href=\"assets/css/bootstrap.min.css\" type=\"text/css\">\n");
      out.write("    <link rel=\"stylesheet\" href=\"assets/css/font-awesome.min.css\" type=\"text/css\">\n");
      out.write("    <link rel=\"stylesheet\" href=\"assets/css/elegant-icons.css\" type=\"text/css\">\n");
      out.write("    <link rel=\"stylesheet\" href=\"assets/css/nice-select.css\" type=\"text/css\">\n");
      out.write("    <link rel=\"stylesheet\" href=\"assets/css/jquery-ui.min.css\" type=\"text/css\">\n");
      out.write("    <link rel=\"stylesheet\" href=\"assets/css/owl.carousel.min.css\" type=\"text/css\">\n");
      out.write("    <link rel=\"stylesheet\" href=\"assets/css/slicknav.min.css\" type=\"text/css\">\n");
      out.write("    <link rel=\"stylesheet\" href=\"assets/css/style.css\" type=\"text/css\">\n");
      out.write("    \n");
      out.write("     <link rel=\"stylesheet\" href=\"css/NoAdmin.css\">\n");
      out.write("</head>\n");
      out.write("\n");
      out.write("<body>\n");
      out.write(" <!--header-->\n");
      out.write("    <div class=\"admin-header\">\n");
      out.write("        <nav class=\"navbar navbar-expand-lg navbar-dark bg-dark\">\n");
      out.write("            <div class=\"collapse navbar-collapse\" id=\"navbarNav\">\n");
      out.write("              <ul class=\"navbar-nav\">\n");
      out.write("                  <li style=\"margin-left: 100px\" class=\"nav-item active\">\n");
      out.write("                  <a class=\"nav-link\" href=\"home\">Trang chủ<span class=\"sr-only\">(current)</span></a>\n");
      out.write("                </li>\n");
      out.write("                <li class=\"nav-item\">\n");
      out.write("                  <a class=\"nav-link\" href=\"home\">Quay lại</a>\n");
      out.write("                </li>\n");
      out.write("              </ul>\n");
      out.write("            </div>\n");
      out.write("          </nav>\n");
      out.write("    </div>    \n");
      out.write("<!--header-->\n");
      out.write("<div style=\" height: 100px;\"></div>\n");
      out.write("<div style=\" height: 100px; width: 100%; text-align: center;\"><h2 style=\" color: #3CC032\">Thông tin cá nhân</h2></div>\n");
      out.write("    <!-- Body Profile Start -->\n");
      out.write("    <div class=\"container\">\n");
      out.write("        <div class=\"row\">\n");
      out.write("            \n");
      out.write("                <div class=\"card\">\n");
      out.write("                    <div class=\"card__img\">\n");
      out.write("                        <img src=\"https://images.pexels.com/photos/39866/entrepreneur-startup-start-up-man-39866.jpeg?cs=srgb&dl=pexels-pixabay-39866.jpg&fm=jpg&_gl=1*dg4i0k*_ga*MTQ0MDQ3NTE5LjE2NTUwOTMyNjk.*_ga_8JE65Q40S6*MTY2Njc3NTk1My4xNS4xLjE2NjY3NzU5NzAuMC4wLjA.\"\n");
      out.write("                            alt=\"\">\n");
      out.write("                    </div>\n");
      out.write("                    <div class=\"card__header\" style=\"\">\n");
      out.write("                        <h2>");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${sessionScope.account.acc}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write(" </h2>\n");
      out.write("                        <button style=\"\">\n");
      out.write("                            <a href=\"editPassword\" style=\"color: white\">Đổi mật khẩu <i class=\"fa fa-edit\"></i></a>\n");
      out.write("                        </button>\n");
      out.write("                    </div>\n");
      out.write("    \n");
      out.write("                    <div class=\"card__social\">\n");
      out.write("                        <a href=\"\">\n");
      out.write("                            <i class=\"fa fa-facebook\"></i>\n");
      out.write("                        </a>\n");
      out.write("                        <a href=\"\">\n");
      out.write("                            <i class=\"fa fa-youtube\"></i>\n");
      out.write("                        </a>\n");
      out.write("                        <a href=\"\">\n");
      out.write("                            <i class=\"fa fa-linkedin\"></i>\n");
      out.write("                        </a>\n");
      out.write("                        <a href=\"\">\n");
      out.write("                            <i class=\"fa fa-github\"></i>\n");
      out.write("                        </a>\n");
      out.write("                    </div>\n");
      out.write("                    <button>Contact me</button>\n");
      out.write("                </div>\n");
      out.write("           \n");
      out.write("                <div style=\" margin-top: 0\" class=\"col-md-6 info__form\">\n");
      out.write("                    ");
      if (_jspx_meth_c_if_0(_jspx_page_context))
        return;
      out.write(" \n");
      out.write("                    \n");
      out.write("                    ");
      if (_jspx_meth_c_if_1(_jspx_page_context))
        return;
      out.write("\n");
      out.write("                </div>\n");
      out.write("                              \n");
      out.write("        </div>\n");
      out.write("    </div>\n");
      out.write("\n");
      out.write("     <div style=\" height: 150px; width: 100%\"></div>\n");
      out.write("    <!-- Footer Section Begin -->\n");
      out.write("    <footer class=\"footer spad\">\n");
      out.write("        <div class=\"container\">\n");
      out.write("            <div class=\"row\">\n");
      out.write("                <div class=\"col-lg-3 col-md-6 col-sm-6\">\n");
      out.write("                    <div class=\"footer__about\">\n");
      out.write("                        <!-- <div class=\"footer__about__logo\">\n");
      out.write("                                <a href=\"./index.html\"><img src=\"img/logo.png\" alt=\"\"></a>\n");
      out.write("                            </div> -->\n");
      out.write("                        <ul>\n");
      out.write("                            <li>Address: Đường Ngũ Hành Sơn Đà Nẵng VietNam</li>\n");
      out.write("                            <li>Phone: +84 9841 2548</li>\n");
      out.write("                            <li>Email: fmarket@gmail.com</li>\n");
      out.write("                        </ul>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("                <div class=\"col-lg-4 col-md-6 col-sm-6 offset-lg-1\">\n");
      out.write("                    <div class=\"footer__widget\">\n");
      out.write("\n");
      out.write("                        <ul>\n");
      out.write("                            <li><a href=\"#\">Về chúng tôi</a></li>\n");
      out.write("                            <li><a href=\"#\">Mua sắm an toàn</a></li>\n");
      out.write("                            <li><a href=\"#\">Thông tin vận chuyển</a></li>\n");
      out.write("                            <li><a href=\"#\">Chính sách bảo mật</a></li>\n");
      out.write("                        </ul>\n");
      out.write("                        <ul>\n");
      out.write("                            <li><a href=\"#\">Chúng tôi là ai?</a></li>\n");
      out.write("                            <li><a href=\"#\">Dịch vụ của chúng tôi</a></li>\n");
      out.write("                            <li><a href=\"#\">Dự án</a></li>\n");
      out.write("                            <li><a href=\"#\">Liên hệ</a></li>\n");
      out.write("                            <li><a href=\"#\">Lời chứng thực</a></li>\n");
      out.write("                        </ul>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("                <div class=\"col-lg-4 col-md-12\">\n");
      out.write("                    <div class=\"footer__widget\">\n");
      out.write("                        <h6>Tham gia với chúng tôi</h6>\n");
      out.write("                        <p>Nhận thông báo mới nhất của chúng tôi qua mail.</p>\n");
      out.write("                        <form action=\"#\">\n");
      out.write("                            <input type=\"text\" placeholder=\"Enter your mail\">\n");
      out.write("                            <button type=\"submit\" class=\"site-btn\">Đăng kí</button>\n");
      out.write("                        </form>\n");
      out.write("                        <div class=\"footer__widget__social\">\n");
      out.write("                            <a href=\"#\"><i class=\"fa fa-facebook\"></i></a>\n");
      out.write("                            <a href=\"#\"><i class=\"fa fa-instagram\"></i></a>\n");
      out.write("                            <a href=\"#\"><i class=\"fa fa-twitter\"></i></a>\n");
      out.write("                            <a href=\"#\"><i class=\"fa fa-pinterest\"></i></a>\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("            <div class=\"row\">\n");
      out.write("                <div class=\"col-lg-12\">\n");
      out.write("                    <div class=\"footer__copyright\">\n");
      out.write("\n");
      out.write("                        <div class=\"footer__copyright__payment\"><img src=\"assets/img/payment-item.png\" alt=\"\"></div>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("    </footer>\n");
      out.write("    <!-- Footer Section End -->\n");
      out.write("\n");
      out.write("    <!-- Js Plugins -->\n");
      out.write("    <script type=\"text/javascript\" src=\"https://cdnjs.cloudflare.com/ajax/libs/mdb-ui-kit/6.0.0/mdb.min.js\"></script>\n");
      out.write("    <script src=\"assets/js/jquery-3.3.1.min.js\"></script>\n");
      out.write("    <script src=\"assets/js/bootstrap.min.js\"></script>\n");
      out.write("    <script src=\"assets/js/jquery.nice-select.min.js\"></script>\n");
      out.write("    <script src=\"assets/js/jquery-ui.min.js\"></script>\n");
      out.write("    <script src=\"assets/js/jquery.slicknav.js\"></script>\n");
      out.write("    <script src=\"assets/js/mixitup.min.js\"></script>\n");
      out.write("    <script src=\"assets/js/owl.carousel.min.js\"></script>\n");
      out.write("    <script src=\"assets/js/main.js\"></script>\n");
      out.write("</body>\n");
      out.write("\n");
      out.write("</html>");
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
    _jspx_th_c_if_0.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${sessionScope.account.roles == 2}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null)).booleanValue());
    int _jspx_eval_c_if_0 = _jspx_th_c_if_0.doStartTag();
    if (_jspx_eval_c_if_0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("  <!--Seller   -->\n");
        out.write("                        <form action=\"managerSeller\" method=\"post\">\n");
        out.write("                            <fieldset>\n");
        out.write("                                <div class=\"form-group\">\n");
        out.write("                                <label>ID</label>\n");
        out.write("                                <input name=\"noID\" type=\"text\" id=\"NameAccount\" class=\"form-control\" value=\"");
        out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${sessionScope.account.id}", java.lang.String.class, (PageContext)_jspx_page_context, null));
        out.write("\" readonly>\n");
        out.write("                              </div>\n");
        out.write("                              <div class=\"form-group\">\n");
        out.write("                                <label for=\"NameAccount\">Tên người dùng</label>\n");
        out.write("                                <input name=\"noName\" type=\"text\" id=\"NameAccount\" class=\"form-control\" value=\"");
        out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${no.name}", java.lang.String.class, (PageContext)_jspx_page_context, null));
        out.write("\">\n");
        out.write("                              </div>\n");
        out.write("                              <div class=\"form-group\">\n");
        out.write("                                <label for=\"NameAccount\">Số điện thoại</label>\n");
        out.write("                                <input name=\"noPhone\" type=\"phone\" id=\"NameAccount\" class=\"form-control\" value=\"");
        out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${no.phone}", java.lang.String.class, (PageContext)_jspx_page_context, null));
        out.write("\">\n");
        out.write("                              </div>\n");
        out.write("                              <div class=\"form-group\">\n");
        out.write("                                  <label class=\"labels\">Địa chỉ</label>\n");
        out.write("                                <input name=\"noAdd\" type=\"text\" class=\"form-control\" value=\"");
        out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${no.address}", java.lang.String.class, (PageContext)_jspx_page_context, null));
        out.write("\">\n");
        out.write("                              </div>\n");
        out.write("                            </fieldset>\n");
        out.write("                            <div class=\"modal-footer\">\n");
        out.write("                                <input type=\"submit\" class=\"btn btn-info\" value=\"Lưu thay đổi\">\n");
        out.write("                            </div>\n");
        out.write("                        </form>\n");
        out.write("                    ");
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
    _jspx_th_c_if_1.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${sessionScope.account.roles == 3}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null)).booleanValue());
    int _jspx_eval_c_if_1 = _jspx_th_c_if_1.doStartTag();
    if (_jspx_eval_c_if_1 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("  <!--Customer   -->\n");
        out.write("                        <form action=\"managerCus\" method=\"post\">\n");
        out.write("                            <fieldset>\n");
        out.write("                                <div class=\"form-group\">\n");
        out.write("                                <label for=\"NameAccount\">ID</label>\n");
        out.write("                                <input name=\"noID\" type=\"text\" id=\"NameAccount\" class=\"form-control\" value=\"");
        out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${sessionScope.account.id}", java.lang.String.class, (PageContext)_jspx_page_context, null));
        out.write("\" readonly>\n");
        out.write("                              </div>\n");
        out.write("                              <div class=\"form-group\">\n");
        out.write("                                <label for=\"NameAccount\">Tên người dùng</label>\n");
        out.write("                                <input name=\"noName\" type=\"text\" id=\"NameAccount\" class=\"form-control\" value=\"");
        out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${no.name}", java.lang.String.class, (PageContext)_jspx_page_context, null));
        out.write("\">\n");
        out.write("                              </div>\n");
        out.write("                              <div class=\"form-group\">\n");
        out.write("                                <label for=\"NameAccount\">Số điện thoại</label>\n");
        out.write("                                <input name=\"noPhone\" type=\"phone\" id=\"NameAccount\" class=\"form-control\" value=\"");
        out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${no.phone}", java.lang.String.class, (PageContext)_jspx_page_context, null));
        out.write("\">\n");
        out.write("                              </div>\n");
        out.write("                              <div class=\"form-group\">\n");
        out.write("                                <label for=\"NameAccount\">Địa chỉ</label>\n");
        out.write("                                <input name=\"noAdd\" type=\"text\" id=\"NameAccount\" class=\"form-control\" value=\"");
        out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${no.address}", java.lang.String.class, (PageContext)_jspx_page_context, null));
        out.write("\">\n");
        out.write("                              </div>\n");
        out.write("                            </fieldset>\n");
        out.write("                            <div class=\"modal-footer\">\n");
        out.write("                                <input type=\"submit\" class=\"btn btn-info\" value=\"Lưu thay đổi\" >\n");
        out.write("                            </div>\n");
        out.write("                        </form>\n");
        out.write("                    ");
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
}
