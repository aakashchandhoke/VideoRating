package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.sql.ResultSet;

public final class view_005fall_005fvideos_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("        <link rel=\"stylesheet\" type=\"text/css\" media=\"screen\" href=\"css/image_style.css\"/>\n");
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
      out.write("\n");
      out.write("\n");
      out.write("                        <h1 class=\"title\">Video Rating</h1>\n");
      out.write("                        <div class=\"center1\">\n");
      out.write("\n");
      out.write("                            <table border=\"1\" align=\"center\">\n");
      out.write("\n");
      out.write("                                ");


                                    String from = request.getParameter("from");
                                    String to = request.getParameter("to");
                                    if (from == null) {
                                        from = "0";
                                        to = "4";
                                    }
                                    String style = "morph  pic";
                                    String query = "select *  from tblvideos limit " + from + "," + to;
                                    System.out.print(query);
                                    DB.Connect.openConnection();

                                    ResultSet rs = DB.Connect.stat.executeQuery(query);
                                    int count = 0;
                                    //  out.println("<tr>");
                                    while (rs.next()) {
                                        int check = count % 3;
                                        if (check == 3) {
                                            out.print("<tr>");
                                        }

                                        out.print("<td>");
                                        out.println("<table><tr>"
                                                + "<td> <div class='" + style + "'><img src=" + "upload/" + rs.getString("gimage") + " alt='' height='200' width='200'></div> </td></tr>");
                                        out.println("<tr>" + "<td><table><tr><td>Video Name: </td><td>" + rs.getString("gname") + "</td></tr></table></td></tr>");
                                        out.println("<tr>" + "<td><table><tr><td>Description: </td><td>" + rs.getString("gdesc") + "</td></tr></table></td></tr>");
                                        out.println("<tr>" + "<td><table><tr><td>Category: </td><td>" + rs.getString("gcategory") + "</td></tr></table></td></tr>");
                                        out.println("<tr>" + "<td><table><tr><td>Uploaded on: </td><td>" + rs.getString("rdate") + "</td></tr></table></td></tr></table>");
                                        out.print("<td>");

                                        if (check == 3) {
                                            out.print("</tr>");
                                        }

                                        count++;
                                    }
                                    //out.println("</tr>");
                                    rs.close();
                                    DB.Connect.CloseConnection();
                                    if (count == 0) {
                                        out.println("<tr><td colspan='4'> No Video Found..!! </td></tr>");
                                    }

                                
      out.write("\n");
      out.write("                            </table>\n");
      out.write("                           <center> <div >\n");
      out.write("                            ");
    if (count > 0) {
                                    out.print("<form method='post' action='view_all_videos.jsp'>");
                                    out.print("<input type='hidden' name='from' value=" + to + ">");
                                    out.print("<input type='hidden' name='to' value=" + (Integer.parseInt(to) + 4) + ">");
                                    out.print("<Button type='submit' value='Next'>Next</Button>");
                                    out.print("</form>");
                                    if (Integer.parseInt(from) > 3) {
                                        out.print("<form method='post' action='view_all_videos.jsp'>");
                                        out.print("<input type='hidden' name='from' value=" + (Integer.parseInt(from) - 4) + ">");
                                        out.print("<input type='hidden' name='to' value=" + (Integer.parseInt(to) - 4) + ">");
                                        out.print("<Button type='submit' value='Previous'>Previous</Button>");
                                        out.print("</form>");
                                    }
                                }else{
                             if (Integer.parseInt(from) > 3) {
                                        out.print("<form method='post' action='view_all_videos.jsp'>");
                                        out.print("<input type='hidden' name='from' value=" + (Integer.parseInt(from) - 4) + ">");
                                        out.print("<input type='hidden' name='to' value=" + (Integer.parseInt(to) - 4) + ">");
                                        out.print("<Button type='submit' value='Previous'>Previous</Button>");
                                        out.print("</form>");
                                    }
                            }
                            
      out.write("\n");
      out.write("                            \n");
      out.write("\n");
      out.write("</div>\n");
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