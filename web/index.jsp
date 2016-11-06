<%--
  Created by IntelliJ IDEA.
  User: Rajiv
  Date: 04.11.2016
  Time: 22:29
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Добро пожаловать</title>
</head>
<body>

<h1>Авторизация</h1>
<form action="Authenticationn" method="POST" autocomplete="on">
    <div id="loginBox">
        <p><strong>Ваш логин:</strong>
            <input placeholder="Введите логин" type="text" size="20" name="j_username"></p>
        <p><strong>Пароль:</strong>
            <input placeholder="Введите пароль" type="password" size="20" name="j_password"></p>
        <p><input type="submit" value="Авторизоваться"></p>
    </div>
</form>







<%--<form action="/Authentication" method="Post" autocomplete="on">
    В

    Name:&nbsp;&nbsp;&nbsp;<input type="text" name="user" value=""/>
    <br>
    <br>
    Password:&nbsp;&nbsp;&nbsp;<input type="text" name="pass" value=""/>
    <br>
    &nbsp;&nbsp;&nbsp;<input type="submit" value="Check" />
</form>--%>



</body>
</html>
