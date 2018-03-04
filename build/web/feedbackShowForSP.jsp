<%-- 
    Document   : feedbackShowForSP
    Created on : 3 May, 2017, 8:23:53 PM
    Author     : Admin
--%>

<%@page import="model.Feedback"%>
<%@page import="java.util.ArrayList"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Service Provider Page</title>
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
        
        <style>
            p {
                margin: 0 0 1em;
            }

            .comment {
                overflow: hidden;
                padding: 0 0 0.1em;
                border-bottom: 1px solid #ddd;
                margin: 0 0 1em;
                *zoom: 1;

            }

            .comment-body {
                overflow: hidden;
                margin-left:5.1em;
            }
            .comment-img {
                float: left;
                margin-right: 33px;
                border-radius: 5px;
                overflow: hidden;
            }

            .comment-img img {
                visibility: hidden;
                //display: block;
            }

            .comment .text {
                padding: 10px;
                border: 1px solid #e5e5e5;
                border-radius: 5px;
                background: #fff;
                width:45em;
            }

            .comment .text p:last-child {
                margin: 0;
            }

            .comment .attribution {
                margin: 0.5em 0 0;
                font-size: 14px;
                color: #666;
                top:10px;
            }

            /* Decoration */

            .comments,
            .comment {
                position: relative;
            }

            .comments:before,
            .comment:before,
            .comment .text:before {
                content: "";
                position: absolute;
                top: 0;
                left: 65px;
            }

            .comments:before {
                width: 3px;
                top: -20px;
                bottom: -20px;
                background: rgba(0,0,0,0.1);
            }

            .comment:before {
                width: 9px;
                height: 9px;
                border: 3px solid #fff;
                border-radius: 100px;
                margin: 16px 0 0 -6px;
                box-shadow: 0 1px 1px rgba(0,0,0,0.2), inset 0 1px 1px rgba(0,0,0,0.1);
                background: #ccc;
            }

            .comment:hover:before {
                background: orange;
            }

            .comment .text:before {
                top: 18px;
                left: 78px;
                width: 9px;
                height: 9px;
                border-width: 0 0 1px 1px;
                border-style: solid;
                border-color: #e5e5e5;
                background: #fff;
                -webkit-transform: rotate(45deg);
                -moz-transform: rotate(45deg);
                -ms-transform: rotate(45deg);
                -o-transform: rotate(45deg);
            }​
            .comment:hover{
                background: #00AAF0;
            }
        </style>
    </head>
    <body>
        <!-- ADMIN HEADER STARTS -->
        <%@ include file="ServiceProviderHeader.jsp" %>
        <!-- ADMIN HEADER ENDS -->
        
        <%
//            HttpSession hs = request.getSession();
//            String name = hs.getAttribute("Name").toString();
//            String id = hs.getAttribute("LoginId").toString();
            //out.println("LoginId" + hs.getAttribute("LoginId"));
        %>
        <!--....................SP PAGE CONTENT.................. -->
        <section id="main" style="padding: 2em;">
            <div class="container">
                <div class="row">
                    <div class="col-md-3">
                        <div class="list-group">
                            <%@include file='ServiceProviderLink.jsp' %>
<!--                            <a href="index.html" class="list-group-item active main-color-bg">
                                <span class="fa fa-user-circle" aria-hidden="true"></span> Welcome <%//name%> <span><i class="fa fa-power-off pull-right"></i></span>
                            </a>
                            <a href="AddProduct.jsp" class="list-group-item"><span class="fa fa-plus" aria-hidden="true"></span><span style="padding:5px;">Add Product</span> <span class="badge">12</span></a>
                            <a href="ViewProductServlet" class="list-group-item"><span class="fa fa-eye" aria-hidden="true"></span><span style="padding:0px;"> View All Products</span><span class="badge">33</span></a>
                            <a href="ManageProductServlet" class="list-group-item"><span class="fa fa-gears" aria-hidden="true"></span> Manage Products <span class="badge">203</span></a>
                            <a href="#" class="list-group-item"><span class="fa fa-shopping-cart" aria-hidden="true"></span> Sales <span class="badge">203</span></a>-->
                        </div>

                        <div class="well" style="padding:0;">
                            <canvas id="canvas" width="500" height="500" style="display: none;"></canvas>
                            <img id="myImage" width="260" height="260"/>

                            <script src="js/clock.js"></script>

                        </div>


                    </div>
                    <div class="col-md-9">
                        <!-- Website Overview -->
                        
                            
                      
                        <!--  feedbacks  -->
                        <div class="panel panel-default">
                            <div class="panel-heading">
                                <h3 class="panel-title">Recent Feedbacks</h3>
                            </div>
                            <div class="panel-body">
                                <section class="comments">
                                    <%
                                        if (request.getAttribute("al") != null) {
                                            ArrayList<Feedback> al = (ArrayList<Feedback>) request.getAttribute("al");
                                            for (int i = 0; i < al.size(); i++) {
                                                Feedback fb = al.get(i);
                                    %>
                                                <div class="comment">
                                                    <div class="comment-body">
                                                        <div class="text">
                                                            <p><%=fb.getFeedback()%></p>
                                                        </div>
                                                    </div>
                                                    <div style="margin-left:6em;">
                                                        <p class="attribution">  at <%=fb.getTime()%>, <%=fb.getDate()%></p>
                                                    </div>
                                                </div>
                                                <%
                                            }
                                        }
                                    %>
                                    <!--
                                    <div class="comment">

                                        <div class="comment-body">
                                            <div class="text">
                                                <p>Hello, this is an example from me</p>
                                            </div>

                                        </div>
                                        <div style="margin-left:6em;">
                                            <p class="attribution">  at 14:23pm, 4 Dec 2015</p>
                                        </div>
                                    </div>


                                    <div class="comment">



                                        <div class="comment-body">
                                            <div class="text">
                                                <p>Hello, this is an example from meHello, this is an example from meHello, this is an example from meHello, this is an example from meHello, this is an example from me
                                                    Hello, this is an example from meHello, this is an example from meHello, this is an example from meHello, this is an example from me
                                                    Hello, this is an example from meHello, this is an example from meHello, this is an example from meHello, this is an example from me</p>
                                            </div>


                                        </div>
                                        <div style="margin-left:6em;">
                                            <p class="attribution">  at 14:23pm, 4 Dec 2015</p>
                                        </div>
                                    </div>
                                    -->
                                </section>
                            </div>
                        </div>
                    </div>
                </div>
            </div>
        </section>
        <!--....................ADMIN PAGE CONTENT over.................. -->
    </body>
</html>
