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
        <form method="POST" action="ajaxtpserv" id="form1">
            <input type="text" name="name" id="name">
            <input type="submit" value="submit" id="submit"><br><br>
            <input type="text" name="result" id="result">
        </form>
        <p id="p"></p>
    </body>
</html>

<script src="js/jquery.min.js"></script>
<script type="text/javascript">
    var form = $('#form1');
    form.submit(function () {

        $.ajax({
            type: form.attr('method'),
            url: form.attr('action')+"?name="+$('#name').val(),
            
            //data: form.serialize(),
            success: function (data) {
                var result = data;
                $('#result').attr("value", result);
                $('#p').append(result);
            }
        });

        return false;
    });
//            $(document).ready(function (){
//               //alert("hello");
//                $("#submit").click(function (){
//                    //alert("on submit");
//                    var form = $("#form1");
//                    var name = $("#name").val();
//                    $.ajax({
//                        type : "POST",
//                        url : "ajaxtpserv",
//                        data : {name : name},
//                        success: function (data){
//                            $("#p").html(data);
//                          //alert("success");  
//                          //return true;
//                        },
//                        error: function (){
//                            //alert("error");
//                            //return true;
//                        }
//                    });
//                    
//                });
//            });
</script>

