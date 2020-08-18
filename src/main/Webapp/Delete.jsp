<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<%@page import="java.sql.*,java.util.*"%>
<%@taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Home Page</title>
</head>
<body>
<form:form action="del/{adminId}" method="get" modelAttribute="del" onsubmit="return validation()">
 
   
   <div class="form-group col-sm-12">
   <button class="btn btn-primary btn-lg">del/${r.adminId}</button><br>
   </div>
   </div>
   </div>
   </form:form>
</body>
</html>
