package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class Chat_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("        <title>Chat Page</title>\n");
      out.write("        <style>\n");
      out.write("            #chatBig{                \n");
      out.write("                height: 450px;\n");
      out.write("                width: 500px;\n");
      out.write("                border: 1px solid #000;\n");
      out.write("                margin: auto;\n");
      out.write("                \n");
      out.write("            }\n");
      out.write("            #chatMsgs{\n");
      out.write("                width: 500px;\n");
      out.write("                height: 400px;\n");
      out.write("                border-bottom: 1px solid #333;\n");
      out.write("                overflow-y: scroll;\n");
      out.write("            }\n");
      out.write("            #chatText{\n");
      out.write("                width: 495px;\n");
      out.write("                height: 45px;\n");
      out.write("                border-bottom: 1px solid #333;\n");
      out.write("            }\n");
      out.write("        </style>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        <h1>Chat Page..!!</h1>\n");
      out.write("\n");
      out.write("        ");


            int FromRegId = Integer.parseInt(session.getAttribute("FromRegId").toString());
            int ToRegId = Integer.parseInt(session.getAttribute("ToRegId").toString());

            String FromName = session.getAttribute("FromName").toString();
            String ToName = session.getAttribute("ToName").toString();

               //out.println(FromName+" "+FromRegId+" "+ToName+" "+ToRegId);
        
      out.write("\n");
      out.write("        <h1>Welcome ");
      out.print(FromName);
      out.write("</h1>\n");
      out.write("\n");
      out.write("        <div class=\"chatbox\">\n");
      out.write("            <div class=\"chatlogs\">\n");
      out.write("                <div class=\"chat\">\n");
      out.write("                    <div class=\"user-photo\"></div>\n");
      out.write("                    <p class=\"chat-message\">\n");
      out.write("                        hello\n");
      out.write("                    </p>\n");
      out.write("                </div>\n");
      out.write("                <div class=\"chat\">\n");
      out.write("                    <div class=\"user-photo\"></div>\n");
      out.write("                    <p class=\"chat-message\">\n");
      out.write("                        how\n");
      out.write("                    </p>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("            \n");
      out.write("            <div class=\"chat-form\">\n");
      out.write("                <form action=\"InsertMsgServ\" method=\"POST\" id=\"form1\">\n");
      out.write("                <input type=\"hidden\" name=\"FromRegId\" value=\"");
      out.print(FromRegId);
      out.write("\" id=\"FromRegId\">\n");
      out.write("                <input type=\"hidden\" name=\"ToRegId\" value=\"");
      out.print(ToRegId);
      out.write("\" id=\"ToRegId\">\n");
      out.write("<!--                <input type=\"text\" name=\"msg\" id=\"msg\" style=\"width:495px;height:45px;\">-->\n");
      out.write("                <textarea id=\"msgtxt\" name=\"msg\"></textarea>\n");
      out.write("                <input type=\"submit\" value=\"send\">\n");
      out.write("            </form>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("        \n");
      out.write("        \n");
      out.write("        <div id=\"chatBig\">\n");
      out.write("            <div id=\"chatMsgs\">\n");
      out.write("\n");
      out.write("            </div>\n");
      out.write("            <form action=\"InsertMsgServ\" method=\"POST\" id=\"form1\">\n");
      out.write("                <input type=\"hidden\" name=\"FromRegId\" value=\"");
      out.print(FromRegId);
      out.write("\" id=\"FromRegId\">\n");
      out.write("                <input type=\"hidden\" name=\"ToRegId\" value=\"");
      out.print(ToRegId);
      out.write("\" id=\"ToRegId\">\n");
      out.write("<!--                <input type=\"text\" name=\"msg\" id=\"msg\" style=\"width:495px;height:45px;\">-->\n");
      out.write("                <textarea id=\"msgtxt\" name=\"msg\"></textarea>\n");
      out.write("                <input type=\"submit\" value=\"send\">\n");
      out.write("            </form>\n");
      out.write("         \n");
      out.write("            <p id=\"p\"></p>\n");
      out.write("        </div>\n");
      out.write("    </body>\n");
      out.write("</html>\n");
      out.write("\n");
      out.write("<script src=\"js/jquery.min.js\"></script>\n");
      out.write("<script type=\"text/javascript\">\n");
      out.write("    var form = $('#form1');\n");
      out.write("    form.submit(function () {\n");
      out.write("        //alert(0);\n");
      out.write("        var msg = $('textarea[name=msg]').val();\n");
      out.write("        $.ajax({\n");
      out.write("            type: form.attr('method'),\n");
      out.write("            url: form.attr('action')+\"?FromRegId=\"+$('#FromRegId').val()+\"&ToRegId=\"+$('#ToRegId').val()+\"&msg=\"+msg,\n");
      out.write("            \n");
      out.write("            //data: form.serialize(),\n");
      out.write("            success: function (data) {\n");
      out.write("                var result = data;\n");
      out.write("                //$('#result').attr(\"value\", result);\n");
      out.write("                $('#p').append(result);\n");
      out.write("                $(\"#chatMsgs\").load(\"SelectMsgServ\");\n");
      out.write("                $(\"#chatMsgs\").scrollTop($(\"#chatMsgs\")[0].scrollHeight);\n");
      out.write("            }\n");
      out.write("        });\n");
      out.write("\n");
      out.write("        return false;\n");
      out.write("    });\n");
      out.write("    \n");
      out.write("    $(document).ready(function(){\n");
      out.write("        $(\"#chatMsgs\").load(\"SelectMsgServ\");\n");
      out.write("        $(\"#chatMsgs\").scrollTop($(\"#chatMsgs\")[0].scrollHeight);\n");
      out.write("    });\n");
      out.write("\n");
      out.write("    setInterval(function (){\n");
      out.write("           $(\"#chatMsgs\").load(\"SelectMsgServ\");\n");
      out.write("           $(\"#chatMsgs\").scrollTop($(\"#chatMsgs\")[0].scrollHeight-300);\n");
      out.write("    },1400);\n");
      out.write("</script>");
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
