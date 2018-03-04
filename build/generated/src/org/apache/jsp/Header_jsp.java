package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class Header_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

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
      response.setContentType("text/html");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

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
      out.write("                        <li><a class=\"fa fa-shopping-cart\" style=\"text-decoration: none; list-style: none; color: #fff;\"\n");
      out.write("                               href=\"CartServlet\"> </a>\n");
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
