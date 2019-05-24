<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
    <title>Splash</title>
    <link rel="stylesheet" href="/AandB/form/styles.css">
</head>
<body>
    <h1>Student Registered!</h1>
    <table>
        <caption>Students</caption>
        <c:forEach var="student" items="${students}">
        <tr>
            <td><c:out value="${student.name}"/></td>
            <td><c:out value="${student.lastName}"/></td>
            <td><c:out value="${student.e_mail}"></c:out></td>
        </tr>
        </c:forEach>
    </table>
</body>
</html>
