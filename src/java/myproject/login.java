/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package myproject;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.*;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author kapil
 */
@WebServlet(urlPatterns = {"/login"})
public class login extends HttpServlet {

   Connection con;
   Statement st;
   ResultSet rs;
   int t=0;

          
       

    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
           try
           {
               
           Class.forName("com.mysql.jdbc.Driver");  
con=DriverManager.getConnection("jdbc:mysql://localhost:3306/systemmon","root",null);  
        System.out.println("success");  
         String s1=request.getParameter("first_name");
         String s2=request.getParameter("last_name");
         String s3=request.getParameter("department");
         String s4=request.getParameter("user_name");
         String s5=request.getParameter("user_password");
         String s6=request.getParameter("confirm_password");
         String s7=request.getParameter("email");
         String s8=request.getParameter("contact_no");
         String s9=request.getParameter("na");
         String nm=s1+" "+s2;
         st=con.createStatement();
         if(s9.equalsIgnoreCase("Submit"))
         {
            if(s5.equals(s6))
         {
              String que="insert into users SET name='"+nm+"',department='"+s3+"',username='"+s4+"',password='"+s5+"',email='"+s7+"',contact='"+s8+"' ";
        st.executeUpdate(que);
        out.print("successfully inserted!!!");
         }
         else
         {
             out.print("sorry");
         } 
         }
         else if(s9.equalsIgnoreCase("Login"))
         {
           //check for login using rs.next() function
               try 
        {
            //st=con.createStatement();     
            rs=st.executeQuery("select * from users");
           
            while(rs.next())
            {
                String a=rs.getString(4);
                 String b=rs.getString(5);
    if(a.equals(s4) && b.equals(s5))
    {
        t=1;
        break;
    }
    }    
             PrintWriter pw=response.getWriter();
             if(t==1)
             {
                response.sendRedirect("Dashboard.jsp");
             }
             else
             {
                System.out.print("bye");
             }
        }catch(Exception e)
        {
            System.out.print(e);
        }
  

                          
                 }
                 
           }catch(Exception e){System.out.println("nope "+e);}
         out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet login</title>");            
            out.println("</head>");
            out.println("<body>");
           // out.println("<h1>Servlet login at " + request.getContextPath() + "</h1>");
            out.println("</body>");
            out.println("</html>");
        }
    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
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
     *
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
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}