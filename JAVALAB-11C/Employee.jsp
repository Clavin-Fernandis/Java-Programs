<%@ page import="java.sql.*" %>

<!-- 11 c. Generate the report using Employee.jsp -->

<!DOCTYPE html>
<html>
<head>
<title>Salary Report</title>

<style>
.box{
width:400px;
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

String no =
request.getParameter(
"empno");

String name =
request.getParameter(
"empname");

String sal =
request.getParameter(
"salary");

Class.forName(
"com.mysql.cj.jdbc.Driver");

Connection con =
DriverManager.getConnection(
"jdbc:mysql://localhost:3306/Employee",
"root",
"@MSQL2530");

PreparedStatement ps =
con.prepareStatement(
"insert into Emp values(?,?,?)");

ps.setInt(1,
Integer.parseInt(no));

ps.setString(2,
name);

ps.setInt(3,
Integer.parseInt(sal));

ps.executeUpdate();

Statement st =
con.createStatement();

ResultSet rs =
st.executeQuery(
"select * from Emp");

int total = 0;

%>

<h2>Salary Report</h2>

<%

while(rs.next())
{
int eno =
rs.getInt(1);

String ename =
rs.getString(2);

int basic =
rs.getInt(3);

total += basic;

%>

<hr>

Emp_No :
<%= eno %>

<br>

Emp_Name :
<%= ename %>

<br>

Basic :
<%= basic %>

<br>

<%
}
%>

<hr>

Grand Salary :
<%= total %>

<br><br>

<a href="index.jsp">

Back to Form

</a>

<%

con.close();

%>

</div>

</body>
</html>