<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
       <%@taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
           <%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">

<link rel="stylesheet" type="text/css" href="/style.css">
<link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.4.1/css/bootstrap.min.css" integrity="sha384-Vkoo8x4CGsO3+Hhxv8T/Q5PaXtkKtu6ug5TOeNV6gBiFeWPGFN9MuhOf23Q9Ifjh" crossorigin="anonymous">

<div class="container-fluid">
<div class="row mainheader">
<div class="col-sm text-nowrap">

</div>
</div>
</div>
</head>

<body>
<div class="header"/>

</div>
<div align="center">
<br><br>
<h2>User</h2>
<table border="2">
<tr>
<th>Id</t>
<th>Name</th>
<th>Password</th>
<th>Role</th>

</tr>
<c:forEach items="${sup}" var="s">

<tr>
<td>${s.analystId}</td>
<td>${s.firstName}</td>
<td>${s.password}</td>
<td>${s.role}</td>
</tr></c:forEach>
<c:forEach items="${ad}" var="ad">
<tr>
<td>${ad.adminId}</td>
<td>${ad.firstName}</td>
<td>${ad.password}</td>
<td>${ad.role}</td>
</c:forEach></table>
</div>

<tr>
<div align="center">
<a href="AdminHome.jsp" >Back</a>

</div>
<br><br>
${message }
<%
RequestDispatcher rd=request.getRequestDispatcher("AdminHome.jsp");
rd.include(request,response);
%>
</body>
</html>