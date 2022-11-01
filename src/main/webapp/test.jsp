<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<html>
<head>
<title>admin</title>
</head>
<body>
    <h1>admin Page!</h1>
 
    <table>
        <thead>
            <tr>
                <th>아이디</th>
            </tr>
        </thead>
        <tbody>
            <c:forEach items="${memberList}" var="member">
                <tr>
                    <td>${member.ID}</td>
                </tr>
            </c:forEach>
        </tbody>
    </table>

</body>
</html>