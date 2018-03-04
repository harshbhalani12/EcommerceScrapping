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
import model.Register;
import org.eclipse.persistence.internal.oxm.schema.model.Restriction;
import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.criterion.Restrictions;

/**
 *
 * @author Admin
 */
public class MessagesServlet extends HttpServlet {

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
        try{
           out.println("hello in messages servlet");
           Session s = NewHibernateUtil.getSessionFactory().openSession();
           Transaction tr = s.beginTransaction();
           
           Criteria cr = s.createCriteria(Login.class);
           cr.add(Restrictions.eq("status","Pending"));
            ArrayList<Login> al = (ArrayList<Login>)cr.list();
            request.setAttribute("al", al);
            
            for(int i=0;i<al.size();i++){
                Login l = al.get(i);
            }
            
            Criteria cr1 = s.createCriteria(Register.class);
            //cr1.add(Restrictions.eq("loginId",l.getLoginId().toString()));
            ArrayList<Register> al1 = (ArrayList<Register>)cr.list();
            request.setAttribute("al1", al1);
            /*
            for(int i=0;i<al1.size();i++){
                Register r = al1.get(i);
               out.println(r.getFirstName());
            }
            */
            tr.commit();
            //out.println(l.getLoginId());
            
            RequestDispatcher rd = request.getRequestDispatcher("Messages.jsp");
            rd.forward(request, response);
            
        }catch(Exception e){
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
