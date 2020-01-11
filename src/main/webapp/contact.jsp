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
<form action="/contacts" method="POST">
    <div>
        <label for="firstName">First Name</label>
        <input id="firstName" name="firstName" placeholder="Enter First Name">
    </div>
    <div>
        <label for="lastName">Last Name</label>
        <input id="lastName" name="lastName" placeholder="Enter Last Name">
    </div>
    <div>
        <label for="phoneNumber">Phone Number</label>
        <input id="phoneNumber" name="phoneNumber" placeholder="Enter Phone Number">
    </div>
    <button>Submit</button>
</form>

</body>
</html>
