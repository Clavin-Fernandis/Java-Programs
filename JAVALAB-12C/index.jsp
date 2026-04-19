<%@ page language="java"
contentType="text/html; charset=UTF-8"
pageEncoding="UTF-8"%>

<!-- 12c. Develop a JDBC Web Project using MySQL after
appending the fields empno, empname and basicsalary
into table Emp of database Employee and by getting a
character through keyboard using JSP -->

<!DOCTYPE html>
<html>
<head>
<title>Employee Query Input</title>

<style>
.box{
width:350px;
margin:auto;
margin-top:50px;
padding:20px;
border:1px solid black;
}
</style>

</head>

<body>

<div class="box">

<h2>Employee Query Form</h2>

<form action="Employee.jsp"
method="post">

Enter Starting Character :

<input type="text"
name="ch"
maxlength="1"
required>

<br><br>

<input type="submit"
value="Show Report">

</form>

</div>

</body>
</html>