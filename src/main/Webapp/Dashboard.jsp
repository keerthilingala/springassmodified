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
<h1>Dashboard</h1>
<form:form onsubmit="return validate()" action="Dash" modelAttribute="dash" method="post">

<table border="1">
<tr>

<th>Role</th><th>Report Name</th><th>Power BI Units</th><th>Action</th></tr>
<c:forEach items="${rll}" var="rd">

<tr>

<td>${rd.roleName}</td>


<td></td>
<td></td>
<td><a href="upd1">modify</a><br>
<a href="delete">delete</a></td>
</tr>
</c:forEach>


</table>

</div>
<tr>
<div align="center">
<a href="AdminHome.jsp" >Back</a>
</form:form>
</div>
<br><br>
${message }
<%
RequestDispatcher rd=request.getRequestDispatcher("AdminHome.jsp");
rd.include(request,response);
%>
</body>
</html>