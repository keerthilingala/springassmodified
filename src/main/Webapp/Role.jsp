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

<div align="center"><br><br>
<h2>Role</h2>
<table border="2">
<tr>

<th>Role Name</th>
<th>List Name</th>
<th>Is Admin</th>
<th>Action</th>
</tr>
<c:forEach items="${rll}" var="r">
<tr>

<td>${r.roleName}</td>
<td>${r.listName}</td>
<td>${r.isadmin}</td>
<td><a href="upd">modify</a><br>
<a href="rol/${r.adminId}">delete</a></td>
</tr>
</c:forEach>
</table>
</div>

<tr>
<div align="center">
<a href="rol">add new role</a><br>
<a href="AdminHome.jsp">Back</a>

</div>
<br><br>
${message }
<%
RequestDispatcher rd=request.getRequestDispatcher("AdminHome.jsp");
rd.include(request,response);
%>
</body>
</html>