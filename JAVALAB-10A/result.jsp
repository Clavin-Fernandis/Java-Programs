<%@ page language="java"
contentType="text/html; charset=UTF-8"
pageEncoding="UTF-8"%>

<!-- result.jsp -->

<!DOCTYPE html>
<html>
<head>
<title>Result</title>

<style>
.box{
width:320px;
margin:auto;
margin-top:50px;
padding:20px;
border:1px solid black;
}
</style>
</head>

<body>

<div class="box">

<h2>Processing Result</h2>

<p>
<%= request.getAttribute(
"message") %>
</p>

<%
if(request.getAttribute(
"username") != null){
%>

<p>
Username :
<%= request.getAttribute(
"username") %>
</p>

<p>
Email :
<%= request.getAttribute(
"email") %>
</p>

<p>
Designation :
<%= request.getAttribute(
"designation") %>
</p>

<%
}
%>

<a href="index.jsp">

Back to Form

</a>

</div>

</body>
</html>