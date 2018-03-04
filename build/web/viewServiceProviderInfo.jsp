<%-- 
    Document   : viewServiceProviderInfo
    Created on : 24 Feb, 2017, 11:02:42 AM
    Author     : Admin
--%>


<%@page import="model.Login"%>
<%@page import="model.RegisterServiceProvider"%>
<%@page import="java.util.ArrayList"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
        <link href="css/bootstrap.css" rel='stylesheet' type='text/css' />
        <link href="css/bootstrap.min.css" rel='stylesheet' type='text/css' />
        <link href="css/style_1.css" rel='stylesheet' type='text/css' />

        <link href="css/font_awesome.css" rel='stylesheet' type='text/css' />
        <link href="css/adminheadercss.css" rel='stylesheet' type='text/css' />

        <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css">

        <meta name="viewport" content="width=device-width, initial-scale=1, maximum-scale=1">
        <meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
        <link href='http://fonts.googleapis.com/css?family=Open+Sans:400,300,600,700,800' rel='stylesheet' type='text/css'>
        <script type="application/x-javascript"> addEventListener("load", function() { setTimeout(hideURLbar, 0); }, false); function hideURLbar(){ window.scrollTo(0,1); } </script>
        <script src="js/jquery.min.js"></script>
        <script type="text/javascript">
            $(document).ready(function () {
                $(".dropdown img.flag").addClass("flagvisibility");

                $(".dropdown dt a").click(function () {
                    $(".dropdown dd ul").toggle();
                });

                $(".dropdown dd ul li a").click(function () {
                    var text = $(this).html();
                    $(".dropdown dt a span").html(text);
                    $(".dropdown dd ul").hide();
                    $("#result").html("Selected value is: " + getSelectedValue("sample"));
                });

                function getSelectedValue(id) {
                    return $("#" + id).find("dt a span.value").html();
                }

                $(document).bind('click', function (e) {
                    var $clicked = $(e.target);
                    if (!$clicked.parents().hasClass("dropdown"))
                        $(".dropdown dd ul").hide();
                });


                $("#flagSwitcher").click(function () {
                    $(".dropdown img.flag").toggleClass("flagvisibility");
                });
            });
        </script>

    </head>
    <body>
        <!-- ADMIN HEADER STARTS -->
        <%@ include file="AdminHeader.jsp" %>
        <!-- ADMIN HEADER STARTS -->

        <section id="main" style="padding: 2em;">
            <div class="container">
                <div class="row">
                    <div class="col-md-3">
                        <div class="list-group">
                            <%@include file='AdminVerticalHeader.jsp' %>
<!--                            <a href="index.html" class="list-group-item active main-color-bg">
                                <span class="fa fa-user-circle" aria-hidden="true"></span> Welcome Harsh <span><i class="fa fa-power-off pull-right"></i></span>
                            </a>
                            <a href="pages.html" class="list-group-item"><span class="fa fa-user" aria-hidden="true"></span><span style="padding:5px;">Total Users</span> <span class="badge">12</span></a>
                            <a href="posts.html" class="list-group-item"><span class="fa fa-eye" aria-hidden="true"></span><span style="padding:0px;"> Visitors </span><span class="badge">33</span></a>
                            <a href="users.html" class="list-group-item"><span class="fa fa-group" aria-hidden="true"></span> New Users <span class="badge">203</span></a>
                            <a href="users.html" class="list-group-item"><span class="fa fa-shopping-cart" aria-hidden="true"></span> Sales <span class="badge">203</span></a>-->
                        </div>

                        <div class="well" style="padding:0;">
                            <canvas id="canvas" width="500" height="500" style="display: none;"></canvas>
                            <img id="myImage" width="260" height="260"/>
                            <script src='js/clock.js'>

                            </script>

                        </div>


                    </div>
                    <div class="col-md-9">


                        <!-- Latest Users -->
                        <div class="panel panel-default">
                            <div class="panel-heading">
                                <h3 class="panel-title">Service Provider Info</h3>
                            </div>
                            <div class="panel-body">
                                <table class="table">
                                    <%
                                        if (request.getAttribute("RegisterAL") != null) {
                                            ArrayList<RegisterServiceProvider> al = (ArrayList<RegisterServiceProvider>) request.getAttribute("RegisterAL");
                                            String name,email = null;
                                            for (int i = 0; i < al.size(); i++) {
                                                RegisterServiceProvider r = al.get(i);
                                                name = r.getFirstName()+" "+r.getLastName();
                                                
                                            %>
                                    
                                    <!--
                                    <tr> 
                                        <td>Name : </td>
                                        <td></td>
                                    </tr>
                                    -->
                                    
                                    <%
                                    }
                                    }
                                    %>
                                    
                                    <%
                                        if (request.getAttribute("RegisterAL") != null) {
                                            ArrayList<RegisterServiceProvider> al = (ArrayList<RegisterServiceProvider>) request.getAttribute("RegisterAL");
                                            String name = null;
                                            String mobileNo,address,companyName,brandName,productCategory,experiance= null;
                                            for (int i = 0; i < al.size(); i++) {
                                                RegisterServiceProvider r = al.get(i);
                                                name = r.getFirstName()+" "+r.getLastName();
                                                mobileNo = r.getMobileNo();
                                                address = r.getAddress();
                                                companyName = r.getCompanyName();
                                                brandName = r.getBrandName();
                                                productCategory =r.getProductCategory();
                                                experiance = r.getExperiance();
                                                %>
                                                <tr>
                                                    <td>Name : </td>
                                                    <td><%=name%></td>
                                                </tr>
                                                <tr>
                                                    <td>Mobile Number: </td>
                                                    <td><%=mobileNo%></td>
                                                </tr>
                                                <tr>
                                                    <td>Address: </td>
                                                    <td><%=address%></td>
                                                </tr>
                                                <tr>
                                                    <td>Company Name: </td>
                                                    <td><%=companyName%></td>
                                                </tr>
                                                <tr>
                                                    <td>Brand Name: </td>
                                                    <td><%=brandName%></td>
                                                </tr>
                                                <tr>
                                                    <td>Product Category: </td>
                                                    <td><%=productCategory%></td>
                                                </tr>
                                                <tr>
                                                    <td>Experiance: </td>
                                                    <td><%=experiance%></td>
                                                </tr>
                                                <%
                                            }                                           
                                        }
                                        int loginId;
                                        if(request.getAttribute("LoginAL")!=null){
                                            ArrayList<Login> a = (ArrayList<Login>)request.getAttribute("LoginAL");
                                            String email = null;
                                            for (int i = 0; i < a.size(); i++) {
                                                Login l  = a.get(i);
                                                email = l.getEmail();
                                                loginId = l.getLoginId();
                                                %>
                                                <tr>
                                                    <td>Email ID : </td>
                                                    <td><%=email%></td>
                                                </tr>
                                                <tr>
                                                    <td></td>
                                                    <td>
                                                        <a href="updateServiceProviderStatus?id=<%=loginId%>" 
                                                           class="btn-danger" 
                                                           style="text-decoration: none; padding:5px; border-radius: 5px; margin-left: 10px;">
                                                            Accept
                                                        </a>
                                                    </td>
                                                </tr>
                                                <%
                                            }       
                                        }
                                     %>
                                    
                                    
                                    

                                </table>
                            </div>
                        </div>
                    </div>
                </div>
            </div>
        </section>
    </body>
</html>
