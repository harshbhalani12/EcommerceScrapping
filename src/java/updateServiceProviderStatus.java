/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import model.Login;
import org.hibernate.Session;
import org.hibernate.Transaction;

/**
 *
 * @author Admin
 */
public class updateServiceProviderStatus extends HttpServlet {

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
        PrintWriter out = response.getWriter();
        try {
            String LoginId1 = request.getParameter("id");
            int LoginId = Integer.parseInt(LoginId1);

            Session s = NewHibernateUtil.getSessionFactory().openSession();
            Transaction tr = s.beginTransaction();

            Login l = (Login) s.get(Login.class, LoginId);
            l.setLoginId(LoginId);
            l.setStatus("Accepted");

            s.update(l);

            //..............sending mail regarding this...............
            String mail = l.getEmail();
            String subject = "Request Approval as a Service Provider - ScrapEcomm";
            String content = "Your request has been approved by admin" + "\n" + "Now you can Login on website by using your EMail Id and password.";

            String[] recipients = new String[]{mail};
            //String[] bccRecipients = new String[]{"sunilkotadiya777@gmail.com"};  

            if (new MailUtil().sendMail(recipients, subject, content)) {
                String msg = "Approval is sent to your registered email id!";
                out.println(msg);
                request.setAttribute("msg1", msg);
//                RequestDispatcher rd = request.getRequestDispatcher("ForgotPassword.jsp");
//                rd.forward(request, response);
            }

            tr.commit();
            out.println("success");

            RequestDispatcher rd = request.getRequestDispatcher("MessagesServlet1");
            rd.forward(request, response);

        } catch (Exception e) {
            out.println(e.getMessage());
        }
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
