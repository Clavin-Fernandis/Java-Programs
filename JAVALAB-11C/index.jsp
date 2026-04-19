<%@ page language="java"
contentType="text/html; charset=UTF-8"
pageEncoding="UTF-8"%>

<!-- 11 c. Develop a JDBC project using JDBC to append the
fields empno, empname and basicsalary into the table Emp
of the database Employee by getting the fields through
keyboard using index.jsp -->

<!DOCTYPE html>
<html>
<head>
<title>Employee Entry</title>

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

<h2>Employee Entry Form</h2>

<form action="Employee.jsp"
method="post">

Emp No :

<input type="number"
name="empno"
required>

<br><br>

Emp Name :

<input type="text"
name="empname"
required>

<br><br>

Basic Salary :

<input type="number"
name="salary"
required>

<br><br>

<input type="submit"
value="Submit">

</form>

</div>

</body>
</html>