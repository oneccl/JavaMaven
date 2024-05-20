<%--
  Created by IntelliJ IDEA.
  User: cc
  Date: 2022/11/18
  Time: 16:32
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>添加账户</title>
</head>
<body>
<form action="${pageContext.request.contextPath}/AccountController/getAccIdParam" method="get">
    <%--绑定简单类型(使用注解)--%>
    账户ID: <input type="text" name="id"><br>
    <input type="submit" value="保存">
</form>

<h4>-----------------------</h4>

<form action="${pageContext.request.contextPath}/AccountController/addAccount" method="get">
    <%--绑定简单类型--%>
    账户ID: <input type="text" name="accId"><br>
    账  户: <input type="text" name="account"><br>
    <%--绑定pojo实体类型--%>
    <%--格式：实体属性.属性--%>
    用户ID: <input type="text" name="user.userId"><br>
    用户名: <input type="text" name="user.userName"><br>
    密  码: <input type="password" name="user.password"><br>
    <input type="submit" value="保存">
</form>

</body>
</html>
