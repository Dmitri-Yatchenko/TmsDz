package com.tms.lesson15;

import java.sql.Connection;
import com.tms.lesson15.config.JDBCConfiguration;
import com.tms.lesson15.entity.Human;
import com.tms.lesson15.service.TableService;
import com.tms.lesson15.service.UserTableService;

import java.sql.SQLException;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        Connection connection = JDBCConfiguration.getConnect();
        TableService table = new UserTableService(connection);

        table.сreateTable();

        table.fillTable();

        System.out.println(table.getById(2));

        List<Human> humans = table.getListHuman();
        System.out.println(humans.toString());

        try {
            connection.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
