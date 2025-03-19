<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<%@ page import="java.util.*" %>
<%@ page import="java.net.*" %>
<%@ page import="java.io.*" %>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Home Page</title>
</head>
<body>
	<h1>This is home page ..... </h1>
	<h1>Called by ModelExplainController</h1>
	<h1>url /home</h1>
	
	<%
	
	String name = (String)request.getAttribute("name");
	Integer id = (Integer)request.getAttribute("id");
	List<String> friends = (List<String>)request.getAttribute("friendsList");
	
	%>
	
	<h1>Name is : <%= name %></h1>
	<h1>Id is : <%= id %></h1>
	
	<%
		for (String f : friends) {
			//out.print(f);
			%>
			
			<h1><%= f %></h1>
			
			<%
		}
	%>
	
</body>
</html>