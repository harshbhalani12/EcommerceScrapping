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
        <form method="POST" action="ajaxtpserv1" id="form1">
            <input type="text" name="num1" class="num1 key"><br>
            <input type="text" name="num2" class="num2 key"><br>
            
            <input type="text" name="result" id="result"><br>
            <input type="submit" value="Submit">
        </form>
        <br><br>
        <input type="button" value="demo1" name="demo1" id="demo1"><br>
        <input type="button" value="demo2" name="demo2" id="demo2">
        <p id="p"></p>
    </body>
</html>

<script src="js/jquery.min.js"></script>
<script type="text/javascript">
    $(document).ready(function(){
        $("#result").val("0");
        function calc(){
            var num1 = ($(".num1").val()!= "") ? parseInt($(".num1").val()) : 0;
            var num2 = ($(".num2").val()!= "") ? parseInt($(".num2").val()) : 0;
            //var num2 = parseInt($(".num2").val());
            $("#result").val(num1+num2);
        }
        $(".key").keyup(function(){
            calc();
        });
    });
    var form = $('#form1');
    form.submit(function () {

        $.ajax({
            type: form.attr('method'),
            url: form.attr('action'),
            data: form.serialize(),
            success: function (data) {
                var result = data;
                //$('#result').attr("value", result);
                $('#p').append(result);
            }
        });

        return false;
    });
    
    var demo1btn = $("#demo1");
    demo1btn.click(function (){
        $.ajax({
            type: "POST",
            url: "jsonserv?id=demo1",
            success: function(data){
                var list = $.parseJSON(data);
                
                var s='';
                for(var i=0;i<list.length;i++){
                    //$('#p').append(data[i]);
                    s += "id : "+list[i].id + "<br>Qty : "+list[i].qty+"<br>Price : "+list[i].price+"<br>================<br>";
                }
                $('#p').append(s);
            }
        });
    });
    
    var demo2btn = $("#demo2");
    demo2btn.click(function (){
        $.ajax({
            type: "POST",
            url: "jsonserv?id=demo2",
            success: function(data){
//                var list = $.parseJSON(data);
//                
//                var s='';
//                for(var i=0;i<list.length;i++){
//                    //$('#p').append(data[i]);
//                    s += "id : "+list[i].id + "<br>Qty : "+list[i].qty+"<br>Price : "+list[i].price+"<br>================<br>";
//                }
                $('#p').append(data);
            }
        });
    });
    
</script>

