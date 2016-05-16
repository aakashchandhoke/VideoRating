<%


            String message = "123";
            try {
                String op = request.getParameter("txtoldpassword");
                System.out.print("oldp=" + op);
                String np = request.getParameter("txtnewpassword");
                String cp = request.getParameter("txtconfirmpassword");
                String id = session.getAttribute("userid").toString();
                String dbp = DB.Connect.getUserPassword(id);
                System.out.print("old db p=" + dbp);
                if ((np == null || cp == null || op == null)) {
                    message = "No fields can be empty!!";
                    System.out.print("here");

                  
                } else if (dbp.equalsIgnoreCase(op)) {
                    if (np.equalsIgnoreCase(cp)) {
                        if (!(np.isEmpty() || cp.isEmpty() || op.isEmpty())) {
                            DB.Connect.changePass(id, np);
                            message = "Password changed successfully";
                            System.out.print("Passwordchanged");

                        } else {
                            message = "No fields can be empty!!";

                        }
                    } else {
                        message = "new password & confirm password do not match!!";


                    }
                } else {

                    message = " Incorrect Password!!";

                }
            } catch (Exception e) {

                e.printStackTrace();

                message = "An error occured please check the fields!!";
                System.out.println("message sent in session="+message);
            }

            session.setAttribute("Message", message);
                     System.out.println("message sent in session real="+message);
            response.sendRedirect("changepass_user.jsp");
%>