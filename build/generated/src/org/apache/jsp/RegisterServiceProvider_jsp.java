package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class RegisterServiceProvider_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.ArrayList<String>(3);
    _jspx_dependants.add("/Header.jsp");
    _jspx_dependants.add("/Feedback.jsp");
    _jspx_dependants.add("/Footer.jsp");
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
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>Register Service Provider</title>\n");
      out.write("        <link href=\"css/bootstrap.css\" rel='stylesheet' type='text/css' />\n");
      out.write("        <link href=\"css/style.css\" rel='stylesheet' type='text/css' />\n");
      out.write("        \n");
      out.write("        <link href=\"css/feedbackstyle.css\" rel='stylesheet' type='text/css' />\n");
      out.write("        \n");
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
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("       \n");
      out.write("        <!-- .................... Header goes here........................ -->\n");
      out.write("        \n");
      out.write("        ");
      out.write("<div class=\"header\">\n");
      out.write("\n");
      out.write("    <div class=\"container\">\n");
      out.write("        <div class=\"row\">\n");
      out.write("            <div class=\"col-md-12\">\n");
      out.write("                <div class=\"header-left\">\n");
      out.write("                    <div class=\"logo\">\n");
      out.write("                        <a href=\"index.html\"><img src=\"images/logo.png\" alt=\"\"/></a>\n");
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
      out.write("                            <li><a href=\"#\">Electronics</a></li>\n");
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
      out.write("                        <li><a class=\"active-icon c1\" href=\"#\"> </a>\n");
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
      out.write("        \n");
      out.write("        <!-- .................... Header ends............................ -->\n");
      out.write("        \n");
      out.write("\n");
      out.write("        <div class=\"main\">\n");
      out.write("            <div class=\"shop_top\">\n");
      out.write("                <div class=\"container\">\n");
      out.write("                    <form action=\"RegisterServiceProviderServlet\"> \n");
      out.write("                        <div class=\"register-top-grid\">\n");
      out.write("                            <h3>PERSONAL INFORMATION</h3>\n");
      out.write("                            <div>\n");
      out.write("                                <span>First Name<label>*</label></span>\n");
      out.write("                                <input type=\"text\" name=\"firstName\"> \n");
      out.write("                            </div>\n");
      out.write("                            <div>\n");
      out.write("                                <span>Last Name<label>*</label></span>\n");
      out.write("                                <input type=\"text\" name=\"lastName\"> \n");
      out.write("                            </div>\n");
      out.write("                            <div>\n");
      out.write("                                <span>Email Address<label>*</label></span>\n");
      out.write("                                <input type=\"text\" name=\"Email\"> \n");
      out.write("                            </div>\n");
      out.write("                            <div>\n");
      out.write("                                <span>Mobile Number<label>*</label></span>\n");
      out.write("                                <input type=\"text\" name=\"mobileNumber\">\n");
      out.write("                            </div>\n");
      out.write("                            \n");
      out.write("                            \n");
      out.write("                            <div>\n");
      out.write("                                <span>Company Name<label>*</label></span>\n");
      out.write("                                <input type=\"text\" name=\"companyName\">\n");
      out.write("                            </div>\n");
      out.write("                            <div>\n");
      out.write("                                <span>Brand Name<label>*</label></span>\n");
      out.write("                                <input type=\"text\" name=\"brandName\">\n");
      out.write("                            </div>\n");
      out.write("                            <div>\n");
      out.write("                                <span>Product Category<label>*</label></span>\n");
      out.write("                                <select class=\"selectpicker form-control\" name=\"productCategory\">\n");
      out.write("                                    \n");
      out.write("                                    <option value=\"General\">General</option>\n");
      out.write("                                    <option value=\"Fashion\">Fashion</option>\n");
      out.write("                                    <option value=\"Electronics\">Electronics</option>\n");
      out.write("                                </select>\n");
      out.write("                            </div>\n");
      out.write("                            <div>\n");
      out.write("                                <span>Experiance<label>*</label></span>\n");
      out.write("                                <input type=\"text\" name=\"experiance\">\n");
      out.write("                            </div>\n");
      out.write("                            <div>\n");
      out.write("                                <span>Address<label>*</label></span>\n");
      out.write("                               <!-- <input type=\"textarea\">-->\n");
      out.write("                               <textarea class=\"form-control\" rows=\"3\" name=\"address\"></textarea>\n");
      out.write("                            </div>\n");
      out.write("                            <div class=\"clear\"> </div>\n");
      out.write("\n");
      out.write("                            <div class=\"clear\"> </div>\n");
      out.write("                        </div>\n");
      out.write("                        <div class=\"clear\"> </div>\n");
      out.write("                    \n");
      out.write("                    \n");
      out.write("                    \n");
      out.write("                        <div class=\"register-bottom-grid\">\n");
      out.write("                            <h3>LOGIN INFORMATION</h3>\n");
      out.write("                            <div>\n");
      out.write("                                <span>Password<label>*</label></span>\n");
      out.write("                                <input type=\"text\" name=\"password\">\n");
      out.write("                            </div>\n");
      out.write("                            <div>\n");
      out.write("                                <span>Confirm Password<label>*</label></span>\n");
      out.write("                                <input type=\"text\" name=\"confirmPassword\">\n");
      out.write("                            </div>\n");
      out.write("                            <div class=\"clear\"> </div>\n");
      out.write("                        </div>\n");
      out.write("                        <div class=\"clear\"> </div>\n");
      out.write("                        <input type=\"submit\" value=\"Submit\" class=\"btn btn-primary pull-right\">\n");
      out.write("                    </form>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("\n");
      out.write("        ");
      out.write("\n");
      out.write("\n");
      out.write("<div id=\"side-tabs\">\n");
      out.write("    <a class=\"support\" href=\"#\"></a>\n");
      out.write("</div>\n");
      out.write("\n");
      out.write("        <!-- .................... Footer goes here........................ -->\n");
      out.write("        \n");
      out.write("        ");
      out.write("\n");
      out.write("<div id=\"side-tabs\">\n");
      out.write("    <a class=\"support\" href=\"#\"></a>\n");
      out.write("</div>\n");
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
      out.write("        \n");
      out.write("        <!-- .................... Footer ends ........................ -->\n");
      out.write("\n");
      out.write("    </body>\n");
      out.write("</html>\n");
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