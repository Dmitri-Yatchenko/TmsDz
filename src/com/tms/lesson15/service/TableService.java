package com.tms.lesson15.service;

import java.sql.ResultSet;
import java.util.List;

public interface TableService<T>{

    void сreateTable();

    void fillTable();

    ResultSet getData();

    String getById(int id);

    List<T>getObjects();
}
