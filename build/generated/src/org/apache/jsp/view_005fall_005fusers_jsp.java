package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.sql.ResultSet;

public final class view_005fall_005fusers_jsp extends org.apache.jasper.runtime.HttpJspBase
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

      out.write("\n");
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
      out.write("                        <div class=\"header-img\"><img src=\"images/ntpc_logo.jpg\" alt=\"\" height=\"200\"\n");
      out.write("                                                     width=\"990\"></div>\n");
      out.write("                    </div>\n");
      out.write("                    <div class=\"content\">\n");
      out.write("                        <div class=\"content-in\">\n");
      out.write("                            <div class=\"left\">\n");
      out.write("                                  <h1 class=\"title\">Video Rating</h1>\n");
      out.write("                                <div class=\"center_view_user\">\n");
      out.write("                                    <table border=\"1\" align=\"center\">\n");
      out.write("                                        <tr>\n");
      out.write("                                            <th>User ID</th>\n");
      out.write("                                            <th>Name</th>\n");
      out.write("\n");
      out.write("                                            <th> Email ID</th>\n");
      out.write("                                            <th> Mobile</th>\n");
      out.write("                                            <th>Address</th>\n");
      out.write("                                            <th>Registration Date</th>\n");
      out.write("                                            <th>User Type</th>\n");
      out.write("\n");
      out.write("                                        </tr>\n");
      out.write("                                        ");



                                                    String query = "select userid,fname,mname,lname,emailid,rdate,mobile,address,usertype from tbluser";
                                                    DB.Connect.openConnection();

                                                    ResultSet rs = DB.Connect.stat.executeQuery(query);
                                                    int count = 0;
                                                    while (rs.next()) {
                                                        out.println("<tr>"
                                                                + "<td>" + rs.getString(1) + "</td>"
                                                                + "<td>" + rs.getString(2) + " " + rs.getString(3) + " " + rs.getString(4) + "</td>"
                                                                + "<td>" + rs.getString(5) + "</td>"
                                                                + "<td>" + rs.getString(7) + "</td>"
                                                                + "<td>" + rs.getString(8) + "</td>"
                                                                + "<td>" + rs.getString(6) + "</td>");
                                                        out.println("<td><b>");
                                                        if (rs.getString(9).equalsIgnoreCase("admin")) {
                                                            out.println("Admin"+"</td>");
                                                        } else if (rs.getString(9).equalsIgnoreCase("user")) {
                                                            out.println("User"+"</td>");
                                                        } 

                                                        out.println("</tr>");
                                                        count++;
                                                    }
                                                    rs.close();
                                                    DB.Connect.CloseConnection();
                                                    if (count == 0) {
                                                        out.println("<tr><td colspan='4'> No Users Found..!! </td></tr>");
                                                    }
                                        
      out.write("\n");
      out.write("                                    </table>\n");
      out.write("\n");
      out.write("\n");
      out.write("                                </div>\n");
      out.write("                            </div>\n");
      out.write("\n");
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
