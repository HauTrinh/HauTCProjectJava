package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class checkout_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_c_forEach_var_items;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_c_set_var_value_nobody;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _jspx_tagPool_c_forEach_var_items = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_c_set_var_value_nobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
  }

  public void _jspDestroy() {
    _jspx_tagPool_c_forEach_var_items.release();
    _jspx_tagPool_c_set_var_value_nobody.release();
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
      out.write("    <head>\n");
      out.write("        <meta charset=\"UTF-8\">\n");
      out.write("        <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\n");
      out.write("        <meta http-equiv=\"X-UA-Compatible\" content=\"ie=edge\">\n");
      out.write("        <title>Shop Details</title>\n");
      out.write("\n");
      out.write("        <!-- Google Font -->\n");
      out.write("        <link href=\"https://fonts.googleapis.com/css2?family=Cairo:wght@200;300;400;600;900&display=swap\" rel=\"stylesheet\">\n");
      out.write("\n");
      out.write("        <!-- Css Styles -->\n");
      out.write("        <link href=\"https://cdnjs.cloudflare.com/ajax/libs/mdb-ui-kit/6.0.0/mdb.min.css\" rel=\"stylesheet\" />\n");
      out.write("        <link rel=\"stylesheet\" href=\"assets/css/bootstrap.min.css\" type=\"text/css\">\n");
      out.write("        <link rel=\"stylesheet\" href=\"assets/css/font-awesome.min.css\" type=\"text/css\">\n");
      out.write("        <link rel=\"stylesheet\" href=\"assets/css/elegant-icons.css\" type=\"text/css\">\n");
      out.write("        <link rel=\"stylesheet\" href=\"assets/css/nice-select.css\" type=\"text/css\">\n");
      out.write("        <link rel=\"stylesheet\" href=\"assets/css/jquery-ui.min.css\" type=\"text/css\">\n");
      out.write("        <link rel=\"stylesheet\" href=\"assets/css/owl.carousel.min.css\" type=\"text/css\">\n");
      out.write("        <link rel=\"stylesheet\" href=\"assets/css/slicknav.min.css\" type=\"text/css\">\n");
      out.write("        <link rel=\"stylesheet\" href=\"assets/css/style.css\" type=\"text/css\">\n");
      out.write("    </head>\n");
      out.write("\n");
      out.write("    <body>\n");
      out.write("\n");
      out.write("        <!-- Page Preloder -->\n");
      out.write("  \n");
      out.write("            <!-- Header Section End -->\n");
      out.write("\n");
      out.write("            <!-- Hero Section Begin -->\n");
      out.write("            <section class=\"hero hero-normal\">\n");
      out.write("                <div class=\"container\">\n");
      out.write("                    <div class=\"row\">\n");
      out.write("                        <div class=\"col-lg-3\">\n");
      out.write("                            <div class=\"hero__categories\">\n");
      out.write("                                <div class=\"hero__categories__all\">\n");
      out.write("                                    <i class=\"fa fa-bars\"></i>\n");
      out.write("                                    <span>Danh mục</span>\n");
      out.write("                                </div>\n");
      out.write("                                <ul>\n");
      out.write("                                    <li><a href=\"#\">Nam</a></li>\n");
      out.write("                                    <li><a href=\"#\">Nữ</a></li>\n");
      out.write("                                    <li><a href=\"#\">Quần</a></li>\n");
      out.write("                                    <li><a href=\"#\">Áo</a></li>\n");
      out.write("                                    <li><a href=\"#\">Váy</a></li>\n");
      out.write("                                    <li><a href=\"#\">Áo khoác</a></li>\n");
      out.write("                                    <li><a href=\"#\">Giày dép</a></li>\n");
      out.write("                                </ul>\n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("                        <div class=\"col-lg-9\">\n");
      out.write("                            <div class=\"hero__search\">\n");
      out.write("                                <div class=\"hero__search__form\">\n");
      out.write("                                    <form action=\"#\">\n");
      out.write("                                        <div class=\"hero__search__categories\">\n");
      out.write("                                            Danh mục\n");
      out.write("                                            <span class=\"arrow_carrot-down\"></span>\n");
      out.write("                                        </div>\n");
      out.write("                                        <input type=\"text\" placeholder=\"What do yo u need?\">\n");
      out.write("                                        <button type=\"submit\" class=\"site-btn\">Tìm kiếm</button>\n");
      out.write("                                    </form>\n");
      out.write("                                </div>\n");
      out.write("                                <div class=\"hero__search__phone\">\n");
      out.write("                                    <div class=\"hero__search__phone__icon\">\n");
      out.write("                                        <i class=\"fa fa-phone\"></i>\n");
      out.write("                                    </div>\n");
      out.write("                                    <div class=\"hero__search__phone__text\">\n");
      out.write("                                        <h5>+84 9841 2548</h5>\n");
      out.write("                                        <span>support 24/7 time</span>\n");
      out.write("                                    </div>\n");
      out.write("                                </div>\n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("            </section>\n");
      out.write("            <!-- Hero Section End -->\n");
      out.write("\n");
      out.write("            <!-- Breadcrumb Section Begin -->\n");
      out.write("            <section class=\"breadcrumb-section set-bg\">\n");
      out.write("                <div class=\"container\">\n");
      out.write("                    <div class=\"row\">\n");
      out.write("                        <div class=\"col-lg-12 text-center\">\n");
      out.write("                            <div class=\"breadcrumb__text\">\n");
      out.write("                                <h2>Checkout</h2>\n");
      out.write("                                <div class=\"breadcrumb__option\">\n");
      out.write("                                    <a href=\"./index.html\">Home</a>\n");
      out.write("\n");
      out.write("                                    <span>Checkout</span>\n");
      out.write("                                </div>\n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("            </section>\n");
      out.write("            <!-- Breadcrumb Section End -->\n");
      out.write("\n");
      out.write("            <form action=\"order\" >\n");
      out.write("            <!-- Checkout Section Begin -->\n");
      out.write("            <section class=\"checkout spad\">\n");
      out.write("                <div class=\"container\">\n");
      out.write("                    <div class=\"row\">\n");
      out.write("                        <div class=\"col-lg-12\">\n");
      out.write("                            <h6><span class=\"icon_tag_alt\"></span> Have a coupon? <a href=\"#\">Click here</a> to enter your code\n");
      out.write("                            </h6>\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                    <div class=\"checkout__form\">\n");
      out.write("                        <h4>Chi tiết hóa đơn</h4>\n");
      out.write("                            <div class=\"row\">\n");
      out.write("                                <div class=\"col-lg-8 col-md-6\">\n");
      out.write("                                    <div class=\"checkout__input\">\n");
      out.write("                                        <p>Tên<span>*</span></p>\n");
      out.write("                                        <input type=\"text\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${custom.customerName}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\" readonly>\n");
      out.write("                                    </div>\n");
      out.write("\n");
      out.write("                                    <div class=\"checkout__input\">\n");
      out.write("                                        <p>Địa chỉ<span>*</span></p>\n");
      out.write("                                        <input type=\"text\" placeholder=\"Street Address\" name=\"address\" class=\"checkout__input__add\"  value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${custom.customerAddress}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\" readonly>\n");
      out.write("\n");
      out.write("                                    </div>\n");
      out.write("                                    <div class=\"checkout__input\">\n");
      out.write("                                        <p>Số điện thoại<span>*</span></p>\n");
      out.write("                                        <input type=\"text\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${custom.phone}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\" readonly>\n");
      out.write("                                    </div>\n");
      out.write("                                    <div class=\"checkout__input\">\n");
      out.write("                                        <p>Email<span>*</span></p>\n");
      out.write("                                        <input type=\"text\">\n");
      out.write("                                    </div>\n");
      out.write("\n");
      out.write("                                    <div class=\"checkout__input__checkbox\">\n");
      out.write("                                        <label for=\"diff-acc\">\n");
      out.write("                                            Ship to a different address?\n");
      out.write("                                            <input type=\"checkbox\" id=\"diff-acc\">\n");
      out.write("                                            <span class=\"checkmark\"></span>\n");
      out.write("                                        </label>\n");
      out.write("                                    </div>\n");
      out.write("                                    <div class=\"checkout__input\">\n");
      out.write("                                        <p>Order notes<span>*</span></p>\n");
      out.write("                                        <input type=\"text\"\n");
      out.write("                                               placeholder=\"Notes about your order, e.g. special notes for delivery.\">\n");
      out.write("                                    </div>\n");
      out.write("                                </div>\n");
      out.write("                                \n");
      out.write("                                <div class=\"col-lg-4 col-md-6\">\n");
      out.write("                                    <div class=\"checkout__order\">\n");
      out.write("                                        <h4>Đơn hàng của bạn</h4>\n");
      out.write("                                        \n");
      out.write("                                        <div class=\"checkout__order__products\">Sản phẩm <span>Tổng</span></div>\n");
      out.write("                                    ");
      if (_jspx_meth_c_set_0(_jspx_page_context))
        return;
      out.write("\n");
      out.write("                                        ");
      if (_jspx_meth_c_forEach_0(_jspx_page_context))
        return;
      out.write("    \n");
      out.write("                                        <div class=\"checkout__order__subtotal\">Phí ship <span>0đ</span></div>\n");
      out.write("                                        <div class=\"checkout__order__total\">Tổng <span>");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${total}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("</span></div>\n");
      out.write("                                        <div class=\"checkout__input__checkbox\">\n");
      out.write("                                             \n");
      out.write("                                        </div>\n");
      out.write("\n");
      out.write("                                        <div class=\"checkout__input__checkbox\" >\n");
      out.write("                                            <label for=\"payment\">\n");
      out.write("                                                Ship Cod\n");
      out.write("                                                <input type=\"checkbox\" id=\"payment\" name=\"pay\" value=\"Ship Cod\">\n");
      out.write("                                                <span class=\"checkmark\"></span>\n");
      out.write("                                            </label>\n");
      out.write("                                        </div>\n");
      out.write("<!--                                        <div class=\"checkout__input__checkbox\">\n");
      out.write("                                            <label for=\"paypal\">\n");
      out.write("                                                Paypal\n");
      out.write("                                                <input type=\"checkbox\" id=\"paypal\" name=\"pay\">\n");
      out.write("                                                <span class=\"checkmark\"></span>\n");
      out.write("                                            </label>\n");
      out.write("                                        </div>-->\n");
      out.write("                                        <button type=\"submit\" class=\"site-btn\">Đặt hàng</button>\n");
      out.write("                                    </div>\n");
      out.write("                                </div>   \n");
      out.write("                            </div>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("            </section>\n");
      out.write("            <!-- Checkout Section End -->\n");
      out.write("</form>\n");
      out.write("            <!-- Footer Section Begin -->\n");
      out.write("            ");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "Footer.jsp", out, false);
      out.write("\n");
      out.write("            <!-- Footer Section End -->\n");
      out.write("\n");
      out.write("            <!-- Js Plugins -->\n");
      out.write("            <script type=\"text/javascript\" src=\"https://cdnjs.cloudflare.com/ajax/libs/mdb-ui-kit/6.0.0/mdb.min.js\"></script>\n");
      out.write("            <script src=\"assets/js/jquery-3.3.1.min.js\"></script>\n");
      out.write("            <script src=\"assets/js/bootstrap.min.js\"></script>\n");
      out.write("            <script src=\"assets/js/jquery.nice-select.min.js\"></script>\n");
      out.write("            <script src=\"assets/js/jquery-ui.min.js\"></script>\n");
      out.write("            <script src=\"assets/js/jquery.slicknav.js\"></script>\n");
      out.write("            <script src=\"assets/js/mixitup.min.js\"></script>\n");
      out.write("            <script src=\"assets/js/owl.carousel.min.js\"></script>\n");
      out.write("            <script src=\"assets/js/main.js\"></script>\n");
      out.write("        </body>\n");
      out.write("\n");
      out.write("    </html>\n");
      out.write("\n");
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

  private boolean _jspx_meth_c_set_0(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:set
    org.apache.taglibs.standard.tag.rt.core.SetTag _jspx_th_c_set_0 = (org.apache.taglibs.standard.tag.rt.core.SetTag) _jspx_tagPool_c_set_var_value_nobody.get(org.apache.taglibs.standard.tag.rt.core.SetTag.class);
    _jspx_th_c_set_0.setPageContext(_jspx_page_context);
    _jspx_th_c_set_0.setParent(null);
    _jspx_th_c_set_0.setVar("total");
    _jspx_th_c_set_0.setValue(new String("0"));
    int _jspx_eval_c_set_0 = _jspx_th_c_set_0.doStartTag();
    if (_jspx_th_c_set_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_set_var_value_nobody.reuse(_jspx_th_c_set_0);
      return true;
    }
    _jspx_tagPool_c_set_var_value_nobody.reuse(_jspx_th_c_set_0);
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
    _jspx_th_c_forEach_0.setItems((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${listCheckout}", java.lang.Object.class, (PageContext)_jspx_page_context, null));
    _jspx_th_c_forEach_0.setVar("c");
    int[] _jspx_push_body_count_c_forEach_0 = new int[] { 0 };
    try {
      int _jspx_eval_c_forEach_0 = _jspx_th_c_forEach_0.doStartTag();
      if (_jspx_eval_c_forEach_0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("\n");
          out.write("                                            ");
          if (_jspx_meth_c_set_1((javax.servlet.jsp.tagext.JspTag) _jspx_th_c_forEach_0, _jspx_page_context, _jspx_push_body_count_c_forEach_0))
            return true;
          out.write("\n");
          out.write("                                        <ul>\n");
          out.write("                                            <li>");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${c.productName}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write('x');
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${c.amount}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write(" <span>");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${c.total}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("</span></li>\n");
          out.write("                                            <input name=\"orid\" value=\"");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${c.cartID}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("\" hidden>\n");
          out.write("                                            <input name=\"total\" value=\"");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${c.total}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("\" hidden>\n");
          out.write("                                        </ul>\n");
          out.write("                                        ");
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

  private boolean _jspx_meth_c_set_1(javax.servlet.jsp.tagext.JspTag _jspx_th_c_forEach_0, PageContext _jspx_page_context, int[] _jspx_push_body_count_c_forEach_0)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:set
    org.apache.taglibs.standard.tag.rt.core.SetTag _jspx_th_c_set_1 = (org.apache.taglibs.standard.tag.rt.core.SetTag) _jspx_tagPool_c_set_var_value_nobody.get(org.apache.taglibs.standard.tag.rt.core.SetTag.class);
    _jspx_th_c_set_1.setPageContext(_jspx_page_context);
    _jspx_th_c_set_1.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_forEach_0);
    _jspx_th_c_set_1.setVar("total");
    _jspx_th_c_set_1.setValue((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${total + c.total}", java.lang.Object.class, (PageContext)_jspx_page_context, null));
    int _jspx_eval_c_set_1 = _jspx_th_c_set_1.doStartTag();
    if (_jspx_th_c_set_1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_set_var_value_nobody.reuse(_jspx_th_c_set_1);
      return true;
    }
    _jspx_tagPool_c_set_var_value_nobody.reuse(_jspx_th_c_set_1);
    return false;
  }
}
