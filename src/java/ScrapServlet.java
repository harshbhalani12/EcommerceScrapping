/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import com.jaunt.Element;
import com.jaunt.Elements;
import com.jaunt.UserAgent;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author Admin
 */
public class ScrapServlet extends HttpServlet {

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
            String pname = request.getParameter("pname");
            
            //out.println("SERVLET : "+pname);
            String[] pnameparts = pname.split(" ");
            String part1 = pnameparts[0];
            String part2 = pnameparts[1];
//            out.println("part 1  : "+part1);
            
            UserAgent user = new UserAgent();
            user.visit("http://www.amazon.in/s/ref=nb_sb_noss?url=node%3D1805560031&field-keywords=" + part1+part2);
            
            Elements elements = user.doc.findFirst("<div class=\"a-row s-result-list-parent-container\">").findFirst("<ul>").findEach("<li>").findEach("<div class=\"a-row a-spacing-base\">");
//            Elements elements = user.doc.findFirst("<div class=\"a-row s-result-list-parent-container\">").findFirst("<ul>").findEach("<li>");
            
            ArrayList<Element> al = new ArrayList<Element>();
            //out.println("size : "+elements.size());

            for (Element element : elements) {
                al.add(element);
//                out.println(element.innerHTML());
//                out.println("<br>");
//                out.println("<hr>");
            }
            request.setAttribute("al", al);

            Elements elements1 = user.doc.findFirst("<div class=\"a-row s-result-list-parent-container\">").findFirst("<ul>").findEach("<li>").findEach("<div class=\"a-row a-spacing-mini\">");

            ArrayList<Element> al1 = new ArrayList<Element>();
            //out.println("size : "+elements.size());

            for (Element element1 : elements1) {
                al1.add(element1);
//                out.println(element.innerHTML());
//                out.println("<br>");
//                out.println("<hr>");
            }
            //request.setAttribute("al1", al1);
            
            int j=0;
            int count = 0;
            for(int i=0;i<al.size();i++)
            {
                count++;
                
                if(count%3 == 0)
                {
                    out.println("<div class=\"row\">\n" +
                                       "<div class=\"col-sm-4\">\n" +
                                            "<div id=\"main\">\n" +
                                                al.get(i).innerHTML()+"\n" +
                                                al1.get(j).innerHTML()+"\n" +
                                                al1.get(++j).innerHTML()+"\n"+
                                            "</div>" +
                                      "</div>\n" +
                                "</div><hr>");
                }
                else{
                    out.println("<div class=\"col-sm-4\">\n" +
                                            "<div id=\"main\">\n" +
                                                al.get(i).innerHTML()+"\n" +
                                                al1.get(j).innerHTML()+"\n" +
                                                al1.get(++j).innerHTML()+"\n"+
                                            "</div>" +
                                "</div>\n");
                }
            }
            
            
//            int j = 0;
//            for(int i=0;i<al.size();i++){
//                //out.println(al.get(i).innerHTML());
//                if((++i)%3 == 0){
//                    out.println("<div id=\"main\">\n" +
//                        al.get(i).innerHTML()+"\n" +
//                           al1.get(j).innerHTML()+"\n" +
//                            al1.get(++j).innerHTML()+"\n"+
//                            "</div>"
//                        );
//                }
//                out.println("<div id=\"main\">\n" +
//                        al.get(i).innerHTML()+"\n" +
//                           al1.get(j).innerHTML()+"\n" +
//                            al1.get(++j).innerHTML()+"\n"+
//                            "</div><hr>"
//                        );
//                
//                
//                //j++;
////                out.println(al1.get(j).innerHTML()+"\n");
////"                            <%j=j+1;%>\n" +
////"                           <%=al1.get(j).innerHTML()%>\n" +
////"                    </div>\n" +
////"                    <hr>");
////                    %>
////                    <div id="main">
////                        <%=al.get(i).innerHTML()%>
////                           <%=al1.get(j).innerHTML()%>
////                            <%j=j+1;%>
////                           <%=al1.get(j).innerHTML()%>
////                    </div>
////                    <hr>
////                                                    
////                    <%
//                   j+=1;
//                }
            
            
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
