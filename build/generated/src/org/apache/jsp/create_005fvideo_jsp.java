package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class create_005fvideo_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.ArrayList<String>(1);
    _jspx_dependants.add("/admin_menu.html");
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
      out.write("                        ");
      out.write("\n");
      out.write("<div class=\"topmenu1\">\n");
      out.write("    <ul>\n");
      out.write("        <li><a href=\"admin_panel.jsp\">Home</a></li>\n");
      out.write("          <li><a href=\"admin_profile.jsp\">Profile</a></li>\n");
      out.write("          <li><a href=\"view_all_videos.jsp\">View Videos</a></li>\n");
      out.write("     \n");
      out.write("          <li><a href=\"create_video.jsp\">Create Videos</a></li>\n");
      out.write("       \n");
      out.write("        <li><a href=\"view_all_users.jsp\">View Users</a></li>\n");
      out.write("      \n");
      out.write("        <li><a href=\"Logout.jsp\">Logout</a></li>\n");
      out.write("    </ul>\n");
      out.write("</div>");
      out.write("\n");
      out.write("                        \n");
      out.write("                        ");

    if(session.getAttribute("Message").equals(null)){
    session.setAttribute("Message","");
    }else{
    out.print(session.getAttribute("Message"));
     session.setAttribute("Message","");
    }                        
   ;
      out.write(" \n");
      out.write("                        <div class=\"header-img\"><img src=\"images/ntpc_logo.jpg\" alt=\"\" height=\"200\"\n");
      out.write("                                                     width=\"990\"></div>\n");
      out.write("                    </div>\n");
      out.write("                    <div class=\"content\">\n");
      out.write("                        <div class=\"content-in\">\n");
      out.write("                            <div>\n");
      out.write("                                <h1 class=\"title\">Video Rating</h1>\n");
      out.write("                                <div class=\"center\" style=\"width: 400px\" >\n");
      out.write("                                    <form class=\"upload\" action=\"create_video_db.jsp\" method=\"post\" enctype=\"multipart/form-data\">\n");
      out.write("                                 ");
      out.print(session.getAttribute("Message"));
      out.write("\n");
      out.write("                                 <table>\n");
      out.write("                                     <tr>\n");
      out.write("                                         <td>\n");
      out.write("                                             <p>Select Category</p>\n");
      out.write("                                         </td>\n");
      out.write("                                         <td>\n");
      out.write("                                             <select name=\"txtcategory\">\n");
      out.write("                                                 <option value=\"sports\">\n");
      out.write("                                                     Sports\n");
      out.write("                                                 </option>\n");
      out.write("                                                 <option value=\"animation\">\n");
      out.write("                                                     Animation\n");
      out.write("                                                 </option>\n");
      out.write("                                                 <option value=\"b\">\n");
      out.write("                                                     B\n");
      out.write("                                                 </option>\n");
      out.write("                                                 <option value=\"c\">\n");
      out.write("                                                     C\n");
      out.write("                                                 </option>\n");
      out.write("                                                 <option value=\"d\">\n");
      out.write("                                                     D\n");
      out.write("                                                 </option>\n");
      out.write("                                                 <option value=\"d\">\n");
      out.write("                                                     D\n");
      out.write("                                                 </option>\n");
      out.write("                                                 <option value=\"d\">\n");
      out.write("                                                     D\n");
      out.write("                                                 </option>\n");
      out.write("                                                 <option value=\"d\">\n");
      out.write("                                                     D\n");
      out.write("                                                 </option>\n");
      out.write("                                                 <option value=\"d\">\n");
      out.write("                                                     D\n");
      out.write("                                                 </option>\n");
      out.write("                                                 <option value=\"d\">\n");
      out.write("                                                     D\n");
      out.write("                                                 </option>\n");
      out.write("                                             </select>\n");
      out.write("                                         </td>\n");
      out.write("                                     </tr>\n");
      out.write("                                     <tr>\n");
      out.write("                                         <td>\n");
      out.write("                                             <p>Select Video Image</p>\n");
      out.write("                                         </td>\n");
      out.write("                                         <td>\n");
      out.write("                                                    <input type=\"file\" name=\"txtfile\" id=\"txtfile\" class=\"upload_file\" accept=\"image/*\"/>\n");
      out.write("                          \n");
      out.write("                                         </td>\n");
      out.write("                                     </tr>\n");
      out.write("                                     <tr>\n");
      out.write("                                         <td>\n");
      out.write("                                             <p>Select Video File</p>\n");
      out.write("                                         </td>\n");
      out.write("                                         <td>\n");
      out.write("                                                    <input type=\"file\" name=\"txtVideo\" id=\"txtfile\" class=\"upload_file\" accept=\"video/*\"/>\n");
      out.write("                          \n");
      out.write("                                         </td>\n");
      out.write("                                     </tr>\n");
      out.write("                                     <tr>\n");
      out.write("                                         <td>\n");
      out.write("                                             <p>Video Name</p>\n");
      out.write("                                         </td>\n");
      out.write("                                         <td>\n");
      out.write("                                             <input type=\"text\" name=\"txtgname\" />\n");
      out.write("                          \n");
      out.write("                                         </td>\n");
      out.write("                                     </tr>\n");
      out.write("                                     <tr>\n");
      out.write("                                         <td>\n");
      out.write("                                             <p>Video Description</p>\n");
      out.write("                                         </td>\n");
      out.write("                                         <td>\n");
      out.write("                                             <textarea name=\"txtdesc\" cols=\"25\" rows=\"5\"></textarea>\n");
      out.write("                          \n");
      out.write("                                         </td>\n");
      out.write("                                     </tr>\n");
      out.write("                                 </table>\n");
      out.write("                                 \n");
      out.write("                                   <br>\n");
      out.write("                                    <input type=\"submit\" name=\"btnSubmit\" id=\"btnSubmit\" value=\"Save\" class=\"btnLogin\"/>\n");
      out.write("                                 \n");
      out.write("                                 \n");
      out.write("                            </form>       \n");
      out.write("                                </div>\n");
      out.write("                             \n");
      out.write("                            </div>\n");
      out.write("                            <div class=\"right\">\n");
      out.write("                               \n");
      out.write("                                \n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                    <!--DO NOT Remove The Footer Links-->\n");
      out.write("                    <!--Designed by--><a href=\"http://www.htmltemplates.net\">\n");
      out.write("                        <img src=\"images/footnote.gif\" class=\"copyright\" alt=\"html templates\"></a>\n");
      out.write("                    <!--In partnership with--><a href=\"http://websitetemplates.net\">\n");
      out.write("                        <img src=\"images/footnote.gif\" class=\"copyright\" alt=\"websitetemplates.net\"></a>\n");
      out.write("                    <div class=\"footer\">Video Rating\n");
      out.write("                       \n");
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
