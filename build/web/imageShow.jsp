<%-- 
    Document   : imageShow
    Created on : 6 Mar, 2017, 2:13:48 PM
    Author     : Admin
--%>

<%@page import="java.io.OutputStream"%>
<%@page import="java.sql.ResultSet"%>
<%@page import="java.sql.PreparedStatement"%>
<%@page import="model.ImageTp"%>
<%@page import="java.sql.DriverManager"%>
<%@page import="java.sql.Connection"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <%
        try{
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
           Connection con = DriverManager.getConnection("jdbc:sqlserver://localhost:1433;databaseName=Ecom","sa","Dspshy29");

           ImageTp i = null;
           OutputStream img;
           PreparedStatement ps = con.prepareStatement("select * from ImageTp");
            ResultSet rs = ps.executeQuery();
            while(rs.next()){
                String name = rs.getString("name");
                byte[] imageData = rs.getBytes("image");
                
                img = response.getOutputStream();
                img.write(imageData);
                img.flush();
                img.close();
            }
            
            
            //response.getOutputStream().write(i.getImage());
            
        } catch (Exception e) {
            out.println(e.getMessage());
        }
        
        %>
    </body>
</html>
