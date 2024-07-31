package com.mphasis.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

//step -1


public class MyFirstDb {

	public static void main(String[] args) {
		
		Connection con = null;
		Statement stmt = null;
		ResultSet rs = null;

		try {
			// step-2-Register the mysql driver
			Class.forName("com.mysql.cj.jdbc.Driver");

			// step -3
			// Establish connection

			con = DriverManager.getConnection("jdbc:mysql://localhost:3306/employee", "root", "root");
			// Step -4 crerating statement
			stmt = con.createStatement();
			// step -5
			rs = stmt.executeQuery("select * from emp");

			while (rs.next()) {

				System.out.println("id: " + rs.getInt("id"));
				System.out.println("First Name: " + rs.getString(2));
				System.out.println("Last Name: " + rs.getString(3));
				System.out.println("==============================");
			}
		} catch (Exception e) {
			System.out.println("Exception occoured");

		} finally {
			try {
				rs.close();
				stmt.close();
				con.close();
			} catch (SQLException e) {
				System.out.println("exception");
			}
			

		}
	}

}
