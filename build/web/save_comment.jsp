<%
String rating=request.getParameter("star");
String gameid=request.getParameter("gameid");
String comment=request.getParameter("txtcomment");

System.out.print("rating "+rating);
String userid=session.getAttribute("userid").toString();
int i=0;
try{
    Integer.parseInt(rating);
if(comment.length()>0)
 i=DB.Connect.saveComment(userid, rating, comment, gameid);
}catch(Exception e){
    session.setAttribute("Message", "Please select rating!!");
    response.sendRedirect("single_video.jsp?gid="+gameid+"");
}

if(i>0){
 session.setAttribute("Message", "Comment published successfully!!");
    response.sendRedirect("single_video.jsp?gid="+gameid+"");
}else{
 session.setAttribute("Message", "Failed to save comment\nCheck whether you have already given comment!!");
    response.sendRedirect("single_video.jsp?gid="+gameid+"");
}
%>