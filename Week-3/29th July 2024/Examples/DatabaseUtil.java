package com.mphasis.jdbc;
import java.io.FileInputStream;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;

public class DatabaseUtil {

    private static Properties loadProperties() throws IOException {
        Properties properties = new Properties();
        try (FileInputStream input = new FileInputStream("dbconfig.properties")) {
            properties.load(input);
        }
        return properties;
    }

    public static Connection getConnection() throws SQLException, IOException {
        Properties properties = loadProperties();
        
        String driverClassName = properties.getProperty("jdbc.driverClassName");
        String url = properties.getProperty("jdbc.url");
        String username = properties.getProperty("jdbc.username");
        String password = properties.getProperty("jdbc.password");
        
        try {
            // Load the JDBC driver class
            Class.forName(driverClassName);
        } catch (ClassNotFoundException e) {
            throw new SQLException("JDBC Driver not found", e);
        }

        // Establish the connection
        return DriverManager.getConnection(url, username, password);
    }
}
