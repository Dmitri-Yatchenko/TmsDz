package com.tms.lesson7;

public class Worker extends Employee{
    public Worker(String name, String surname, int experience, int tariffRate) {
        super(name, surname, experience, Positions.WORKER);
    }

    @Override
    public void establishAPosition(Positions position) {
        this.position = position;
    }

    @Override
    public String toString() {
        return "Worker{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                '}';
    }
}
