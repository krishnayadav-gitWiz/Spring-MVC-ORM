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
<h2 class="text-center">${Header }</h2>
    <h5 class="text-center">${Description }</h5>
    <br>
    <h5 style="color: green" class="text-center">${msg }</h5>
<h1 style="color: blue">View to controller to new view</h1>
<h1 style="color: purple"> Hey!!!  ${user.username}</h1>
<h2 style="color: green">Your email address is ${user.email}</h2>
<h4 style="color: red">Your password is ${user.password} try to secure the password...</h4>
</body>
</html>