
<%@page import="java.util.Date"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Understanding HTTP headers</title>
</head>
<body>
<%
     String useragent = request.getHeader("user-agent");
 %>
 <h1><%= useragent %></h1>
 
 <h1>
 Date is : <%=new Date() %></h1>
<%
    //response.setHeader("refresh","1");
//response.setHeader("refresh", "5; URL=http://www.google.com");
//response.setHeader("Cache-Control","no-cache"); 
%>

<%        
    response.setHeader("Pragma", "No-cache");
    response.setHeader("Cache-Control", "no-cache, no-store, must-revalidate");
    response.setDateHeader("Expires", -1);
%>
</body>
</html>