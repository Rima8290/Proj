<%@page import="com.lti.minorProject.studentServlet"%>

<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Details</title>
</head>
<body>

<% 
       student stu = (student)session.getAttribute("currentStudents");
	%>
	     Rollno : <%= stu.getRollno() %><br/>
	     Fname : <%= stu.getFname() %><br/>
	     Lname : <%= stu.getLname() %><br/>
	     Course: <%= stu.getCourse() %><br/>
	     Result : <%= stu.getResult() %><br/>
	 
</body>
</html>