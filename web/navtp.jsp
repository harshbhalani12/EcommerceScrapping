<%-- 
    Document   : navtp
    Created on : 4 May, 2017, 9:13:46 AM
    Author     : Admin
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
        <style>
            body { margin: 0px; }
            #topbar { background: #555; height: 70px; }
            #menu1btn { float:left; margin:15px 0px 0px 20px; padding: 10px; }
            #menu1 {
                position: absolute;
                left: 20px;
                background: #333;
                width: 140px;
                height: auto;
                padding: 0px 2px 2px 2px;
                z-index: 10;
                transform-origin: 50% 0%;
                transform: perspective(800px) rotateX(90deg);
                transition: transform .3s linear 0s;
            }
            #menu1 > a {
                display: block;
                text-decoration: none;
                color: #FFF;
                background:#666;
                padding: 12px 0px 12px 12px;
                margin: 1px;
                font-family: Arial;
                font-size: 13px;
                transition: background 0.2s linear 0s, color 0.2s linear 0s;
            }
            #menu1 > a:hover { background:#888; color:#FFF; }
            
            #menu2 {
                position: absolute;
                left: 20px;
                background: #333;
                width: 140px;
                height: auto;
                padding: 0px 2px 2px 2px;
                margin-left: 50px;
                z-index: 10;
                transform-origin: 50% 0%;
                transform: perspective(100px) rotateY(90deg);
                transition: transform .3s linear 0s;
            }
            #menu2 > a {
                display: block;
                text-decoration: none;
                color: #FFF;
                background:#666;
                padding: 12px 0px 12px 12px;
                margin: 1px;
                
                font-family: Arial;
                font-size: 13px;
                transition: background 0.2s linear 0s, color 0.2s linear 0s;
            }
            
        </style>
        <script>
            function toggleMenu(menu) {
                var menu = document.getElementById(menu);
                if (menu.dataset.opened == "no") {
                    menu.style.transform = "perspective(800px) rotateY(0deg)";
                    menu.dataset.opened = "yes";
                    return false;
                } else {
                    menu.style.transform = "perspective(800px) rotateY(90deg)";
                    menu.dataset.opened = "no";
                }
            }
        </script>
    </head>
    <body>
        <div id="topbar">
            <button id="menu1btn" onclick="toggleMenu('menu1')" onmouseover="toggleMenu('menu1')">Menu</button>
            <a href="#" id="" onmouseover="toggleMenu('menu1')">link</a>
        </div>
        <nav id="menu1" class="folding_menu" data-opened="no">
            <a href="#">Section A</a>
            <a href="#">Section B</a>
            <a href="#">Section C</a>
            <a href="#">Section D</a>
        </nav>

        <button id="menu1btn" onmouseover="toggleMenu('menu2')">Menu</button>
        <nav id="menu2" class="folding_menu" data-opened="no">
            <a href="#">Section A</a>
            
        </nav>
    </body>
</html>
