
package control;

import DAO.LoginDAO;
import entity.Account;
import entity.SendEmail;
import entity.Email;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;


public class TakeEmail extends HttpServlet {

   
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            
            String username = request.getParameter("username");
            String email = request.getParameter("useremail");

            LoginDAO dao = new LoginDAO();
            Account a = dao.checkEmail(email, username);
            
            if(a != null){
                SendEmail sm = new SendEmail();
      		//get the 6-digit code
                String code = sm.getRandom();

                     //craete new user using all information
                Email mail = new Email(email,code);
                
                sm.sendEmail(mail);
      		//check if the email send successfully
                
                    HttpSession session = request.getSession();
                    session.setAttribute("authcode", mail);
                    response.sendRedirect("testEmail.jsp");
            }else{
                 request.setAttribute("message", "Email Incorrect!");
             }
                           
           }          
    }

    
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

}
