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
    <h5 class="card-title">Modify</h5>
    
     <c:forEach items="${upp}" var="p">
     

     </c:forEach>
   <form:form action="updt" method="post" modelAttribute="upd" onsubmit="return rolevalidation()">
   <div class="form-row">
   <div class="form-group col-md-6">
   <form:label path="roleName">Role Name :</form:label>
   
   <form:input path="roleName" class="form-control input-sm" name="roleName" id="roleName" />
   
   </div>
  
   
   <div class="form-group col-md-6">
   
   <form:label path="listName">List Name :</form:label>
   <div>
    <form:select  path="listName"  class="form-control input-sm" id="listName" name="listName">
    <option></option>
   <option>Walmart</option>
  <option>Target</option>
  <option>SRG</option>
   </form:select>
   
    </div>
   </div>
   
   <div class="form-row">
  
   <div class="form-group col-md-6">
   <form:label path="adminId">User Name :</form:label>
   
   <form:input path="adminId" class="form-control input-sm" id="adminId" name="adminId"/>
   </div>
   
    <div class="form-group col-md-6">
    <form:label path="isadmin">Is Admin:</form:label>
  <div>
    <form:select  path="isadmin"  class="form-control input-sm" id="isadmin" name="isadmin">
    <option></option>
   <option>Yes</option>
  <option>No</option>
   </form:select>
   
    </div>
   </div>
   </div>
  </div>
  <div align="center">
   <div class="form-group col-md-12">
   <button class="btn btn-primary btn-lg">Submit</button><br>
        
 <div align="center">
<a href="AdminHome.jsp">Back</a>

   </div>
   
   </div>
   
   </form:form> 
   
    
   
  </div>
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