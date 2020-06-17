<%--
  Created by IntelliJ IDEA.
  User: croson_u
  Date: 2020/6/17
  Time: 14:51
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" isELIgnored="false" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>成功</title>
</head>
<body>
<c:forEach items="${employee}" var="employee">
    ${employee.toString()}
</c:forEach>
</body>
</html>
