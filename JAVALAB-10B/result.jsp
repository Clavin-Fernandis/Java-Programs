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
width:350px;
margin:auto;
margin-top:40px;
padding:20px;
border:1px solid black;
}
</style>
</head>

<body>

<div class="box">

<h2>Student Result</h2>

<p>Roll No :
<%= request.getAttribute(
"rollno") %></p>

<p>Name :
<%= request.getAttribute(
"studentname") %></p>

<p>Sub1 :
<%= request.getAttribute(
"sub1") %></p>

<p>Sub2 :
<%= request.getAttribute(
"sub2") %></p>

<p>Sub3 :
<%= request.getAttribute(
"sub3") %></p>

<p>Sub4 :
<%= request.getAttribute(
"sub4") %></p>

<p>Sub5 :
<%= request.getAttribute(
"sub5") %></p>

<p>Average :
<%= request.getAttribute(
"average") %></p>

<p>Result :
<%= request.getAttribute(
"result") %></p>

<a href="index.jsp">
Back to Form
</a>

</div>

</body>
</html>