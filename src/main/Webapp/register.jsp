<%@ taglib uri="http://www.springframework.org/tags" prefix="spring" %>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h3>Registration</h3>

<c:url var="action" value="/role/create"></c:url>
<form:form method="post" action="${action}" modelAttribute="role">
<table>
<tr>
<td><form:label path="adminId">User Id :</form:label></td>
<td><form:input path="adminId" /></td>
</tr>
<tr>
<td><form:label path="firstName">First Name :</form:label></td>
<td><form:input path="firstName" /></td>
</tr>
<tr>
<td><form:label path="lastName" />Last Name :</td>
<td><form:input path="lastName" /></td>
</tr>
<tr>
<td><form:label path="roleName" />Role Name :</td>
<td><form:input path="roleName" /></td>
</tr>
<tr>
<td<form:label path="powerbiunits" />>Power BI Units :</td>
<td><form:input path="powerbiunits" /></td>
</tr>
<tr>
<td><form:label path="isadmin" />Is Admin :</td>
<td><form:input path="isadmin" /></td>
</tr>
<tr>
<td><form:label path="role" />Role :</td>
<td><form:input path="role" /></td>
</tr>
<tr>
<td><form:label path="password" />Password :</td>
<td><form:input path="password" /></td>
</tr>
<tr>
<td><form:label path="Conformpassword" />Conform Password :</td>
<td><form:input path="Conformpassword" /></td>
</tr>
<tr>
<td colspan="2"><input type="submit" value="Add Role" /></td>
</tr>

</table>
</form:form>
</body>
</html>