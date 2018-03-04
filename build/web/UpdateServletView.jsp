<%-- 
    Document   : UpdateServletView
    Created on : 18 Feb, 2017, 3:41:55 PM
    Author     : Admin
--%>

<%@page import="java.util.ArrayList"%>
<%@page import="model.Login"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <%

            if (request.getAttribute("al") != null) {
                ArrayList<Login> al = (ArrayList<Login>) request.getAttribute("al");
                for (Login l : al) {
                    
                    //l.getLoginId();
                    String email = l.getEmail();
                    String password = l.getPassword();
                    String role = l.getRole();

        %>
        <form action="UpdateServletInDb">
            
            <input type="hidden" name="role" value="<%=role%>">
            <input type="hidden" name="id" value="<%=l.getLoginId()%>">
            <br>
            <input type="text" name="email" value="<%=email%>"><br>
            <input type="text" name="password" value="<%=password%>"><br>
            <input type="submit" value="Update">
        </form>
        <%
                 }
            }
        %>
    </body>
</html>
