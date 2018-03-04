package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class Feedback_jsp extends org.apache.jasper.runtime.HttpJspBase
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
