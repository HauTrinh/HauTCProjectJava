package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class listCartUser_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>JSP Page</title>\n");
      out.write("        <meta name=\"viewport\"\n");
      out.write("\t\tcontent=\"width=device-width, height=device-height, initial-scale=1.0, user-scalable=0, minimum-scale=1.0, maximum-scale=1.0\">\n");
      out.write("\t<link rel=\"icon\" type=\"image/png\" href=\"image/logoshop.jpg\" />\n");
      out.write("\n");
      out.write("\t<!-- Import lib -->\n");
      out.write("\t<link rel=\"stylesheet\" type=\"text/css\" href=\"https://cdnjs.cloudflare.com/ajax/libs/Chart.js/2.9.3/Chart.min.css\">\n");
      out.write("\t<link rel=\"stylesheet\" type=\"text/css\" href=\"fontawesome-free/css/all.min.css\">\n");
      out.write("\t<link href=\"https://fonts.googleapis.com/css2?family=Roboto&display=swap\" rel=\"stylesheet\">\n");
      out.write("\t<!-- End import lib -->\n");
      out.write("\n");
      out.write("\t<link rel=\"stylesheet\" type=\"text/css\" href=\"style/sell.css\">\n");
      out.write("</head>\n");
      out.write("\n");
      out.write("<body class=\"overlay-scrollbar\">\n");
      out.write("\t<!-- navbar -->\n");
      out.write("\t<div class=\"navbar\">\n");
      out.write("\t\t<!-- nav left -->\n");
      out.write("\t\t<ul class=\"navbar-nav\">\n");
      out.write("\t\t\t<li class=\"nav-item\">\n");
      out.write("\t\t\t\t<a class=\"nav-link\">\n");
      out.write("\t\t\t\t\t<i class=\"fas fa-bars\" onclick=\"collapseSidebar()\"></i>\n");
      out.write("\t\t\t\t</a>\n");
      out.write("\t\t\t</li>\n");
      out.write("\t\t\t<li class=\"nav-item\">\n");
      out.write("                            <a href=\"index.jsp\" class=\"logo\">SNEAKER</a>\n");
      out.write("\t\t\t</li>\n");
      out.write("\t\t</ul>\n");
      out.write("\t\t<!-- end nav left -->\n");
      out.write("\t\t<!-- form -->\n");
      out.write("\t\t<form class=\"navbar-search\">\n");
      out.write("\t\t\t<input type=\"text\" name=\"Search\" class=\"navbar-search-input\" placeholder=\"What you looking for...\">\n");
      out.write("\t\t\t<i class=\"fas fa-search\"></i>\n");
      out.write("\t\t</form>\n");
      out.write("\t\t<!-- end form -->\n");
      out.write("\t\t<!-- nav right -->\n");
      out.write("\t\t<ul class=\"navbar-nav nav-right\">\n");
      out.write("\t\t\t<li class=\"nav-item mode\">\n");
      out.write("\t\t\t\t<a class=\"nav-link\" href=\"#\" onclick=\"switchTheme()\">\n");
      out.write("\t\t\t\t\t<i class=\"fas fa-moon dark-icon\"></i>\n");
      out.write("\t\t\t\t\t<i class=\"fas fa-sun light-icon\"></i>\n");
      out.write("\t\t\t\t</a>\n");
      out.write("\t\t\t</li>\n");
      out.write("\t\t\t<li class=\"nav-item avt-wrapper\">\n");
      out.write("\t\t\t\t<div class=\"avt dropdown\">\n");
      out.write("\t\t\t\t\t<img src=\"image/chamsoc.png\" alt=\"User image\" class=\"dropdown-toggle\" data-toggle=\"user-menu\">\n");
      out.write("\t\t\t\t\t<ul id=\"user-menu\" class=\"dropdown-menu\">\n");
      out.write("\t\t\t\t\t\t");
      if (_jspx_meth_c_if_0(_jspx_page_context))
        return;
      out.write("\n");
      out.write("\t\t\t\t\t\t<li class=\"dropdown-menu-item\">\n");
      out.write("\t\t\t\t\t\t\t<a href=\"#\" class=\"dropdown-menu-link\">\n");
      out.write("\t\t\t\t\t\t\t\t<div>\n");
      out.write("\t\t\t\t\t\t\t\t\t<i class=\"fas fa-cog\"></i>\n");
      out.write("\t\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t\t\t<span>Settings</span>\n");
      out.write("\t\t\t\t\t\t\t</a>\n");
      out.write("\t\t\t\t\t\t</li>\n");
      out.write("\t\t\t\t\t\t<li class=\"dropdown-menu-item\">\n");
      out.write("\t\t\t\t\t\t\t<a href=\"#\" class=\"dropdown-menu-link\">\n");
      out.write("\t\t\t\t\t\t\t\t<div>\n");
      out.write("\t\t\t\t\t\t\t\t\t<i class=\"far fa-credit-card\"></i>\n");
      out.write("\t\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t\t\t<span>Payments</span>\n");
      out.write("\t\t\t\t\t\t\t</a>\n");
      out.write("\t\t\t\t\t\t</li>\n");
      out.write("\t\t\t\t\t\t<li class=\"dropdown-menu-item\">\n");
      out.write("\t\t\t\t\t\t\t<a href=\"#\" class=\"dropdown-menu-link\">\n");
      out.write("\t\t\t\t\t\t\t\t<div>\n");
      out.write("\t\t\t\t\t\t\t\t\t<i class=\"fas fa-spinner\"></i>\n");
      out.write("\t\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t\t\t<span>Projects</span>\n");
      out.write("\t\t\t\t\t\t\t</a>\n");
      out.write("\t\t\t\t\t\t</li>\n");
      out.write("\t\t\t\t\t\t<li class=\"dropdown-menu-item\">\n");
      out.write("\t\t\t\t\t\t\t<a href=\"#\" class=\"dropdown-menu-link\">\n");
      out.write("\t\t\t\t\t\t\t\t<div>\n");
      out.write("\t\t\t\t\t\t\t\t\t<i class=\"fas fa-sign-out-alt\"></i>\n");
      out.write("\t\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t\t\t<span>Logout</span>\n");
      out.write("\t\t\t\t\t\t\t</a>\n");
      out.write("\t\t\t\t\t\t</li>\n");
      out.write("\t\t\t\t\t</ul>\n");
      out.write("\t\t\t\t</div>\n");
      out.write("\t\t\t</li>\n");
      out.write("\t\t</ul>\n");
      out.write("\t\t<!-- end nav right -->\n");
      out.write("\t</div>\n");
      out.write("\t<!-- end navbar -->\n");
      out.write("\t<!-- sidebar -->\n");
      out.write("\t<div class=\"sidebar\">\n");
      out.write("\t\t<ul class=\"sidebar-nav\">\n");
      out.write("\t\t\t<li class=\"sidebar-nav-item\">\n");
      out.write("\t\t\t\t<a href=\"#\" class=\"sidebar-nav-link\">\n");
      out.write("\t\t\t\t\t<div>\n");
      out.write("\t\t\t\t\t\t<i class=\"fas fa-tachometer-alt\"></i>\n");
      out.write("\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t<span>\n");
      out.write("\t\t\t\t\t\tDashboard\n");
      out.write("\t\t\t\t\t</span>\n");
      out.write("\t\t\t\t</a>\n");
      out.write("\t\t\t</li>\n");
      out.write("\t\t\t<li class=\"sidebar-nav-item\">\n");
      out.write("\t\t\t\t<a href=\"seller\" class=\"sidebar-nav-link\">\n");
      out.write("\t\t\t\t\t<div>\n");
      out.write("\t\t\t\t\t\t<i class=\"fab fa-accusoft\"></i>\n");
      out.write("\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t<span>PRODUCT</span>\n");
      out.write("\t\t\t\t</a>\n");
      out.write("\t\t\t</li>\n");
      out.write("\t\t\t<li class=\"sidebar-nav-item\">\n");
      out.write("\t\t\t\t<a href=\"addproduct\" class=\"sidebar-nav-link\">\n");
      out.write("\t\t\t\t\t<div>\n");
      out.write("\t\t\t\t\t\t<i class=\"fas fa-tasks\"></i>\n");
      out.write("\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t<span>ADD PRODUCT</span>\n");
      out.write("\t\t\t\t</a>\n");
      out.write("\t\t\t</li>\n");
      out.write("\t\t\t");
      if (_jspx_meth_c_if_1(_jspx_page_context))
        return;
      out.write("\n");
      out.write("\t\t\t<li class=\"sidebar-nav-item\">\n");
      out.write("\t\t\t\t<a href=\"listCart\" class=\"sidebar-nav-link\">\n");
      out.write("\t\t\t\t\t<div>\n");
      out.write("\t\t\t\t\t\t<i class=\"fas fa-check-circle\"></i>\n");
      out.write("\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t<span>BILL</span>\n");
      out.write("\t\t\t\t</a>\n");
      out.write("\t\t\t</li>\n");
      out.write("\t\t\t<li class=\"sidebar-nav-item\">\n");
      out.write("\t\t\t\t<a href=\"#\" class=\"sidebar-nav-link\">\n");
      out.write("\t\t\t\t\t<div>\n");
      out.write("\t\t\t\t\t\t<i class=\"fas fa-bug\"></i>\n");
      out.write("\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t<span>Morbi</span>\n");
      out.write("\t\t\t\t</a>\n");
      out.write("\t\t\t</li>\n");
      out.write("\t\t\t<li class=\"sidebar-nav-item\">\n");
      out.write("\t\t\t\t<a href=\"#\" class=\"sidebar-nav-link\">\n");
      out.write("\t\t\t\t\t<div>\n");
      out.write("\t\t\t\t\t\t<i class=\"fas fa-chart-line\"></i>\n");
      out.write("\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t<span>Praesent</span>\n");
      out.write("\t\t\t\t</a>\n");
      out.write("\t\t\t</li>\n");
      out.write("\t\t\t<li class=\"sidebar-nav-item\">\n");
      out.write("\t\t\t\t<a href=\"#\" class=\"sidebar-nav-link\">\n");
      out.write("\t\t\t\t\t<div>\n");
      out.write("\t\t\t\t\t\t<i class=\"fas fa-book-open\"></i>\n");
      out.write("\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t<span>Pellentesque</span>\n");
      out.write("\t\t\t\t</a>\n");
      out.write("\t\t\t</li>\n");
      out.write("\t\t\t<li class=\"sidebar-nav-item\">\n");
      out.write("\t\t\t\t<a href=\"#\" class=\"sidebar-nav-link\">\n");
      out.write("\t\t\t\t\t<div>\n");
      out.write("\t\t\t\t\t\t<i class=\"fas fa-adjust\"></i>\n");
      out.write("\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t<span>Morbi</span>\n");
      out.write("\t\t\t\t</a>\n");
      out.write("\t\t\t</li>\n");
      out.write("\t\t\t<li class=\"sidebar-nav-item\">\n");
      out.write("\t\t\t\t<a href=\"#\" class=\"sidebar-nav-link\">\n");
      out.write("\t\t\t\t\t<div>\n");
      out.write("\t\t\t\t\t\t<i class=\"fab fa-algolia\"></i>\n");
      out.write("\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t<span>Praesent</span>\n");
      out.write("\t\t\t\t</a>\n");
      out.write("\t\t\t</li>\n");
      out.write("\t\t\t<li class=\"sidebar-nav-item\">\n");
      out.write("\t\t\t\t<a href=\"#\" class=\"sidebar-nav-link\">\n");
      out.write("\t\t\t\t\t<div>\n");
      out.write("\t\t\t\t\t\t<i class=\"fas fa-audio-description\"></i>\n");
      out.write("\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t<span>Pellentesque</span>\n");
      out.write("\t\t\t\t</a>\n");
      out.write("\t\t\t</li>\n");
      out.write("\t\t</ul>\n");
      out.write("\t</div>\n");
      out.write("\t<!-- end sidebar -->\n");
      out.write("\t<!-- main content -->\n");
      out.write("\t<div class=\"wrapper\">\n");
      out.write("\t\t<div class=\"row\">\n");
      out.write("\t\t\t<div class=\"col-8 col-m-12 col-sm-12\">\n");
      out.write("\t\t\t\t<div class=\"card\">\n");
      out.write("\t\t\t\t\t<div class=\"card-header\">\n");
      out.write("\t\t\t\t\t\t<h3>\n");
      out.write("\t\t\t\t\t\t\tTable\n");
      out.write("\t\t\t\t\t\t</h3>\n");
      out.write("\t\t\t\t\t\t<i class=\"fas fa-ellipsis-h\"></i>\n");
      out.write("\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t<div class=\"card-content\">\n");
      out.write("                                            <form action=\"listCart\" method=\"post\"> \n");
      out.write("\t\t\t\t\t\t<table>\n");
      out.write("\t\t\t\t\t\t\t<thead>\n");
      out.write("\t\t\t\t\t\t\t\t<tr>\n");
      out.write("\t\t\t\t\t\t\t\t\t<th>Img</th>\n");
      out.write("\t\t\t\t\t\t\t\t\t<th>Size</th>\n");
      out.write("\t\t\t\t\t\t\t\t\t<th>Name Product</th>\n");
      out.write("\t\t\t\t\t\t\t\t\t<th>Price</th>\n");
      out.write("                                                                        <th>amount</th>\n");
      out.write("                                                                        <th>UserName</th>\n");
      out.write("                                                                        <th>Tel</th>\n");
      out.write("\t\t\t\t\t\t\t\t</tr>\n");
      out.write("\t\t\t\t\t\t\t</thead>\n");
      out.write("\t\t\t\t\t\t\t<tbody>\n");
      out.write("                                                            ");
      if (_jspx_meth_c_forEach_0(_jspx_page_context))
        return;
      out.write("\n");
      out.write("\t\t\t\t\t\t\t</tbody>\n");
      out.write("\t\t\t\t\t\t</table>\n");
      out.write("                                                                        </form>\n");
      out.write("\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t</div>\n");
      out.write("\t\t\t</div>\n");
      out.write("\t\t\t<div class=\"col-4 col-m-12 col-sm-12\">\n");
      out.write("\t\t\t\t<div class=\"card\" >\n");
      out.write("\t\t\t\t\t<div class=\"card-header\">\n");
      out.write("\t\t\t\t\t\t<h3>\n");
      out.write("\t\t\t\t\t\t\tProgress bar\n");
      out.write("\t\t\t\t\t\t</h3>\n");
      out.write("\t\t\t\t\t\t<i class=\"fas fa-ellipsis-h\"></i>\n");
      out.write("\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t<div class=\"card-content\">\n");
      out.write("\t\t\t\t\t\t<div class=\"progress-wrapper\">\n");
      out.write("\t\t\t\t\t\t\t<p>\n");
      out.write("\t\t\t\t\t\t\t\tLess than 1 hour\n");
      out.write("\t\t\t\t\t\t\t\t<span class=\"float-right\">50%</span>\n");
      out.write("\t\t\t\t\t\t\t</p>\n");
      out.write("\t\t\t\t\t\t\t<div class=\"progress\">\n");
      out.write("\t\t\t\t\t\t\t\t<div class=\"bg-success\" style=\"width: 50%\"></div>\n");
      out.write("\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t<div class=\"progress-wrapper\">\n");
      out.write("\t\t\t\t\t\t\t<p>\n");
      out.write("\t\t\t\t\t\t\t\t1 - 3 hours\n");
      out.write("\t\t\t\t\t\t\t\t<span class=\"float-right\">60%</span>\n");
      out.write("\t\t\t\t\t\t\t</p>\n");
      out.write("\t\t\t\t\t\t\t<div class=\"progress\">\n");
      out.write("\t\t\t\t\t\t\t\t<div class=\"bg-primary\" style=\"width:60%\"></div>\n");
      out.write("\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t<div class=\"progress-wrapper\">\n");
      out.write("\t\t\t\t\t\t\t<p>\n");
      out.write("\t\t\t\t\t\t\t\tMore than 3 hours\n");
      out.write("\t\t\t\t\t\t\t\t<span class=\"float-right\">40%</span>\n");
      out.write("\t\t\t\t\t\t\t</p>\n");
      out.write("\t\t\t\t\t\t\t<div class=\"progress\">\n");
      out.write("\t\t\t\t\t\t\t\t<div class=\"bg-warning\" style=\"width:40%\"></div>\n");
      out.write("\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t<div class=\"progress-wrapper\">\n");
      out.write("\t\t\t\t\t\t\t<p>\n");
      out.write("\t\t\t\t\t\t\t\tMore than 6 hours\n");
      out.write("\t\t\t\t\t\t\t\t<span class=\"float-right\">20%</span>\n");
      out.write("\t\t\t\t\t\t\t</p>\n");
      out.write("\t\t\t\t\t\t\t<div class=\"progress\">\n");
      out.write("\t\t\t\t\t\t\t\t<div class=\"bg-danger\" style=\"width:20%\"></div>\n");
      out.write("\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t</div>\n");
      out.write("\t\t\t</div>\n");
      out.write("\t\t</div>\n");
      out.write("\t</div>\n");
      out.write("\t<!-- end main content -->\n");
      out.write("\t<!-- import script -->\n");
      out.write("\t<script src=\"https://cdnjs.cloudflare.com/ajax/libs/Chart.js/2.9.3/Chart.min.js\"></script>\n");
      out.write("\t<script src=\"js/index.js\"></script>\n");
      out.write("\t<!-- end import script -->\n");
      out.write("        </body>\n");
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
    _jspx_th_c_if_0.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${sessionScope.acc != null}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null)).booleanValue());
    int _jspx_eval_c_if_0 = _jspx_th_c_if_0.doStartTag();
    if (_jspx_eval_c_if_0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\n");
        out.write("\t\t\t\t\t\t<li class=\"dropdown-menu-item\">\n");
        out.write("\t\t\t\t\t\t\t<a class=\"dropdown-menu-link\">\n");
        out.write("\t\t\t\t\t\t\t\t<div>\n");
        out.write("\t\t\t\t\t\t\t\t\t<i class=\"fas fa-user-tie\"></i>\n");
        out.write("\t\t\t\t\t\t\t\t</div>\n");
        out.write("\t\t\t\t\t\t\t\t\n");
        out.write("                                                            <span>Profile ");
        out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${sessionScope.acc.username}", java.lang.String.class, (PageContext)_jspx_page_context, null));
        out.write("</span>\n");
        out.write("                                                                \n");
        out.write("                                                                    \n");
        out.write("\t\t\t\t\t\t\t</a>\n");
        out.write("\t\t\t\t\t\t</li>\n");
        out.write("                                                ");
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
    _jspx_th_c_if_1.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${sessionScope.acc.isAdmin == true}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null)).booleanValue());
    int _jspx_eval_c_if_1 = _jspx_th_c_if_1.doStartTag();
    if (_jspx_eval_c_if_1 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\n");
        out.write("\t\t\t<li class=\"sidebar-nav-item\">\n");
        out.write("\t\t\t\t<a href=\"listUser\" class=\"sidebar-nav-link\">\n");
        out.write("\t\t\t\t\t<div>\n");
        out.write("\t\t\t\t\t\t<i class=\"fas fa-spinner\"></i>\n");
        out.write("\t\t\t\t\t</div>\n");
        out.write("\t\t\t\t\t\n");
        out.write("                                    <span>MANAGER ADMIN</span>\n");
        out.write("                                           \n");
        out.write("\t\t\t\t</a>\n");
        out.write("\t\t\t</li>\n");
        out.write("                        ");
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
    _jspx_th_c_forEach_0.setItems((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${listCart}", java.lang.Object.class, (PageContext)_jspx_page_context, null));
    _jspx_th_c_forEach_0.setVar("cart");
    int[] _jspx_push_body_count_c_forEach_0 = new int[] { 0 };
    try {
      int _jspx_eval_c_forEach_0 = _jspx_th_c_forEach_0.doStartTag();
      if (_jspx_eval_c_forEach_0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("\n");
          out.write("                                                            <tr>\n");
          out.write("                                                                <td style=\"width: 200px\">\n");
          out.write("                                                                    <img src=\"");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${cart.image}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("\" alt=\"\" style=\"width: 200px\"/>\n");
          out.write("                                                                </td>\n");
          out.write("                                                                <td style=\"width: 100px;\">\n");
          out.write("                                                                    <h5 class=\"product-titles\" style=\"text-align: center;\">");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${cart.sizeProduct}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("</h5>\n");
          out.write("                                                                </td>\n");
          out.write("                                                                <td style=\"width: 100px;\">\n");
          out.write("                                                                   <h5 class=\"product-titles\" style=\"text-align: center;\">");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${cart.nameProduct}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("</h5>\n");
          out.write("                                                               </td>\n");
          out.write("                                                               <td style=\"width: 100px;\">\n");
          out.write("                                                                   <h5 class=\"product-titles\" style=\"text-align: center;\">");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${cart.price}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("</h5>\n");
          out.write("                                                               </td>\n");
          out.write("                                                               <td style=\"width: 100px;\">\n");
          out.write("                                                                   <h5 class=\"product-titles\" style=\"text-align: center;\">");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${cart.amount}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("</h5>\n");
          out.write("                                                               </td>\n");
          out.write("                                                               <td style=\"width: 100px;\">\n");
          out.write("                                                                   <h5 class=\"product-titles\" style=\"text-align: center;\">");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${cart.uName}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("</h5>\n");
          out.write("                                                               </td>\n");
          out.write("                                                               <td style=\"width: 100px;\">\n");
          out.write("                                                                   <h5 class=\"product-titles\" style=\"text-align: center;\">");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${cart.phone}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("</h5>\n");
          out.write("                                                               </td>\n");
          out.write("                                                               \n");
          out.write("                                                             </tr>\n");
          out.write("                                                             ");
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
