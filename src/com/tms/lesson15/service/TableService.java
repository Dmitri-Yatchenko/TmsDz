package com.tms.lesson15.service;

import java.util.List;

public interface TableService<T>{

    void сreateTable();

    void fillTable();

    String getById(int id);

    List<T> getListHuman();
}
