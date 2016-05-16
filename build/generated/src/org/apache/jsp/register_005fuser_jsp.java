package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class register_005fuser_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("        <link href=\"css/style.css\" rel=\"stylesheet\" type=\"text/css\">\n");
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
      out.write("                        <div class=\"header-img\"><img src=\"images/ntpc_logo.jpg\" alt=\"\" height=\"200\"\n");
      out.write("                                                     width=\"990\"></div>\n");
      out.write("                    </div>\n");
      out.write("                   \n");
      out.write("                    <div class=\"content\">\n");
      out.write("                        <div class=\"content-in\">\n");
      out.write("                            <div>\n");
      out.write("                                <center>\n");
      out.write("                                <h1 class=\"title\">Video Rating</h1>      \n");
      out.write("                                </center>\n");
      out.write("                              \n");
      out.write("                                <div class=\"center\">\n");
      out.write("                                    <form class=\"frmSignup\" action=\"sign_up\" method=\"post\">\n");
      out.write("                                        ");
      out.print(session.getAttribute("Message"));
      out.write("\n");
      out.write("                                        ");
session.setAttribute("Message","");
      out.write("\n");
      out.write("                                        <br>\n");
      out.write("                                        <span class=\"mySpan\">\n");
      out.write("                                          Create Account\n");
      out.write("                                        </span>\n");
      out.write("\n");
      out.write("                                        <hr>\n");
      out.write("                                          \n");
      out.write("                                        <input type=\"text\" id=\"txtfirstname\" name=\"txtfirstname\" placeHolder=\"First Name\" class=\"txtLogin\" title=\"First Name\" maxlength=\"20\" >\n");
      out.write("                                        <input type=\"text\" id=\"txtmiddlename\" name=\"txtmiddlename\" placeHolder=\"Middle Name\" class=\"txtLogin\" title=\"Middle Name\" maxlength=\"20\">\n");
      out.write("                                        <input type=\"text\" id=\"txtlastname\" name=\"txtlastname\" placeHolder=\"Last Name\" class=\"txtLogin\" title=\"Last Name\" maxlength=\"20\">\n");
      out.write("                                          \n");
      out.write("                                        <select  id=\"cmbgender\" name=\"cmbgender\" class=\"txtLogin\">\n");
      out.write("                                                                        <option value=\"Select\"> - - - - - - Select Gender- - - - - - - - -  </option>\n");
      out.write("                                                                        <option value=\"Male\">Male</option>\n");
      out.write("                                                                        <option value=\"Female\">Female</option>\n");
      out.write("                                                                    </select>\n");
      out.write("                                        \n");
      out.write("                                        <input type=\"text\" id=\"txtmobile\" name=\"txtemailid\" placeHolder=\"Email ID\" class=\"txtLogin\" title=\"Email ID\" >\n");
      out.write("                                        <input type=\"text\" id=\"txtmobile\" name=\"txtmobile\" placeHolder=\"Mobile No.\" class=\"txtLogin\" title=\"Mobile no.\" maxlength=\"10\">\n");
      out.write("                                        <textarea rows=\"2\" cols=\"3\" id=\"txtaddress\" name=\"txtaddress\" placeHolder=\"Address\" class=\"txtAddress\" title=\"Address\" maxlength=\"50\" ></textarea>\n");
      out.write("\n");
      out.write("                                        <input type=\"password\" id=\"txtpassword\" name=\"txtpassword\" placeHolder=\"Password\"  class=\"txtPass\" title=\"Password\" maxlength=\"25\">\n");
      out.write("                                       \n");
      out.write("                                        <input type=\"password\" id=\"txtConfirm_password\" name=\"txtConfirm_password\" placeHolder=\"Confirm Password\" title=\"Confirm Password\"  class=\"txtPass\" maxlength=\"25\" onchange=\"checkForNull()\">\n");
      out.write("                                        <br>\n");
      out.write("                                        <input name=\"btnSignup\" type=\"submit\" class=\"btnLogin\" id=\"btnSignup\" value=\"Register\" align=\"right\" title=\"Sign up\"  >\n");
      out.write("\n");
      out.write("                                    </form>\n");
      out.write("                                </div>\n");
      out.write("                            </div>\n");
      out.write("                           \n");
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
