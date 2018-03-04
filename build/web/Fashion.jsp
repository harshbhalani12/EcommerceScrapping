<%-- 
    Document   : Fashion
    Created on : 5 May, 2017, 6:46:19 AM
    Author     : Admin
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<%@page import="model.Product"%>
<%@page import="java.util.ArrayList"%>

<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Fashion</title>
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
                overflow: auto; /* Enable scroll if needed */
                background-color: rgb(0,0,0); /* Fallback color */
                background-color: rgba(0,0,0,0.4); /* Black w/ opacity */
            }

            .scrapmodal {
                display:none; /* Hidden by default */
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

        <script>
            function myFun() {
                var logoutid = document.getElementById('logoutId');
                logoutid.style.display = "none";
            }

            function scrapFun(name) {
                alert("scrap");
                alert(name);
                $.ajax({
                    type: "POST",
                    url: 'ScrapServlet' + "?pname=" + name,
                    //data: form.serialize(),
                    success: function (data) {
                        var result = data;
                        //alert(result);
                        //alert("Added to cart");
                        //$('#productmsg').html(result);
                        $('#model_body').html(result);
                    }
                });

                var scrapmodel = document.getElementById('myscrapModal');
                scrapmodel.style.display = "block";

                //var modal = document.getElementById("myModal");
                //var btn = document.getElementById("myBtn");
                var span = document.getElementsByClassName("close")[0];
                var close1 = document.getElementById('close1');

//            btn.onclick = function () {
//                modal.style.display = "block";
//            }
                span.onclick = function () {
                    scrapmodel.style.display = "none";
                }
                close1.onclick = function () {
                    scrapmodel.style.display = "none";
                }

// When the user clicks anywhere outside of the modal, close it
                window.onclick = function (event) {
                    if (event.target == modal) {
                        scrapmodel.style.display = "none";
                    }
                }
            }
        </script>
    </head>
    <body>

        <!-- .................... Header goes here........................ -->

        <%@ include file="Header.jsp" %> 

        <!-- .................... Header ends............................ -->
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
                    <div class="col-md-12" id="productmsg">
                        <!--                        <div class="alert alert-success" id="alertbox1" style="display: block;">
                                                    <a href="#" id="closealertbtn" class="close" data-dismiss="alert" area-label="close">&times;</a>
                                                    <b id="b"></b>
                                                </div>-->
                    </div>
                    <div class="row">
                        <%
                            if (request.getAttribute("al") != null) {
                                ArrayList<Product> al = (ArrayList<Product>) request.getAttribute("al");
                                for (int i = 0; i < al.size(); i++) {
                                    Product p = al.get(i);
                                    // p.getPCategory()
                        %>
                        <div class="col-sm-3">
                            <article class="col-item" style="border: none;">
                                <div class="photo">
                                    <div class="options">
                                        <button class="btn btn-default" type="submit" data-toggle="tooltip" data-placement="top" title="Add to wish list">
                                            <i class="fa fa-heart"></i>
                                        </button>
                                        <button class="btn btn-default" type="submit" data-toggle="tooltip" data-placement="top" title="Compare"
                                                onclick="scrapFun('<%=p.getPName()%>')">
                                            <a><i class="fa fa-exchange"></i></a>
                                        </button>
                                    </div>
                                    <div class="options-cart">
                                        <button class="btn btn-default" title="Add to cart">
                                            <span class="fa fa-shopping-cart"></span>
                                        </button>
                                    </div>
                                    <a href="#"> <img src="images1/<%=p.getPImage()%>" height="350px" width="275px;" class="" alt="Product Image" /> </a>
                                </div>
                                <div class="info">
                                    <div class="row">
                                        <div class="price-details col-md-6">
                                            <p class="details">
                                                <%=p.getPDescri()%>
                                            </p>
                                            <h1><%=p.getPName()%></h1>
                                            <span class="price-new">&#8377; <%=p.getPPrice()%></span>
                                        </div>
                                    </div>
                                    <div class="separator clear-left">
                                        <p class="btn-add">
                                            <i class="fa fa-shopping-cart"></i>
                                            <button id="btnatc" pid="<%=p.getPId()%>" class="hidden-sm addtocart"
                                                    style="background: none; border:none; color:blue;">
                                                Add To Cart</button>

<!--                                                        <a href="AddToCartServlet?pid=<%=p.getPId()%>" id="btnatc" pid="<%=p.getPId()%>" class="hidden-sm addtocart"
style="background: none; border:none; color:blue;">
Add To Cart</a>-->


                                            <!--
                                            <a href="AddToCartServlet?pid=<%=p.getPId()%>" class="hidden-sm addtocart">
                                                Add to cart
                                            </a>
                                            -->
                                        </p>
                                        <p class="btn-details">
                                            <a href="#" class="hidden-sm" data-toggle="tooltip" data-placement="top" title="Add to wish list"><i class="fa fa-heart"></i></a>
                                            <a href="#" class="hidden-sm" data-toggle="tooltip" data-placement="top" title="Compare"><i class="fa fa-exchange"></i></a>
                                        </p>
                                    </div>
                                </div>
                            </article>
                            <p class="text-center"></p>
                        </div>
                        <%
                                }
                            }
                        %>


                    </div>                  
                </div>
            </div>
        </div>

        <!-- .................... scraping goes here........................ -->

        <div class="scrapmodal" id="myscrapModal">
            <!-- Modal content-->
            <div class="modal-content">
                <div class="modal-header">
                    <button type="button" class="close" data-dismiss="modal">&times;</button>
                    <h4 class="modal-title">Suggested products from Amazon</h4>
                </div>
                <div class="modal-body" id="model_body">


                </div>
                <div class="modal-footer">

                    <button type="button" class="btn btn-default" id='close1' data-dismiss="modal">Close</button>
                </div>
            </div>
        </div>

        <!-- .................... scraping ends here........................ -->


        <%
//                          int count=0;
//                          for(int i=0;i<8;i++)
//                          {
//                              count++;
//                              if(count%3 == 0){
        %>
        <!--                                  <div class="row">
                                              <div class="col-sm-3">
                                                  hello <%//count%>
                                              </div>
                                          </div>-->
        <%
//                              }
//                              else
//                              {
        %>
        <!--                                  <div class="col-sm-3">
                                              hello <%//count%>
                                          </div>-->
        <%
//                              }
//                          }
%>

        <!--        <div class="row">
                    <div class="col-sm-3">
                        
                    </div>
                    <div class="col-sm-3">
                        
                    </div>
                    <div class="col-sm-3">
                        
                    </div>
                    
                </div>
                <div class="row">
                    <div class="col-sm-3">
                        hello 4
                    </div>
                    <div class="col-sm-3">
                        hello 5
                    </div>
                    <div class="col-sm-3">
                        hello 6
                    </div>
                </div>-->

        <!-- .................... Footer goes here........................ -->

        <%@ include file="Footer.jsp" %>

        <!-- .................... Footer ends ........................ -->
        <%@include file="Feedback.jsp" %>
    </body>
</html>

<script src="js/jquery.min.js"></script>
<script>
                                                    var cart = $('#cart');
                                                    cart.hover(function(){
                                                    //alert(0);
                                                    $.ajax({
                                                    type : "POST",
                                                            url: 'GetProductsOfCart',
                                                            success: function(data){
                                                            $('#productmsg').html(result);
                                                                    console.log("hello");
                                                            }
                                                    error: function(data){
                                                    console.log("error");
                                                    }
                                                    });
                                                    });
                                                            atc.click(function () {
                                                            //alert(0);

                                                            var pid = $(this).attr('pid');
                                                                    //alert(pid);
                                                                    $.ajax({
                                                                    type : "POST",
                                                                            url: 'AddToCartServlet' + "?pid=" + pid,
                                                                            //data: form.serialize(),
                                                                            success: function (data) {
                                                                            var result = data;
                                                                                    //alert("Added to cart");
                                                                                    $('#productmsg').html(result);
                                                                            }
                                                                    });
                                                                    return false;
                                                            });</script>
<script type="text/javascript">
            setTimeout(function(){
            $('#productmsg').hide();
            }, 3000);
            setInterval(function(){
            $('#productmsg').html("");
                    $('#productmsg').show();
            }, 4000);
            var closealertbtn = document.getElementById("closealertbtn");
            var alertbox1 = document.getElementById("alertbox1");
            closealertbtn.onclick = function () {
            alert("on close");
                    alertbox1.style.display = "none";
            }
</script>


<script>
    var atc = $('.addtocart');
            atc.click(function () {
            //alert(0);
            var pid = $(this).attr('pid');
                    //alert(pid);
                    $.ajax({
                    type : "POST",
                            url: 'AddToCartServlet' + "?pid=" + pid,
                            success: function (data) {
                            var result = data;
                                    $('#productmsg').html(result);
                            }
                    });
                    return false;
            });


</script>
