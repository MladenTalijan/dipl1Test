package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class admin_002dhome_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.ArrayList<String>(2);
    _jspx_dependants.add("/index.html");
    _jspx_dependants.add("/footer.html");
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
      out.write("        <title>Admin Home</title>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        <div> ");
      out.write("<!DOCTYPE html>\n");
      out.write("<!--\n");
      out.write("To change this license header, choose License Headers in Project Properties.\n");
      out.write("To change this template file, choose Tools | Templates\n");
      out.write("and open the template in the editor.\n");
      out.write("-->\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        \n");
      out.write("        <style type =\"text/css\">\n");
      out.write("            .title{\n");
      out.write("                text-align: center;\n");
      out.write("                font-size: 65px;\n");
      out.write("                font-family: var;\n");
      out.write("                background-color: gray;\n");
      out.write("                padding: 10px;\n");
      out.write("            }\n");
      out.write("            ul {\n");
      out.write("                list-style-type: none;\n");
      out.write("                margin: 0px;\n");
      out.write("                padding: 0px;\n");
      out.write("                background-color: black;\n");
      out.write("                overflow: hidden;\n");
      out.write("            }\n");
      out.write("            li {\n");
      out.write("                float: left;\n");
      out.write("            }\n");
      out.write("            li a{\n");
      out.write("                display: block;\n");
      out.write("                padding: 14px 18px;\n");
      out.write("                color: white;\n");
      out.write("                text-decoration: none;\n");
      out.write("            }\n");
      out.write("            li a:hover{\n");
      out.write("                background-color: gray;\n");
      out.write("            }\n");
      out.write("            .header{\n");
      out.write("                margin-left: -10px;\n");
      out.write("                margin-right: -10px;\n");
      out.write("            }\n");
      out.write("        </style>\n");
      out.write("        \n");
      out.write("<title>header</title>\n");
      out.write("<meta charset=\"UTF-8\">\n");
      out.write("<meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("    <div class=\"header\">\n");
      out.write("        <div class=\"title\">Servis za diplomske radove</div>\n");
      out.write("        \n");
      out.write("        <div class =\"menu\">\n");
      out.write("            <ul>\n");
      out.write("                <li><a href=\"#\">Pocetna strana </a></li>\n");
      out.write("                <li><a href = \"\">Dodaj diplomski rad</a></li>\n");
      out.write("                <li><a href = \"\">Pogledaj sve diplomske radove</a></li>\n");
      out.write("                <li><a href = \"\">Izbrisi diplomski rad</a></li>\n");
      out.write("                <li><a href = \"\">Azuriraj diplomski rad</a></li>\n");
      out.write("            </ul>\n");
      out.write("        </div>\n");
      out.write("    </div>\n");
      out.write("    </body>\n");
      out.write("</html>\n");
      out.write(" </div>\n");
      out.write("        <div>Welcome to Admin page</div>\n");
      out.write("        <div>");
      out.write("<!DOCTYPE html>\n");
      out.write("<!--\n");
      out.write("To change this license header, choose License Headers in Project Properties.\n");
      out.write("To change this template file, choose Tools | Templates\n");
      out.write("and open the template in the editor.\n");
      out.write("-->\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <style type = \"text/css\">\n");
      out.write("        .footer{\n");
      out.write("            text-align: center;\n");
      out.write("            background-color: black;\n");
      out.write("            color:white;\n");
      out.write("            padding: 18px;\n");
      out.write("            position: fixed;\n");
      out.write("            left: 0px;\n");
      out.write("            width: 100%;\n");
      out.write("            bottom: 0px;\n");
      out.write("        }\n");
      out.write("    </style>\n");
      out.write("        <title> footer </title>\n");
      out.write("        <meta charset=\"UTF-8\">\n");
      out.write("        <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        <div class=\"footer\">\n");
      out.write("        \n");
      out.write("            \n");
      out.write("            \n");
      out.write("        Â® Talijan Mladen @ 2020\n");
      out.write("        </div>\n");
      out.write("    </body>\n");
      out.write("</html>\n");
      out.write("</div>\n");
      out.write("        \n");
      out.write("        \n");
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
