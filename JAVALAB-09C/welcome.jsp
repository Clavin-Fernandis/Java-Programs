<%@ page language="java"
contentType="text/html; charset=ISO-8859-1"
pageEncoding="ISO-8859-1"%>

<!-- welcome.jsp -->

<!DOCTYPE html>
<html>
<head>
<title>Welcome</title>
</head>

<body>

<%

String name =
request.getParameter("uname");

int min =
Integer.parseInt(
request.getParameter("time"));

session.setAttribute(
"user", name);

session.setMaxInactiveInterval(
min * 60);

out.print(
"Hello " + name);

out.print(
"<br><br>Session Expiry Time : "
+ min + " minute(s)");

out.print(
"<br><br>Press following link "
+ "within set session time "
+ "or wait for expiry.");

%>

<br><br>

<a href="second.jsp">

Check Session

</a>

</body>
</html>