
package com.servlet;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Date;

/**
 *
 * @author sukhm
 */
public class Fourth extends HttpServlet{
    @Override
    public void doGet(HttpServletRequest req,HttpServletResponse res) throws IOException{
        
            System.out.println("THis is get method");
            res.setContentType("text/html");
            PrintWriter writer=res.getWriter();
            writer.println("<h1> Fourth servlet</h1>");
            writer.println(new Date().toString());
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        
    }
    
}
  