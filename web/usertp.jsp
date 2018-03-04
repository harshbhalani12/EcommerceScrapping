<%-- 
    Document   : usertp
    Created on : 18 Feb, 2017, 2:32:07 PM
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
        <form action="usertpServ">
            <input type="submit" value="ShowValues">
        </form>
        <table border="1px">
        <%
            if(request.getAttribute("al")!=null){
                ArrayList<Login> al = (ArrayList<Login>)request.getAttribute("al");
                for(int i=0;i<al.size();i++){
                    Login l = al.get(i);
                    %>
                    <tr>
                        <td><%=l.getEmail()%></td>
                        <td><%=l.getPassword()%></td>
                        <td><a href="UpdateServlet?Loginid=<%=l.getLoginId()%>">Update</a></td>
                        <td><a href="DeleteServlet?Loginid=<%=l.getLoginId()%>">Delete</a></td>
                    </tr>
                    <%
                }
            }
        %>
        </table>
    </body>
</html>
