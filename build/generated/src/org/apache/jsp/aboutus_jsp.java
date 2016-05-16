package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class aboutus_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.ArrayList<String>(1);
    _jspx_dependants.add("/index_menu.html");
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

      out.write("<!DOCTYPE HTML>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta charset=\"UTF-8\">\n");
      out.write("        <title>Video Rating</title>\n");
      out.write("        <meta name=\"description\" content=\"Description of your site goes here\">\n");
      out.write("        <meta name=\"keywords\" content=\"keyword1, keyword2, keyword3\">\n");
      out.write("             <link href=\"css/image_style.css\" rel=\"stylesheet\" type=\"text/css\">\n");
      out.write("        <link href=\"css/style.css\" rel=\"stylesheet\" type=\"text/css\">\n");
      out.write("   \n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        <div class=\"page-out\">\n");
      out.write("            <div class=\"main\">\n");
      out.write("                <div class=\"page\">\n");
      out.write("                    <div class=\"header\">\n");
      out.write("                          ");
      out.write("<div class=\"topmenu\">\r\n");
      out.write("    <ul>\r\n");
      out.write("        <li><a href=\"index.jsp\">Home</a></li>\r\n");
      out.write("\r\n");
      out.write("        <li><a href=\"register_user.jsp\">Sign up</a></li>\r\n");
      out.write("\r\n");
      out.write("        <li><a href=\"aboutus.jsp\">About us</a></li>\r\n");
      out.write("        <li><a href=\"contactus.jsp\">Contact</a></li>\r\n");
      out.write("        <li><a href=\"sign_in.jsp\">Sign In</a></li>\r\n");
      out.write("    </ul>\r\n");
      out.write("</div>");
      out.write("\n");
      out.write("                          <div class=\"header-img\"><img class=\"growheader picheader \" src=\"images/ntpc_logo.jpg\" alt=\"\" \n");
      out.write("                                                    ></div>\n");
      out.write("                    </div>\n");
      out.write("                    <div class=\"content\">\n");
      out.write("                        \n");
      out.write("                        <div>\n");
      out.write("                            <h1 class=\"title\"><center>About Us</center></h1>\n");
      out.write("                            <h3>It helps ppl to watch and upload originally created videos. It provides comment analysis of videos and provides direct download link of videos.</h3>\n");
      out.write("                       \n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                    <!--DO NOT Remove The Footer Links-->\n");
      out.write("                    <!--Designed by--><a href=\"http://www.htmltemplates.net\">\n");
      out.write("                        <img src=\"images/footnote.gif\" class=\"copyright\" alt=\"html templates\"></a>\n");
      out.write("                    <!--In partnership with--><a href=\"http://websitetemplates.net\">\n");
      out.write("                        <img src=\"images/footnote.gif\" class=\"copyright\" alt=\"websitetemplates.net\"></a>\n");
      out.write("                    <div class=\"footer\">Video Rating\n");
      out.write("\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
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
