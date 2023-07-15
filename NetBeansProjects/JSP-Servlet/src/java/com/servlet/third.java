
package com.servlet;

import jakarta.servlet.GenericServlet;
import jakarta.servlet.ServletException;
import jakarta.servlet.ServletRequest;
import jakarta.servlet.ServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

/**
 *
 * @author sukhm
 */
public class third extends GenericServlet{

    @Override
    public void service(ServletRequest sr, ServletResponse sr1) throws ServletException, IOException {
        sr1.setContentType("text/html");
        PrintWriter writer=sr1.getWriter();
        writer.println("<h1> This is generic servlet</h1>");
    }
    
}
