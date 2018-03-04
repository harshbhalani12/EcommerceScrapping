/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import model.Login;
import model.RegisterServiceProvider;
import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.criterion.Restrictions;

/**
 *
 * @author Admin
 */
public class viewServiceProviderServlet1 extends HttpServlet {

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
//            ;
//            out.println("loginid = "+LoginId);

            Session s = NewHibernateUtil.getSessionFactory().openSession();
            Transaction tr = s.beginTransaction();

            Criteria c = s.createCriteria(Login.class);
            c.add(Restrictions.eq("loginId",Integer.parseInt(LoginId1)));
            ArrayList<Login> a = (ArrayList<Login>) c.list();
            request.setAttribute("LoginAL", a);
//            RegisterServiceProvider r = a.get(0);
            Login l = a.get(0);
            out.print(l.getEmail());
            
            Criteria cr =   s.createCriteria(RegisterServiceProvider.class);
            cr.add(Restrictions.eq("loginId",l));
            ArrayList<RegisterServiceProvider> al = (ArrayList<RegisterServiceProvider>) cr.list();
            request.setAttribute("RegisterAL", al);
            
            

            
            tr.commit();
//            out.println("Success");
            
            RequestDispatcher rd = request.getRequestDispatcher("viewServiceProviderInfo1.jsp");
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
