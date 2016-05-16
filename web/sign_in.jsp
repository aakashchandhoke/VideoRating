<!DOCTYPE HTML>
<html>
    <head>
        <meta charset="UTF-8">
        <title>Video Rating</title>
        <meta name="description" content="Description of your site goes here">
        <meta name="keywords" content="keyword1, keyword2, keyword3">
             <link href="css/image_style.css" rel="stylesheet" type="text/css">
        <link href="css/style.css" rel="stylesheet" type="text/css">
   
    </head>
    <body>
        <div class="page-out">
            <div class="main">
                <div class="page">
                    <div class="header">
                          <%@include file="index_menu.html" %>
                          <div class="header-img"><img class="growheader picheader " src="images/ntpc_logo.jpg" alt="" 
                                                    ></div>
                    </div>
                    <div class="content">
                        <div class="content-in">
                            <div>
                                <h2 class="titleLogin">Login here</h2>

                            </div>
                            <div class="leftSignup">
                      <form class="frmLogin" action="Login" method="post">
                    <input name="txtusername" type="text" class="txtLogin" id="txtusername" title="Username or email" maxlength="30" placeHolder="Username or email" >
                  <input name="txtpassword" type="password"  class="txtPass" id="txtpassword" title="Password" maxlength="20" placeHolder="Password">
                  <br>
                  <input name="btnLogin" type="submit" class="btnLogin" id="btnLogin" value="Login" align="right" title="Click to login" >
                   
                 
                   
                    <%

                            String msg = request.getParameter("error");
                            try {
                                if (msg.equalsIgnoreCase("1") ) {

                                    out.println("<script type=text/javascript>");
                                    out.println("alert('" + "Invalid username or password!!" + "')");
                                    out.println("</script>");
                                }else if(msg.equalsIgnoreCase("2")){

                                      out.println("<script type=text/javascript>");
                                    out.println("drawToast1('" + "First Name and Email id are required!!" + "')");
                                    out.println("</script>");

                                }
                            } catch (Exception ex) {
                                System.out.println(ex.getMessage());
                            }

                    %>
                </form>
                <form action="register_user.jsp">
                    <input name="btnLogin" type="submit" class="btnLogin" id="btnLogin" value="New User"  align="right" title="Click to Register" >
                 
                </form>
                <br>
                <br>
                
      

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
