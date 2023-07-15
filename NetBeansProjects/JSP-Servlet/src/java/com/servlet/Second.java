
package com.servlet;

import jakarta.servlet.Servlet;
import jakarta.servlet.ServletConfig;
import jakarta.servlet.ServletException;
import jakarta.servlet.ServletRequest;
import jakarta.servlet.ServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Date;
//import jakarta.servlet.http.HttpServlet;

/**
 *
 * @author sukhm
 */
public class Second implements Servlet {
    ServletConfig conf;
    @Override
    public void init(ServletConfig sc) throws ServletException {
        this.conf=conf;
        System.out.println("Creating object...");
    }

    @Override
    public ServletConfig getServletConfig() {
        return this.conf;
    }

    @Override
    public void service(ServletRequest sr, ServletResponse sr1) throws ServletException, IOException {
        System.out.println("servicing...");
        
        sr1.setContentType("text/html");
        PrintWriter writer= sr1.getWriter();
        writer.println("<h1>Welcome to second servlet</h1>");
        writer.println("<h1>Today's Date: "+new Date().toString()+"</h1>");
    }

    @Override
    public String getServletInfo() {
        return ("servlet created by sukhmeet");
    }

    @Override
    public void destroy() {
       System.out.println("Going to destroy servlet object");
       
    }
    
}
