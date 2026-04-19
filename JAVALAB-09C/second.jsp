<%@ page language="java"
contentType="text/html; charset=ISO-8859-1"
pageEncoding="ISO-8859-1"%>

<!-- second.jsp -->

<!DOCTYPE html>
<html>
<head>
<title>Session Check</title>
</head>

<body>

<%

String name =
(String)session.getAttribute(
"user");

if(name == null)

    out.print(
    "Sorry Session Expired");

else

    out.print(
    "Hello " + name);

%>

</body>
</html>