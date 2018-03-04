<%-- 
    Document   : Login
    Created on : 30 Jan, 2017, 4:08:03 PM
    Author     : Admin
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Login</title>
        <link href="css/bootstrap.css" rel='stylesheet' type='text/css' />

        <link href="css/bootstrap.min.css" rel='stylesheet' type='text/css' />

        <link href="css/style.css" rel='stylesheet' type='text/css' />

        <link href="css/feedbackstyle.css" rel='stylesheet' type='text/css' />

        <meta name="viewport" content="width=device-width, initial-scale=1, maximum-scale=1">
        <meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
        <link href='http://fonts.googleapis.com/css?family=Open+Sans:400,300,600,700,800' rel='stylesheet' type='text/css'>
        <!--        <script type="application/x-javascript"> addEventListener("load", function() { setTimeout(hideURLbar, 0); }, false); function hideURLbar(){ window.scrollTo(0,1); } </script>
        -->    
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
            #myBtn{
                background: url('images/feedback.png');
                left: 0px;
                top: 250px;
                height: 108px;
                width: 45px;
                margin: 0;
                padding: 0;
                position: fixed;
                z-index: 1;
                display:block;
            }
            #myBtn1{
                //background: url('images/feedback.png');
                left: 0px;
                top: 370px;
                height: 108px;
                width: 45px;
                margin: 0;
                padding: 0;
                position: fixed;
                z-index: 1;
                display:block;
            }
            .modal {
                display:hidden; /* Hidden by default */
                position: fixed; /* Stay in place */
                z-index: 100000;/*sit on top */
                left: 0;
                top: 0;
                width: 100%; /* Full width */
                height: 100%; /* Full height */
                overflow: hidden; /* Enable scroll if needed */
                background-color: rgb(0,0,0); /* Fallback color */
                background-color: rgba(0,0,0,0.4); /* Black w/ opacity */
            }
            .modal-content {
                background-color: #fefefe;
                margin: 15% auto; /* 15% from the top and centered */
                padding: 20px;
                border: 1px solid #888;
                width: 80%; /* Could be more or less, depending on screen size */
                box-shadow: 0 4px 8px 0 rgba(0,0,0,0.2),0 6px 20px 0 rgba(0,0,0,0.19);
                -webkit-animation-name: animatetop;
                -webkit-animation-duration: 0.4s;
                animation-name: animatetop;
                animation-duration: 0.4s
            }
            /* Add Animation */
            @-webkit-keyframes animatetop {
                from {top: -300px; opacity: 0} 
                to {top: 0; opacity: 1}
            }

            @keyframes animatetop {
                from {top: -300px; opacity: 0}
                to {top: 0; opacity: 1}
            }


        </style>

        <script>
            function myFun() {
                var logoutid = document.getElementById('logoutId');
                logoutid.style.display = "none";
            }
        </script>

    </head>
    <body>

        <!-- ................header starts....................... -->
        <%@ include file="Header.jsp" %> 
        <!-- ................header ends   ....................... -->

        <%
            //HttpSession hs = request.getSession();
            //String name = hs.getAttribute("Name").toString();
//            HttpSession hs = request.getSession(false);
//            if (hs == null) {
//                out.println("null................");
//            } else {
//                String id = hs.getAttribute("LoginId").toString();
//                out.println(id);
//            }
            HttpSession hs = request.getSession(false);
            String loginId = (String) hs.getAttribute("loginId");
            if (loginId == null) {
        %>
        <script>
            myFun();
        </script>
        <%
                //out.println("SESSIOON NULL......");
                //request.getRequestDispatcher("Cart_no_login.jsp").forward(request, response);
            }
        %>
        
        <div class="main">
            <div class="shop_top">
                <div class="container">
                    <div class="col-md-6">
                        <div class="login-page">
                            <h4 class="title">New Customers</h4>
                            <p>Lorem ipsum dolor sit amet, consectetuer adipiscing elit, sed diam nonummy nibh euismod tincidunt ut laoreet dolore magna aliquam erat volutpat. Ut wisi enim ad minim veniam, quis nostrud exerci tation ullamcorper suscipit lobortis nisl ut aliquip ex ea commodo consequat. Duis autem vel eum iriure dolor in hendrerit in vulputate velit esse molestie consequat, vel illum dolore eu feugiat nulla facilisis</p>
                            <div class="button1">
                                <a href="Register.jsp"><input type="submit" name="Submit" value="Create an Account"></a>
                            </div>
                            <div class="clear"></div>
                        </div>
                    </div>
                    <div class="col-md-6">
                        <div class="login-title">
                            <h4 class="title">Registered Customers</h4>
                            <div id="loginbox" class="loginbox">
                                <form action="LoginServlet" name="login" id="login-form">
                                    <fieldset class="input">
                                        <p id="login-form-username">
                                            <label for="modlgn_username">Email</label>
                                            <input id="modlgn_username" type="text" name="email" class="inputbox" size="18">
                                        </p>
                                        <p id="login-form-password">
                                            <label for="modlgn_passwd">Password</label>
                                            <input id="modlgn_passwd" type="text" name="password" class="inputbox" size="18">
                                        </p>
                                        <div class="remember">
                                            <p id="login-form-remember">
                                                <label for="modlgn_remember"><a href="ForgotPassword.jsp">Forget Your Password ? </a></label>
                                            </p>
                                            <input type="submit" class="button" value="Login"><div class="clear"></div>
                                        </div>
                                    </fieldset>
                                </form>
                            </div>
                        </div>
                        <div class="clear"></div>
                    </div>
                </div>
            </div>
        </div>






        <!-- ...........footer goes here.................... -->
        <%@include file="Footer.jsp" %>
        <!--............ footer ends........................ -->

        <%@include file="Feedback.jsp"%>
        
    </body>
    
</html>
<script>
    $(document).ready(function (){
        
    });
</script>