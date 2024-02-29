package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import model.Size;
import java.util.ArrayList;
import model.Product;
import model.Cart;

public final class buy_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("        <link rel=\"stylesheet\" href=\"style/Giohang.css\">\n");
      out.write("        <link rel=\"stylesheet\" href=\"style/product.css\">\n");
      out.write("        <link href='https://unpkg.com/boxicons@2.1.2/css/boxicons.min.css' rel='stylesheet'>\n");
      out.write("        <title>Document</title>\n");
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
      out.write("       <div class=\"h1-g\">\n");
      out.write("\t\t\t\t<div class=\"title\">\n");
      out.write("\t\t\t\t\t<h1>Giao Hàng tận tay người dùng</h1>\n");
      out.write("\t\t\t\t\t<p id=\"p1\" style=\"font-size: 20px;\">Với chất lượng nông sản sạch và an toàn nhất</p>\n");
      out.write("\t\t\t\t</div>\n");
      out.write("\t\t\t\t<div style=\"margin-top: 30px;\">\n");
      out.write("\t\t\t\t\t<button type=\"button\" class=\"btn btn-success\" style=\"border-radius: 10px;line-height: 40px;\">Mua Ngay</button>\n");
      out.write("\t\t\t\t</div>\n");
      out.write("\t\t\t</div>\n");
      out.write("\t\t\t<!------------------------------------------------------------------------>\n");
      out.write("\t\t\t<!------------------------------  Tieu de ----------------------------------\n");
      out.write("\t\t\t<!---------------------------------- End tieu de   ------------------------------->\n");
      out.write("\t\t\t\n");
      out.write("\t\t\t<div style=\"margin-left: 120px;font-size: 20px;color: green;\">\n");
      out.write("\t\t\t\t<span>GIỎ HÀNG</span>\n");
      out.write("\t\t\t\t<hr>\n");
      out.write("\t\t\t</div>\n");
      out.write("                        <div class=\"card-content\" style=\"display: flex;\">\n");
      out.write("\t           <table class=\"table\" style=\"width: 700px;margin-left: 120px;margin-bottom: 100px;\">\n");
      out.write("                       <thead>\n");
      out.write("                           <tr >\n");
      out.write("                              <th scope=\"col\">Hình ảnh</th>\n");
      out.write("                              <th scope=\"col\">Size</th>\n");
      out.write("                              <th scope=\"col\">name</th>\n");
      out.write("                              <th scope=\"col\">Giá</th>\n");
      out.write("                              <th scope=\"col\">Xóa</th>\n");
      out.write("                           </tr>\n");
      out.write("                       </thead>\n");
      out.write("                       <tbody>\n");
      out.write("                          ");

                                    Cart cart=(Cart)session.getAttribute("gio"); 

                                    if(cart!=null){
                                        Product db=new Product();
                                        
                                            
      out.write("\n");
      out.write("                                                <tr>\n");
      out.write("                                                    <td>");
      out.print( db);
      out.write("</td>\n");
      out.write("                                                </tr>\n");
      out.write("                                            ");

                                        }
                                
      out.write("\n");
      out.write("                       </tbody>\n");
      out.write("\t\t   </table>\n");
      out.write("                      <script>\n");
      out.write("\t\t\t\t\tfunction deleteCart(pID, sizeId) {\n");
      out.write("\t\t\t\t\t\tvar ctx = \"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${pageContext.request.contextPath}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\"\n");
      out.write("\t\t\t\t\t\tlocation.href = ctx + \"/DeleteCart?pID=\" + pID + \"&sizeId=\" +sizeId;\n");
      out.write("\t\t\t\t\t}\n");
      out.write("\t\t\t\t\t</script>\n");
      out.write("                                        <div class=\"totalprice\" style=\"margin-top: 50px;\">\n");
      out.write("                                            <h2 style=\"color: #000; font-size: 50px;\">Total Price :<span style=\"color: red\">");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${totalPrice}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write(" VND</span></h2>\n");
      out.write("                                            <button class=\"btn btn-success\">Thanh toán</button>\n");
      out.write("                                            <button class=\"btn btn-danger\" data-toggle=\"modal\" data-target=\"#modal-delete-all\" ><a href=\"#\">Xóa tất cả</a></button>\n");
      out.write("                                        </div>\n");
      out.write("                                       \n");
      out.write("\t\t\t</div>\n");
      out.write("\t\t\t\n");
      out.write("\n");
      out.write("\t\t\t<!-- The Modal -->\n");
      out.write("\t\t\t  <div class=\"modal fade\" id=\"modal-delete\" style=\"padding-top: 200px;\">\n");
      out.write("\t\t\t    <div class=\"modal-dialog modal-sm\">\n");
      out.write("\t\t\t      <div class=\"modal-content\">\n");
      out.write("\t\t\t      \n");
      out.write("\t\t\t        <!-- Modal Header -->\n");
      out.write("\t\t\t        <div class=\"modal-header\">\n");
      out.write("\t\t\t          <h4 class=\"modal-title\">Xóa</h4>\n");
      out.write("\t\t\t          <button type=\"button\" class=\"close\" data-dismiss=\"modal\">&times;</button>\n");
      out.write("\t\t\t        </div>\n");
      out.write("\t\t\t        \n");
      out.write("\t\t\t        <!-- Modal body -->\n");
      out.write("\t\t\t        <div class=\"modal-body\">\n");
      out.write("\t\t\t          Bạn có chắc chắn xóa không?\n");
      out.write("\t\t\t        </div>\n");
      out.write("\t\t\t        \n");
      out.write("\t\t\t        <!-- Modal footer -->\n");
      out.write("\t\t\t        <div class=\"modal-footer\">\n");
      out.write("\t\t\t          <button type=\"button\" class=\"btn btn-secondary\" data-dismiss=\"modal\">Đóng</button>\n");
      out.write("\t\t\t          <button type=\"button\" class=\"btn btn-secondary\" id=\"button-delete\" data-dismiss=\"modal\">Xóa</button>\n");
      out.write("\t\t\t        </div>\n");
      out.write("\t\t\t        \n");
      out.write("\t\t\t      </div>\n");
      out.write("\t\t\t    </div>\n");
      out.write("\t\t\t  </div>\n");
      out.write("\n");
      out.write("\t\t\t  <div class=\"modal fade\" id=\"modal-delete-all\" style=\"padding-top: 200px;\">\n");
      out.write("\t\t\t    <div class=\"modal-dialog modal-sm\">\n");
      out.write("\t\t\t      <div class=\"modal-content\">\n");
      out.write("\t\t\t      \n");
      out.write("\t\t\t        <!-- Modal Header -->\n");
      out.write("\t\t\t        <div class=\"modal-header\">\n");
      out.write("\t\t\t          <h4 class=\"modal-title\">Xóa tất cả</h4>\n");
      out.write("\t\t\t          <button type=\"button\" class=\"close\" data-dismiss=\"modal\">&times;</button>\n");
      out.write("\t\t\t        </div>\n");
      out.write("\t\t\t        \n");
      out.write("\t\t\t        <!-- Modal body -->\n");
      out.write("\t\t\t        <div class=\"modal-body\">\n");
      out.write("\t\t\t          Bạn có chắc chắn xóa tất cả sản phẩm không?\n");
      out.write("\t\t\t        </div>\n");
      out.write("\t\t\t        \n");
      out.write("\t\t\t        <!-- Modal footer -->\n");
      out.write("\t\t\t        <div class=\"modal-footer\">\n");
      out.write("\t\t\t          <button type=\"button\" class=\"btn btn-secondary\" data-dismiss=\"modal\">Đóng</button>\n");
      out.write("\t\t\t          <button type=\"button\" class=\"btn btn-secondary\" data-dismiss=\"modal\" onclick=\"DeleteAll()\">Xóa</button>\n");
      out.write("\t\t\t        </div>\n");
      out.write("\t\t\t        \n");
      out.write("\t\t\t      </div>\n");
      out.write("\t\t\t    </div>\n");
      out.write("\t\t\t  </div>\n");
      out.write("\t\t\t<!-- The Modal -->\n");
      out.write("\t\t\t  <div class=\"modal fade\" id=\"modal-delete\" style=\"padding-top: 200px;\">\n");
      out.write("\t\t\t    <div class=\"modal-dialog modal-sm\">\n");
      out.write("\t\t\t      <div class=\"modal-content\">\n");
      out.write("\t\t\t      \n");
      out.write("\t\t\t        <!-- Modal Header -->\n");
      out.write("\t\t\t        <div class=\"modal-header\">\n");
      out.write("\t\t\t          <h4 class=\"modal-title\">Xóa</h4>\n");
      out.write("\t\t\t          <button type=\"button\" class=\"close\" data-dismiss=\"modal\">&times;</button>\n");
      out.write("\t\t\t        </div>\n");
      out.write("\t\t\t        \n");
      out.write("\t\t\t        <!-- Modal body -->\n");
      out.write("\t\t\t        <div class=\"modal-body\">\n");
      out.write("\t\t\t          Bạn có chắc chắn xóa không?\n");
      out.write("\t\t\t        </div>\n");
      out.write("\t\t\t        \n");
      out.write("\t\t\t        <!-- Modal footer -->\n");
      out.write("\t\t\t        <div class=\"modal-footer\">\n");
      out.write("\t\t\t          <button type=\"button\" class=\"btn btn-secondary\" data-dismiss=\"modal\">Đóng</button>\n");
      out.write("\t\t\t          <button type=\"button\" class=\"btn btn-secondary\" id=\"button-delete\" data-dismiss=\"modal\">Xóa</button>\n");
      out.write("\t\t\t        </div>\n");
      out.write("\t\t\t        \n");
      out.write("\t\t\t      </div>\n");
      out.write("\t\t\t    </div>\n");
      out.write("\t\t\t  </div>\n");
      out.write("\n");
      out.write("\t\t\t  <div class=\"modal fade\" id=\"modal-delete-all\" style=\"padding-top: 200px;\">\n");
      out.write("\t\t\t    <div class=\"modal-dialog modal-sm\">\n");
      out.write("\t\t\t      <div class=\"modal-content\">\n");
      out.write("\t\t\t      \n");
      out.write("\t\t\t        <!-- Modal Header -->\n");
      out.write("\t\t\t        <div class=\"modal-header\">\n");
      out.write("\t\t\t          <h4 class=\"modal-title\">Xóa tất cả</h4>\n");
      out.write("\t\t\t          <button type=\"button\" class=\"close\" data-dismiss=\"modal\">&times;</button>\n");
      out.write("\t\t\t        </div>\n");
      out.write("\t\t\t        \n");
      out.write("\t\t\t        <!-- Modal body -->\n");
      out.write("\t\t\t        <div class=\"modal-body\">\n");
      out.write("\t\t\t          Bạn có chắc chắn xóa tất cả sản phẩm không?\n");
      out.write("\t\t\t        </div>\n");
      out.write("\t\t\t        \n");
      out.write("\t\t\t        <!-- Modal footer -->\n");
      out.write("\t\t\t        <div class=\"modal-footer\">\n");
      out.write("\t\t\t          <button type=\"button\" class=\"btn btn-secondary\" data-dismiss=\"modal\">Đóng</button>\n");
      out.write("\t\t\t          <button type=\"button\" class=\"btn btn-secondary\" data-dismiss=\"modal\" onclick=\"DeleteAll()\">Xóa</button>\n");
      out.write("\t\t\t        </div>\n");
      out.write("\t\t\t        \n");
      out.write("\t\t\t      </div>\n");
      out.write("\t\t\t    </div>\n");
      out.write("\t\t\t  </div>\n");
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
      out.write("            <a href=\"login.jsp\" class=\"bxuser\">\n");
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
      out.write("            <a href=\"cart.jsp\" class=\"bxcart\">\n");
      out.write("                <i class='bx bx-cart'></i>\n");
      out.write("            </a>\n");
      out.write("        </div>\n");
      out.write("                        <script src=\"Giohang.js\"></script>\n");
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
      out.write("            \t\t\n");
      out.write("\t\tfunction getThis(e) {\n");
      out.write("\t\t\tvar buttonDelete = e.parentElement.parentElement.parentElement.parentElement;\n");
      out.write("\t\t\tvar x = document.getElementById('button-delete');\n");
      out.write("\t\t\tx.onclick = function() {\n");
      out.write("\t\t\t\tDelete(buttonDelete);\n");
      out.write("\t\t\t}\n");
      out.write("\t\t}\n");
      out.write("\n");
      out.write("\t\tfunction DeleteAll() {\n");
      out.write("\t\t\tlet productContainer = document.querySelector(\".products\");\n");
      out.write("\t\t\tproductContainer.innerHTML = '';\n");
      out.write("\n");
      out.write("\t\t\tlocalStorage.removeItem('productsInCart');\n");
      out.write("\t\t\tlocalStorage.removeItem('totalCost');\n");
      out.write("\t\t\tlocalStorage.removeItem('cartNumbers');\n");
      out.write("\n");
      out.write("\t\t\tvar cart = document.getElementsByClassName('count-item')[0];\n");
      out.write("\t\t\tcart.innerText = 0;\n");
      out.write("\n");
      out.write("\t\t}\n");
      out.write("\n");
      out.write("\t\tfunction Delete(e) {\n");
      out.write("\t\t\tvar totalPrice =  e.getElementsByClassName('product-total')[0];\n");
      out.write("\t\t\te.remove();\n");
      out.write("\t\t\t\n");
      out.write("\t\t\tupdateCost(totalPrice);\n");
      out.write("\t\t\tupdateCart(e);\n");
      out.write("\t\t}\n");
      out.write("\n");
      out.write("\t\tfunction updateCost(e) {\n");
      out.write("\t\t\tvar price = parseInt(e.innerText.replace('Thành tiền : ', ''));\n");
      out.write("\t\t\tvar totalElement = document.getElementsByClassName('totalprice')[0];\n");
      out.write("\t\t\tvar total = parseInt(totalElement.innerText.replace('đ', ''));\n");
      out.write("\t\t\ttotal = total - price;\n");
      out.write("\t\t\tdocument.getElementsByClassName('totalprice')[0].innerText = total + \"đ\";\n");
      out.write("\t\t}\n");
      out.write("\n");
      out.write("\t\tfunction increase(e) {\n");
      out.write("\t\t\tvar cart = e.parentElement.parentElement.parentElement;\n");
      out.write("\t\t\tvar quantityElement = cart.getElementsByClassName('product-quantity')[0];\n");
      out.write("\t\t\tvar quantity = parseInt(quantityElement.innerText);\n");
      out.write("\t\t\tquantity += 1;\n");
      out.write("\t\t\tquantityElement.innerText = quantity;\n");
      out.write("\t\t\t\n");
      out.write("\t\t\tvar cartNumbers = document.getElementsByClassName('count-item')[0];\n");
      out.write("\t\t\tvar carts = parseInt(cartNumbers.innerText);\n");
      out.write("\t\t\tcarts = carts + 1;\n");
      out.write("\t\t\tdocument.getElementsByClassName('count-item')[0].innerText = carts;\n");
      out.write("\n");
      out.write("\t\t\tvar totalPriceElement = cart.getElementsByClassName('product-total')[0];\n");
      out.write("\t\t\tvar totalPrice = parseInt(totalPriceElement.innerText.replace('Thành tiền : ', ''));\n");
      out.write("\t\t\t\n");
      out.write("\t\t\tvar priceElement = cart.getElementsByClassName('product-price')[0];\n");
      out.write("\t\t\tvar price = parseInt(priceElement.innerText.replace('Đơn giá : ', ''));\n");
      out.write("\n");
      out.write("\t\t\tvar newTotalPrice = totalPrice + price;\n");
      out.write("\t\t\ttotalPriceElement.innerText = \"Thành tiền : \" + newTotalPrice + \"đ\";\n");
      out.write("\n");
      out.write("\t\t\tvar sumElement = document.getElementsByClassName('totalprice')[0];\n");
      out.write("\t\t\tvar sum = parseInt(sumElement.innerText.replace('đ',''));\n");
      out.write("\t\t\tvar newSum = sum + price;\n");
      out.write("\t\t\tsumElement.innerText = newSum + 'đ';\n");
      out.write("\n");
      out.write("\t\t}\n");
      out.write("\n");
      out.write("\t\tfunction decrease(e) {\n");
      out.write("\t\t\tvar cart = e.parentElement.parentElement.parentElement;\n");
      out.write("\t\t\tvar quantityElement = cart.getElementsByClassName('product-quantity')[0];\n");
      out.write("\t\t\tvar quantity = parseInt(quantityElement.innerText);\n");
      out.write("\t\t\tquantity = quantity - 1;\n");
      out.write("\t\t\tquantityElement.innerText = quantity;\n");
      out.write("\n");
      out.write("\t\t\tif(quantity > 0) {\n");
      out.write("\n");
      out.write("\t\t\t\tvar cartNumbers = document.getElementsByClassName('count-item')[0];\n");
      out.write("\t\t\t\tvar carts = parseInt(cartNumbers.innerText);\n");
      out.write("\t\t\t\tcarts = carts - 1;\n");
      out.write("\t\t\t\tdocument.getElementsByClassName('count-item')[0].innerText = carts;\n");
      out.write("\n");
      out.write("\t\t\t\tvar totalPriceElement = cart.getElementsByClassName('product-total')[0];\n");
      out.write("\t\t\t\tvar totalPrice = parseInt(totalPriceElement.innerText.replace('Thành tiền : ', ''));\n");
      out.write("\t\t\t\t\n");
      out.write("\t\t\t\tvar priceElement = cart.getElementsByClassName('product-price')[0];\n");
      out.write("\t\t\t\tvar price = parseInt(priceElement.innerText.replace('Đơn giá : ', ''));\n");
      out.write("\n");
      out.write("\t\t\t\tvar newTotalPrice = totalPrice - price;\n");
      out.write("\t\t\t\ttotalPriceElement.innerText = \"Thành tiền : \" + newTotalPrice + \"đ\";\n");
      out.write("\n");
      out.write("\t\t\t\tvar sumElement = document.getElementsByClassName('totalprice')[0];\n");
      out.write("\t\t\t\tvar sum = parseInt(sumElement.innerText.replace('đ',''));\n");
      out.write("\t\t\t\tvar newSum = sum - price;\n");
      out.write("\t\t\t\tsumElement.innerText = newSum + 'đ';\n");
      out.write("\n");
      out.write("\t\t\t} else {\n");
      out.write("\t\t\t\tvar quantityElements = cart.getElementsByClassName('product-quantity')[0];\n");
      out.write("\t\t\t\tvar quantity = parseInt(quantityElements.innerText);\n");
      out.write("\t\t\t\tquantityElements.innerText = 1;\n");
      out.write("\t\t\t}\n");
      out.write("\n");
      out.write("\t\t}\n");
      out.write("\n");
      out.write("\t\tfunction updateCart(e) {\n");
      out.write("\t\t\tvar productQuantity = e.getElementsByClassName('product-quantity')[0];\n");
      out.write("\t\t\tvar quantity = parseInt(productQuantity.innerText);\n");
      out.write("\t\t\tvar cartNumbers = document.getElementsByClassName('count-item')[0];\n");
      out.write("\t\t\tvar cart = parseInt(cartNumbers.innerText);\n");
      out.write("\t\t\tcart = cart - quantity;\n");
      out.write("\t\t\tdocument.getElementsByClassName('count-item')[0].innerText = cart;\n");
      out.write("\t\t}\n");
      out.write("\n");
      out.write("\t\tonLoadCartNumbers();\n");
      out.write("\t\tdisplayCart();\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
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
