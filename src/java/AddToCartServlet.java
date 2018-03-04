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
import model.Product;
import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.criterion.Restrictions;

/**
 *
 * @author Admin
 */
public class AddToCartServlet extends HttpServlet {

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

            int PId = Integer.parseInt(request.getParameter("pid"));
            int qty = 1;

            /*..............get LOGIN ID.................*/
            //HttpSession hs = request.getSession();
            HttpSession hs = request.getSession(false);
            
            String loginId = (String)hs.getAttribute("loginId");
            if(loginId == null){
                //out.println("SESSION NULL");
                out.println("<div class=\"alert alert-success\" id=\"alertbox1\" style=\"display: block;\">\n"
                                + "                            <button id=\"closealertbtn\" class=\"close\" data-dismiss=\"alert\" area-label=\"close\">&times;</button>\n"
                                + "                            <b id=\"b\">Please Login First to add product</b>\n"
                                + "                        </div>");
            }
            else{
            int LoginId = Integer.parseInt(hs.getAttribute("LoginId").toString());

            
                /*..............get PRICE OF PRODUCT from PID................*/
                Product p = (Product) s.get(Product.class, PId);
                int price = Integer.parseInt(p.getPPrice().toString());
                int total = price;
                //out.println("price > "+price);

                Login l = (Login) s.get(Login.class, LoginId);
            //out.print(l.getLoginId());

                /*..............check if item is already added to cart.............*/
                Criteria cr = s.createCriteria(Cart1.class);
                cr.add(Restrictions.eq("pId", PId));
                cr.add(Restrictions.eq("loginId", LoginId));
                ArrayList<Cart1> alc = (ArrayList<Cart1>) cr.list();
                if (alc.size() > 0) {
                    Cart1 c1 = alc.get(0);
                    //out.println("FROM table: " + c1.getPId());
                    if (c1.getPId() == PId) {
                        //out.println("already");
//                    out.println("1");
                        out.println("<div class=\"alert alert-success\" id=\"alertbox1\" style=\"display: block;\">\n"
                                + "                            <button id=\"closealertbtn\" class=\"close\" data-dismiss=\"alert\" area-label=\"close\">&times;</button>\n"
                                + "                            <b id=\"b\">Product is already there in your cart</b>\n"
                                + "                        </div>");
                    }
                } else {
                    Cart1 c = new Cart1();
                    c.setLoginId(l.getLoginId());
                    c.setPId(PId);
                    c.setProductImage(p.getPImage());
                    c.setProductName(p.getPName());
                    c.setPrice(price);
                    c.setQty(qty);
                    c.setTotal(total);
                    s.save(c);
                //out.println("added");
                    //out.println("2");
                    out.println("<div class=\"alert alert-success\" id=\"alertbox1\" style=\"display: block;\">\n"
                            + "                            <button id=\"closealertbtn\" class=\"close\" data-dismiss=\"alert\" area-label=\"close\">&times;</button>\n"
                            + "                            <b id=\"b\">Product is added to your cart</b>\n"
                            + "                        </div>");
                }
            }
            tr.commit();

//            out.println("<div class=\"alert alert-success\" id=\"alertbox1\" style=\"display: block;\">\n"
//                    + "                            <a href=\"#\" id=\"closealertbtn\" class=\"close\" data-dismiss=\"alert\" area-label=\"close\">&times;</a>\n"
//                    + "                            <b id=\"b\">Product is added to your cart</b>\n"
//                    + "                        </div>");
//            out.println("<div class=\"alert alert-success \"> id=\"alertbox\"\n" +
//"                            <a href=\"#\" class=\"close\" data-dismiss=\"alert\" area-label=\"close\" id=\"closebtn\">&times;</a>\n" +
//"                            <b id=\"b\">Product is Added to cart</b>\n" +
//"                        </div>");
//            
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
