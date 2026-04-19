<%@ page import="java.sql.*" %>

<!-- 12d. Generate report of remaining records -->

<!DOCTYPE html>
<html>
<head>
<title>Remaining Records</title>

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

PreparedStatement ps1 =
con.prepareStatement(
"delete from Emp where Emp_Name like ?");

ps1.setString(1,
ch + "%");

ps1.executeUpdate();

Statement st =
con.createStatement();

ResultSet rs =
st.executeQuery(
"select * from Emp");

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

<a href="index.jsp">

Back

</a>

<%

con.close();

%>

</div>

</body>
</html>