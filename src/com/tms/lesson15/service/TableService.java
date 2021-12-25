package com.tms.lesson15.service;

import com.tms.lesson15.entity.Human;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class TableService implements Table<Human> {

    @Override
    public void сreateTable(Connection connection, String inquiry) {

        Statement statement = null;
        try {
            statement = connection.createStatement();
            String SQL = inquiry;
            statement.executeUpdate(SQL);
            System.out.println("Таблица создана!");
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    @Override
    public void fillTable(Connection connection, String inquiry) {

        Statement statement = null;
        try {
            statement = connection.createStatement();
            String SQL = inquiry;
            statement.executeUpdate(SQL);
            System.out.println("Таблица заполнена!");
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    @Override
    public ResultSet getData(Connection connection, String inquiry) {

        Statement statement = null;
        ResultSet resultSet = null;
        try {
            statement = connection.createStatement();
            String SQL = inquiry;
            resultSet = statement.executeQuery(SQL);
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            return resultSet;
        }
    }

    @Override
    public List<Human> getObjects(Connection connection, String inquiry) {

        List<Human> humans = new ArrayList<>();
        try {
            Statement statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery(inquiry);

            while (resultSet.next()) {
                int id = resultSet.getInt(1);
                String name = resultSet.getString(2);
                boolean sex = resultSet.getBoolean(3);
                Date dateOfBirth = resultSet.getDate(4);

                Human human = new Human(id, name, sex, dateOfBirth);
                humans.add(human);
            }
        } catch (SQLException exc) {
            exc.printStackTrace();
        }
        return humans;
    }
}
