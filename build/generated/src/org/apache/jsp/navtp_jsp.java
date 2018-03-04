package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class navtp_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("        <style>\n");
      out.write("            body { margin: 0px; }\n");
      out.write("            #topbar { background: #555; height: 70px; }\n");
      out.write("            #menu1btn { float:left; margin:15px 0px 0px 20px; padding: 10px; }\n");
      out.write("            #menu1 {\n");
      out.write("                position: absolute;\n");
      out.write("                left: 20px;\n");
      out.write("                background: #333;\n");
      out.write("                width: 140px;\n");
      out.write("                height: auto;\n");
      out.write("                padding: 0px 2px 2px 2px;\n");
      out.write("                z-index: 10;\n");
      out.write("                transform-origin: 50% 0%;\n");
      out.write("                transform: perspective(800px) rotateX(90deg);\n");
      out.write("                transition: transform .3s linear 0s;\n");
      out.write("            }\n");
      out.write("            #menu1 > a {\n");
      out.write("                display: block;\n");
      out.write("                text-decoration: none;\n");
      out.write("                color: #FFF;\n");
      out.write("                background:#666;\n");
      out.write("                padding: 12px 0px 12px 12px;\n");
      out.write("                margin: 1px;\n");
      out.write("                font-family: Arial;\n");
      out.write("                font-size: 13px;\n");
      out.write("                transition: background 0.2s linear 0s, color 0.2s linear 0s;\n");
      out.write("            }\n");
      out.write("            #menu1 > a:hover { background:#888; color:#FFF; }\n");
      out.write("        </style>\n");
      out.write("        <script>\n");
      out.write("            function toggleMenu(menu) {\n");
      out.write("                var menu = document.getElementById(menu);\n");
      out.write("                if (menu.dataset.opened == \"no\") {\n");
      out.write("                    menu.style.transform = \"perspective(800px) rotateX(0deg)\";\n");
      out.write("                    menu.dataset.opened = \"yes\";\n");
      out.write("                    return false;\n");
      out.write("                } else {\n");
      out.write("                    menu.style.transform = \"perspective(800px) rotateX(90deg)\";\n");
      out.write("                    menu.dataset.opened = \"no\";\n");
      out.write("                }\n");
      out.write("            }\n");
      out.write("        </script>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        <div id=\"topbar\">\n");
      out.write("            <button id=\"menu1btn\" onclick=\"toggleMenu('menu1')\">Menu</button>\n");
      out.write("        </div>\n");
      out.write("        <nav id=\"menu1\" class=\"folding_menu\" data-opened=\"no\">\n");
      out.write("            <a href=\"#\">Section A</a>\n");
      out.write("            <a href=\"#\">Section B</a>\n");
      out.write("            <a href=\"#\">Section C</a>\n");
      out.write("            <a href=\"#\">Section D</a>\n");
      out.write("        </nav>\n");
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
