<%-- 
    Document   : UserChat
    Created on : 1 Apr, 2017, 7:55:55 PM
    Author     : Admin
--%>

<%@page import="model.Register"%>
<%@page import="java.util.ArrayList"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Users!</h1>
        <%
            if (request.getAttribute("al") != null) {
                ArrayList<Register> al = (ArrayList<Register>) request.getAttribute("al");
                for (int i = 0; i < al.size(); i++) {
                    Register r = al.get(i);
                    //out.println(r.getFirstName());
                    %>
                    <%=r.getFirstName()%>
                    <a href="ChatServ?id=<%=r.getRegId()%>">Chat</a><br>
                    -----------------------<br>
                    <%
                }
            }
        %>
    </body>
</html>
