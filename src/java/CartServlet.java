/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import model.Cart1;
import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.criterion.Restrictions;

/**
 *
 * @author Admin
 */
public class CartServlet extends HttpServlet {

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
            Session s = NewHibernateUtil.getSessionFactory().openSession();
            Transaction tr = s.beginTransaction();
            /*..............get LOGIN ID.................*/
            //HttpSession hs = request.getSession();
            HttpSession hs = request.getSession(false);
            
            String loginId = (String)hs.getAttribute("loginId");
            if(loginId == null){
                out.println("SESSIOON NULL......");
                request.getRequestDispatcher("Cart_no_login.jsp").forward(request, response);
            }else{
                

                int LoginId = Integer.parseInt(hs.getAttribute("LoginId").toString());
            
                
                Criteria cr = s.createCriteria(Cart1.class);
                cr.add(Restrictions.eq("loginId", LoginId));
                ArrayList<Cart1> al = (ArrayList<Cart1>) cr.list();

                tr.commit();

                request.setAttribute("al", al);

                out.println("hrllo");
                request.getRequestDispatcher("Cart.jsp").forward(request, response);
            }
//            
//            int LoginId = Integer.parseInt(hs.getAttribute("LoginId").toString());
//            //out.println(LoginId);
//
//            if (hs.getAttribute("LoginId").toString() == null) {
//                out.println("plz login first");
//            } else {
//                Session s = NewHibernateUtil.getSessionFactory().openSession();
//                Transaction tr = s.beginTransaction();
//
//                Criteria cr = s.createCriteria(Cart1.class);
//                cr.add(Restrictions.eq("loginId", LoginId));
//                ArrayList<Cart1> al = (ArrayList<Cart1>) cr.list();
//
//                tr.commit();
//
//                request.setAttribute("al", al);
//
//                out.println("hrllo");
//                request.getRequestDispatcher("Cart.jsp").forward(request, response);
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
