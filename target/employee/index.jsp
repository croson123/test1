<%--
  Created by IntelliJ IDEA.
  User: croson_u
  Date: 2020/6/1
  Time: 17:19
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>入口</title>
</head>
<body>
hello world!

<a href="/findAll">查询所有</a>

<hr/>
<form action="/save" method="post">
    员工信息：<br/>
    姓名：<input type="text" name="name"/><br/>
    年龄：<input type="text" name="age"/><br/>
    性别：<input type="text" name="sex"/><br/>
    地址：<input type="text" name="address"/><br/>
    <input type="submit" value="提交"/><br/>
</form>

<hr>
<form action="/delete" method="post">
    删除id:<input type="text" name="id"/><br/>
    <input type="submit" value="提交"/><br/>
</form>

<hr>
<form action="/update" method="post">
    更新：
    id:<input type="text" name="id"/><br/>
    名字:<input type="text" name="name"/><br/>
    年龄:<input type="text" name="age"/><br/>
    <input type="submit" value="提交"/><br/>
</form>


</body>
</html>
