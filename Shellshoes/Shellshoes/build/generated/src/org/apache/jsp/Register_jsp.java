package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class Register_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
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
      out.write("    <link href=\"css/bootstrap.css\" rel=\"stylesheet\">\n");
      out.write("    <link href=\"css/userregister.css\" rel=\"stylesheet\">\n");
      out.write("\n");
      out.write("</head>\n");
      out.write("\n");
      out.write("<body>\n");
      out.write("    <div class=\"container\">\n");
      out.write("        <h3>Register</h3>\n");
      out.write("        <form action=\"Register\" method=\"post\">\n");
      out.write("            <label>User Name:</label><br>\n");
      out.write("            <input name=\"name\" type=\"text\" value=\"\"><br>\n");
      out.write("            <datalist id=\"list\">\n");
      out.write("                <option value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${list.username}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\">\n");
      out.write("            </datalist>\n");
      out.write("\n");
      out.write("            <label>Password:</label><br>\n");
      out.write("            <input name=\"pass\" type=\"password\" value=\"\"><br>\n");
      out.write("            \n");
      out.write("            <label>Full Name:</label><br>\n");
      out.write("            <input name=\"fullname\" type=\"text\" value=\"\"><br>\n");
      out.write("\n");
      out.write("            <label>Birthday:</label><br>\n");
      out.write("            <input name=\"birthday\" type=\"date\" value=\"\" id=\"birthday\"><br>\n");
      out.write("\n");
      out.write("            <label>Number Phone:</label><br>\n");
      out.write("            <input name=\"phone\" type=\"tel\" value=\"\" pattern=\"[0-9]{3}[0-9]{4}[0-9]{3}\"><br>\n");
      out.write("\n");
      out.write("            <label>Email:</label><br>\n");
      out.write("            <input name=\"mail\" type=\"email\" value=\"\"><br>\n");
      out.write("\n");
      out.write("            <div id=\"captchaBackground\">\n");
      out.write("                <canvas id=\"captcha\">captcha text</canvas>\n");
      out.write("                <input id=\"textBox\" type=\"text\" name=\"text\">\n");
      out.write("                <div id=\"buttons\">\n");
      out.write("                    <button id=\"refreshButton\" type=\"submit\">Refresh</button>\n");
      out.write("                </div>\n");
      out.write("                <span id=\"output\"></span>\n");
      out.write("            </div>\n");
      out.write("    </div>\n");
      out.write("    <script src=\"js/scriptcaptcha.js\"></script>\n");
      out.write("    <input id=\"Register\" type=\"submit\" name=\"submit\" value=\"Register\" />\n");
      out.write("\n");
      out.write("    </form>\n");
      out.write("             <script>\n");
      out.write("       function validation(){\n");
      out.write("           var user = document.getElementsByName(\"name\");\n");
      out.write("                if(user.value.length <= 20 && user.value.length >= 3){\n");
      out.write("                }\n");
      out.write("                else{\n");
      out.write("                    alert(\"Username has to be between 3-20 characters.\")\n");
      out.write("                 }\n");
      out.write("                //duplication data list\n");
      out.write("                var user = document.getElementsByName(\"name\");\n");
      out.write("                if(user.value == list.value){\n");
      out.write("                }\n");
      out.write("                else{\n");
      out.write("                    alert(\"Username already exists.\")\n");
      out.write("                 }\n");
      out.write("       }\n");
      out.write("    </script>\n");
      out.write("    </div>\n");
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
}
