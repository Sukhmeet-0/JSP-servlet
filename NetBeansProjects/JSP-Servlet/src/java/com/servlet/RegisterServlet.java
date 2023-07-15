
package com.servlet;

import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

/**
 *
 * @author sukhm
 */
public class RegisterServlet extends HttpServlet{
    @Override
    public void doPost(HttpServletRequest req,HttpServletResponse res) throws IOException{
        
        res.setContentType("text/html");
        PrintWriter out=res.getWriter();
        out.println("<h2> Welcome to Register Servlet</h2>");
        
        String name=req.getParameter("username");
        String pass=req.getParameter("userpass");
        String email=req.getParameter("useremail");
        String gender=req.getParameter("usergender");
        String course=req.getParameter("usercourse");
        String check=req.getParameter("condition");
        if(!check.equals("null")){
            if(check.equals("checked")){
                out.println("<h2> Name: "+name+"</h2>");
                out.println("<h2> Password: "+pass+"</h2>");
                out.println("<h2> Email: "+email+"</h2>");
                out.println("<h2 Gender: >"+gender+"</h2>");
                out.println("<h2 Course: >"+course+"</h2>");
            }
            else if(check.equals("null")){
             out.println("<h2> You have not accepted terms and conditions!</h2>");   
            }
        }
        else{
            out.println("<h2> You have not accepted terms and conditions!</h2>");
        }
    }
    
}
