package com.tms.lesson15;

import java.sql.Connection;
import com.tms.lesson15.config.JDBCConfiguration;
import com.tms.lesson15.entity.Human;
import com.tms.lesson15.service.Table;
import com.tms.lesson15.service.TableService;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        Connection connection = JDBCConfiguration.getConnect();
        Table table = new TableService();


        //Создаем таблицу
        table.сreateTable(connection, "CREATE TABLE humans( " +
                "id SERIAL PRIMARY KEY, " +
                " name CHARACTER VARYING(30), " +
                " sex BOOLEAN not null, " +
                " dateOfBirth DATE)");


        //Заполняем таблицу
        table.fillTable(connection, "INSERT INTO humans (name, sex, dateofbirth) VALUES" +
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


        //Получаем данные
        ResultSet resultSet = table.getData(connection, "SELECT * FROM humans");
        while (true){
            try {
                if (!resultSet.next()) break;
            } catch (SQLException e) {
                e.printStackTrace();
            }
            try {
                System.out.println("Создан объект: " + resultSet.getInt(1)
                            + ", "
                            + resultSet.getString(2)
                            + ", "
                            + resultSet.getString(3)
                            + ", "
                            + resultSet.getDate(4)
                            + ";");
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }


        //Создаем объекты
        List<Human> humans = table.getObjects(connection,"SELECT * FROM humans");
        System.out.println("Создали объекты:");
        System.out.println(humans.toString());


        try {
            connection.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
