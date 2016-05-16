
<%@page import="java.util.ArrayList"%>
<%@page import="java.util.List"%>

<%@page import="DB.Connect.*"%>
<%

    String fid = request.getParameter("gid");

  
    String input = "";
    String output="";
    try {
        String sql = "";
        if (fid.length() > 0) {
            sql = "SELECT * FROM tblcomment where did = '" + fid + "' order by rdate";
        }
        System.out.println(sql);
        DB.Connect.openConnection();
        DB.Connect.rs = DB.Connect.stat.executeQuery(sql);
        while (DB.Connect.rs.next()) {
            input = input + " " + DB.Connect.rs.getString("comment");
        }
       
        
         if(input.length()>0){
         output=DB.NavieBayesClassifier.analayseData(input);  
         }
       
        if(output.equals("positive")){
        output="Positive Response";
        }else  if(output.equals("negative")){
              output="Negative Response";
       
        }else{
              output="No Data Found!!";
        
        }
    } catch (Exception e) {
        e.printStackTrace();
    }
    System.out.print(output);
    response.getWriter().print(output);

%>