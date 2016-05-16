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
                        
                        <%
    if(session.getAttribute("Message").equals(null)){
    session.setAttribute("Message","");
    }else{
    out.print(session.getAttribute("Message"));
     session.setAttribute("Message","");
    }                        
   ;%> 
                        <div class="header-img"><img src="images/ntpc_logo.jpg" alt="" height="200"
                                                     width="990"></div>
                    </div>
                    <div class="content">
                        <div class="content-in">
                            <div>
                                <h1 class="title">Video Rating</h1>
                                <div class="center" style="width: 400px" >
                                    <form class="upload" action="create_video_db.jsp" method="post" enctype="multipart/form-data">
                                 <%=session.getAttribute("Message")%>
                                 <table>
                                     <tr>
                                         <td>
                                             <p>Select Category</p>
                                         </td>
                                         <td>
                                             <select name="txtcategory">
                                                 <option value="sports">
                                                     Sports
                                                 </option>
                                                 <option value="animation">
                                                     Animation
                                                 </option>
                                                 <option value="b">
                                                     Hollywood
                                                 </option>
                                                 <option value="c">
                                                     Bollywood
                                                 </option>
                                                 <option value="d">
                                                     Tutorials
                                                 </option>
                                                 <option value="d">
                                                     EDM
                                                 </option>
                                                 <option value="d">
                                                     POP
                                                 </option>
                                                 <option value="d">
                                                     Sufi
                                                 </option>
                                                 <option value="d">
                                                     Slow songs
                                                 </option>
                                                 <option value="d">
                                                     Coding Tutorials
                                                 </option>
                                             </select>
                                         </td>
                                     </tr>
                                     <tr>
                                         <td>
                                             <p>Select Video Image</p>
                                         </td>
                                         <td>
                                                    <input type="file" name="txtfile" id="txtfile" class="upload_file" accept="image/*"/>
                          
                                         </td>
                                     </tr>
                                     <tr>
                                         <td>
                                             <p>Select Video File</p>
                                         </td>
                                         <td>
                                                    <input type="file" name="txtVideo" id="txtfile" class="upload_file" accept="video/*"/>
                          
                                         </td>
                                     </tr>
                                     <tr>
                                         <td>
                                             <p>Video Name</p>
                                         </td>
                                         <td>
                                             <input type="text" name="txtgname" />
                          
                                         </td>
                                     </tr>
                                     <tr>
                                         <td>
                                             <p>Video Description</p>
                                         </td>
                                         <td>
                                             <textarea name="txtdesc" cols="25" rows="5"></textarea>
                          
                                         </td>
                                     </tr>
                                 </table>
                                 
                                   <br>
                                    <input type="submit" name="btnSubmit" id="btnSubmit" value="Save" class="btnLogin"/>
                                 
                                 
                            </form>       
                                </div>
                             
                            </div>
                            <div class="right">
                               
                                
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
