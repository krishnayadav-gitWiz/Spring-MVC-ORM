<%@page import="java.time.LocalDateTime"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@page isELIgnored="false" %>
     <%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%> 
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>this is help page...</title>
</head>
<body>
<h1 style="color: blue">Using Model</h1>
<%
Integer id=(Integer) request.getAttribute("id");
 String name=(String) request.getAttribute("name");
 LocalDateTime time=(LocalDateTime) request.getAttribute("time");
%>
<h1> Id = <%=id %></h1>
<h1> Name = <%=name %></h1>
<h2>current time = <%=time %></h2>
<h1 style="color: red">-----------------------</h1>
<h1 style="color: blue">Using ModelAndView</h1>

<h2>${ id }</h2>
<h2>${ name }</h2>
<h2>${ time }</h2>
<hr>
<c:forEach var="item" items="${f }">
<h3>${item}</h3>
</c:forEach>

</body>
</html>