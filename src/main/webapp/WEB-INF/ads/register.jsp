<%--
  Created by IntelliJ IDEA.
  User: christopheraguirre
  Date: 1/15/20
  Time: 3:56 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <jsp:include page="/WEB-INF/partials/head.jsp">
        <jsp:param name="title" value="Register"/>
    </jsp:include>
</head>
<body>
<jsp:include page="/WEB-INF/partials/navbar.jsp"/>

<h1>Register with us</h1>
<form action="/ads/register" method="post">
    <label for="username">Username</label>
    <input type="text" id="username" name="username" placeholder="username"><br>
    <label for="email">email</label>
    <input type="text" id="email" name="email" placeholder="email"><br>
    <label for="password">password</label>
    <input type="text" id="password" name="password" placeholder="password"><br>
    <button type="submit">Sign-up</button>
</form>

</body>
</html>
