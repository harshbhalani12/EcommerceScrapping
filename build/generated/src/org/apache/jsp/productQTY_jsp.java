package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class productQTY_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        <h1>Hello World!</h1>\n");
      out.write("        <form method=\"POST\" action=\"ajaxtpservadd\" id=\"form1\">\n");
      out.write("            <input type=\"text\" name=\"qty\" class=\"qty key\" value=\"1\"><br>\n");
      out.write("            <input type=\"text\" name=\"price\" class=\"price1\" value=\"1000\"><br>\n");
      out.write("            \n");
      out.write("            <input type=\"text\" name=\"total\" id=\"total\"><br>\n");
      out.write("            <input type=\"submit\" value=\"Add\">\n");
      out.write("        </form>\n");
      out.write("        <p id=\"p\"></p>\n");
      out.write("    </body>\n");
      out.write("</html>\n");
      out.write("\n");
      out.write("<script src=\"js/jquery.min.js\"></script>\n");
      out.write("<script type=\"text/javascript\">\n");
      out.write("    $(document).ready(function(){\n");
      out.write("        $(\"#total\").val($(\".price1\").val());\n");
      out.write("        function calc(){\n");
      out.write("            var qty = ($(\".qty\").val()!= \"\") ? parseInt($(\".qty\").val()) : 0;\n");
      out.write("            var price = ($(\".price1\").val()!= \"\") ? parseInt($(\".price1\").val()) : 0;\n");
      out.write("            //var num2 = parseInt($(\".num2\").val());\n");
      out.write("            $(\"#total\").val(qty*price);\n");
      out.write("        }\n");
      out.write("        $(\".key\").keyup(function(){\n");
      out.write("            calc();\n");
      out.write("        });\n");
      out.write("    });\n");
      out.write("</script>\n");
      out.write("<script type=\"text/javascript\">\n");
      out.write("    var form = $('#form1');\n");
      out.write("//    $.get('ajaxtpservadd',{\n");
      out.write("//        data:form.serialize()\n");
      out.write("//    },function(response){\n");
      out.write("//        \n");
      out.write("//        $.each(response, function(index,value){\n");
      out.write("//            $('#p').append(value);\n");
      out.write("//        });\n");
      out.write("//    });\n");
      out.write("    form.submit(function () {\n");
      out.write("\n");
      out.write("        $.ajax({\n");
      out.write("            type: form.attr('method'),\n");
      out.write("            url: form.attr('action'),\n");
      out.write("            data: form.serialize(),\n");
      out.write("            success: function (data) {\n");
      out.write("                var result = data;\n");
      out.write("                //$('#result').attr(\"value\", result);\n");
      out.write("                $.each(data,function(){\n");
      out.write("                    $('#p').append(result);\n");
      out.write("                });\n");
      out.write("               // $('#p').append(result);\n");
      out.write("            }\n");
      out.write("        });\n");
      out.write("\n");
      out.write("        return false;\n");
      out.write("    });\n");
      out.write("</script>\n");
      out.write("\n");
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
