<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" import="java.util.*"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h1>Hello JSP</h1>
	<%= new Date().toString() %>
	<br>
	<%= 45*7 %><br>
	<%= 35>7 %><br>
	<%
		int x=25;
	out.println(x);
	if(x>25){
		out.print("X greater than 25");
	}else{
		out.print("not greater");
	}
	
	for(int i=0;i<10;i++){
		out.print("<br>"+i);
	}
	
	%>
	<br>
	
	<!-- declaration  for methods-->
	<!--  <%!
		String message(){
			return "I love jsp";	
		}
	%>
	<%=message() %>
	-->
	 <%--//response.sendRedirect("http://studyeasy.org");--%> 
</body>
</html>