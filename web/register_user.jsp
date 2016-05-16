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
                          <%@include file="index_menu.html" %>
                        <div class="header-img"><img src="images/ntpc_logo.jpg" alt="" height="200"
                                                     width="990"></div>
                    </div>
                   
                    <div class="content">
                        <div class="content-in">
                            <div>
                                <center>
                                <h1 class="title">Video Rating</h1>      
                                </center>
                              
                                <div class="center">
                                    <form class="frmSignup" action="sign_up" method="post">
                                        <%=session.getAttribute("Message")%>
                                        <%session.setAttribute("Message","");%>
                                        <br>
                                        <span class="mySpan">
                                          Create Account
                                        </span>

                                        <hr>
                                          
                                        <input type="text" id="txtfirstname" name="txtfirstname" placeHolder="First Name" class="txtLogin" title="First Name" maxlength="20" >
                                        <input type="text" id="txtmiddlename" name="txtmiddlename" placeHolder="Middle Name" class="txtLogin" title="Middle Name" maxlength="20">
                                        <input type="text" id="txtlastname" name="txtlastname" placeHolder="Last Name" class="txtLogin" title="Last Name" maxlength="20">
                                          
                                        <select  id="cmbgender" name="cmbgender" class="txtLogin">
                                                                        <option value="Select"> - - - - - - Select Gender- - - - - - - - -  </option>
                                                                        <option value="Male">Male</option>
                                                                        <option value="Female">Female</option>
                                                                    </select>
                                        
                                        <input type="text" id="txtmobile" name="txtemailid" placeHolder="Email ID" class="txtLogin" title="Email ID" >
                                        <input type="text" id="txtmobile" name="txtmobile" placeHolder="Mobile No." class="txtLogin" title="Mobile no." maxlength="10">
                                        <textarea rows="2" cols="3" id="txtaddress" name="txtaddress" placeHolder="Address" class="txtAddress" title="Address" maxlength="50" ></textarea>

                                        <input type="password" id="txtpassword" name="txtpassword" placeHolder="Password"  class="txtPass" title="Password" maxlength="25">
                                       
                                        <input type="password" id="txtConfirm_password" name="txtConfirm_password" placeHolder="Confirm Password" title="Confirm Password"  class="txtPass" maxlength="25" onchange="checkForNull()">
                                        <br>
                                        <input name="btnSignup" type="submit" class="btnLogin" id="btnSignup" value="Register" align="right" title="Sign up"  >

                                    </form>
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
