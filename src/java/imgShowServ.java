/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.servlet.ServletException;
import javax.servlet.ServletOutputStream;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import model.ImageTp;
import org.hibernate.Session;
import org.hibernate.Transaction;

/**
 *
 * @author Admin
 */
public class imgShowServ extends HttpServlet {

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
//            Session s = NewHibernateUtil.getSessionFactory().openSession();
//            Transaction tr = s.beginTransaction();
//
//            ImageTp i = (ImageTp) s.get(ImageTp.class, 1);
//            byte[] bfile = i.getImage();
//            
//                ServletOutputStream sos = response.getOutputStream();
//                sos.write(bfile);
//                sos.close();
//                /*
//                FileOutputStream fos = new FileOutputStream("E:\feedback.png");
//                fos.write(bfile);
//                fos.close();
//                */
//                     
//            tr.commit();
            
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
           Connection con = DriverManager.getConnection("jdbc:sqlserver://localhost:1433;databaseName=Ecom","sa","Dspshy29");

           ImageTp i = null;
           
           PreparedStatement ps = con.prepareStatement("select * from ImageTp");
            ResultSet rs = ps.executeQuery();
            while(rs.next()){
                String name = rs.getString("name");
                byte[] imageData = rs.getBytes(2);
                
                i = new ImageTp();
                i.setName(name);
                i.setImage(imageData);
            }
            
            
            //response.getOutputStream().write(i.getImage());
            
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
