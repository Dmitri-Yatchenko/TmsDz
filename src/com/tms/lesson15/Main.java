package com.tms.lesson15;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Main {
    public static void main(String[] args) throws SQLException {

        String url = "jdbc:postgresql://localhost:5432/";
        String database = "lesson15";
        String userName = "postgres";
        String password = "1234";
        Connection connection = DriverManager.getConnection(url + database, userName, password);
        System.out.println(connection);

    }
}
