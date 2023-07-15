
package com.servlet;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

/**
 *
 * @author sukhm
 */
@WebServlet(urlPatterns="/NewClass" ,name="NewClass")
public class NewClass extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
//        resp.getWriter().print(req.getParameter("value1"));
        PrintWriter out=resp.getWriter();
        out.println("Value 1:"+req.getParameter("val1"));
        out.println("Value 1:"+req.getParameter("val2"));
    }
    
}
