<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: christopheraguirre
  Date: 1/13/20
  Time: 9:40 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>

<html>
<head>
    <title>Title</title>
</head>
<body>
    <h1>This is the session JSP</h1>

    <h2><c:out value="${requestScope.reqAt}"/></h2>
    <h2><c:out value="${applicationScope.conAt}"/></h2>

    <h2>This is how to get session data: <c:out value="${sessionScope.name}"/></h2>

    <h2>You have <c:out value="${sessionScope.cart.numItems}"/> items in your cart </h2>
    <h3><%= request.getSession().getMaxInactiveInterval()%>
    </h3>
</body>
</html>
