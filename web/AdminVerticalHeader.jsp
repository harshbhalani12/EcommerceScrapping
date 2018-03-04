<%-- 
    Document   : AdminVerticalHeader
    Created on : 13 May, 2017, 10:34:20 PM
    Author     : Admin
--%>
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
                        $('#serviceProvider').html(list[2]);
                        
                        $('#totalUsers').html(list[0]);
                        $('#newUsers').html(list[1]);
                    }
                });
            });
        </script>
<a href="#" class="list-group-item active main-color-bg">
    <span class="fa fa-user-circle" aria-hidden="true"></span> Welcome Harsh <span>
        <a href="Logout.jsp"><i class="fa fa-power-off pull-right"></i></a>
    </span>
</a>
<a href="TotalUsersShow" class="list-group-item">
    <span class="fa fa-user" aria-hidden="true"></span>
    <span style="padding:5px;">Total Users</span> 
    <span class="badge" id="totalUser">0</span>
</a>
<a href="#" class="list-group-item">
    <span class="fa fa-eye" aria-hidden="true"></span>
    <span style="padding:0px;"> Visitors </span>
    <span class="badge">0</span></a>
<a href="TotalUsersShow" class="list-group-item">
    <span class="fa fa-group" aria-hidden="true"></span> New Users 
    <span class="badge" id="newUser">0</span>
</a>
<a href="TotalServiceProviderShow" class="list-group-item">
    <span class="fa fa-shopping-cart" aria-hidden="true"></span> Service Provider
    <span class="badge" id="serviceProvider">0</span>
</a>
