<%-- 
    Document   : ServiceProviderLink
    Created on : 13 May, 2017, 9:16:16 AM
    Author     : Admin
--%>
<script>
    $(document).ready(function () {
        //alert("SP link alert");
        $.ajax({
            type: "POST",
            url: 'dbCon',
            success: function (data) {
                //alert(data);
                $('#viewProduct').html(data);
                $('#manageProduct').html(data);
            }
        });
    });
</script>
<a href="#" class="list-group-item active main-color-bg">
    <span class="fa fa-user-circle" aria-hidden="true"></span>
    Welcome  
    <!--    <a href = "Logout.jsp" style="background-color: #fff; text-decoration: none; ">Logout</a>-->
    <!--        <span>
                <i class="fa fa-power-off pull-right"></i>
            </span>-->
    <span class="fa fa-power-off pull-right"><a href="Logout.jsp"></a></span>

</a>
<a href="ServiceProviderPage.jsp" class="list-group-item">
    <span class="fa fa-plus" aria-hidden="true"></span>
    <span style="padding:5px;">Add Product</span>
    <span class="badge"></span>
</a>
<a href="ViewProductServlet" class="list-group-item">
    <span class="fa fa-eye" aria-hidden="true"></span>
    <span style="padding:0px;"> View All Products</span>
    <span class="badge" id="viewProduct">0</span>
</a>
<a href="ViewProductServlet" class="list-group-item">
    <span class="fa fa-gears" aria-hidden="true"></span> Manage Products
    <span class="badge" id="manageProduct">0</span>
</a>
<a href="#" class="list-group-item">
    <span class="fa fa-shopping-cart" aria-hidden="true"></span> 
    Sales 
    <span class="badge">0</span>
</a>