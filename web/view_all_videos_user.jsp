<%@page import="java.sql.ResultSet"%>
<!DOCTYPE HTML>
<html>
    <head>
        <meta charset="UTF-8">
        <title>Video Rating</title>
        <meta name="description" content="Description of your site goes here">
        <meta name="keywords" content="keyword1, keyword2, keyword3">
        <link href="css/style.css" rel="stylesheet" type="text/css">
        <link rel="stylesheet" type="text/css" media="screen" href="css/image_style.css"/>
        <script type="text/javascript" src="ajax/prototype.lite.js"></script>
        <script type="text/javascript" src="ajax/moo.ajax.js"></script>
        <script type="text/javascript" src="ajax/ajaxrating.js"></script>
    </head>
    <body>
        <div class="page-out">
            <div class="main">
                <div class="page">
                    <div class="header">
                        <%@include file="user_menu.html" %>
                        <div class="header-img"><img src="images/ntpc_logo.jpg" alt="" height="200"
                                                     width="990"></div>
                    </div>
                    <div class="content">


                        <h1 class="title">Video Rating</h1>
                        <div class="center1">

                            <table border="1" align="center">

                                <%

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
                                                + "<td> <div class='" + style + "'><a href='single_video.jsp?gid="+rs.getString("gameid")+"'><img src=" + "upload/" + rs.getString("gimage") + " alt='' height='200' width='200'></a></div> </td></tr>");
                                        out.println("<tr>" + "<td><table><tr><td>Vidoe Name: </td><td>" + rs.getString("gname") + "</td></tr></table></td></tr>");
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
                                        out.println("<tr><td colspan='4'> No Videos Found..!! </td></tr>");
                                    }

                                %>
                            </table>
                           <center> <div >
                            <%    if (count > 0) {
                                    out.print("<form method='post' action='view_all_videos_user.jsp'>");
                                    out.print("<input type='hidden' name='from' value=" + to + ">");
                                    out.print("<input type='hidden' name='to' value=" + (Integer.parseInt(to) + 4) + ">");
                                    out.print("<Button type='submit' value='Next'>Next</Button>");
                                    out.print("</form>");
                                    if (Integer.parseInt(from) > 3) {
                                        out.print("<form method='post' action='view_all_videos_user.jsp'>");
                                        out.print("<input type='hidden' name='from' value=" + (Integer.parseInt(from) - 4) + ">");
                                        out.print("<input type='hidden' name='to' value=" + (Integer.parseInt(to) - 4) + ">");
                                        out.print("<Button type='submit' value='Previous'>Previous</Button>");
                                        out.print("</form>");
                                    }
                                }else{
                             if (Integer.parseInt(from) > 3) {
                                        out.print("<form method='post' action='view_all_videos_user.jsp'>");
                                        out.print("<input type='hidden' name='from' value=" + (Integer.parseInt(from) - 4) + ">");
                                        out.print("<input type='hidden' name='to' value=" + (Integer.parseInt(to) - 4) + ">");
                                        out.print("<Button type='submit' value='Previous'>Previous</Button>");
                                        out.print("</form>");
                                    }
                            }
                            %>
                      
</div>
</div>
                        </div>
                    </div>
                    <!--DO NOT Remove The Footer Links-->
                    <!--Designed by--><a href="http://www.htmltemplates.net">
                        <img src="images/footnote.gif" class="copyright" alt="html templates"></a>
                    <!--In partnership with--><a href="http://websitetemplates.net">
                        <img src="images/footnote.gif" class="copyright" alt="websitetemplates.net"></a>
                    
                </div>
            </div>
        </div>
    </body>
</html>
