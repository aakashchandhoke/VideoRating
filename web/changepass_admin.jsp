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

                        <%
                                    try {
                                        String s = session.getAttribute("userid").toString();
                                        String s1 = session.getAttribute("usertype").toString();
                                        if (s.isEmpty()) {
                                            // response.sendRedirect("Logout.jsp");
                                        }
                                        if (!s1.equalsIgnoreCase("admin")) {//to check wheter someone else is not downloading files
                                            //response.sendRedirect("Logout.jsp");
                                        }
                                    } catch (Exception e) {
                                        // e.printStackTrace();
                                        // response.sendRedirect("Logout.jsp");
                                    }
                                    // session.setAttribute("Message", "");
%>

                        <%@include file="admin_menu.html" %>
                        <div class="header-img"><img src="images/ntpc_logo.jpg" alt="" height="200"
                                                     width="990"></div>
                    </div>
                    <div class="content">
                        <div class="content-in">
                            <div class="left">
                                <h1 class="title">Video Rating</h1>

                            </div>

                            <div class="contentfull1">

                                <form  action="change_pass_admin.jsp" method="post" >
                                    <%=session.getAttribute("Message").toString()%>
                                    <%
                                                System.out.println("message" + session.getAttribute("Message"));
                                                session.setAttribute("Message", "");
                                    %>
                                    <table  border="0" cellspacing="20" cellpadding="8" style align="center">

                                        <br>
                                        <tr>
                                            <td>
                                                <fieldset>
                                                    <legend>Change Password</legend>
                                                    <table cellpadding="5" cellspacing="5">
                                                        <tr>
                                                            <td class="text">Old Password:</td>
                                                            <td>
                                                                <input type= password size="25"  id="txtoldpassword" name="txtoldpassword"/>

                                                            </td>
                                                        </tr>
                                                        <tr>
                                                            <td class="text">New Password:</td>
                                                            <td>
                                                                <input type= password size="25"  id="txtnewpassword" name="txtnewpassword"/>

                                                            </td>
                                                        </tr>
                                                        <tr>
                                                            <td class="text">Confirm Password:</td>
                                                            <td>
                                                                <input type= password size="25"  id="txtconfirmpassword" name="txtconfirmpassword"/>

                                                            </td>

                                                        </tr>
                                                    </table>
                                                </fieldset>
                                            </td>
                                        </tr>
                                        <tr>
                                            <td align="center" style="color: red"></td>
                                        </tr>
                                        <tr>
                                            <td align="center" colspan="2" >
                                                <input type="submit" class="btnSubmit1" onclick= "return valid2()"value="Submit" />
                                                <input type= "reset" class="btnSubmit1" value="Reset"/>
                                            </td>
                                        </tr>
                                    </table>
                                </form>



                            </div>

                        </div>
                    </div>
                </div>

                <img src="images/footnote.gif" class="copyright" alt="html templates">


                <div class="footer">Video Rating

                </div>
            </div>
        </div>

    </body>
</html>
