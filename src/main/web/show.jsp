<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%--
  Created by IntelliJ IDEA.
  User: lizq
  Date: 2017/8/30
  Time: 16:00
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<table border="1">
    <tr>
        <td>I D:</td>
        <td>姓名:</td>
        <td>密码:</td>
    </tr>
    <c:forEach items="${userList}" var="user">
        <tr>
            <td>${user.id}</td>
            <td> ${user.username}</td>
            <td>${user.password}</td>
        </tr>
    </c:forEach>
</table>
</body>
</html>
