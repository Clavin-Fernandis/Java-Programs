<%@ page language="java"
contentType="text/html; charset=UTF-8"
pageEncoding="UTF-8"%>

<!-- index.jsp -->

<!DOCTYPE html>
<html>
<head>
<title>User Data Form</title>

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

<h2>Enter User Data</h2>

<form action="processUser"
      method="post">

Username :

<input type="text"
       name="username"
       required>

<br><br>

Email :

<input type="email"
       name="email"
       required>

<br><br>

Designation :

<input type="text"
       name="designation"
       required>

<br><br>

<input type="submit"
       value="Submit">

</form>

</div>

</body>
</html>