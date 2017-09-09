<%--
  Created by IntelliJ IDEA.
  User: LiuYuanhuai
  Date: 2017/8/30
  Time: 10:03
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>测试</title>
</head>
<body>
<form action="user/all.do" method="post">
    <input type="submit" value="查询全部"/>
</form>
<form action="user/reg.do" method="post">
    用户名: <input type="text" name="username"/><br/>
    密码: <input type="password" name="password"/><br/>
    <input type="submit" value="提交"/>
</form>


<form action="user/condition.do" method="post">
    用户名: <input type="text" name="username"/><br/>
    用户id: <input type="text" name="id"/><br/>
    <input type="submit" value="condition"/>
</form>

<form action="user/cond.do" method="post">
    用户名: <input type="text" name="username"/><br/>
    用户id: <input type="text" name="id"/><br/>
    <input type="submit" value="cond"/>
</form>
</body>
</html>
