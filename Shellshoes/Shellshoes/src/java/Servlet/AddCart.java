/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servlet;

import DAO.SellShoesDao;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import model.User;
import model.Cart;

public class AddCart extends HttpServlet {

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
        response.setContentType("text/html;charset=UTF-8");
        HttpSession session = request.getSession();
		User user = (User) session.getAttribute("acc");  // đăng nhập = User có email, password
		int userId = user.getuID();
		int productId = Integer.parseInt(request.getParameter("pID"));
		int sId = Integer.parseInt(request.getParameter("sId"));
                
		SellShoesDao sellShoesDao = new SellShoesDao();
                
		int numberOfProduct = sellShoesDao.getNumberOfProduct(productId);
		if (numberOfProduct <= 0) {
			request.setAttribute("messageError", "Het hang");
			request.getRequestDispatcher("CartProduct?pID" + productId).forward(request, response);
			return;
		}

		int cID = sellShoesDao.checkProductIsAvaiableInCart(userId, productId, sId);
		if (cID > 0) {
			sellShoesDao.updateCart(userId, productId, sId, cID);
		} else {
			sellShoesDao.insertCart(userId, productId, sId);
		}

		ArrayList<Cart> cartModelList = sellShoesDao.getProductInCart(userId);

		double totalPrice = 0;

		for (Cart cartModel : cartModelList) {
			totalPrice += cartModel.getPrice();
		}

		request.setAttribute("listCart", cartModelList);
		request.setAttribute("totalPrice", totalPrice);

		RequestDispatcher rd = request.getRequestDispatcher("cart.jsp");
		rd.forward(request, response);
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
        processRequest(request, response);
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
        processRequest(request, response);
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
