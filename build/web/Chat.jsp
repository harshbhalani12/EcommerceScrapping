<%-- 
    Document   : Chat
    Created on : 1 Apr, 2017, 8:02:30 PM
    Author     : Admin
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Chat Page</title>
        <link href="css/bootstrap.css" rel='stylesheet' type='text/css' />

        <link href="css/bootstrap.min.css" rel='stylesheet' type='text/css' />
        <style>
            #chatBig{                
                height: 450px;
                width: 500px;
                border: 1px solid #000;
                margin: auto;
                
            }
            #chatMsgs{
                width: 500px;
                height: 400px;
                border-bottom: 1px solid #333;
                overflow-y: scroll;
            }
            #chatText{
                width: 495px;
                height: 45px;
                border-bottom: 1px solid #333;
            }
        </style>
        <style>
            body{
                background: #1ddced;
            }
            .chatbox{
                width:500px;
                height:600px;
                min-width: 390px;
                background: #fff;
                margin: 0px auto;
                padding: 25px;
                box-shadow: 0 3px #ccc;
            }
            .chatlogs{
                padding: 10px;
                width: 100%;
                height: 450px;
                overflow-x: hidden;
                overflow-y: scroll;
            }
            .chatlogs::-webkit-scrollbar{
                width: 10px;
            }
            .chatlogs::-webkit-scrollbar-thumb{
                border-radius: 5px;
                background: rgba(0,0,0,0.1);
            }
            .chat{
                display: flex;
                flex-flow : row wrap;
                align-items: flex-start;
                margin-bottom: 10px;
            }
            .chat .user-photo{
                width: 50px;
                height: 50px;
                background: #ccc;
                border-radius: 50%; 
            }
            .chat .chat-message{
                width:79%;
                padding:15px;
                margin: 5px 10px 0;
                
                border-radius: 10px;
                color:#fff;
                font-size: 20px;
            }
            .friend .chat-message{
                background: #1adda4;
            }
            .self .chat-message{
                background: #1ddced;
                order: -1;
            }
            .chat-form{
                margin-top: 20px;
                display: flex;
                align-item : flex-start; 
            }
            .chat-form textarea{
                background: #fbfbfb;
                width: 375px;
                height: 50px;
                border: 2px solid #eee;
                border-radius: 3px;
                resize: none;
                padding: 10px;
                font-size: 18px;
                color:#333;
            }
            #send{
                float: right;
                margin-top: 5px;;
                margin-left: 10px;
                padding: 10px;
                height: 40px;
                //border-radius: 50%;
            }
            .ToName{
                width:500px;
                height:50px;
                min-width: 390px;
                background: #fff;
                margin: 0px auto;
                padding: 10px 0 0 25px;
                box-shadow: 0 3px #ccc;
                
            }
            
        </style>
    </head>
    <body>
        <!--<h1>Chat Page..!!</h1>-->

        <%

            int FromRegId = Integer.parseInt(session.getAttribute("FromRegId").toString());
            int ToRegId = Integer.parseInt(session.getAttribute("ToRegId").toString());

            String FromName = session.getAttribute("FromName").toString();
            String ToName = session.getAttribute("ToName").toString();

               //out.println(FromName+" "+FromRegId+" "+ToName+" "+ToRegId);
        %>
        <h1 style="text-align: center;">Welcome <%=FromName%></h1>

        <div class="ToName">
                <h3><%=ToName%></h3>
        </div>
        <div class="chatbox">
            
            <div class="chatlogs">
                <!--
                <div class="chat friend">
                    <div class="user-photo"></div>
                    <p class="chat-message">
                        
                        hello
                    </p>
                </div>
                <div class="chat self">
                    <div class="user-photo"></div>
                    <p class="chat-message">
                        how
                    </p>
                </div>
                
                <div class="chat friend">
                    <div class="user-photo"></div>
                    <p class="chat-message">
                        Lorem ipsum dolor sit amet, consectetuer adipiscing elit, sed diam nonummy nibh
                        euismod tincidunt ut laoreet dolore magna aliquam erat volutpat. Ut wisi enim ad minim veniam
                        , quis nostrud exerci tation ullamcorper suscipit lobortis nisl ut aliquip ex ea commodo consequat.
                        Duis autem vel eum iriure dolor in hendrerit in vulputate velit esse molestie consequat,
                        vel illum dolore eu feugiat nulla facilisis
                    </p>
                </div>
                <div class="chat self">
                    <div class="user-photo"></div>
                    <p class="chat-message">
                        how
                    </p>
                </div>
                
                <div class="chat friend">
                    <div class="user-photo"></div>
                    <p class="chat-message">
                        Lorem ipsum dolor sit amet, consectetuer adipiscing elit, sed diam nonummy nibh
                        euismod tincidunt ut laoreet dolore magna aliquam erat volutpat. Ut wisi enim ad minim veniam
                        , quis nostrud exerci tation ullamcorper suscipit lobortis nisl ut aliquip ex ea commodo consequat.
                        Duis autem vel eum iriure dolor in hendrerit in vulputate velit esse molestie consequat,
                        vel illum dolore eu feugiat nulla facilisis
                    </p>
                </div>
                <div class="chat self">
                    <div class="user-photo"></div>
                    <p class="chat-message">
                        how
                    </p>
                </div>
                -->
            </div>
            
            <div class="chat-form">
                <form action="InsertMsgServ" method="POST" id="form1">
                <input type="hidden" name="FromRegId" value="<%=FromRegId%>" id="FromRegId">
                <input type="hidden" name="ToRegId" value="<%=ToRegId%>" id="ToRegId">
<!--                <input type="text" name="msg" id="msg" style="width:495px;height:45px;">-->
                <textarea id="msgtxt" name="msg"></textarea>
                <input type="submit" value="send" id="send" class="btn btn-danger">
                
            </form>
            </div>
        </div>
        
        <!--
        <div id="chatBig">
            <div id="chatMsgs">

            </div>
            <form action="InsertMsgServ" method="POST" id="form1">
                <input type="hidden" name="FromRegId" value="<%=FromRegId%>" id="FromRegId">
                <input type="hidden" name="ToRegId" value="<%=ToRegId%>" id="ToRegId">
<!--                <input type="text" name="msg" id="msg" style="width:495px;height:45px;">-->
<!--
                <div> 
                    <div style="float: left; width:310px; height: 60px; background: #000;">
                        <textarea id="msgtxt" name="msg"></textarea>
                    </div>
                    <div style="float:right; padding:10px;">
                        <button>helo</button>
                        <input type="submit" value="send" id="send">
                    </div>
                </div>
            </form>
         
            <p id="p"></p>
        </div>-->
    </body>
</html>

<script src="js/jquery.min.js"></script>
<script type="text/javascript">
    var form = $('#form1');
    form.submit(function () {
        //alert(0);
        var msg = $('textarea[name=msg]').val();
        
        $.ajax({
            type: form.attr('method'),
            url: form.attr('action')+"?FromRegId="+$('#FromRegId').val()+"&ToRegId="+$('#ToRegId').val()+"&msg="+msg,
            
            //data: form.serialize(),
            success: function (data) {
                var result = data;
                //$('#result').attr("value", result);
                $('#p').append(result);
                //$("#chatMsgs").load("SelectMsgServ");
                $(".chatlogs").load("SelectMsgServ");
                $(".chatlogs").scrollTop($(".chatlogs")[0].scrollHeight);
                //$("#chatMsgs").scrollTop($("#chatMsgs")[0].scrollHeight);
                $('textarea[name=msg]').val("");
            }
        });
        
        return false;
    });
    
    $(document).ready(function(){
        //$("#chatMsgs").load("SelectMsgServ");
        $(".chatlogs").load("SelectMsgServ");
        $(".chatlogs").scrollTop($(".chatlogs")[0].scrollHeight);
        //$("#chatMsgs").scrollTop($("#chatMsgs")[0].scrollHeight);
    });

    setInterval(function (){
           $(".chatlogs").load("SelectMsgServ");
           $(".chatlogs").scrollTop($(".chatlogs")[0].scrollHeight);
           //$("#chatMsgs").scrollTop($("#chatMsgs")[0].scrollHeight-300);
    },1400);
</script>