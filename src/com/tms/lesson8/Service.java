package com.tms.lesson8;

public interface Service {

    public void addElement(String[] arr, String element) throws ArrayOverflowException;

    public void returnElement(String[] arr) throws GettingAnEmptyEntryException;

}
