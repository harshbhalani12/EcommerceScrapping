<%-- 
    Document   : imguploadtp
    Created on : 10 Mar, 2017, 8:19:13 AM
    Author     : Admin
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <form action="imgupserv" method="post" enctype="multipart/form-data">
            <input type="file" name="file"><br/>
            <input type="submit" value="submit">
            
        </form>
    </body>
</html>
