<%@ page language="java"
contentType="text/html; charset=UTF-8"
pageEncoding="UTF-8"%>

<!-- index.jsp -->

<!DOCTYPE html>
<html>
<head>
<title>Student Result</title>

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

<h2>Student Marks Entry</h2>

<form action="processResult"
      method="post">

Roll No :
<input type="text"
name="rollno" required>
<br><br>

Student Name :
<input type="text"
name="studentname" required>
<br><br>

Sub1 :
<input type="number"
name="sub1"
min="0" max="100"
required>
<br><br>

Sub2 :
<input type="number"
name="sub2"
min="0" max="100"
required>
<br><br>

Sub3 :
<input type="number"
name="sub3"
min="0" max="100"
required>
<br><br>

Sub4 :
<input type="number"
name="sub4"
min="0" max="100"
required>
<br><br>

Sub5 :
<input type="number"
name="sub5"
min="0" max="100"
required>
<br><br>

<input type="submit"
value="Submit">

</form>

</div>

</body>
</html>