// 11 b. Read all the existing records from the table coffee
// which is from the database test and update an existing
// coffee product in the table with its id.

package com.mypack;

import java.sql.*;
import java.util.Properties;

public class Mysql_Update
{
public static void main(String[] args)
{
try
{
Connection dbConnection = null;

try
{
String url = "jdbc:mysql://localhost/test";

Properties info = new Properties();

info.put("user", "root");
info.put("password", "@MSQL2530");

dbConnection =
DriverManager.getConnection(url, info);

if (dbConnection != null)
{
System.out.println(
"Successfully connected to MySQL database test");
}
}

catch (SQLException ex)
{
System.out.println(
"An error occurred while connecting MySQL databse");

ex.printStackTrace();
}

String query = "SELECT * FROM coffee";

Statement st =
dbConnection.createStatement();

ResultSet rs =
st.executeQuery(query);

while (rs.next())
{
int id =
rs.getInt("id");

String coffee_name =
rs.getString("coffee_name");

int price =
rs.getInt("price");

System.out.format(
"\n%d %s %d",
id,
coffee_name,
price);
}

rs.close();

String query2 =
"update coffee set price=950 where id=102";

PreparedStatement preparedStmt1 =
dbConnection.prepareStatement(query2);

preparedStmt1.execute();

preparedStmt1.close();
}

catch (Exception e)
{
System.err.println(
"Got an exception!");

System.err.println(
e.getMessage());
}
}
}