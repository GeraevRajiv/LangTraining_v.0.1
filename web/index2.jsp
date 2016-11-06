<%--
  Created by IntelliJ IDEA.
  User: Rajiv
  Date: 06.11.2016
  Time: 20:39
  To change this template use File | Settings | File Templates.
--%>
<%@ page language="java" %>
Please enter your Name and Password here:
<br>
<br>
<form name="frm" action="/JSPMultipleForms/Authentication" method="Post" >
    Name:&nbsp;&nbsp;&nbsp;<input type="text" name="user" value=""/>
    Password:<input type="text" name="pass" value=""/>
    &nbsp;&nbsp;&nbsp;<input type="submit" value="Check" />
</form>
