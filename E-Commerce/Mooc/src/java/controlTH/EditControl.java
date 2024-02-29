/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlTH;

import DAO.OrdersDAO;
import entity.Orders;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;


@WebServlet(name = "EditControl", urlPatterns = {"/edit"})
public class EditControl extends HttpServlet {

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
        request.setCharacterEncoding("UTF-8");
        String orderid = request.getParameter("orderid");
        String cartid = request.getParameter("cartid");
        String foundeddate = request.getParameter("foundeddate");
        String deliverydate = request.getParameter("deliverydate");
        String address = request.getParameter("address");
        String ppaymentway = request.getParameter("paymentway");
        String ppaymentstatus = request.getParameter("paymentstatus");

        int paymentway = Integer.parseInt(ppaymentway);
        int paymentstatus = Integer.parseInt(ppaymentstatus);
        if (paymentway == 1) {
            if (paymentstatus == 1) {
                String PaymentStatus = "3";
                String Payment = "Chuyển khoản";
                OrdersDAO dao = new OrdersDAO();
                dao.editOrders(cartid, foundeddate, deliverydate, address, Payment, PaymentStatus, orderid);
            }
            else if(paymentstatus == 2) {
                String PaymentStatus = "2";
                String Payment = "Chuyển khoản";
                OrdersDAO dao = new OrdersDAO();
                dao.editOrders(cartid, foundeddate, deliverydate, address, Payment, PaymentStatus, orderid);
            }
            else {
                String PaymentStatus = "1";
                String Payment = "Chuyển khoản";
                OrdersDAO dao = new OrdersDAO();
                dao.editOrders(cartid, foundeddate, deliverydate, address, Payment, PaymentStatus, orderid);
            }
        } else if (paymentway == 2) {
            if (paymentstatus == 1) {
                String PaymentStatus = "3";
                String Payment = "Tiền mặt";
                OrdersDAO dao = new OrdersDAO();
                dao.editOrders(cartid, foundeddate, deliverydate, address, Payment, PaymentStatus, orderid);
            }
            else if (paymentstatus == 2) {
                String PaymentStatus = "2";
                String Payment = "Tiền mặt";
                OrdersDAO dao = new OrdersDAO();
                dao.editOrders(cartid, foundeddate, deliverydate, address, Payment, PaymentStatus, orderid);
            }
            else {
                String PaymentStatus = "1";
                String Payment = "Tiền mặt";
                OrdersDAO dao = new OrdersDAO();
                dao.editOrders(cartid, foundeddate, deliverydate, address, Payment, PaymentStatus, orderid);
            }
        } else {
            if (paymentstatus == 1) {
                String PaymentStatus = "3";
                String Payment = "Ship COD";
                OrdersDAO dao = new OrdersDAO();
                dao.editOrders(cartid, foundeddate, deliverydate, address, Payment, PaymentStatus, orderid);
            }
            else if (paymentstatus == 2) {
                String PaymentStatus = "2";
                String Payment = "Ship COD";
                OrdersDAO dao = new OrdersDAO();
                dao.editOrders(cartid, foundeddate, deliverydate, address, Payment, PaymentStatus, orderid);
            }
            else {
                String PaymentStatus = "1";
                String Payment = "Ship COD";
                OrdersDAO dao = new OrdersDAO();
                dao.editOrders(cartid, foundeddate, deliverydate, address, Payment, PaymentStatus, orderid);
            }
        } 
            
        response.sendRedirect("homeServlet");

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
