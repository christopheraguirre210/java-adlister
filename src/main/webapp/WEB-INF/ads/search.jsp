<%--
  Created by IntelliJ IDEA.
  User: christopheraguirre
  Date: 1/15/20
  Time: 3:03 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<h1>Search page</h1>

<form action="/ads/search" method="post">
    <label for="search">Search for ad</label>
    <input type="text" id="search" name="search">
    <button type="submit">Search</button>
</form>

</body>
</html>
