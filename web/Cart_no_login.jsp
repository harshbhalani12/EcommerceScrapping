

<%@page import="model.Cart1"%>

<%@page import="model.Product"%>
<%@page import="java.util.ArrayList"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Cart</title>
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
        

        <div class="main">
            <div class="shop_top">
                <div class="container">
                    <div class="row">
                        
                        <div class="col-md-12">
                            <div class="panel panel-primary">
                                <div class="panel-heading">
                                    
                                </div>
                                <div class="panel-body">
                                    <div class="row" style='padding: 15px;'>
                                        <h3>Please Login First to see your Cart's product.</h3>
                                        
                                        <a href='Login.jsp' style='background-color: #000; padding:8px 25px; color: #fff;border-radius: 5px;'>
                                            Login</a>    
                                    
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
    $(document).ready(function (){
        var st = parseInt(0);
        $(".total").each(function(){
            //alert(0);
            var subt = $(this).val();
            //alert("SubT : "+subt);
            //var q = $(i).val();
            st = st + parseInt(subt);
            //alert(st);
        });
        $("#totalamt").val(st);
    });
    
    
    $("body").delegate(".qty","keyup",function (){
        //alert(0);
        var pid = $(this).attr("pid");
        //alert("PID : "+pid);
        var qty12 = $("#qty-"+pid).val();
        var price12 = $("#price-"+pid).val();
        var total12 = qty12*price12;
        //alert(total12);
        $("#total-"+pid).val(total12);
        
        //grand total
        var st = parseInt(0);
        $(".total").each(function(){
            //alert(0);
            var subt = $(this).val();
            //alert("SubT : "+subt);
            //var q = $(i).val();
            st = st + parseInt(subt);
            //alert(st);
        });
        $("#totalamt").val(st);
        //alert("total : "+st);
    });
  
   
    $(".plusbtn").click(function (){
        //alert("helo");
        var pid = $(this).attr("pid");
        //alert("PID : "+pid);
        var qty12 = $("#qty-"+pid).val();
        qty12++;
        $("#qty-"+pid).val(qty12);
        //alert(qty12);
        var price12 = $("#price-"+pid).val();
        var total12 = qty12*price12;
        //totalamt += total12; 
        //alert(total12);
        $("#total-"+pid).val(total12);
        //$("#totalamt").val(totalamt);
        var st = parseInt(0);
        $(".total").each(function(){
            //alert(0);
            var subt = $(this).val();
            //alert("SubT : "+subt);
            //var q = $(i).val();
            st = st + parseInt(subt);
            //alert(st);
        });
        $("#totalamt").val(st);
        return false;
    });
    
    $(".minusbtn").click(function (){
        //alert("helo");
        var pid = $(this).attr("pid");
        //alert("PID : "+pid);
        var qty12 = $("#qty-"+pid).val();
        if(qty12>1){
            qty12--;
            $("#qty-"+pid).val(qty12);
            //alert(qty12);
            var price12 = $("#price-"+pid).val();
            var total12 = qty12*price12;
            //alert(total12);
            $("#total-"+pid).val(total12);
            
            var st = parseInt(0);
            $(".total").each(function(){
                //alert(0);
                var subt = $(this).val();
                //alert("SubT : "+subt);
                //var q = $(i).val();
                st = st + parseInt(subt);
            //alert(st);
            });
        $("#totalamt").val(st);
        }
        return false;
    });
    
    $("body").delegate(".update","click",function(){
        //alert("update");
        var pid = $(this).attr("pid");
        var cid = $(this).attr("cid");
        alert(pid);
        var qty12 = $("#qty-"+pid).val();
        var total12 = $("#total-"+pid).val();
        alert(qty12 + "  "+total12);
        $.ajax({
            type: "POST",
            url: 'UpdateToCart?'+"cid="+cid+"&qty="+qty12+"&total="+total12,
            //data: form.serialize(),
            success: function (data) {
                var result = data;
                //$('#result').attr("value", result);
                $('#p').append(result);
            }
        });

        return false;
        
    });

    $(".qty").on("change",function(){
        
        
    });
    
</script>
