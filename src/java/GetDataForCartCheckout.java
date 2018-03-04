/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import com.google.gson.Gson;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import model.Cart1;
import model.Login;
import model.Register;
import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.criterion.Restrictions;

/**
 *
 * @author Admin
 */
public class GetDataForCartCheckout extends HttpServlet {

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

            HttpSession hs = request.getSession(false);
            int LoginId = Integer.parseInt(hs.getAttribute("LoginId").toString());

            Criteria cr1 = s.createCriteria(Login.class);
            cr1.add(Restrictions.eq("loginId",LoginId));
            ArrayList<Login> al1 = (ArrayList<Login>) cr1.list();
            Login l = al1.get(0);
            
            Criteria cr2 = s.createCriteria(Register.class);
            cr2.add(Restrictions.eq("loginId",l));
            ArrayList<Register> al2 = (ArrayList<Register>) cr2.list();
            Register r = al2.get(0);
            
            Criteria cr3 = s.createCriteria(Cart1.class);
            cr3.add(Restrictions.eq("loginId",LoginId));
            ArrayList<Cart1> al3 = (ArrayList<Cart1>) cr3.list();
            int totalAmount = 0;
            for(int i=0;i<al3.size();i++){
                Cart1 c = al3.get(i);
                int t = c.getTotal();
                totalAmount += t;
            }
            
//            Login l = (Login) s.get(Login.class, LoginId);
//            Register r = (Register) s.get(Register.class, l);
//            
//            Cart1 c = (Cart1) s.get(Cart1.class, LoginId);
            
            //out.println(l.getEmail()+"   "+r.getFirstName()+"  "+totalAmount);
            
            ArrayList<String> al = new ArrayList<>();
            al.add(r.getFirstName().toString()+r.getLastName().toString());
            al.add(r.getAddress().toString());
            al.add(r.getMobileNo().toString());
            al.add(Integer.toString(totalAmount));
//            
//            al.add(Integer.toString(totalUsers));
//            al.add(Integer.toString(newUsers));
//            al.add(Integer.toString(serviceProvider));
            
            Gson gson = new Gson();
            out.println(gson.toJson(al));

            out.flush();
            tr.commit();
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
