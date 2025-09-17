<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
    <title>Profile</title>
</head>
<body>
    <h2>Profile, ${user.username}!</h2>
    <h3>All Registered Users:</h3>
    <ul>
        <c:forEach items="${users}" var="u">
            <li>${u.username}</li>
        </c:forEach>
    </ul>
    <br/>
    <form action="login" method="get">
        <input type="submit" value="Logout" />
    </form>
</body>
</html>