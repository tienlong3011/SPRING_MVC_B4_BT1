<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%--
  Created by IntelliJ IDEA.
  User: ACER
  Date: 25/11/2021
  Time: 16:52
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Settings</title>
</head>
<body>
<form:form modelAttribute="settings" method="post" action="/setting/create" >
    Languages: <form:select path="languages" items="${language}"/><br/>
    Page Size: Show <form:select path="pageSize" items="${pageSize}"/><br/>
    Spams filter: <form:checkbox path="spamsFilter"/> Enable spams filter <br/>
    Signature: <form:textarea path="signature"/><br/>
    <button type="submit" >Update</button>
</form:form>

</body>
</html>
