<%--
  Created by IntelliJ IDEA.
  User: christopheraguirre
  Date: 1/8/20
  Time: 4:12 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<form action="/colorpicked.jsp" method="POST">
    <label for="colors">What's your favorite color?</label>
    <input type="color" name="colors" id="colors">
    <button type="submit">Pick</button>
</form>

</body>
</html>
