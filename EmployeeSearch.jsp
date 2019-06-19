<%@page import="com.lti.assignment.Employee"%>
<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Details:</title>
</head>
<body>
<% 

       Employee emp = (Employee)session.getAttribute("currentEmps");
	%>
	     Empno : <%= emp.getEmpno() %><br/>
	    Ename : <%= emp.getEname() %><br/>
	    Job : <%= emp.getJob() %><br/>
	    Mgr : <%= emp.getMgr() %><br/>
	    Hiredate : <%= emp.getHiredate() %><br/>
	    Sal : <%= emp.getSal() %><br/>
	    Comm : <%= emp.getComm() %><br/>
	    Deptno : <%= emp.getDeptno() %><br/>
</body>
</html>