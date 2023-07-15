<%-- 
    Document   : Demo
    Created on : 11-Jul-2023, 9:15:59 pm
    Author     : sukhm
--%>

<%@page contentType="text/html" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Original Page</h1>
<!--        <-jsp:forward page="Forward.jsp"><-/jsp:forward->-->
        <% // request.getRequestDispatcher("Forward.jsp").forward(request,response);
            response.sendRedirect("Redirect.jsp");
        %>
    </body>
</html>
