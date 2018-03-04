<%-- 
    Document   : AdminHeader
    Created on : 19 Feb, 2017, 9:19:20 PM
    Author     : Admin
--%>

<%@page import="model.RegisterServiceProvider"%>
<%@page import="model.Register"%>
<%@page import="java.util.ArrayList"%>
<%@page import="model.Login"%>
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
        <!--
       
        -->
        <style>
            .side-nav {
                position: absolute;
                width:60px;
                //width: 100%;
                height: 100vh;
                background-color: #35475e;
                z-index: 3;
                padding-top: 5px;
                //display: none;
            }
            .side-nav ul{
                list-style: none;
                padding: 0;
                margin: 0;
            }
            .side-nav ul li{
                padding: 20px 20px;
                border-bottom: 1px solid #333;
            }
            .side-nav ul li a{
                color:#fff;
                text-decoration: none;

            }
            .side-nav ul li a i{
                color:#fff;
            }
            .main-content{
                //padding: 3em;
                margin-top: 0;
                //padding: 0;
                //padding-top: 44px;
                height: 100%;

                margin-left: 65px;
                //overflow: scroll;
            }
            .side-nav ul:hover{
                color:#333;
                visibility: visible;
            }


        </style>
        <style>
            @keyframes burst{
                0%{
                    opacity:.6;
                }
                50%{
                    transform: scale(2.5);
                    opacity: 0;
                }
                100%{
                    opacity: 0;
                }

            }
            .user:hover .faa-burst.animated{
                animation: burst 3s infinite linear;
            }
            .usergroup:hover .faa-burst.animated{
                animation: burst 3s infinite linear;
            }
            .shoppingcart:hover .faa-burst.animated{
                animation: burst 3s infinite linear;
            }
            .visitors:hover .faa-burst.animated{
                animation: burst 3s infinite linear;
            }


        </style>
        <script>
            $(document).ready(function(){
                //alert(0);
                $.ajax({
                    url: 'GetDataForAdmin',
                    success:function(data){
                        //alert(data);
                        var list = $.parseJSON(data);
                        //alert(list);
                        $('#totalUser').html(list[0]);
                        $('#newUser').html(list[1]);
                        
//                        $('#totalUsers').html(list[0]);
//                        $('#newUsers').html(list[1]);
                    }
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
                            <a href="TotalUsersShow" class="list-group-item"><span class="fa fa-user" aria-hidden="true"></span><span style="padding:5px;">Total Users</span> <span class="badge" id="totalUser">12</span></a>
                            <a href="#" class="list-group-item"><span class="fa fa-eye" aria-hidden="true"></span><span style="padding:0px;"> Visitors </span><span class="badge">33</span></a>
                            <a href="TotalUsersShow" class="list-group-item"><span class="fa fa-group" aria-hidden="true"></span> New Users <span class="badge" id="newUser">203</span></a>
                            <a href="#" class="list-group-item"><span class="fa fa-shopping-cart" aria-hidden="true"></span> Sales <span class="badge">203</span></a>-->
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
                                <h3 class="panel-title">Latest Service Provider Requests</h3>
                            </div>
                            <div class="panel-body">
                                <table class="table table-striped table-hover">
                                    <tr>
                                        <!--<th>Name</th>-->
                                        <th>Email</th>
                                       
                                        <th>Request Status</th>
                                        <th>Decision</th>
                                    </tr>
                                    
                                    <%
                                            if(request.getAttribute("LoginAL")!=null){
                                            ArrayList<Login> al = (ArrayList<Login>)request.getAttribute("LoginAL");
                                            
                                            for(int i=0;i<al.size();i++){
                                                Login l = al.get(i);
                                                
                                                %>
                                                <tr>
                                                   
                                                    <td><%=l.getEmail()%></td>
                                                    
                                                    <td>
                                                        pending..
                                                    </td>
                                                    <td>
                                                        <a href="viewServiceProviderServlet?id=<%=l.getLoginId()%>" class="btn-info" style="text-decoration: none; padding:5px; border-radius: 5px;">
                                                            View
                                                        </a>
                                                    <!--</td>   
                                                    <td>-->
                                                        <a href="updateServiceProviderStatus?id=<%=l.getLoginId()%>" class="btn-danger" style="text-decoration: none; padding:5px; border-radius: 5px; margin-left: 10px;">
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
