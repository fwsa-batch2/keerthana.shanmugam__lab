package com.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class Insert {
	public static void main(String[] args) throws SQLException {
		String url="jdbc:mysql://localhost:3306/JDBC";
		String username = "root";
		String password="freshworks2022";
		Connection connect = DriverManager.getConnection(url, username, password);
		String sql="INSERT INTO library VALUES(1,'Harry potter','Swetha','English')";
		Statement stmt = connect.createStatement();
		stmt.executeUpdate(sql);
		System.out.println("Values Inserted....");

	}

}
