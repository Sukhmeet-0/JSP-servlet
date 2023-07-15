/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.servlet;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 *
 * @author sukhm
 */
@WebServlet(urlPatterns="/Controller", name="Controller")
public class Controller extends HttpServlet {
    @Override
    @SuppressWarnings("ConvertToStringSwitch")
    public void doGet(HttpServletRequest req,HttpServletResponse res) throws ServletException, IOException{
        String param=req.getParameter("page");
        if(param.equals("login")){
            getServletContext().getRequestDispatcher("/Login.jsp").forward(req, res);
        }else if(param.equals("signup")){
            getServletContext().getRequestDispatcher("/Signup.jsp").forward(req, res);
        }else{
            getServletContext().getRequestDispatcher("/Notfound.jsp").forward(req, res);
        }
    } 
}
