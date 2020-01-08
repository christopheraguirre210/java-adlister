<%--
  Created by IntelliJ IDEA.
  User: christopheraguirre
  Date: 1/7/20
  Time: 2:18 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Login</title>
</head>
<body>

<form method="POST" action="/login.jsp">
    <label for="username">Username:</label>
    <input id="username" name="username" placeholder="Enter your username" />

    <label for="password">Password:</label>
    <input id="password" name="password" placeholder="Enter your password" />

    <button type="submit" formmethod="post"></button>
</form>

</body>
</html>
