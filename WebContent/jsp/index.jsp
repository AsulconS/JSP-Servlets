<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
	<meta charset="ISO-8859-1">
	<title>Form</title>
</head>
<body>
	Hello World! This is a JSP!
	<br>
	Employee:<br>
	Name: <c:out value="${emp.name}"></c:out><br>
	Last Name: <c:out value="${emp.lastName}"></c:out><br>
	E-Mail: <c:out value="${emp.e_mail}"></c:out>
</body>
</html>