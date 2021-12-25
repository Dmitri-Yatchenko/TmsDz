package com.tms.lesson15.config;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class JDBCConfiguration {

    public static Connection getConnect () {
        String url = "jdbc:postgresql://localhost:5432/";
        String database = "lesson15";
        String userName = "postgres";
        String password = "1234";
        Connection connection = null;
        try {
            connection = DriverManager.getConnection(url + database, userName, password);
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return connection;
    }
}
