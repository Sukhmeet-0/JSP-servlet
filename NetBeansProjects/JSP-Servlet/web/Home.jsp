<%-- 
    Document   : Home
    Created on : 12-Jul-2023, 5:33:50 pm
    Author     : sukhm
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Welcome to Home page</h1>
        <a href="<%= request.getContextPath()%>/Controller?page=login">Login</a><br>
        <a href="<%= request.getContextPath()%>/Controller?page=signup">Sign Up</a><br>
        
    </body>
</html>
