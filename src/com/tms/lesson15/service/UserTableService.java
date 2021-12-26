package com.tms.lesson15.service;

import com.tms.lesson15.entity.Human;
import java.sql.*;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class UserTableService implements TableService<Human> {


    private Connection connection;

    public UserTableService(Connection connection) {
        this.connection = connection;
    }

    @Override
    public void сreateTable() {

        try {
            Statement statement = connection.createStatement();
            statement.executeUpdate("CREATE TABLE humans( " +
                    "id SERIAL PRIMARY KEY, " +
                    " name CHARACTER VARYING(30), " +
                    " sex BOOLEAN not null, " +
                    " dateOfBirth DATE)");
            System.out.println("Таблица создана!");
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    @Override
    public void fillTable() {

        try {
            Statement statement = connection.createStatement();
            statement.executeUpdate("INSERT INTO humans (name, sex, dateofbirth) VALUES" +
                    "('Human1', true, '1991-04-19')," +
                    "('Human2', false, '1992-07-15')," +
                    "('Human3', true, '1995-06-20')," +
                    "('Human4', true, '1994-04-19')," +
                    "('Human5', false, '1991-03-06')," +
                    "('Human6', true, '1995-05-19')," +
                    "('Human7', true, '1995-04-27')," +
                    "('Human8', false, '1990-02-01')," +
                    "('Human9', true, '1999-06-13')," +
                    "('Human10', false, '1994-01-01')");
            System.out.println("Таблица заполнена!");
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    @Override
    public String getById(int id) {

        try {
            PreparedStatement statement = connection.prepareStatement("SELECT * FROM humans WHERE id = ?");
            statement.setInt(1, id);
            ResultSet resultSet = statement.executeQuery();
            resultSet.next();

            int iD = resultSet.getInt(1);
            String name = resultSet.getString(2);
            boolean sex = resultSet.getBoolean(3);
            Date dateOfBirth = resultSet.getDate(4);
            String s = iD + ", " + name + ", " + sex + ", " + dateOfBirth;
            return s;
        } catch (SQLException exc) {
            return "Строки с данным ID не найдено!";
        }
    }

    @Override
    public List<Human> getListHuman() {

        List<Human> humans = new ArrayList<>();
        try {
            Statement statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery("SELECT * FROM humans");

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
