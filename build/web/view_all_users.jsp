<%@page import="java.sql.ResultSet"%>
<!DOCTYPE HTML>
<html>
    <head>
        <meta charset="UTF-8">
        <title>Video Rating</title>
        <meta name="description" content="Description of your site goes here">
        <meta name="keywords" content="keyword1, keyword2, keyword3">
        <link href="css/style.css" rel="stylesheet" type="text/css">
    </head>
    <body>
        <div class="page-out">
            <div class="main">
                <div class="page">
                    <div class="header">
                        <%@include file="admin_menu.html" %>
                        <div class="header-img"><img src="images/ntpc_logo.jpg" alt="" height="200"
                                                     width="990"></div>
                    </div>
                    <div class="content">
                        <div class="content-in">
                            <div class="left">
                                  <h1 class="title">Video Rating</h1>
                                <div class="center_view_user">
                                    <table border="1" align="center">
                                        <tr>
                                            <th>User ID</th>
                                            <th>Name</th>

                                            <th> Email ID</th>
                                            <th> Mobile</th>
                                            <th>Address</th>
                                            <th>Registration Date</th>
                                            <th>User Type</th>

                                        </tr>
                                        <%


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
                                        %>
                                    </table>


                                </div>
                            </div>

                        </div>
                    </div>
                    <!--DO NOT Remove The Footer Links-->
                    <!--Designed by--><a href="http://www.htmltemplates.net">
                        <img src="images/footnote.gif" class="copyright" alt="html templates"></a>
                    <!--In partnership with--><a href="http://websitetemplates.net">
                        <img src="images/footnote.gif" class="copyright" alt="websitetemplates.net"></a>
                    <div class="footer">Video Rating

                    </div>
                </div>
            </div>
        </div>
    </body>
</html>
