package com.tms.lesson6;

public class Person {

    public String name;
    public String surname;

    public Person(String name, String surname) {
        this.name = name;
        this.surname = surname;
    }

    public String getNameSurname() {
        return name + " " + surname;
    }

}
