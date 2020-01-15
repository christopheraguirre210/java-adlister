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
    <title>Register page</title>
</head>
<body>
<h1>Register with us</h1>
<form action="/ads/register" method="post">
    <label for="sign-up">Username</label>
    <input type="text" id="sign-up" name="sign-up"><br>
    <label for="sign-up">password</label>
    <input type="text" id="sign-up" name="sign-up">
    <button type="submit">Sign-up</button>
</form>

</body>
</html>
