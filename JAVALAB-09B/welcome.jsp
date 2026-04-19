<%@ page language="java"
contentType="text/html; charset=ISO-8859-1"
pageEncoding="ISO-8859-1"%>

<!-- welcome.jsp -->

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Welcome</title>
</head>

<body>

<%

String name =
request.getParameter("uname");

out.print("Welcome! " + name);

out.print("<br>Session has started...");

session.setAttribute(
"user", name);

out.print(
"<br>Your name stored in session");

session.setMaxInactiveInterval(
60);

out.print(
"<br>One minute is set for session expiry");

out.print(
"<br><br>Click below link within one minute");

%>

<br><br>

<a href="second.jsp">

Display the value

</a>

</body>
</html>