/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Iterator;
import java.util.List;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.apache.commons.fileupload.FileItem;
import org.apache.commons.fileupload.disk.DiskFileItemFactory;
import org.apache.commons.fileupload.servlet.ServletFileUpload;

/**
 *
 * @author Admin
 */
public class imgupserv extends HttpServlet {

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
        File file;
        try{
            boolean isMultipart = ServletFileUpload.isMultipartContent(request);
            //String filePath = "C:\\Users\\Admin\\Desktop\\apache-tomcat-8.0.30\\webapps\\images\\";
            String filePath = "C:\\Users\\Admin\\Documents\\NetBeansProjects\\EcommerceScrapping\\web\\images1\\";
            if(!isMultipart){
                out.println("No file uploaded..........");
                return;
            }
            
            DiskFileItemFactory factory = new DiskFileItemFactory();
            ServletFileUpload upload = new ServletFileUpload(factory);
            try{
                List fileItems = upload.parseRequest(request);
                Iterator i = fileItems.iterator();
                while(i.hasNext()){
                    FileItem fi = (FileItem) i.next();
                    if(!fi.isFormField()){
                        String fileName = fi.getName();
                        if(fileName.lastIndexOf("\\")>=0){
                            file = new File(filePath + fileName.substring(fileName.lastIndexOf("\\")));                            
                        }
                        else{
                            file = new File(filePath + fileName.substring(fileName.lastIndexOf("\\")+1)); 
                        }
                        fi.write(file);
                        out.println("uploaded file : "+fileName+"successfully to : "+ "path : -> "+filePath);
                    }
                }
            }catch(Exception e){
                out.println("inner try catch : "+e.getMessage());
            }
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
