<%@ page language="java"
contentType="text/html; charset=ISO-8859-1"
pageEncoding="ISO-8859-1"%>

<!-- second.jsp -->

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Second Page</title>
</head>

<body>

<h2>Display Session Value</h2>

<%

String name =
(String)session.getAttribute(
"user");

if(name == null)

    out.print(
    "Sorry the session has ended");

else

    out.print(
    "Hello " + name);

%>

</body>
</html>