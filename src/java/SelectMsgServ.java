/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;

/**
 *
 * @author Admin
 */
public class SelectMsgServ extends HttpServlet {

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

            HttpSession hs = request.getSession();
            int FromRegId = Integer.parseInt(hs.getAttribute("FromRegId").toString());
            int ToRegId = Integer.parseInt(hs.getAttribute("ToRegId").toString());

            //ArrayList<chatdummy> al = new ArrayList<>();

//            Query q = s.createSQLQuery("select Register.firstName,Chat.chatMsg,Chat.fromUId from Register as register right join Chat as chat"
//                    + " ON register.regId = Chat.FromUId where register.regId = :fromRegId or register.regId = :toRegId");
//            Query q = s.createSQLQuery("select Register.firstName,Chat.chatMsg,Chat.fromUId from Chat as chat left join Register as register"
//                                        +"ON Chat.fromUId = register.regId where chat.fromUId = :fromUId and chat.toRegId = :toRegId");
            
            String sql = "select Register.firstName,Chat.chatMsg,Chat.fromUId from Chat as chat left join Register as register "
                    + "ON Chat.fromUId = register.regId "
                    + "where chat.fromUId = :fromRegId and chat.toUId = :toRegId "
                    + "or"
                    + " chat.fromUId = :toRegId and chat.toUId = :fromRegId";
            Query q = s.createSQLQuery(sql);
            q.setParameter("fromRegId", FromRegId);
            q.setParameter("toRegId", ToRegId);

            List<Object[]> l = q.list();
            for (Object[] o : l) {
                int fromUId = o[2].hashCode();
                if (fromUId == FromRegId) {
                    
                    out.println("<div class=\"chat self\">\n" +
                "                    <div class=\"user-photo\"></div>\n" +
                "                    <p class=\"chat-message\">\n" +
                                            o[1].toString()  +
                "                    </p>\n" +
                "                </div>");
                    
                    
                    
                    
                    
//                    out.println("<span class=\"Username\" style=\"margin-left:300px;color:red;\">" + o[0].toString() + "says:</span><br>");
//                    out.println("<span class=\"Username\" style=\"margin-left:300px;\">" + o[1].toString() + "<br><hr>");
                } else {
                    out.println("<div class=\"chat friend\">\n" +
                "                    <div class=\"user-photo\"></div>\n" +
                "                    <p class=\"chat-message\">\n" +
                                        o[1].toString()          +
                "                    </p>\n" +
                "                </div>");
//                    out.println("<span class=\"Username\">" + o[0].toString() + "says:</span><br>");
//                    out.println("<span class=\"Username\">" + o[1].toString() + "<br><hr>");
                }
            }

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
