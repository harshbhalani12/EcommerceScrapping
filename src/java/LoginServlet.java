/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
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
public class LoginServlet extends HttpServlet {

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
            String email = request.getParameter("email");
            String password = request.getParameter("password");

            String email1 = "admin@gmail.com";
            String pass1 = "Dspshy29";

            Session session = NewHibernateUtil.getSessionFactory().openSession();
            Transaction tr = session.beginTransaction();

            Criteria criteria = session.createCriteria(Login.class);

            criteria.add(Restrictions.eq("email", email));
            criteria.add(Restrictions.eq("password", password));

            ArrayList<Login> arrayList = (ArrayList<Login>) criteria.list();

            if (arrayList.size() > 0) {

                Login login = arrayList.get(0);

                HttpSession hs = request.getSession();

                if (login.getRole().equals("ServiceProvider")) {
                    out.println("SP");

                    hs.setAttribute("LoginId", login.getLoginId());
                    hs.setAttribute("loginId", login.getLoginId().toString());

                    RequestDispatcher rd = request.getRequestDispatcher("ServiceProviderPage.jsp");
                    rd.forward(request, response);
                } else {
                    //...........for chat purpose.............
                    Criteria cr1 = session.createCriteria(Register.class);
                    cr1.add(Restrictions.eq("loginId", login));
                    ArrayList<Register> al1 = (ArrayList<Register>) cr1.list();
                    Register r1 = al1.get(0);
                    //...........for chat purpose.............

                    if (login.getRole().equals("User")) {
                        out.println("Welcome USER......");

                        hs.setAttribute("LoginId", login.getLoginId());
                        hs.setAttribute("loginId", login.getLoginId().toString());
                        //...........for chat purpose.............
                        hs.setAttribute("RegId", r1.getRegId());
                        hs.setAttribute("r", r1);
                        //...........for chat purpose.............

                        RequestDispatcher rd = request.getRequestDispatcher("ElectronicsServlet");
                        rd.forward(request, response);

                    } else if (login.getRole().equals("ServiceProvider")) {
//                        out.println("Welcome SP...");
//                        HttpSession hs = request.getSession();
//                        hs.setAttribute("LoginId", login.getLoginId());

//                    Criteria criteria1 = session.createCriteria(Register.class);
//                    criteria.add(Restrictions.eq("loginId", login.getLoginId()));
//                    ArrayList<Register> arrayList1 = (ArrayList<Register>) criteria1.list();
//                    if (arrayList1.size() > 0) {
//                        Register r = arrayList1.get(0);
//                        //out.println(r.getFirstName());
//                        hs.setAttribute("Name", r.getFirstName());
                    }
                    //out.println("ID : "+login.getLoginId());
//                    RequestDispatcher rd = request.getRequestDispatcher("ServiceProviderPage.jsp");
//                    rd.forward(request, response);

                    out.println("Successfully logged in..");

                }

            } else if (email.equals("admin@gmail.com") && password.equals("Dspshy29")) {
                RequestDispatcher rd = request.getRequestDispatcher("AdminPage.jsp");
                rd.forward(request, response);
            } else {
                out.println("login failed......");
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
