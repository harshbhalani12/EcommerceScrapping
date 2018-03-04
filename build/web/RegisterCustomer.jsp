<%-- 
    Document   : Register
    Created on : 30 Jan, 2017, 3:43:31 PM
    Author     : Admin
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Register</title>
        <link href="css/bootstrap.css" rel='stylesheet' type='text/css' />
        <link href="css/style.css" rel='stylesheet' type='text/css' />

        <link href="css/feedbackstyle.css" rel='stylesheet' type='text/css' />

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
            .modal {
                display:hidden; /* Hidden by default */
                position: fixed; /* Stay in place */
                z-index: 100000;/*sit on top */
                left: 0;
                top: 0;
                width: 100%; /* Full width */
                height: 100%; /* Full height */
                overflow: auto; /* Enable scroll if needed */
                background-color: rgb(0,0,0); /* Fallback color */
                background-color: rgba(0,0,0,0.4); /* Black w/ opacity */
            }
            .modal-content {
                background-color: #fefefe;
                margin: 15% auto; /* 15% from the top and centered */
                padding: 20px;
                border: 1px solid #888;
                width: 80%; /* Could be more or less, depending on screen size */
            }
        </style>
    </head>
    <body>

        <!-- .................... Header goes here........................ -->

        <%@ include file="Header.jsp" %> 

        <!-- .................... Header ends............................ -->


        <div class="main">
            <div class="shop_top">
                <div class="container">
                    <form action="RegisterServlet"> 
                        <div class="register-top-grid">
                            <h3>PERSONAL INFORMATION</h3>
                            <div>
                                <span>First Name<label>*</label></span>
                                <input type="text" name="firstName"> 
                            </div>
                            <div>
                                <span>Last Name<label>*</label></span>
                                <input type="text" name="lastName"> 
                            </div>
                            <div>
                                <span>Email Address<label>*</label></span>
                                <input type="text" name="Email"> 
                            </div>
                            <div>
                                <span>Mobile Number<label>*</label></span>
                                <input type="text" name="mobileNumber">
                            </div>
                            <div>
                                <span>Address<label>*</label></span>
                                <!-- <input type="textarea">-->
                                <textarea class="form-control" rows="3" name="address"></textarea>
                            </div>

                            <div class="clear"> </div>

                            <div class="clear"> </div>
                        </div>
                        <div class="clear"> </div>



                        <div class="register-bottom-grid">
                            <h3>LOGIN INFORMATION</h3>
                            <div>
                                <span>Password<label>*</label></span>
                                <input type="text" name="password">
                            </div>
                            <div>
                                <span>Confirm Password<label>*</label></span>
                                <input type="text" name="confirmPassword">
                            </div>
                            <div class="clear"> </div>
                        </div>
                        <div class="clear"> </div>
                        <input type="submit" value="Submit" class="btn btn-primary pull-right">
                    </form>
                </div>
            </div>
        </div>

        
        <!-- .................... Footer goes here........................ -->

        <%@ include file="Footer.jsp" %>

        <!-- .................... Footer ends ........................ -->

    </body>
</html>
