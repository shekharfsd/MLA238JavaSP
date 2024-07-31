package com.mphasis.jdbc;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class DatabaseExample {

    public static void main(String[] args) {
        try (Connection connection = DatabaseUtil.getConnection()) {
            String query = "SELECT * FROM emp";
            try (PreparedStatement stmt = connection.prepareStatement(query);
                 ResultSet rs = stmt.executeQuery()) {

                while (rs.next()) {
                    System.out.println("User ID: " + rs.getInt(1));
                    System.out.println("First Name: " + rs.getString(2));
                    System.out.println("Last Name: " + rs.getString(3));
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
