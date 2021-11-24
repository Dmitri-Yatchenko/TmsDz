package com.tms.lesson8;

public interface Service {

    public void addElement(Database db, String element) throws ArrayOverflowException;

    public void returnElement(Database db) throws GettingAnEmptyEntryException;

}
