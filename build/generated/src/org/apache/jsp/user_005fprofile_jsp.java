package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.sql.ResultSet;

public final class user_005fprofile_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.ArrayList<String>(1);
    _jspx_dependants.add("/user_menu.html");
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
      out.write("        <link href=\"css/table.css\" rel=\"stylesheet\" type=\"text/css\">\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        <div class=\"page-out\">\n");
      out.write("            <div class=\"main\">\n");
      out.write("                <div class=\"page\">\n");
      out.write("                    <div class=\"header\">\n");
      out.write("                        ");
      out.write("\n");
      out.write("<div class=\"topmenu2\">\n");
      out.write("    <ul>\n");
      out.write("        <li><a href=\"user_panel.jsp\">Home</a></li>\n");
      out.write("         <li><a href=\"user_profile.jsp\">Profile</a></li>\n");
      out.write("         <li><a href=\"view_all_videos_user.jsp\">View Videos</a></li>\n");
      out.write("      \n");
      out.write("    \n");
      out.write("        \n");
      out.write("       \n");
      out.write("        <li><a href=\"Logout.jsp\">Logout</a></li>\n");
      out.write("    </ul>\n");
      out.write("</div>");
      out.write("\n");
      out.write("                        ");
session.setAttribute("Message", "");
      out.write("\n");
      out.write("                        <div class=\"header-img\"><img src=\"images/ntpc_logo.jpg\" alt=\"\" height=\"200\"\n");
      out.write("                                                     width=\"990\"></div>\n");
      out.write("                    </div>\n");
      out.write("                    <div class=\"content\">\n");
      out.write("                        <div class=\"content-in\">\n");
      out.write("                            <div>\n");
      out.write("                                <h1 class=\"title\">Video Rating</h1>\n");
      out.write("\n");
      out.write("                            </div>\n");
      out.write("                            <div class=\"right\">\n");
      out.write("\n");
      out.write("                                ");


                                            String id = session.getAttribute("userid").toString();
                                            //String id = "1";
                                            String txtname = "";
                                            String txtlname = "";

                                            String txtmname = "";
                                            String number = "";
                                            String txtemail = "";
                                            String txtaddress = "";

                                            String usertype = "";

                                            String doj = "";
                                            String userid = "";

                                            String query = "select * from tbluser where userid='" + id + "'";
                                            DB.Connect.openConnection();

                                            ResultSet rs = DB.Connect.stat.executeQuery(query);

                                            if (rs.next()) {
                                                userid = rs.getString("userid");
                                                txtname = rs.getString("fname");
                                                txtlname = rs.getString("lname");
                                                txtmname = rs.getString("mname");
                                                txtaddress = rs.getString("address");
                                                txtemail = rs.getString("emailid");
                                                number = rs.getString("mobile");
                                                usertype = rs.getString("usertype");
                                                doj = rs.getString("rdate");

                                            }
                                            rs.close();
                                            DB.Connect.CloseConnection();

                                
      out.write("\n");
      out.write("                                <table border=\"1\" class=\"leftuser\">\n");
      out.write("                                    <tr>\n");
      out.write("                                        <th>User</th>\n");
      out.write("                                        <th>Details</th>\n");
      out.write("\n");
      out.write("                                    </tr>\n");
      out.write("                                    <tr>\n");
      out.write("                                        <td>User ID</td>\n");
      out.write("                                        <td>");
      out.print(userid);
      out.write("</td>\n");
      out.write("\n");
      out.write("                                    </tr>\n");
      out.write("                                    <tr>\n");
      out.write("                                        <td>Name</td>\n");
      out.write("                                        <td>");
      out.print(txtname + " " + txtmname + " " + txtlname);
      out.write("</td>\n");
      out.write("                                    </tr>\n");
      out.write("                                    <tr>\n");
      out.write("                                        <td>Email id</td>\n");
      out.write("                                        <td>");
      out.print(txtemail);
      out.write("</td>\n");
      out.write("                                    </tr>\n");
      out.write("                                    <tr>\n");
      out.write("                                        <td>Mobile No.</td>\n");
      out.write("                                        <td>");
      out.print(number);
      out.write("</td>\n");
      out.write("                                    </tr>\n");
      out.write("\n");
      out.write("                                    <tr>\n");
      out.write("                                        <td>Address</td>\n");
      out.write("                                        <td>");
      out.print(txtaddress);
      out.write("</td>\n");
      out.write("                                    </tr>\n");
      out.write("                                    <tr>\n");
      out.write("                                        <td>Date of Joining</td>\n");
      out.write("                                        <td>");
      out.print(doj);
      out.write("</td>\n");
      out.write("                                    </tr>\n");
      out.write("                                    <tr>\n");
      out.write("                                        <td>User Type</td>\n");
      out.write("                                        <td>");
      out.print(usertype);
      out.write("</td>\n");
      out.write("                                    </tr>\n");
      out.write("                                    <tr>\n");
      out.write("                                        <td>   <form action=\"change_pass_user.jsp\" method=\"post\">\n");
      out.write("                                                <input type=\"submit\" class=\"btnChangePass\"  value=\"Change Password\"/>\n");
      out.write("                                            </form>\n");
      out.write("                                        </td>\n");
      out.write("                                    </tr>\n");
      out.write("\n");
      out.write("\n");
      out.write("                                </table>\n");
      out.write("\n");
      out.write("                            </div>\n");
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
