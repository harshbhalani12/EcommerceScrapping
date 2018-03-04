<%-- 
    Document   : AdminPage
    Created on : 24 Feb, 2017, 8:37:54 AM
    Author     : Admin
--%>

<%@page import="model.Product"%>
<%@page import="java.util.ArrayList"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Edit Product Page</title>
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
    </head>
    <body>
        <!-- ADMIN HEADER STARTS -->
        <%@ include file="ServiceProviderHeader.jsp" %>
        <!-- ADMIN HEADER ENDS -->
        
        <%
//            HttpSession hs = request.getSession();
//            String name = hs.getAttribute("Name").toString();
//            String id = hs.getAttribute("LoginId").toString();
//            //out.println("LoginId" + hs.getAttribute("LoginId"));
        %>
        <!--....................ADMIN PAGE CONTENT.................. -->
        <section id="main" style="padding: 2em;">
            <div class="container">
                <div class="row">
                    <div class="col-md-3">
                        <div class="list-group">
                            <%@include file='ServiceProviderLink.jsp' %>
                        </div>

                        <div class="well" style="padding:0;">
                            <canvas id="canvas" width="500" height="500" style="display: none;"></canvas>
                            <img id="myImage" width="260" height="260"/>

                            <script src="js/clock.js"></script>

                        </div>


                    </div>
                    <div class="col-md-9">
                        <!-- Website Overview -->
                        <div class="panel panel-default">
                            <div class="panel-heading main-color-bg">
                                <h3 class="panel-title">Add Product</h3>
                            </div>
                            <div class="panel-body">
                                <%
                                    if(request.getAttribute("al")!=null){
                                        ArrayList<Product> al = (ArrayList<Product>)request.getAttribute("al");
                                        for(int i=0;i<al.size();i++){
                                            Product p = al.get(0);
                                            %>
                                            <form action="EditProductInDbServlet" method="POST" class="form-horizontal" enctype="multipart/form-data">
                                                <div class="form-group">
                                                    <div class="col-sm-3">
                                                        <label>Product Name : </label>
                                                    </div>
                                                    <div class="col-sm-9">
                                                        <input type="text" name="productName" value="<%=p.getPName()%>">
                                                    </div>
                                                </div>

                                                <div class="form-group">
                                                    <div class="col-sm-3">
                                                        <label>Product Category : </label>
                                                    </div>
                                                    <div class="col-sm-9">
                                                        <input type="text" name="productCategory" value="<%=p.getPCategory()%>">
                                                    </div>
                                                </div>

                                                <div class="form-group">
                                                    <div class="col-sm-3">
                                                        <label>Product SubCategory : </label>
                                                    </div>
                                                    <div class="col-sm-9">
                                                        <input type="text" name="productSubCategory" value="<%=p.getPSubCategory()%>">
                                                    </div>
                                                </div>

                                                <div class="form-group">
                                                    <div class="col-sm-3">
                                                        <label>Product Price : </label>
                                                    </div>
                                                    <div class="col-sm-9">
                                                        <input type="text" name="productPrice" value="<%=p.getPPrice()%>">
                                                    </div>
                                                </div>

                                                <div class="form-group">
                                                    <div class="col-sm-3">
                                                        <label>Product Description : </label>
                                                    </div>
                                                    <div class="col-sm-9">
                                                        <textarea rows="3" name="productDescription">
                                                            <%=p.getPDescri()%>
                                                        </textarea>

                                                    </div>
                                                </div>

                                                <div class="form-group">
                                                    <div class="col-sm-3">
                                                        <label>Offers : </label>
                                                    </div>
                                                    <div class="col-sm-9">
                                                        <input type="text" name="productOffers" value="<%=p.getPOffers()%>">
                                                    </div>
                                                </div>

                                                <div class="form-group">
                                                    <div class="col-sm-3">
                                                        <label>Product Image : </label>
                                                    </div>
                                                    <div class="col-sm-9">
                                                        <input type="file" src="images1/<%=p.getPImage()%>" name="productImage" multiple>
                                                    </div>
                                                </div>

                                                <div class="form-group">
                                                    <div class="col-sm-offset-2">

                                                        <input type="submit" value="Edit Product" class="btn btn-primary">
                                                    </div>
                                                </div>
                                            </form>
                                            <%
                                        }
                                    }
                                %>
                                
                            </div>
                        </div>

                        <!-- Latest Users -->
                        <div class="panel panel-default">
                            <div class="panel-heading">
                                <h3 class="panel-title">Latest Users</h3>
                            </div>
                            <div class="panel-body">
                                <table class="table table-striped table-hover">
                                    <tr>
                                        <th>Name</th>
                                        <th>Email</th>
                                        <th>Joined</th>
                                    </tr>
                                    <tr>
                                        <td>Jill Smith</td>
                                        <td>jillsmith@gmail.com</td>
                                        <td>Dec 12, 2016</td>
                                    </tr>
                                    <tr>
                                        <td>Eve Jackson</td>
                                        <td>ejackson@yahoo.com</td>
                                        <td>Dec 13, 2016</td>
                                    </tr>
                                    <tr>
                                        <td>John Doe</td>
                                        <td>jdoe@gmail.com</td>
                                        <td>Dec 13, 2016</td>
                                    </tr>
                                    <tr>
                                        <td>Stephanie Landon</td>
                                        <td>landon@yahoo.com</td>
                                        <td>Dec 14, 2016</td>
                                    </tr>
                                    <tr>
                                        <td>Mike Johnson</td>
                                        <td>mjohnson@gmail.com</td>
                                        <td>Dec 15, 2016</td>
                                    </tr>
                                </table>
                            </div>
                        </div>
                    </div>
                </div>
            </div>
        </section>
        <!--....................ADMIN PAGE CONTENT over.................. -->
    </body>
</html>
