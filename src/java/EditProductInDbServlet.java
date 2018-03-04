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
import javax.servlet.http.HttpSession;
import model.Login;
import model.Product;
import org.apache.commons.fileupload.FileItem;
import org.apache.commons.fileupload.FileItemFactory;
import org.apache.commons.fileupload.disk.DiskFileItemFactory;
import org.apache.commons.fileupload.servlet.ServletFileUpload;
import org.hibernate.Session;
import org.hibernate.Transaction;

/**
 *
 * @author Admin
 */
public class EditProductInDbServlet extends HttpServlet {

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
            int PId = Integer.parseInt(request.getParameter("pid"));
            String pname = "";
            String pcat = "";
            String psubcat = "";
            String pprice = "";
            String pdesc = "";
            String pimage = "";
            String poffers = "";
            String filePath = "C:\\Users\\Admin\\Documents\\NetBeansProjects\\EcommerceScrapping\\web\\images1\\";

            boolean isMultipart = ServletFileUpload.isMultipartContent(request);
            if (!isMultipart) {
                out.println("in if");
            } else {
                out.println("in else");
                // creates FileItem instances which keep their content in a temporary file on disk
                FileItemFactory factory = new DiskFileItemFactory();
                // Create a new file upload handler
                ServletFileUpload upload = new ServletFileUpload(factory);

                List<FileItem> fields = upload.parseRequest(request);
                // iterates the object of list
                Iterator<FileItem> it = fields.iterator();
                //getting objects one by one
                while (it.hasNext()) {
                    //assigning coming object if list to object of FileItem
                    FileItem fileItem = it.next();
                    //check whether field is form field or not
                    boolean isFormField = fileItem.isFormField();

                    if (isFormField) {
                        //get the filed name 
                        String fieldName = fileItem.getFieldName();
                        if (fieldName.equals("productName")) {
                            //getting value of field
                            pname = fileItem.getString();
                        } else if (fieldName.equals("productCategory")) {
                            pcat = fileItem.getString();
                        } else if (fieldName.equals("productSubCategory")) {
                            psubcat = fileItem.getString();
                        } else if (fieldName.equals("productPrice")) {
                            pprice = fileItem.getString();
                        } else if (fieldName.equals("productDescription")) {
                            pdesc = fileItem.getString();
                        } else if (fieldName.equals("productOffers")) {
                            poffers = fileItem.getString();
                        }

                    } else {
                        //getting name of file
                        pimage = new File(fileItem.getName()).getName();
                        //get the extension of file by diving name into substring
                        String extension = pimage.substring(pimage.indexOf(".") + 1, pimage.length());
                        //rename file...concate name and extension
                        pimage = pname + "." + extension;
                        //add multiple images into arraylist

                        try {
                            //String filePath = "C:\\Users\\Admin\\Desktop\\apache-tomcat-8.0.30\\webapps\\images\\";
                            fileItem.write(new File(filePath + pimage));
                        } catch (Exception ex) {
                            out.println(ex.toString());
                        }

                    }

                }
//                out.println(pname);
//                out.println(pimage);
//                out.println("hello");
                //.................      SAVING TO DATABASE     ..........................

                Session s = NewHibernateUtil.getSessionFactory().openSession();
                Transaction tr = s.beginTransaction();

                HttpSession hs = request.getSession();
                String id = hs.getAttribute("LoginId").toString();
                int LoginId = Integer.parseInt(id);
                
                
                Login log = (Login) s.get(Login.class, LoginId);
                
                //Login log = (Login)hs.getAttribute("LoginId");
                Product p = (Product) s.get(Product.class, PId);
                p.setLoginId(log);
                p.setPName(pname);
                p.setPCategory(pcat);
                p.setPSubCategory(psubcat);
                p.setPPrice(pprice);
                p.setPDescri(pdesc);
                p.setPOffers(poffers);
                p.setPImage(pimage);
                
                s.update(p);
                
                tr.commit();
                //request.getRequestDispatcher("ServiceProviderPage.jsp").forward(request, response);
                out.println("Success");
            }
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
