<%--
  Created by IntelliJ IDEA.
  User: cc
  Date: 2022/11/19
  Time: 14:43
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>添加用户</title>
</head>
<body>
<form action="${pageContext.request.contextPath}/UserController/addUser" method="post">
    用户ID: <input type="text" name="userId"><br>
    用户名: <input type="text" name="userName"><br>
    密  码: <input type="password" name="password"><br>
    <%--绑定集合List/Set类型--%>
    <%--格式：list[索引].属性--%>
    账户地址1:<br>
    省  份: <input type="text" name="accAddresses[0].province"><br>
    城  市: <input type="text" name="accAddresses[0].city"><br>
    <%--绑定集合Map类型--%>
    <%--格式：map['key'].属性--%>
    账户信息1:<br>
    账户ID: <input type="text" name="accounts['key1'].accId"><br>
    账户余额:<input type="text" name="accounts['key1'].account"><br>
    <input type="submit" value="保存">
</form>

<h4>-----------------------</h4>

<%--@RequestBody注解：使用Ajax请求--%>
用户名: <input type="text" id="userName"><br>
密  码: <input type="password" id="password"><br>
<button name="btn" onclick="ajaxReq()">提交</button>

<script src="js/jquery-3.5.0.js"></script>
<script>
    // 使用ajax需要导入jQuery包
    function ajaxReq() {
        let unValue = document.getElementById("userName");
        let pwValue = document.getElementById("password");
        let userList = [];
        userList.push({"userName":unValue,"password":pwValue});
        $.ajax({
            url:"/UserController/ajaxRequestBody",
            type:"post",
            data:JSON.stringify(userList),
            contentType:"application/json"
        });
    }
</script>

</body>
</html>
