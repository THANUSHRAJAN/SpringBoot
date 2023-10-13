<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Spring Boot Model Program</title>
<style>
body {
    font-family: Arial, sans-serif;
    background: linear-gradient(to right, #3498db, #8e44ad);
    margin: 0;
    padding: 0;
    display: flex;
    justify-content: center;
    align-items: center;
    height: 100vh;
}

</style>
</head>
<body>

<c:forEach var="z" items="${Home}">
        ${z.name}
    </c:forEach>
    
    
    
</body>
</html>