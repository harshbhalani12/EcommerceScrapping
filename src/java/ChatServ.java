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
import javax.servlet.http.HttpSession;
import model.Register;
import org.hibernate.Session;
import org.hibernate.Transaction;

/**
 *
 * @author Admin
 */
public class ChatServ extends HttpServlet {

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
            int RegId = Integer.parseInt(request.getParameter("id"));
            
            Session s = NewHibernateUtil.getSessionFactory().openSession();
            Transaction tr = s.beginTransaction();

            //........this is for the selected user to whom u wanna chat..............
//            Register r = new Register();
//            r.setRegId(RegId);
            
            Register r = (Register) s.get(Register.class, RegId);
            
            out.println("REGID : "+RegId);
            
            //ArrayList<chatdummy> al=new ArrayList<>();
            
            HttpSession hs=request.getSession();
           //Register r1 = (Register) hs.getAttribute("r");


            //................this is logged in user................
            int RegId1 = Integer.parseInt(hs.getAttribute("RegId").toString());
            Register r1 = (Register) s.get(Register.class,RegId1);
            
            
            out.println(hs.getAttribute("RegId"));
            hs.setAttribute("FromRegId",r1.getRegId());
            hs.setAttribute("ToRegId", r.getRegId());
            
            hs.setAttribute("FromName", r1.getFirstName());
            hs.setAttribute("ToName", r.getFirstName());
            
            hs.setAttribute("FromR1", r1);
            hs.setAttribute("ToR", r);
            out.println("From:"+hs.getAttribute("RegId")+" TO: "+ r.getRegId());
            
            tr.commit();
            RequestDispatcher rd=request.getRequestDispatcher("Chat.jsp");
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
