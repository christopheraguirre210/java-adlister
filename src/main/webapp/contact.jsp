<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: christopheraguirre
  Date: 1/10/20
  Time: 11:47 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<div>
    <c:forEach var="contact" items="${contacts}">
        <h1>${contact.firstName}${contact.lastName}</h1>
        <p>${contact.phoneNumber}</p>
    </c:forEach>
</div>

</body>
</html>
