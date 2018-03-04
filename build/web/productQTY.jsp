<%-- 
    Document   : ajaxtp
    Created on : 13 Mar, 2017, 3:21:39 PM
    Author     : Admin
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>

    </head>
    <body>
        <h1>Hello World!</h1>
        <form method="POST" action="ajaxtpservadd" id="form1">
            <input type="text" name="qty" class="qty key" value="1"><br>
            <input type="text" name="price" class="price1" value="1000"><br>
            
            <input type="text" name="total" id="total"><br>
            <input type="submit" value="Add">
        </form>
        <p id="p"></p>
    </body>
</html>

<script src="js/jquery.min.js"></script>
<script type="text/javascript">
    $(document).ready(function(){
        $("#total").val($(".price1").val());
        function calc(){
            var qty = ($(".qty").val()!= "") ? parseInt($(".qty").val()) : 0;
            var price = ($(".price1").val()!= "") ? parseInt($(".price1").val()) : 0;
            //var num2 = parseInt($(".num2").val());
            $("#total").val(qty*price);
        }
        $(".key").keyup(function(){
            calc();
        });
    });
</script>
<script type="text/javascript">
    var form = $('#form1');
//    $.get('ajaxtpservadd',{
//        data:form.serialize()
//    },function(response){
//        
//        $.each(response, function(index,value){
//            $('#p').append(value);
//        });
//    });
    form.submit(function () {

        $.ajax({
            type: form.attr('method'),
            url: form.attr('action'),
            data: form.serialize(),
            success: function (data) {
                var result = data;
                $('#result').attr("value", result);
//                $.each(data,function(){
//                    $('#p').append(result);
//                });
                $('#p').append(result);
            }
        });

        return false;
    });
</script>

