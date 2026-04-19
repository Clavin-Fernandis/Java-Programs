<%@ page language="java"
contentType="text/html; charset=UTF-8"
pageEncoding="UTF-8"%>

<!-- 12d. Develop a JDBC project using MySQL to delete
the records in the table Emp of database Employee by
getting the name starting with character through JSP -->

<!DOCTYPE html>
<html>
<head>
<title>Delete Employee</title>

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

<h2>Delete Employee Records</h2>

<form action="Employee.jsp"
method="post">

Enter Starting Character :

<input type="text"
name="ch"
maxlength="1"
required>

<br><br>

<input type="submit"
value="Delete & Show Report">

</form>

</div>

</body>
</html>