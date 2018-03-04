<%-- 
    Document   : CheckOut.jsp
    Created on : 15 May, 2017, 6:57:09 AM
    Author     : Admin
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>CheckOut</title>
        <link href="css/bootstrap.css" rel='stylesheet' type='text/css' />
        <link href="css/style.css" rel='stylesheet' type='text/css' />

        <link href="css/animate.css" rel="stylesheet" type="text/css"/>
        <link href="css/styleProduct.css" rel="stylesheet" type="text/css"/>
        <!--<link href="css/bootstrap.min.css" rel="stylesheet" type="text/css"/>
        -->
        <link href="css/font_awesome.css" rel='stylesheet' type='text/css' />
        <link href="css/faStyle.css" rel='stylesheet' type='text/css' />

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
            button :hover{

                color:#fff;
            }
        </style>
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
        <%
            HttpSession hs = request.getSession();
            //String name = hs.getAttribute("Name").toString();
            String id = hs.getAttribute("LoginId").toString();
            //out.println(id);
        %>
        <script>
            $(document).ready(function(){
                $.ajax({
                    url:'GetDataForCartCheckout',
                    success: function(data){
                        var list = $.parseJSON(data);
                        $('#Name').html(list[0]);
                        $('#Address').html(list[1]);
                        $('#Phone').html(list[2]);
                        $('#Amount').html(list[3]);
                    }
                });
            });
        </script>

        <div class="main">
            <div class="shop_top">
                <div class="container">
                    <div class="row">

                        <div class="col-md-12">
                            <div class="panel panel-primary">
                                <div class="panel-heading">
                                    Cart Checkout
                                </div>
                                <div class="panel-body">
                                    Products will be delivered to your address:<br><br>
                                    Name: <span id="Name"></span><br>
                                    Address: <span id="Address"></span><br>
                                    Phone No: <span id="Phone"></span><br>
                                    <br>
                                    Total amount payable :  <span id="Amount"></span> Rs.<br>
                                </div>
                                <div class="panel-footer">
                                    <p id="p">

                                    </p>
                                </div>
                            </div>
                        </div>


                    </div>                  
                </div>
            </div>
        </div>


        <!-- .................... Footer goes here........................ -->

        <%@ include file="Footer.jsp" %>

        <!-- .................... Footer ends ........................ -->
        <%@include file="Feedback.jsp" %>
    </body>
</html>
<script src="js/jquery.min.js"></script>
<script type="text/javascript">

</script>

