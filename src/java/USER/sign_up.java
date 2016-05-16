package USER;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 *
 * @author DKG
 */
public class sign_up extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code> methods.
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
       
        String txtfirstname = request.getParameter("txtfirstname");
        String txtmiddlename = request.getParameter("txtmiddlename");
        String txtlastname = request.getParameter("txtlastname");
        String txtemailid = request.getParameter("txtemailid");
         HttpSession session=request.getSession();
      
        String txtmobile = request.getParameter("txtmobile");
        String cmbgender = request.getParameter("cmbgender");
        String txtaddress = request.getParameter("txtaddress");
          String usertype ="user";
        String txtConfirm_password = request.getParameter("txtConfirm_password");
        String txtpassword = request.getParameter("txtpassword");
        String message="";
        System.out.print("details==" + txtfirstname + ":" + cmbgender);
        boolean b = false;
       

        if (txtpassword.equalsIgnoreCase(txtConfirm_password)) {
            b = true;
            if (txtpassword.equalsIgnoreCase("") || txtConfirm_password.equalsIgnoreCase("")) {
                b = false;

            }
        }
         int i=0;
        if(b){
           i = DB.Connect.saveUsers(txtfirstname, txtmiddlename, txtlastname, txtemailid, txtmobile, cmbgender, txtaddress, txtpassword, "True", usertype);

        }
      
      
        if (i > 0) {
            message="Registration Successfull";
              session.setAttribute("Message", message);
            response.sendRedirect("register_user.jsp");
        } else {
               message="Registration Failed";
                 session.setAttribute("Message", message);
            response.sendRedirect("register_user.jsp");
        }
    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Returns a short description of the servlet.
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>
}
