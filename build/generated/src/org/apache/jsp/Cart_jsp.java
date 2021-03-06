package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import model.Cart1;
import model.Product;
import java.util.ArrayList;

public final class Cart_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.ArrayList<String>(3);
    _jspx_dependants.add("/Header.jsp");
    _jspx_dependants.add("/Footer.jsp");
    _jspx_dependants.add("/Feedback.jsp");
  }

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    PageContext pageContext = null;
    HttpSession session = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;

    try {
      response.setContentType("text/html;charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>Cart</title>\n");
      out.write("        <link href=\"css/bootstrap.css\" rel='stylesheet' type='text/css' />\n");
      out.write("        <link href=\"css/style.css\" rel='stylesheet' type='text/css' />\n");
      out.write("\n");
      out.write("        <link href=\"css/animate.css\" rel=\"stylesheet\" type=\"text/css\"/>\n");
      out.write("        <link href=\"css/styleProduct.css\" rel=\"stylesheet\" type=\"text/css\"/>\n");
      out.write("        <!--<link href=\"css/bootstrap.min.css\" rel=\"stylesheet\" type=\"text/css\"/>\n");
      out.write("        -->\n");
      out.write("        <link href=\"css/font_awesome.css\" rel='stylesheet' type='text/css' />\n");
      out.write("        <link href=\"css/faStyle.css\" rel='stylesheet' type='text/css' />\n");
      out.write("\n");
      out.write("        <link href=\"css/feedbackstyle.css\" rel='stylesheet' type='text/css' />\n");
      out.write("\n");
      out.write("        <meta name=\"viewport\" content=\"width=device-width, initial-scale=1, maximum-scale=1\">\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=utf-8\" />\n");
      out.write("        <link href='http://fonts.googleapis.com/css?family=Open+Sans:400,300,600,700,800' rel='stylesheet' type='text/css'>\n");
      out.write("        <script type=\"application/x-javascript\"> addEventListener(\"load\", function() { setTimeout(hideURLbar, 0); }, false); function hideURLbar(){ window.scrollTo(0,1); } </script>\n");
      out.write("        <script src=\"js/jquery.min.js\"></script>\n");
      out.write("        <script type=\"text/javascript\">\n");
      out.write("            $(document).ready(function () {\n");
      out.write("                $(\".dropdown img.flag\").addClass(\"flagvisibility\");\n");
      out.write("\n");
      out.write("                $(\".dropdown dt a\").click(function () {\n");
      out.write("                    $(\".dropdown dd ul\").toggle();\n");
      out.write("                });\n");
      out.write("\n");
      out.write("                $(\".dropdown dd ul li a\").click(function () {\n");
      out.write("                    var text = $(this).html();\n");
      out.write("                    $(\".dropdown dt a span\").html(text);\n");
      out.write("                    $(\".dropdown dd ul\").hide();\n");
      out.write("                    $(\"#result\").html(\"Selected value is: \" + getSelectedValue(\"sample\"));\n");
      out.write("                });\n");
      out.write("\n");
      out.write("                function getSelectedValue(id) {\n");
      out.write("                    return $(\"#\" + id).find(\"dt a span.value\").html();\n");
      out.write("                }\n");
      out.write("\n");
      out.write("                $(document).bind('click', function (e) {\n");
      out.write("                    var $clicked = $(e.target);\n");
      out.write("                    if (!$clicked.parents().hasClass(\"dropdown\"))\n");
      out.write("                        $(\".dropdown dd ul\").hide();\n");
      out.write("                });\n");
      out.write("\n");
      out.write("\n");
      out.write("                $(\"#flagSwitcher\").click(function () {\n");
      out.write("                    $(\".dropdown img.flag\").toggleClass(\"flagvisibility\");\n");
      out.write("                });\n");
      out.write("            });\n");
      out.write("        </script>\n");
      out.write("        <style>\n");
      out.write("            button :hover{\n");
      out.write("\n");
      out.write("                color:#fff;\n");
      out.write("            }\n");
      out.write("        </style>\n");
      out.write("        <style>\n");
      out.write("            #myBtn{\n");
      out.write("                background: url('images/feedback.png');\n");
      out.write("                left: 0px;\n");
      out.write("                top: 250px;\n");
      out.write("                height: 108px;\n");
      out.write("                width: 45px;\n");
      out.write("                margin: 0;\n");
      out.write("                padding: 0;\n");
      out.write("                position: fixed;\n");
      out.write("                z-index: 1;\n");
      out.write("                display:block;\n");
      out.write("            }\n");
      out.write("            .modal {\n");
      out.write("                display:hidden; /* Hidden by default */\n");
      out.write("                position: fixed; /* Stay in place */\n");
      out.write("                z-index: 100000;/*sit on top */\n");
      out.write("                left: 0;\n");
      out.write("                top: 0;\n");
      out.write("                width: 100%; /* Full width */\n");
      out.write("                height: 100%; /* Full height */\n");
      out.write("                overflow: auto; /* Enable scroll if needed */\n");
      out.write("                background-color: rgb(0,0,0); /* Fallback color */\n");
      out.write("                background-color: rgba(0,0,0,0.4); /* Black w/ opacity */\n");
      out.write("            }\n");
      out.write("            .modal-content {\n");
      out.write("                background-color: #fefefe;\n");
      out.write("                margin: 15% auto; /* 15% from the top and centered */\n");
      out.write("                padding: 20px;\n");
      out.write("                border: 1px solid #888;\n");
      out.write("                width: 80%; /* Could be more or less, depending on screen size */\n");
      out.write("            }\n");
      out.write("        </style>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("\n");
      out.write("        <!-- .................... Header goes here........................ -->\n");
      out.write("\n");
      out.write("        ");
      out.write("<div class=\"header\">\n");
      out.write("\n");
      out.write("    <div class=\"container\">\n");
      out.write("        <div class=\"row\">\n");
      out.write("            <div class=\"col-md-12\">\n");
      out.write("                <div class=\"header-left\">\n");
      out.write("                    <div class=\"logo\">\n");
      out.write("                        <a href=\"home.jsp\"><img src=\"images/logo.png\" alt=\"\"/></a>\n");
      out.write("                    </div>\n");
      out.write("                    <div class=\"menu\">\n");
      out.write("                        <a class=\"toggleMenu\" href=\"#\"><img src=\"images/nav.png\" alt=\"\" /></a>\n");
      out.write("                        <ul class=\"nav\" id=\"nav\">\n");
      out.write("                            <!--\n");
      out.write("                            <li><a href=\"shop.html\">Shop</a></li>\n");
      out.write("                            <li><a href=\"team.html\">Team</a></li>\n");
      out.write("                            <li><a href=\"shop.html\">Events</a></li>\n");
      out.write("                            <li><a href=\"experiance.html\">Experiance</a></li>\n");
      out.write("                            <li><a href=\"shop.html\">Company</a></li>\n");
      out.write("                            <li><a href=\"contact.html\">Contact</a></li>\t\t\t\t\t\t\t\t\n");
      out.write("                            -->\n");
      out.write("                            <li><a href=\"ElectronicsServlet\">Electronics</a></li>\n");
      out.write("                            <li><a href=\"#\">Home</a></li>\n");
      out.write("                            <li><a href=\"#\">Fashion</a></li>\n");
      out.write("                            <li><a href=\"#\">Company</a></li>\n");
      out.write("                            <li><a href=\"contact.html\">Contact</a></li>\n");
      out.write("                            \n");
      out.write("                            <div class=\"clear\"></div>\n");
      out.write("                        </ul>\n");
      out.write("                        <script type=\"text/javascript\" src=\"js/responsive-nav.js\"></script>\n");
      out.write("                    </div>\t\t\t\t\t\t\t\n");
      out.write("                    <div class=\"clear\"></div>\n");
      out.write("                </div>\n");
      out.write("                <div class=\"header_right\">\n");
      out.write("                    <!-- start search-->\n");
      out.write("                    <div class=\"search-box\">\n");
      out.write("                        <div id=\"sb-search\" class=\"sb-search\">\n");
      out.write("                            <form>\n");
      out.write("                                <input class=\"sb-search-input\" placeholder=\"Enter your search term...\" type=\"search\" name=\"search\" id=\"search\">\n");
      out.write("                                <input class=\"sb-search-submit\" type=\"submit\" value=\"\">\n");
      out.write("                                <span class=\"sb-icon-search\"> </span>\n");
      out.write("                            </form>\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                    <!----search-scripts---->\n");
      out.write("                    \n");
      out.write("                    <script src=\"js/classie.js\"></script>\n");
      out.write("                    <script src=\"js/uisearch.js\"></script>\n");
      out.write("                    \n");
      out.write("                    <script>\n");
      out.write("                        new UISearch( document.getElementById( 'sb-search' ) );\n");
      out.write("                    </script>\n");
      out.write("                    <ul class=\"icon1 sub-icon1 profile_img\">\n");
      out.write("                        <li><!--<a class=\"active-icon \" href=\"#\"> </a>-->\n");
      out.write("                            <a class=\"fa fa-shopping-cart\" href=\"CartServlet\"> </a>\n");
      out.write("                            <ul class=\"sub-icon1 list\">\n");
      out.write("                                <div class=\"product_control_buttons\">\n");
      out.write("                                    <a href=\"#\"><img src=\"images/edit.png\" alt=\"\"/></a>\n");
      out.write("                                    <a href=\"#\"><img src=\"images/close_edit.png\" alt=\"\"/></a>\n");
      out.write("                                </div>\n");
      out.write("                                <div class=\"clear\"></div>\n");
      out.write("                                <li class=\"list_img\"><img src=\"images/1.jpg\" alt=\"\"/></li>\n");
      out.write("                                <li class=\"list_desc\"><h4><a href=\"#\">velit esse molestie</a></h4><span class=\"actual\">1 x\n");
      out.write("                                        $12.00</span></li>\n");
      out.write("                                <div class=\"login_buttons\">\n");
      out.write("                                    <div class=\"check_button\"><a href=\"checkout.html\">Check out</a></div>\n");
      out.write("                                    <div class=\"login_button\"><a href=\"Login.jsp\">Login</a></div>\n");
      out.write("                                    <div class=\"clear\"></div>\n");
      out.write("                                </div>\n");
      out.write("                                <div class=\"clear\"></div>\n");
      out.write("                            </ul>\n");
      out.write("                        </li>\n");
      out.write("                        \n");
      out.write("                    </ul>\n");
      out.write("                    <div class=\"clear\"></div>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("    </div>\n");
      out.write("</div>\n");
      out.write(" \n");
      out.write("\n");
      out.write("        <!-- .................... Header ends............................ -->\n");
      out.write("        ");

            HttpSession hs = request.getSession();
            //String name = hs.getAttribute("Name").toString();
            String id = hs.getAttribute("LoginId").toString();
            //out.println(id);
        
      out.write("\n");
      out.write("\n");
      out.write("        <div class=\"main\">\n");
      out.write("            <div class=\"shop_top\">\n");
      out.write("                <div class=\"container\">\n");
      out.write("                    <div class=\"row\">\n");
      out.write("                        \n");
      out.write("                        <div class=\"col-md-12\">\n");
      out.write("                            <div class=\"panel panel-primary\">\n");
      out.write("                                <div class=\"panel-heading\">\n");
      out.write("                                    Cart Checkout\n");
      out.write("                                </div>\n");
      out.write("                                <div class=\"panel-body\">\n");
      out.write("                                    <div class=\"row\">\n");
      out.write("                                        <div class=\"col-md-1\"><b>Sr No.</b></div>\n");
      out.write("                                        <div class=\"col-md-2\"><b>Product Image</b></div>\n");
      out.write("                                        <div class=\"col-md-2\"><b>Product Name</b></div>\n");
      out.write("                                        <div class=\"col-md-2\"><b>Price</b></div>\n");
      out.write("                                        <div class=\"col-md-2\"><b>Quantity</b></div>\n");
      out.write("                                        <div class=\"col-md-2\"><b>Total</b></div>\n");
      out.write("                                        <div class=\"col-md-1\"><b>Action</b></div>\n");
      out.write("                                    </div>\n");
      out.write("                                    \n");
      out.write("                                    ");

                                        if(request.getAttribute("al")!=null){
                                            ArrayList<Cart1> al = (ArrayList<Cart1>)request.getAttribute("al");
                                            for(int i=0;i<al.size();i++){
                                                Cart1 c = al.get(i);
                                                String pimage = c.getProductImage();
                                                String pname = c.getProductName();
                                                int price1 = c.getPrice();
                                                int qty1 = c.getQty();
                                                int total1 = c.getTotal();
                                                int cid = c.getCId();
                                                int pid = c.getPId();
                                                String qty = Integer.toString(qty1);
                                                out.println("QUANTATITY  : "+qty);
                                                //c.getP
                                                
      out.write("\n");
      out.write("                                                <div class=\"row\">\n");
      out.write("                                                    <div class=\"col-md-1\"><b>");
      out.print(i+1);
      out.write("</b></div>\n");
      out.write("                                                    <div class=\"col-md-2\"><img src=\"images1/");
      out.print(pimage);
      out.write("\" height=\"100px\" width=\"100px\"></div>\n");
      out.write("                                                    <div class=\"col-md-2\">");
      out.print(pname);
      out.write("</div>\n");
      out.write("                                                    \n");
      out.write("                                                    <form>\n");
      out.write("                                                        <div class=\"col-md-2\">\n");
      out.write("                                                            <i>&#8377;</i>\n");
      out.write("                                                            <input type=\"text\" class=\"price\" pid=\"");
      out.print(pid);
      out.write("\" id=\"price~");
      out.print(pid);
      out.write("\" value=\"");
      out.print(price1);
      out.write("\" style=\"width:100px;\" disabled>\n");
      out.write("                                                        </div>\n");
      out.write("                                                            <input type=\"hidden\" value=\"");
      out.print(c.getCId());
      out.write("\">\n");
      out.write("                                                            <input type=\"hidden\" value=\"");
      out.print(c.getPId());
      out.write("\">\n");
      out.write("                                                        <div class=\"col-md-2\">\n");
      out.write("                                                            <input type=\"text\" class=\"qty\" pid=\"");
      out.print(pid);
      out.write("\" id=\"qty~");
      out.print(pid);
      out.write("\" name=\"qty\" value=\"");
      out.print(qty);
      out.write("\" style=\"width:50px;\">\n");
      out.write("                                                            <button><i class=\"fa fa-plus\"></i></button>\n");
      out.write("                                                            <button><i class=\"fa fa-minus\"></i></button>\n");
      out.write("                                                        </div>\n");
      out.write("                                                        <div class=\"col-md-2\">\n");
      out.write("                                                            <i>&#8377;</i>\n");
      out.write("                                                            <input type=\"text\" class=\"total\" pid=\"");
      out.print(pid);
      out.write("\" id=\"total~");
      out.print(pid);
      out.write("\" name=\"total\" id=\"total\" value=\"");
      out.print(total1);
      out.write("\" style=\"width:100px;\" disabled>\n");
      out.write("                                                        </div>\n");
      out.write("                                                    </form>\n");
      out.write("                                                    <div class=\"col-md-1\"></div>\n");
      out.write("                                                </div>\n");
      out.write("                                                \n");
      out.write("                                        ");

                                    }
                                }
                            
      out.write("\n");
      out.write("                                    \n");
      out.write("                                    \n");
      out.write("                                </div>   \n");
      out.write("                                <div class=\"panel-footer\">\n");
      out.write("                                    \n");
      out.write("                                </div>\n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("                        \n");
      out.write("\n");
      out.write("                    </div>                  \n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("\n");
      out.write("\n");
      out.write("        <!-- .................... Footer goes here........................ -->\n");
      out.write("\n");
      out.write("        ");
      out.write("\n");
      out.write("\n");
      out.write("<div class=\"footer\">\n");
      out.write("    <div class=\"container\">\n");
      out.write("        <div class=\"row\">\n");
      out.write("            <div class=\"col-md-3\">\n");
      out.write("                <ul class=\"footer_box\">\n");
      out.write("                    <h4>Products</h4>\n");
      out.write("                    <li><a href=\"#\">Mens</a></li>\n");
      out.write("                    <li><a href=\"#\">Womens</a></li>\n");
      out.write("                    <li><a href=\"#\">Youth</a></li>\n");
      out.write("                </ul>\n");
      out.write("            </div>\n");
      out.write("            <div class=\"col-md-3\">\n");
      out.write("                <ul class=\"footer_box\">\n");
      out.write("                    <h4>About</h4>\n");
      out.write("                    <li><a href=\"#\">Careers and internships</a></li>\n");
      out.write("                    <li><a href=\"#\">Sponserships</a></li>\n");
      out.write("                    <li><a href=\"#\">team</a></li>\n");
      out.write("                    <li><a href=\"#\">Catalog Request/Download</a></li>\n");
      out.write("                </ul>\n");
      out.write("            </div>\n");
      out.write("            <div class=\"col-md-3\">\n");
      out.write("                <ul class=\"footer_box\">\n");
      out.write("                    <h4>Customer Support</h4>\n");
      out.write("                    <li><a href=\"#\">Contact Us</a></li>\n");
      out.write("                    <li><a href=\"#\">Shipping and Order Tracking</a></li>\n");
      out.write("                    <li><a href=\"#\">Easy Returns</a></li>\n");
      out.write("                    <li><a href=\"#\">Warranty</a></li>\n");
      out.write("                    <li><a href=\"#\">Replacement Binding Parts</a></li>\n");
      out.write("                </ul>\n");
      out.write("            </div>\n");
      out.write("            <div class=\"col-md-3\">\n");
      out.write("                <ul class=\"footer_box\">\n");
      out.write("                    <h4>Newsletter</h4>\n");
      out.write("                    <div class=\"footer_search\">\n");
      out.write("                        <form>\n");
      out.write("                            <input type=\"text\" value=\"Enter your email\" onfocus=\"this.value = '';\" onblur=\"if (this.value == '') {\n");
      out.write("                                                this.value = 'Enter your email';\n");
      out.write("                                            }\">\n");
      out.write("                            <input type=\"submit\" value=\"Go\">\n");
      out.write("                        </form>\n");
      out.write("                    </div>\n");
      out.write("                    <ul class=\"social\">\t\n");
      out.write("                        <li class=\"facebook\"><a href=\"#\"><span> </span></a></li>\n");
      out.write("                        <li class=\"twitter\"><a href=\"#\"><span> </span></a></li>\n");
      out.write("                        <li class=\"instagram\"><a href=\"#\"><span> </span></a></li>\t\n");
      out.write("                        <li class=\"pinterest\"><a href=\"#\"><span> </span></a></li>\t\n");
      out.write("                        <li class=\"youtube\"><a href=\"#\"><span> </span></a></li>\t\t\t\t\t\t\t\t\t\t  \t\t\t\t\n");
      out.write("                    </ul>\n");
      out.write("                </ul>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("        <div class=\"row footer_bottom\">\n");
      out.write("            <div class=\"copy\">\n");
      out.write("                <p>© 2014 Template by <a href=\"http://w3layouts.com\" target=\"_blank\">w3layouts</a></p>\n");
      out.write("            </div>\n");
      out.write("            <dl id=\"sample\" class=\"dropdown\">\n");
      out.write("                <dt><a href=\"#\"><span>Change Region</span></a></dt>\n");
      out.write("                <dd>\n");
      out.write("                    <ul>\n");
      out.write("                        <li><a href=\"#\">Australia<img class=\"flag\" src=\"images/as.png\" alt=\"\" /><span class=\"value\">AS</span></a></li>\n");
      out.write("                        <li><a href=\"#\">Sri Lanka<img class=\"flag\" src=\"images/srl.png\" alt=\"\" /><span class=\"value\">SL</span></a></li>\n");
      out.write("                        <li><a href=\"#\">Newziland<img class=\"flag\" src=\"images/nz.png\" alt=\"\" /><span class=\"value\">NZ</span></a></li>\n");
      out.write("                        <li><a href=\"#\">Pakistan<img class=\"flag\" src=\"images/pk.png\" alt=\"\" /><span class=\"value\">Pk</span></a></li>\n");
      out.write("                        <li><a href=\"#\">United Kingdom<img class=\"flag\" src=\"images/uk.png\" alt=\"\" /><span class=\"value\">UK</span></a></li>\n");
      out.write("                        <li><a href=\"#\">United States<img class=\"flag\" src=\"images/us.png\" alt=\"\" /><span class=\"value\">US</span></a></li>\n");
      out.write("                    </ul>\n");
      out.write("                </dd>\n");
      out.write("            </dl>\n");
      out.write("        </div>\n");
      out.write("    </div>\n");
      out.write("</div>\n");
      out.write("\n");
      out.write("\n");
      out.write("        <!-- .................... Footer ends ........................ -->\n");
      out.write("        ");
      out.write("<button type=\"button\" id=\"myBtn\"></button>\n");
      out.write("<div class=\"modal\" id=\"myModal\">\n");
      out.write("    <!-- Modal content-->\n");
      out.write("    <div class=\"modal-content\">\n");
      out.write("        <div class=\"modal-header\">\n");
      out.write("            <button type=\"button\" class=\"close\" data-dismiss=\"modal\">&times;</button>\n");
      out.write("            <h4 class=\"modal-title\">Give your Feedback here</h4>\n");
      out.write("        </div>\n");
      out.write("        <div class=\"modal-body\">\n");
      out.write("\n");
      out.write("            <form action=\"FeedbackSubmitServlet\">\n");
      out.write("                <div class=\"form-group\">\n");
      out.write("                    <label for=\"form_feedback\">Feedback : </label>\n");
      out.write("                    <textarea name=\"feedback\" class=\"form-control\" rows=\"4\" style=\"max-height: 200px;\" required=\"required\" data-error=\"Please leave us a feedback\">\n");
      out.write("                    </textarea>\n");
      out.write("                </div>\n");
      out.write("                <input type=\"submit\" value=\"Submit\" class=\"btn btn-info pull-right\"/>\n");
      out.write("                <br>\n");
      out.write("            </form>\n");
      out.write("        </div>\n");
      out.write("        <div class=\"modal-footer\">\n");
      out.write("\n");
      out.write("            <button type=\"button\" class=\"btn btn-default\" id='close1' data-dismiss=\"modal\">Close</button>\n");
      out.write("        </div>\n");
      out.write("    </div>\n");
      out.write("</div>\n");
      out.write("<script>\n");
      out.write("            var modal = document.getElementById(\"myModal\");\n");
      out.write("            var btn = document.getElementById(\"myBtn\");\n");
      out.write("            var span = document.getElementsByClassName(\"close\")[0];\n");
      out.write("            var close1 = document.getElementById('close1');\n");
      out.write("\n");
      out.write("            btn.onclick = function () {\n");
      out.write("                modal.style.display = \"block\";\n");
      out.write("            }\n");
      out.write("            span.onclick = function () {\n");
      out.write("                modal.style.display = \"none\";\n");
      out.write("            }\n");
      out.write("            close1.onclick = function () {\n");
      out.write("                modal.style.display = \"none\";\n");
      out.write("            }\n");
      out.write("\n");
      out.write("// When the user clicks anywhere outside of the modal, close it\n");
      out.write("            window.onclick = function (event) {\n");
      out.write("                if (event.target == modal) {\n");
      out.write("                    modal.style.display = \"none\";\n");
      out.write("                }\n");
      out.write("            }\n");
      out.write("        </script>");
      out.write("\n");
      out.write("    </body>\n");
      out.write("</html>\n");
      out.write("<script src=\"js/jquery.min.js\"></script>\n");
      out.write("<script type=\"text/javascript\">\n");
      out.write("    $(\"body\").delegate(\".qty\",\"keyup\",function (){\n");
      out.write("        //alert(0);\n");
      out.write("        var pid = $(this).attr(\"pid\");\n");
      out.write("        //alert(pid);\n");
      out.write("        var qty = $(\"#qty~\"+pid).val();\n");
      out.write("        alert(\"Qty : \"+ qty);\n");
      out.write("        var price = parseInt($(\"#price~\"+pid).val());\n");
      out.write("        var total = qty*price;\n");
      out.write("        //alert(total);\n");
      out.write("        //$(\"#total~\"+pid).val(qty*price);\n");
      out.write("    });\n");
      out.write("//    $(document).ready(function(){\n");
      out.write("//       \n");
      out.write("//        function calc(){\n");
      out.write("//            var pid = $('.qty').attr('pid');\n");
      out.write("//            alert(pid);\n");
      out.write("////            var qty = $(\"#qty~\"+pid).val();\n");
      out.write("////            var price = $(\"#price~\"+pid).val();\n");
      out.write("////            var total = qty*price;\n");
      out.write("////            alert(total);\n");
      out.write("//            //var num2 = parseInt($(\".num2\").val());\n");
      out.write("//            //alert(qty+\"   \"+price);\n");
      out.write("//            //$(\"#total\").val(qty*price);\n");
      out.write("//        }\n");
      out.write("//        $(\".qty\").keyup(function(){\n");
      out.write("//            calc();\n");
      out.write("//        });\n");
      out.write("//    });\n");
      out.write("//    var form = $('#form1');\n");
      out.write("//    form.submit(function () {\n");
      out.write("//\n");
      out.write("//        $.ajax({\n");
      out.write("//            type: form.attr('method'),\n");
      out.write("//            url: form.attr('action'),\n");
      out.write("//            data: form.serialize(),\n");
      out.write("//            success: function (data) {\n");
      out.write("//                var result = data;\n");
      out.write("//                //$('#result').attr(\"value\", result);\n");
      out.write("//                $('#p').append(result);\n");
      out.write("//            }\n");
      out.write("//        });\n");
      out.write("//\n");
      out.write("//        return false;\n");
      out.write("//    });\n");
      out.write("</script>\n");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          out.clearBuffer();
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
