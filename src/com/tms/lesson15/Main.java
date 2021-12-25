package com.tms.lesson15;

import java.sql.Connection;
import com.tms.lesson15.config.JDBCConfiguration;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Main {

    public static void main(String[] args) {
        Connection connection = JDBCConfiguration.getConnect();
        Statement statement = null;


//        //Создаем таблицу
//        try {
//            statement = connection.createStatement();
//            String SQL = "CREATE TABLE humans( " +
//                    "id SERIAL PRIMARY KEY, " +
//                    " name CHARACTER VARYING(30), " +
//                    " sex BOOLEAN not null, " +
//                    " dateOfBirth DATE)";
//            statement.executeUpdate(SQL);
//            System.out.println("Таблица humans создана!");
//        } catch (SQLException e) {
//            e.printStackTrace();
//        }
//
//
//        //Заполняем таблицу
//        try {
//            statement = connection.createStatement();
//            String SQL = "INSERT INTO humans (name, sex, dateofbirth) VALUES\n" +
//                    "('Human1', true, '1991-04-19'),\n" +
//                    "('Human2', false, '1992-07-15'),\n" +
//                    "('Human3', true, '1995-06-20'),\n" +
//                    "('Human4', true, '1994-04-19'),\n" +
//                    "('Human5', false, '1991-03-06'),\n" +
//                    "('Human6', true, '1995-05-19'),\n" +
//                    "('Human7', true, '1995-04-27'),\n" +
//                    "('Human8', false, '1990-02-01'),\n" +
//                    "('Human9', true, '1999-06-13'),\n" +
//                    "('Human10', false, '1994-01-01')";
//            statement.executeUpdate(SQL);
//            System.out.println("Таблица humans заполнена!");
//        } catch (SQLException e) {
//            e.printStackTrace();
//        }

        //Получаем данные
        try {
            statement = connection.createStatement();
            String SQL = "SELECT * FROM humans";
            ResultSet resultSet = statement.executeQuery(SQL);
            System.out.println("Данные таблицы humans:");
            while (resultSet.next()){
                System.out.println(resultSet.getInt(1)
                        + ", "
                        + resultSet.getString(2)
                        + ", "
                        + resultSet.getString(3)
                        + ", "
                        + resultSet.getDate(4)
                        + ";");
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }


        try {
            connection.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
