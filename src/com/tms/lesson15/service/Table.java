package com.tms.lesson15.service;

import java.sql.Connection;
import java.sql.ResultSet;
import java.util.List;

public interface Table<T>{

    void сreateTable(Connection connection, String inquiry);

    void fillTable(Connection connection, String inquiry);

    ResultSet getData(Connection connection, String inquiry);

    List<T>getObjects(Connection connection, String inquiry);
}
