<%@page import="java.io.FileOutputStream"%>
<%@page import="java.io.FileInputStream"%>
<%@page import="java.io.InputStream"%>
<%@ page import="java.util.List" %>
<%@ page import="java.util.Iterator" %>
<%@ page import="java.io.File" %>
<%@ page import="org.apache.commons.fileupload.servlet.ServletFileUpload"%>
<%@ page import="org.apache.commons.fileupload.disk.DiskFileItemFactory"%>
<%@ page import="org.apache.commons.fileupload.*"%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
 

        <%
            System.out.println("here");
            boolean isMultipart = ServletFileUpload.isMultipartContent(request);
            String txtcategory = "", txtgname = "", txtdesc = "", txtuserid = "",realname=null,videoname=null;
            System.out.println("here");
           
            String context = config.getServletContext().getRealPath("/");
            String filePath = context + "upload";
            txtuserid = session.getAttribute("userid").toString();
            int i = 0;
            File f = null;
            if (!isMultipart) {
            } else {
                FileItemFactory factory = new DiskFileItemFactory();
                ServletFileUpload upload = new ServletFileUpload(factory);
                List items = null;
                try {
                    items = upload.parseRequest(request);
                } catch (FileUploadException e) {
                    e.printStackTrace();
                }
                Iterator itr = items.iterator();
                while (itr.hasNext()) {
                    FileItem item = (FileItem) itr.next();
                    if (item.isFormField()) {
                        String name = item.getFieldName();
                        String value = item.getString();
                        if (name.equalsIgnoreCase("txtcategory")) {
                            txtcategory = value;
                        }

                        if (name.equalsIgnoreCase("txtgname")) {
                            txtgname = value;
                        }
                        if (name.equalsIgnoreCase("txtdesc")) {
                            txtdesc = value;
                        }
                      
                        System.out.println("Parameters " + name + " value " + value);
                     

                    } else {
                        try {
                            String itemName = item.getFieldName();
                                    
                         if(itemName.equals("txtfile")){
                             System.out.println("fILE pATH=" + filePath + itemName);
                                String strFile = DB.Connect.getFileDateTime();

                            f = new File(filePath + "\\" + strFile + ".jpg");
                            realname = strFile + ".jpg";
                          //  f = new File(filePath + "\\" + itemName);
                           
                            f.setWritable(true);
                            f.setReadable(true);
                            item.write(f);
                         }else{
                         System.out.println("fILE pATH=" + filePath + itemName);
                                String strFile = DB.Connect.getFileDateTime();

                            f = new File(filePath + "\\" + strFile + ".mkv");
                            videoname = strFile + ".mkv";
                          //  f = new File(filePath + "\\" + itemName);
                           
                            f.setWritable(true);
                            f.setReadable(true);
                            item.write(f);
                         }
                            
                           

                        } catch (Exception e) {
                            e.printStackTrace();
                        }
                    }


                }

            }

           i=DB.Connect.saveGame(txtgname, txtdesc, realname, txtcategory,videoname);

            if (i > 0) {
                session.setAttribute("Message", "Video created successfully!!");
                response.sendRedirect("create_video.jsp");
            } else {
                  session.setAttribute("Message", "Failed to create video!!");
                response.sendRedirect("create_video.jsp");
            }

           
%>
  


