

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
        <%
            HttpSession hs = request.getSession();
            //String name = hs.getAttribute("Name").toString();
            String id = hs.getAttribute("LoginId").toString();
            //out.println(id);
        %>

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
                                    <div class="row">
                                        <!--<div class="col-md-1"><b>Sr No.</b></div>-->
                                        <div class="col-md-2"><b>Product Image</b></div>
                                        <div class="col-md-2"><b>Product Name</b></div>
                                        <div class="col-md-2"><b>Price</b></div>
                                        <div class="col-md-2"><b>Quantity</b></div>
                                        <div class="col-md-2"><b>Total</b></div>
                                        <div class="col-md-1"><b>Action</b></div>
                                    </div>
                                    <hr>
                                    <%
                                        if(request.getAttribute("al")!=null){
                                            ArrayList<Cart1> al = (ArrayList<Cart1>)request.getAttribute("al");
                                            for(int i=0;i<al.size();i++){
                                                Cart1 c = al.get(i);
                                                String pimage = c.getProductImage();
                                                String pname = c.getProductName();
                                                int price1 = c.getPrice();
                                                int qty1 = c.getQty();
                                                int total1 = c.getTotal();
                                                int cid1 = c.getCId();
                                                int pid1 = c.getPId();
                                                String qty = Integer.toString(qty1);
                                                String pid = Integer.toString(pid1);
                                                String price = Integer.toString(price1);
                                                String total = Integer.toString(total1);
                                               
                                                //out.println("QUANTATITY  : "+qty);
                                                //c.getP
                                                %>
                                                <div class="row cart-row">
                                                    <!--<div class="col-sm-1"><b><%//i+1%></b></div>-->
                                                    <div class="col-md-2"><img src="images1/<%=pimage%>" height="100px" width="100px"></div>
                                                    <div class="col-md-2"><%=pname%></div>
                                                    <form>
                                                        <div class="col-md-2">
                                                            <input type="text" class="qty" pid="<%=pid%>" id="qty-<%=pid%>" value="<%=qty%>" style="width:50px;">
                                                            <button class="plusbtn" pid="<%=pid%>" id="plus-<%=pid%>"><i class="fa fa-plus"></i></button>
                                                            <button class="minusbtn" pid="<%=pid%>" id="minus-<%=pid%>"><i class="fa fa-minus"></i></button>
                                                        </div>
                                                    
                                                        <div class="col-md-2">
                                                            <i>&#8377;</i>
                                                            <input type="text" class="price" pid="<%=pid%>" id="price-<%=pid%>" value="<%=price%>" style="width:100px;" disabled>
                                                        </div>
                                                    
                                                            <input type="hidden" value="<%=c.getCId()%>">
                                                            <input type="hidden" value="<%=c.getPId()%>">
                                                        
                                                        <div class="col-md-2">
                                                            <i>&#8377;</i>
                                                            <input type="text" class="total" pid="<%=pid%>" id="total-<%=pid%>" value="<%=total%>"style="width:100px;" disabled>
                                                        </div>
                                                    
                                                        <div class="col-md-2">
                                                            <a href="DeleteFromCart?cid=<%=cid1%>" class="btn btn-danger"><span class="fa fa-trash"></span></a>
                                                            <a class="btn btn-primary update" pid="<%=pid%>" cid="<%=cid1%>" style="margin-left: 5px;"><span class="fa fa-check"></span></a>
                                                            
                                                        </div>
                                                    </form>
                                                </div>
                                                        <hr>
                                                
                                        <%
                                    }
                                }
                            %>
                                    <div class="col-md-6"></div>    
                                    <div class="col-md-2"><b>Total Amount:</b></div>
                                    <div class="col-md-4"><i>&#8377;</i><input type="text" id="totalamt" value="0" style="width:150px; margin-left: 5px;" disabled></div>
                                    <div style="float: right;">
                                        <a href="CheckOut.jsp" style="background-color: #00AAF0; color: #fff; padding:10px;border-radius: 5px;">
                                            CheckOut
                                        </a>
                                    </div>
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
