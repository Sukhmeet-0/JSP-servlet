

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP File</title>
    </head>
    <body>
        <!<!-- static content only -->
        <%@include file="file.txt" %><br>
        <!<!-- dynamic content will be fetched -->
        <jsp:include page="file.txt"></jsp:include>
        <br>
        <!<!-- only import class not package -->
        <%@page import="java.util.Date"%>
        
        <% out.println(new java.util.Date().toString());%>
    </body>
</html>
