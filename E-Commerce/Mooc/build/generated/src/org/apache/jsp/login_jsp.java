package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class login_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html lang=\"en\">\n");
      out.write("    <head>\n");
      out.write("        <meta charset=\"UTF-8\">\n");
      out.write("        <meta http-equiv=\"X-UA-Compatible\" content=\"IE=edge\">\n");
      out.write("        <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\n");
      out.write("        <meta charset=\"UTF-8\">\n");
      out.write("        <meta http-equiv=\"X-UA-Compatible\" content=\"IE=edge\">\n");
      out.write("        <!--icon-->\n");
      out.write("        <link href=\"https://fonts.googleapis.com/icon?family=Material+Icons\" rel=\"stylesheet\">\n");
      out.write("        <link rel=\"stylesheet\" href=\"https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css\">\n");
      out.write("        <!--icon-->\n");
      out.write("        <!--bootstrap-->\n");
      out.write("        <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\n");
      out.write("        <link rel=\"stylesheet\" href=\"https://cdn.jsdelivr.net/npm/bootstrap@4.0.0/dist/css/bootstrap.min.css\" \n");
      out.write("              integrity=\"sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm\" crossorigin=\"anonymous\">\n");
      out.write("        <!--bootstrap-->\n");
      out.write("        <!--Css-->\n");
      out.write("        <link rel=\"stylesheet\" href=\"css/login.css\">\n");
      out.write("        <!--Css-->\n");
      out.write("        <!--JSV-->\n");
      out.write("        <script src=\"https://kit.fontawesome.com/3aa40a242b.js\" crossorigin=\"anonymous\"></script>\n");
      out.write("        <script src=\"https://code.jquery.com/jquery-3.2.1.slim.min.js\" integrity=\"sha384-KJ3o2DKtIkvYIK3UENzmM7KCkRr/rE9/Qpg6aAZGJwFDMVNA/GpGFF93hXpG5KkN\" crossorigin=\"anonymous\"></script>\n");
      out.write("        <script src=\"https://cdn.jsdelivr.net/npm/popper.js@1.12.9/dist/umd/popper.min.js\" integrity=\"sha384-ApNbgh9B+Y1QKtv3Rn7W3mgPxhU9K/ScQsAP7hUibX39j7fakFPskvXusvfa0b4Q\" crossorigin=\"anonymous\"></script>\n");
      out.write("        <script src=\"https://cdn.jsdelivr.net/npm/bootstrap@4.0.0/dist/js/bootstrap.min.js\" integrity=\"sha384-JZR6Spejh4U02d8jOt6vLEHfe/JQGiRRSQQxSfFWpi1MquVdAyjUar5+76PVCmYl\" crossorigin=\"anonymous\"></script>\n");
      out.write("        <!--JSV-->\n");
      out.write("        <!--style form-->\n");
      out.write("        <link rel=\"preconnect\" href=\"https://fonts.googleapis.com\">\n");
      out.write("        <link rel=\"preconnect\" href=\"https://fonts.gstatic.com\" crossorigin>\n");
      out.write("        <link href=\"https://fonts.googleapis.com/css2?family=Nunito+Sans:wght@200&display=swap\" rel=\"stylesheet\">\n");
      out.write("        <!--style form-->\n");
      out.write("        <title>Đăng nhập</title>\n");
      out.write("        <style>\n");
      out.write("            body {\n");
      out.write("                background-image: url(https://images.unsplash.com/photo-1464618663641-bbdd760ae84a?ixlib=rb-1.2.1&ixid=MnwxMjA3fDB8MHxwaG90by1wYWdlfHx8fGVufDB8fHx8&auto=format&fit=crop&w=1170&q=80);\n");
      out.write("                background-position: center;\n");
      out.write("                background-size: cover;\n");
      out.write("            }\n");
      out.write("        </style>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("\n");
      out.write("        <!--nav bar-->\n");
      out.write("        <div class=\"top-login\">\n");
      out.write("            <nav class=\"navbar navbar-expand-lg navbar-dark bg-dark\">\n");
      out.write("\n");
      out.write("                <div class=\"collapse navbar-collapse\" id=\"navbarSupportedContent\">\n");
      out.write("                    <ul class=\"navbar-nav mr-auto\">\n");
      out.write("                        <li class=\"nav-item active\">\n");
      out.write("                            <a style=\"margin-left: 50px\" class=\"nav-link\" href=\"HomeControl\">Trang chủ <span class=\"sr-only\">(current)</span></a>\n");
      out.write("                        </li>\n");
      out.write("                    </ul>\n");
      out.write("                </div>\n");
      out.write("            </nav>\n");
      out.write("        </div>\n");
      out.write("        <!--nav bar-->\n");
      out.write("        <!--form đăng nhập-->\n");
      out.write("        <div>\n");
      out.write("            <div class=\"login\">\n");
      out.write("                <div class=\"content-login\" style=\"margin-top: 5%;text-align: center; color: rgb(77, 77, 77);\">\n");
      out.write("                    <h3>Đăng nhập</h3>\n");
      out.write("                </div>\n");
      out.write("                <div class=\"login-form border border-primary\" style=\"margin: 2% 30%;\n");
      out.write("                    padding: 2% 2%;\n");
      out.write("                    box-shadow: 0 5px 20px rgba(105, 105, 105, 0.845);\n");
      out.write("                    background-color: rgba(255, 255, 255, 0.8);\">\n");
      out.write("                    <form action=\"login\" method=\"post\">\n");
      out.write("                        <label for=\"exampleInputEmail1\">Tên tài khoản</label>\n");
      out.write("                        <div class=\"input-box\">\n");
      out.write("                            <input  type=\"text\" class=\"username\" id=\"exampleInputAcount1\" aria-describedby=\"account\" placeholder=\"...\" name=\"account\">\n");
      out.write("                        </div>\n");
      out.write("\n");
      out.write("                        <label for=\"exampleInputPassword1\">Mật khẩu</label>\n");
      out.write("                        <div class=\"input-box\">\n");
      out.write("                            <input class=\"password\" placeholder=\"...\" type=\"password\" name=\"pass\" id=\"myInput\">\n");
      out.write("                            <span class=\"eye\" onclick=\"myFunction()\">\n");
      out.write("                                <i class=\"fa-solid fa-eye\" id=\"show\"></i>\n");
      out.write("                                <i class=\"fa-sharp fa-solid fa-eye-slash\" id=\"hide\"></i>\n");
      out.write("                            </span>\n");
      out.write("                        </div>\n");
      out.write("                        <p class=\"text-danger\" style=\" font-size: 1.2em\">");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${mess}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("</p>\n");
      out.write("                        <div class=\"form-group\" style=\"text-align: right; margin-top: 5%;\">\n");
      out.write("                            <small id=\"accountHelp\" class=\"form-text text-muted\"><a style=\"font-size: 1.5em\" href=\"take_email.jsp\">Quên mật khẩu ?</a></small> \n");
      out.write("                        </div>\n");
      out.write("                        <div class=\"\" style=\" text-align: center;\">\n");
      out.write("                            <input style=\"font-size: 1.2em; padding-left: 20px; padding-right: 20px\" type=\"submit\" class=\"btn btn-primary \" value=\"Login\">\n");
      out.write("                        </div>\n");
      out.write("                        <div class=\"form-group\" style=\"text-align: center; margin-top: 5%;\">\n");
      out.write("                            <h6 style=\"font-size: 1.5em;\">Đăng ký tài khoản</h6>\n");
      out.write("                            <a style=\"font-size: 1.5em\" href=\"register.jsp\">NGƯỜI DÙNG MỚI</a>\n");
      out.write("                        </div>\n");
      out.write("                        <!--social-->\n");
      out.write("                        <div class=\"\" style=\"text-align: center ; margin-top: 2%;\">\n");
      out.write("                            <small id=\"accountHelp\" class=\"form-text text-muted\" style=\"padding-bottom: 2%; font-size: 1em;\">Hoặc đăng nhập bằng</small> \n");
      out.write("                            <div class=\"social-login\">\n");
      out.write("\n");
      out.write("                                <fb:login-button size=\"xlarge\" scope=\"public_profile,email\" onlogin=\"checkLoginState();\" ></fb:login-button>\n");
      out.write("\n");
      out.write("                                <a href=\"https://accounts.google.com/o/oauth2/auth?scope=email&redirect_uri=http://localhost:8080/MoocProject/LoginGoogleHandler&response_type=code&client_id=1048107053599-ep3rpeid2clmq59qlqtrr8nhh29520dg.apps.googleusercontent.com&approval_prompt=force\"><i class=\"fa-brands fa-google\" style=\"font-size: 250%; padding-left: 15px\"></i></a>\n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("                        <!--social-->\n");
      out.write("                    </form>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("\n");
      out.write("        <script>\n");
      out.write("            // This is called with the results from from FB.getLoginStatus().\n");
      out.write("            function statusChangeCallback(response) {\n");
      out.write("                console.log('statusChangeCallback');\n");
      out.write("                console.log(response);\n");
      out.write("                console.log(response.authResponse.accessToken);\n");
      out.write("                alert(response.authResponse.accessToken);\n");
      out.write("                if (response.status === 'connected') {\n");
      out.write("                    window.location.href = 'register_loginFB.jsp?access_token=' + response.authResponse.accessToken;\n");
      out.write("                } else {\n");
      out.write("                    // The person is not logged into your app or we are unable to tell.\n");
      out.write("                    document.getElementById('status').innerHTML = 'Please log ' +\n");
      out.write("                            'into this app.';\n");
      out.write("                }\n");
      out.write("            }\n");
      out.write("            // This function is called when someone finishes with the Login\n");
      out.write("            // Button. See the onlogin handler attached to it in the sample\n");
      out.write("            // code below.\n");
      out.write("            function checkLoginState() {\n");
      out.write("                FB.getLoginStatus(function (response) {\n");
      out.write("                    statusChangeCallback(response);\n");
      out.write("                });\n");
      out.write("            }\n");
      out.write("            window.fbAsyncInit = function () {\n");
      out.write("                FB.init({\n");
      out.write("                    appId: '783989646013292',\n");
      out.write("                    cookie: true, // enable cookies to allow the server to access \n");
      out.write("                    // the session\n");
      out.write("                    xfbml: true, // parse social plugins on this page\n");
      out.write("                    version: 'v2.8' // use graph api version 2.8\n");
      out.write("                });\n");
      out.write("                FB.getLoginStatus(function (response) {\n");
      out.write("                    statusChangeCallback(response);\n");
      out.write("                });\n");
      out.write("            };\n");
      out.write("            // Load the SDK asynchronously\n");
      out.write("            (function (d, s, id) {\n");
      out.write("                var js, fjs = d.getElementsByTagName(s)[0];\n");
      out.write("                if (d.getElementById(id))\n");
      out.write("                    return;\n");
      out.write("                js = d.createElement(s);\n");
      out.write("                js.id = id;\n");
      out.write("                js.src = \"https://connect.facebook.net/en_US/sdk.js\";\n");
      out.write("                fjs.parentNode.insertBefore(js, fjs);\n");
      out.write("            }(document, 'script', 'facebook-jssdk'));\n");
      out.write("        </script>\n");
      out.write("        <script>\n");
      out.write("            function myFunction() {\n");
      out.write("                var x = document.getElementById(\"myInput\");\n");
      out.write("                var y = document.getElementById(\"show\");\n");
      out.write("                var z = document.getElementById(\"hide\");\n");
      out.write("\n");
      out.write("                if (x.type === 'password') {\n");
      out.write("                    x.type = \"text\";\n");
      out.write("                    y.style.display = \"none\";\n");
      out.write("                    z.style.display = \"block\";\n");
      out.write("                } else {\n");
      out.write("                    x.type = \"password\";\n");
      out.write("                    y.style.display = \"block\";\n");
      out.write("                    z.style.display = \"none\";\n");
      out.write("                }\n");
      out.write("            }\n");
      out.write("\n");
      out.write("\n");
      out.write("        </script>\n");
      out.write("        <!--form đăng nhập-->\n");
      out.write("    </body>\n");
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
}
