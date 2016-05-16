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
                        <%session.setAttribute("Message", "");%>
                        <div class="header-img"><img src="images/ntpc_logo.jpg" alt="" height="200"
                                                     width="990"></div>
                    </div>
                    <div class="content">
                        <div class="content-in">
                            <div>
                                <h1 class="title">Video Rating</h1>

                            </div>
                            <div class="right">

                                <%

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

                                %>
                                <table border="1" class="leftuser">
                                    <tr>
                                        <th>Admin</th>
                                        <th>Details</th>

                                    </tr>
                                    <tr>
                                        <th>User ID</th>
                                        <th><%=userid%></th>

                                    </tr>
                                    <tr>
                                        <td>Name</td>
                                        <td><%=txtname + " " + txtmname + " " + txtlname%></td>
                                    </tr>
                                    <tr>
                                        <td>Email id</td>
                                        <td><%=txtemail%></td>
                                    </tr>
                                    <tr>
                                        <td>Mobile No.</td>
                                        <td><%=number%></td>
                                    </tr>

                                    <tr>
                                        <td>Address</td>
                                        <td><%=txtaddress%></td>
                                    </tr>
                                    <tr>
                                        <td>Date of Joining</td>
                                        <td><%=doj%></td>
                                    </tr>
                                    <tr>
                                        <td>User Type</td>
                                        <td><%=usertype%></td>
                                    </tr>
                                    <tr>
                                        <td>   <form action="changepass_admin.jsp" method="post">
                                                <input type="submit" class="btnChangePass"  value="Change Password"/>
                                            </form>
                                        </td>
                                    </tr>


                                </table>

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
