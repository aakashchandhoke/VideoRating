<%@page import="java.sql.ResultSet"%>
<!DOCTYPE HTML>
<html>
    <head>
        <meta charset="UTF-8">
        <title>Video Rating</title>
        <meta name="description" content="Description of your site goes here">
        <meta name="keywords" content="keyword1, keyword2, keyword3">
        <link href="css/style.css" rel="stylesheet" type="text/css">
        <link href="css/table.css" rel="stylesheet" type="text/css">
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
                    <div class="content1">

                        

                        <center> <div>

                                <table border="0" align="center">

                                    <%

                                        String from = request.getParameter("gid");
  double rating=0; 
                                        String style = "morph  picsingle";
                                        String query = "select *  from tblvideos where gameid='" + from + "'";
                                        System.out.print(query);
                                        DB.Connect.openConnection();

                                        ResultSet rs = DB.Connect.stat.executeQuery(query);

                                        //  out.println("<tr>");
                                        if (rs.next()) {

                                            out.print("<td>");
                                            out.println("<table><tr>"
                                                    + "<td> <div class='" + style + "'><img src=" + "upload/" + rs.getString("gimage") + " alt='' height='280' width='280'></div> </td></tr>");
                                            out.println("<tr>" + "<td><table><tr><td>Video Name: </td><td>" + rs.getString("gname") + "</td></tr></table></td></tr>");
                                            out.println("<tr>" + "<td><table><tr><td>Description: </td><td>" + rs.getString("gdesc") + "</td></tr></table></td></tr>");
                                            out.println("<tr>" + "<td><table><tr><td>Category: </td><td>" + rs.getString("gcategory") + "</td></tr></table></td></tr>");
                                            out.println("<tr>" + "<td><table><tr><td>Uploaded on: </td><td>" + rs.getString("rdate") + "</td></tr></table></td></tr>");
                                            out.println("<tr>" + "<td><table><tr><td>Download Video: </td><td><a target='new' href='upload/"+rs.getString("videoname")+"'>Click here to Download Video</a></td></tr></table></td></tr>");
                                            out.println("<tr>" + "<td><table><tr><td>Comment Analysis: </td><td> "+DB.Connect.analyze(from)+"</td></tr></table></td></tr></table>");
                                            out.print("<td>");

                                        }
                                        //out.println("</tr>");
                                        rs.close();
                                        DB.Connect.CloseConnection();


                                    %>
                                </table>
                                   
                                            <%
    if(session.getAttribute("Message").equals(null)){
    session.setAttribute("Message","");
    }else{
    out.print("<p style='color:red'>"+session.getAttribute("Message")+"</p>");
     session.setAttribute("Message","");
    }                        
   ;%> 
 
                                    <%
                                      
                                         query = "select tbluser.fname,comment,tblcomment.rdate,rating  from tbluser,tblcomment where tblcomment.gameid='" + from + "' and tbluser.userid=tblcomment.userid";
                                        System.out.print(query);
                                      

                   rs = DB.Connect.stat.executeQuery(query);
                                      int count1=0;
                                       while (rs.next()) {
                                           if(count1==0&& rs.getString("fname")!=null){
                                             out.println("<table border='1' align='center'><th>Name</th><th>Comment</th><th>Commented on</th>");
                                   
                                           }
                                             if(rs.getString("fname")!=null){
                                              out.println("<tr>");
                                            out.println("<td>" + rs.getString("fname") + "</td></td>");
                                            out.println("<td>" + rs.getString("comment") + "</td>");
                                            out.println("<td>" + rs.getString("rdate") + "</td>");
                                            out.print("</tr>");
                                            rating=rating+rs.getDouble("rating");
                                             }
                                           
                                            count1++;
                                        }
                                       System.out.print("total rating "+rating);
                                       if(rating>5.0)
                                       rating=(rating/count1);
                                        System.out.print("total rating "+rating);
                                       if(count1>0)
                                         out.println("<table>");
                                        rs.close();
                                        DB.Connect.CloseConnection();

                                        
%> <link rel="stylesheet" href="//netdna.bootstrapcdn.com/font-awesome/4.2.0/css/font-awesome.min.css">
                                <link rel="stylesheet" href="ajax/stylesheet.css">

                                <center> 

                                    <div >
                                        <form action="save_comment.jsp" method="post">
                                            <table class="">
                                                <tr>
                                                    <td>
                                                        <p>Current rating: <%=rating%>
                                                    </td>
                                                </tr>
                                                <tr>
                                                    <td>
                                            <center><div class="stars">

                                                    <input class="star star-5" id="star-5" type="radio" name="star" value="5"/>
                                                <label class="star star-5" for="star-5"></label>
                                                <input class="star star-4" id="star-4" type="radio" name="star" value="4"/>
                                                <label class="star star-4" for="star-4"></label>
                                                <input class="star star-3" id="star-3" type="radio" name="star" value="3"/>
                                                <label class="star star-3" for="star-3"></label>
                                                <input class="star star-2" id="star-2" type="radio" name="star" value="2"/>
                                                <label class="star star-2" for="star-2"></label>
                                                <input class="star star-1" id="star-1" type="radio" name="star" value="1"/>
                                                <label class="star star-1" for="star-1"></label>

                                            </div>
                                                    </td>
                                                </tr>
                                                <tr>
                                                    <td>
                                                        <input type='hidden' name='gameid' value="<%=from%>">
                                                        <textarea cols="35" rows="5" name="txtcomment" placeholder="Write your comment here"></textarea>
                                                    </td>
                                                </tr>
                                                <tr>
                                                    <td>
                                                        <button type="submit" >Submit</button>
                                                    </td>
                                                </tr>
                                                    
                                            </table>
                                          
                                         
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
                
            </div>
        </div>
    </div>
</body>
</html>
