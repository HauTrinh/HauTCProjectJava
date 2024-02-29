/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlHau;

import DAO.DetailDAO;
import DAO.ProductDAO;
import entity.Cart;
import entity.Custom;
import entity.Customer;
import entity.store1;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 *
 * @author ADMIN
 */
@WebServlet(name = "AddToCart", urlPatterns = {"/add-cart"})
public class AddToCart extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
        
    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        request.getRequestDispatcher("login.jsp").forward(request, response);
      
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        Custom cc = (Custom) request.getSession().getAttribute("custom");
        if(cc == null) {
            response.sendRedirect("loginController");
        } else{
            String productId = request.getParameter("productID");
            int cid = Integer.parseInt(request.getParameter("cid"));
            ProductDAO productDAO = new ProductDAO();
            store1 st = productDAO.showStore(productId);
            String size = request.getParameter("txtsize");
            String color = request.getParameter("txtcolor");
            int quantity = Integer.parseInt(request.getParameter("quantity"));
            DetailDAO dao = new DetailDAO();
            Cart c = dao.showCart1(productId, 2, size, color, cid);
                if(c == null) {
                    dao.insertCart(cid, st.getStoreId(), productId, size, color, quantity);
                    request.getRequestDispatcher("detail?productID=" + productId).forward(request, response);
                }else if(c.getProductID().equals(productId) && c.getSize().equals(size) && c.getColor().equals(color)) {
                    int quan = c.getAmount() + quantity;
                    dao.updateCart(quan, c.getCartID());
                    request.getRequestDispatcher("detail?productID=" + productId).forward(request, response);
                } else {
                    dao.insertCart(cid, st.getStoreId(), productId, size, color, quantity);
                    request.getRequestDispatcher("detail?productID=" + productId).forward(request, response);
                }
        }
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
