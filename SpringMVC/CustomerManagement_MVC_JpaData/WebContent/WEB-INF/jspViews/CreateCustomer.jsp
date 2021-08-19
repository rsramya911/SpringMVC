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
		<h2>Add Customer Details</h2>
		<form:form modelAttribute="custBean" method="GET"
			action="${pageContext.request.contextPath}/addCustomer.html">

			<br>

			<table border="2">
				<tr>
					<th>Customer Name</th>
					<td><form:input path="custName" /></td>
				</tr>
				<tr>
					<th>Location</th>
					<td>
						<form:select path="custLocation">
							<form:option value="" label="--Select--" />
							<form:option value="CH" label="Chennai" />
							<form:option value="BL" label="Bangalore" />
							<form:option value="CBE" label="Coimbatore" />
						</form:select>
					</td>
				</tr>
				<tr>
					<th>Customer Salary</th>
					<td>
						<form:input path="custSal"/>
					</td>
				</tr>
				<tr>
					<th>Customer Date of Birth</th>
					<td>
						<form:input path="custDob"/>
					</td>
				</tr>
				


			</table>

		<input type="submit" value="Submit"/>

		</form:form>
	</center>
</body>
</html>