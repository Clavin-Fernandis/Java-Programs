<%@ page import="java.sql.*" %>

<!-- 12c. Generate query report using Employee.jsp
Emp name starting with given character -->

<!DOCTYPE html>
<html>
<head>
<title>Salary Report</title>

<style>
.box{
width:420px;
margin:auto;
margin-top:30px;
padding:20px;
border:1px solid black;
}
</style>

</head>

<body>

<div class="box">

<%

String ch =
request.getParameter("ch");

Class.forName(
"com.mysql.cj.jdbc.Driver");

Connection con =
DriverManager.getConnection(
"jdbc:mysql://localhost:3306/Employee",
"root",
"@MSQL2530");

PreparedStatement ps =
con.prepareStatement(
"select * from Emp where Emp_Name like ?");

ps.setString(1,
ch + "%");

ResultSet rs =
ps.executeQuery();

int total = 0;

%>

<h2>Salary Report</h2>

<%

while(rs.next())
{
int no =
rs.getInt(1);

String name =
rs.getString(2);

int sal =
rs.getInt(3);

total += sal;

%>

<hr>

Emp_No :
<%= no %>

<br>

Emp_Name :
<%= name %>

<br>

Basic :
<%= sal %>

<br>

<%
}
%>

<hr>

Grand Salary :
<%= total %>

<br><br>

<a href="index.jsp">

Back

</a>

<%

con.close();

%>

</div>

</body>
</html>