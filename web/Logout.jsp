<%-- 
    Document   : Logout
    Created on : 2 May, 2017, 8:18:32 PM
    Author     : Admin
--%>

<!DOCTYPE html>
<!--<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Hello World!</h1>
    </body>
</html>-->
<%
    session.invalidate();
    response.sendRedirect("Login.jsp");
%>
