package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class viewServiceProviderInfo_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.ArrayList<String>(1);
    _jspx_dependants.add("/AdminHeader.jsp");
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
      out.write("        <title>JSP Page</title>\n");
      out.write("        <link href=\"css/bootstrap.css\" rel='stylesheet' type='text/css' />\n");
      out.write("        <link href=\"css/bootstrap.min.css\" rel='stylesheet' type='text/css' />\n");
      out.write("        <link href=\"css/style_1.css\" rel='stylesheet' type='text/css' />\n");
      out.write("\n");
      out.write("        <link href=\"css/font_awesome.css\" rel='stylesheet' type='text/css' />\n");
      out.write("        <link href=\"css/adminheadercss.css\" rel='stylesheet' type='text/css' />\n");
      out.write("\n");
      out.write("        <link rel=\"stylesheet\" href=\"https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css\">\n");
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
      out.write("        \n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        <!-- ADMIN HEADER STARTS -->\n");
      out.write("            ");
      out.write("\n");
      out.write("\n");
      out.write("<div class=\"header\" style=\"height: 70px; padding:0.5% 0;\">\n");
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
      out.write("\n");
      out.write("                        <ul class=\"\" id=\"\">\n");
      out.write("\n");
      out.write("                            <li class=\"dropdown\">\n");
      out.write("                                <a href=\"MessagesServlet\" class=\"dropdown-toggle\" data-toggle=\"dropdown\" area-exapanded=\"false\">\n");
      out.write("                                    <i class=\"fa fa-envelope\"></i>\n");
      out.write("                                    <span class=\"badge\">3</span>\n");
      out.write("                                </a>\n");
      out.write("                            </li>\n");
      out.write("                            <li class=\"dropdown head-dpdn\">\n");
      out.write("                                <a href=\"#\" class=\"dropdown-toggle\" data-toggle=\"dropdown\" area-exapanded=\"false\">\n");
      out.write("                                    <i class=\"fa fa-bell\"></i>\n");
      out.write("                                    <span class=\"badge\">2</span>\n");
      out.write("                                </a>\n");
      out.write("                            </li>\n");
      out.write("                            <li class=\"dropdown head-dpdn\">\n");
      out.write("                                <a href=\"#\" class=\"dropdown-toggle\" data-toggle=\"dropdown\" area-exapanded=\"false\">\n");
      out.write("                                    <i class=\"fa fa-tasks\"></i>\n");
      out.write("                                    <span class=\"badge\">3</span>\n");
      out.write("                                </a>\n");
      out.write("                            </li>\n");
      out.write("                            <div class=\"clear\"></div>\n");
      out.write("                        </ul>\n");
      out.write("                        <script type=\"text/javascript\" src=\"js/responsive-nav.js\"></script>\n");
      out.write("                        <!--\n");
      out.write("                        <ul class=\"\" id=\"\" style=\"margin:0;\">\n");
      out.write("                        <!--\n");
      out.write("                        <li><a href=\"#\">Electronics</a></li>\n");
      out.write("                        <li><a href=\"#\">Home</a></li>\n");
      out.write("                        <div class=\"clear\"></div>\n");
      out.write("                        -->\n");
      out.write("                        <!--\n");
      out.write("                        <li class=\"dropdown\">\n");
      out.write("                            <a href=\"#\" class=\"dropdown-toggle\" data-toggle=\"dropdown\" area-exapanded=\"false\">\n");
      out.write("                                <i class=\"fa fa-envelope\"></i>\n");
      out.write("                                <span class=\"badge\">3</span>\n");
      out.write("                            </a>\n");
      out.write("                        </li>\n");
      out.write("                        <ul class=\"dropdown-menu\">\n");
      out.write("                            <li>\n");
      out.write("\n");
      out.write("                                <div class=\"notification-header\">\n");
      out.write("                                    You have 3 new Notifications\n");
      out.write("                                </div>\n");
      out.write("                            </li>\n");
      out.write("\n");
      out.write("\n");
      out.write("                        </ul>\n");
      out.write("                        <li class=\"dropdown head-dpdn\">\n");
      out.write("                            <a href=\"#\" class=\"dropdown-toggle\" data-toggle=\"dropdown\" area-exapanded=\"false\">\n");
      out.write("                                <i class=\"fa fa-bell\"></i>\n");
      out.write("                                <span class=\"badge\">2</span>\n");
      out.write("                            </a>\n");
      out.write("                        </li>\n");
      out.write("                        <li class=\"dropdown head-dpdn\">\n");
      out.write("                            <a href=\"#\" class=\"dropdown-toggle\" data-toggle=\"dropdown\" area-exapanded=\"false\">\n");
      out.write("                                <i class=\"fa fa-tasks\"></i>\n");
      out.write("                                <span class=\"badge\">3</span>\n");
      out.write("                            </a>\n");
      out.write("                        </li>\n");
      out.write("\n");
      out.write("                    </ul>\n");
      out.write("                        -->\n");
      out.write("                        <script type=\"text/javascript\" src=\"js/responsive-nav.js\"></script>\n");
      out.write("                    </div>\t\t\t\t\t\t\t\n");
      out.write("                    <div class=\"clear\"></div>\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("                    <!-- start search-->\n");
      out.write("\n");
      out.write("                    <div id=\"sb-search\" class=\"sb-search sb-search-open\" style=\"float:left;\">\n");
      out.write("                        <form>\n");
      out.write("                            <input class=\"sb-search-input\" placeholder=\"Enter your search term...\" type=\"search\" name=\"search\" id=\"search\">\n");
      out.write("                            <input class=\"sb-search-submit\" type=\"submit\" value=\"\">\n");
      out.write("                            <span class=\"sb-icon-search\"> </span>\n");
      out.write("                        </form>\n");
      out.write("                    </div>\n");
      out.write("\n");
      out.write("                    <!----search-scripts---->\n");
      out.write("\n");
      out.write("                    <script src=\"js/classie.js\"></script>\n");
      out.write("                    <script src=\"js/uisearch.js\"></script>\n");
      out.write("\n");
      out.write("                    <script>\n");
      out.write("                        new UISearch(document.getElementById('sb-search'));\n");
      out.write("                    </script>\n");
      out.write("\n");
      out.write("                    <div class=\"clear\"></div>\n");
      out.write("                </div>\n");
      out.write("                <div class=\"header_right\">\n");
      out.write("                    <!-- \n");
      out.write("                     <ul class=\"icon1 sub-icon1 profile_img\">\n");
      out.write("                         <li><a class=\"active-icon c1\" href=\"#\"> </a>\n");
      out.write("                             <ul class=\"sub-icon1 list\">\n");
      out.write("                                 <div class=\"product_control_buttons\">\n");
      out.write("                                     <a href=\"#\"><img src=\"images/edit.png\" alt=\"\"/></a>\n");
      out.write("                                     <a href=\"#\"><img src=\"images/close_edit.png\" alt=\"\"/></a>\n");
      out.write("                                 </div>\n");
      out.write("                                 <div class=\"clear\"></div>\n");
      out.write("                                 <li class=\"list_img\"><img src=\"images/1.jpg\" alt=\"\"/></li>\n");
      out.write("                                 <li class=\"list_desc\"><h4><a href=\"#\">velit esse molestie</a></h4><span class=\"actual\">1 x\n");
      out.write("                                         $12.00</span></li>\n");
      out.write("                                 <div class=\"login_buttons\">\n");
      out.write("                                     <div class=\"check_button\"><a href=\"checkout.html\">Check out</a></div>\n");
      out.write("                                     <div class=\"login_button\"><a href=\"Login.jsp\">Login</a></div>\n");
      out.write("                                     <div class=\"clear\"></div>\n");
      out.write("                                 </div>\n");
      out.write("                                 <div class=\"clear\"></div>\n");
      out.write("                             </ul>\n");
      out.write("                         </li>\n");
      out.write("                     </ul>\n");
      out.write("                     <div class=\"clear\"></div>\n");
      out.write("                    -->\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("    </div>\n");
      out.write("</div>\n");
      out.write("\n");
      out.write("<div class=\"side-nav\">\n");
      out.write("    <nav>\n");
      out.write("        <ul>\n");
      out.write("            <li>\n");
      out.write("                <a href=\"#\"> \n");
      out.write("                    <span> <i class=\"fa fa-user\"></i></span>\n");
      out.write("                </a>\n");
      out.write("            </li>\n");
      out.write("\n");
      out.write("            <li>\n");
      out.write("                <a href=\"#\">\n");
      out.write("                    <span><i class=\"fa fa-envelope\"></i></span>\n");
      out.write("\n");
      out.write("                </a>\n");
      out.write("            </li>\n");
      out.write("            <li class=\"active\">\n");
      out.write("                <a href=\"#\">\n");
      out.write("                    <span><i class=\"fa fa-bar-chart\"></i></span>\n");
      out.write("\n");
      out.write("                </a>\n");
      out.write("            </li>\n");
      out.write("            <li>\n");
      out.write("                <a href=\"#\">\n");
      out.write("                    <span><i class=\"fa fa-credit-card-alt\"></i></span>\n");
      out.write("\n");
      out.write("                </a>\n");
      out.write("            </li>\n");
      out.write("        </ul>\n");
      out.write("    </nav>\n");
      out.write("</div>\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("        <!-- ADMIN HEADER STARTS -->\n");
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
