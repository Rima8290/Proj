<%@page import="com.lti.assign.model.Employee"%>
<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<%
    
   Employee employees=new Employee();

%>

EmpId : <%=employees.getId() %><br/>
Ename: <%=employees.getName() %><br/>
Mgr : <%=employees.getMgr() %><br/>
HireDate : <%=employees.getHiredate() %><br/>
Sal: <%=employees.getSal() %><br/>
Comm : <%=employees.getComm() %><br/>
Deptno : <%=employees.getDeptno() %><br/>
=======================================


	<a href="EmployeeControllerServlet?id">&lt;&lt;</a>|
</body>
</html>