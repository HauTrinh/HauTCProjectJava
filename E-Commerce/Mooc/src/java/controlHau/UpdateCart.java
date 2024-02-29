/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlHau;

import DAO.DetailDAO;
import entity.Cart;
import entity.Carts;
import entity.Color;
import entity.Colors;
import entity.Size;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author ADMIN
 */
@WebServlet(name = "UpdateCart", urlPatterns = {"/updateCart"})
public class UpdateCart extends HttpServlet {

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
        DetailDAO dao = new DetailDAO();
        int cid = Integer.parseInt(request.getParameter("cid"));
        List<Size> size = dao.showSizeProducts(3, cid);
        Carts ct = dao.showCart1s(3, cid);
        List<Colors> color = dao.getListColors(3, cid);
        System.out.println(color.toString());
        request.setAttribute("listC", color);
        request.setAttribute("ct", ct);
        request.setAttribute("listS", size);
        request.getRequestDispatcher("UpdateCart.jsp").forward(request, response);
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
        int csID = Integer.parseInt(request.getParameter("csID"));
        int cid = Integer.parseInt(request.getParameter("cid"));
        int amount = Integer.parseInt(request.getParameter("amount"));
        String size = request.getParameter("size");
        String color = request.getParameter("color");
        DetailDAO dao = new DetailDAO();
        dao.updateCarts(color, size, amount, cid);
        response.sendRedirect("showCart?cid=" + csID);
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
