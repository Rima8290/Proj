<%@page import="com.lti.minor.project2.Employee"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Delete Employee</title>
</head>
<body>
<%
 Employee emp = (Employee)session.getAttribute("deleteEmps");
%>
    Eid : <%= emp.getEid() %><br/>
	Fname : <%= emp.getFname() %><br/>
	Doj : <%= emp.getDoj() %><br/>
	Dept : <%= emp.getDept() %><br/>
</body>
</html>