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


</head>

<body>
<div class="header"/>

</div>

<div class="row mainsection">
 <div class="col-sm">
 <span class="text-success">${message}</span>
<div align="center">   
<div class="card" style="width: 20rem;margin-top: 20px;border-radius: 10px;">
  
  <div class="card-body">
    <h5 class="card-title">Add Role</h5>
   <form:form action="role" method="post" modelAttribute="rol" >
   <div class="form-row">
   <div class="form-group col-md-6">
   <form:label path="adminId">Id :</form:label>
   
   <form:input path="adminId" class="form-control input-sm" name="adminId" id="adminId"/>
   
   </div>
   <div class="form-group col-md-6">
   <form:label path="listName">List Name :</form:label>
   
   <form:input path="listName" class="form-control input-sm" name="listName" id="listName"/>
   
   </div>
    <div class="form-row">
   
   <div class="form-group col-md-6">
   <form:label path="roleName">Role Name :</form:label>
   
   <form:input path="roleName" class="form-control input-sm" id="roleName" name="roleName"/>
   
   </div>
   <div class="form-group col-md-6">
   <form:label path="isadmin">Is Admin :</form:label>
   
   <form:input path="isadmin" class="form-control input-sm" name="isadmin" id="isadmin"/>
   
   </div>
   </div>
   
   
   <div class="form-group col-sm-12">
   <button class="btn btn-primary btn-lg">Add</button><br>
   </div>
   </div>
   </div>
   </form:form>
    
<div align="center">
<a href="AdminHome.jsp">Back</a>
</div>
 </div>
   </div>
   </div>




</div>

   ${message }
<%
RequestDispatcher rd=request.getRequestDispatcher("AdminHome.jsp");
rd.include(request,response);
%>
</body>
</html>