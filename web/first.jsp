<%--
  Created by IntelliJ IDEA.
  User: Yevhen
  Date: 16.10.2015
  Time: 10:37
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title></title>
</head>
<body>
 <h1>Hello from JSP</h1>
    <jsp:useBean id="calc" type="logic.Calculator" scope="request"/>
    <p> ${calc.a} + ${calc.b} = ${calc.sum} </p>
    <p> ${calc.a} - ${calc.b} = ${calc.subtract} </p>


</body>
</html>
