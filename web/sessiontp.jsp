<%-- 
    Document   : sessiontp
    Created on : 26 Apr, 2017, 8:50:14 AM
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
        <%
            HttpSession hs = request.getSession(false);
//            if(hs == null){
//                out.println("session null");
//            }
//            else{
//                out.println("session is not null"+(String)hs.getAttribute("LoginId"));
//            }
            String log = (String)hs.getAttribute("loginId");
            if(log == null){
                out.println("session null");
            }
            else{
                out.println("session is not null : "+ log);
                %>
                <div>
            kjcvlkcx
            vkjf,cm, 
            x'mvk jx,cm 
            c,m kvc,
             c,mk flv, '
             d;cvlifdkjvk[pf'fv4
             ;lkjvfolkcv
             dkvpofkvl
             eflvcfd
        </div>
                <%
            }
        %>
        
    </body>
</html>
