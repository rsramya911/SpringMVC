<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<center>
<h2>Customer Details</h2>
<form:form>
	
	<br>
	<c:if test="${not empty custList}">
	<table border="2">
		
			<tr>
				<th>CustomerID</th><th>CustomerName</th><th>Location</th><th>Salary</th><th>DateOfBirth</th>
			</tr>
			<c:forEach var="var" items="${custList}">
			<tr>
				<td>${var.custId}</td><td>${var.custName}</td><td>${var.custLocation}</td><td>${var.custSal}</td><td>${var.custDob}</td>
			</tr>		
			</c:forEach>
		
	</table>
	
	</c:if>
	<c:if test="${empty custList}">
	
		<h2>No Customers Available</h2>
	
	</c:if>
</form:form>
</center>
</body>
</html>