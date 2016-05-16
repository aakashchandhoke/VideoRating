/*
 * To change this template, choose Tools | Templates
 * and openConnection the template in the editor.
 */

import DB.Connect;
import java.io.IOException;
import java.sql.SQLException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 *
 * @author Durgesh
 */
public class Login extends HttpServlet {

    String username;
    String password;
    String from;
    private String usertype;

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        validateUser(req, resp);
    }

    protected void validateUser(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {



        setPassword(req.getParameter("txtpassword"));
        setUsername(req.getParameter("txtusername"));
        String fname;


        if (Connect.validateLogin(username, password)) {
            HttpSession session = req.getSession();
            session.setAttribute("username", username);

String userid="";
            System.out.println("fname in session now");
            try {
                Connect.openConnection();
                Connect.rs = Connect.stat.executeQuery("select fname,usertype,userid from tbluser where emailid='" + username + "'");
                if (Connect.rs.next()) {
                    fname = Connect.rs.getString(1);
                    usertype = Connect.rs.getString(2);
                    session.setAttribute("fname", fname);
                    userid=Connect.rs.getString(3);
                    session.setAttribute("userid", userid);
                    setFrom(usertype);
                    System.out.println("fname in session now" + Connect.rs.getString(1));
                }
                  Connect.closeConnection();
                  
                
                if (getFrom().equalsIgnoreCase("dhead")) {
                    resp.sendRedirect("dept_panel.jsp");
                }else
                if (getFrom().equalsIgnoreCase("user")) {
                    resp.sendRedirect("user_panel.jsp");
                } else if (getFrom().equalsIgnoreCase("admin")) {
                    resp.sendRedirect("admin_panel.jsp");
                }
              
            } catch (SQLException ex) {
                ex.printStackTrace();
            }


        } else {
            {
                resp.getWriter().print("Authentication Fail");
                resp.sendRedirect("sign_in.jsp?error=1");
            }


        }


    }

    public String getFrom() {
        return from;
    }

    public void setFrom(String from) {
        this.from = from;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }
}
