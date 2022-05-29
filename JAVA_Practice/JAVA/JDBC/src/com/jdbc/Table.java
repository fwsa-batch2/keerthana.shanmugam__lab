package com.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class Table {

	public static void main(String[] args) throws SQLException {
		String url="jdbc:mysql://localhost:3306/JDBC";
		String username = "root";
		String password="freshworks2022";
		Connection connect = DriverManager.getConnection(url, username, password);
		String sql="CREATE TABLE Library(Id int , Name varchar(100) , Author varchar(100), Language varchar(100))";
		Statement stmt = connect.createStatement();
		stmt.executeUpdate(sql);
		System.out.println("Table created...");

	}

}


