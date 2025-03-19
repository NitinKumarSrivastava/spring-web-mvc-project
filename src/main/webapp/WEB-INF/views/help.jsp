<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import="java.util.*" %>
<%@ page import="java.net.*" %>
<%@ page import="java.io.*" %>
<%@ page import="java.time.LocalDateTime" %>

<%@ page isELIgnored="false" %>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Help Page</title>
</head>
<body>
	<h1>This is help page ..... </h1>
	<h1>Called by ModelAndViewExplainController</h1>
	<h1>url /help</h1>
	
	<%
	
	/* String name = (String)request.getAttribute("name");
	Integer rn = (Integer)request.getAttribute("rollnumber");
	LocalDateTime ldt = (LocalDateTime)request.getAttribute("time"); */
	
	%>
	<%-- 
	<h1>Name is : <%= name %></h1>
	<h1>Roll Number is : <%= rn %></h1>
	
	<h1>Date and Time is : <%= ldt %></h1>
	 --%>
	 
	<h1>Name is : ${name}</h1>
	<h1>Roll Number is : ${rollnumber}</h1>
	
	<h1>Date and Time is : ${time}</h1>
	
	<hr>
	
	<c:forEach var="mark" items="${marks}">
	
		<%-- <h1>${mark }</h1> --%>
		<h1><c:out value="${mark }"></c:out></h1>
	
	</c:forEach>
	
	
	
</body>
</html>