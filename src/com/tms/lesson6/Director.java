package com.tms.lesson6;

import java.util.Arrays;

public class Director extends Employee{

    Person[] employees = new Person[0];

    public Director(String name, String surname, Positions position, int experience, int tariffRate) {
        super(name, surname, position, experience, tariffRate);
    }

    @Override
    public void establishAPosition(Positions position) {
        this.position = position;
    }

    public void addWorker(Person person) {
        Person[] employees1 = employees;
        employees = Arrays.copyOf(employees1, employees1.length + 1);
        int i = employees.length - 1;
        employees[i] = person;
    }

    @Override
    public int calculationOfSalary() {
        if (employees.length > 0) {
            return tariffRate * position.coefficient * experience * employees.length;
        }else {
            return tariffRate * position.coefficient * experience;
        }
    }

    @Override
    public String toString() {
        return "Director{" +
                "name='" + name +
                ", surname='" + surname +
                ", position=" + position +
                ", experience=" + experience +
                ", tariffRate=" + tariffRate +
                ", employees=" + Arrays.toString(employees) +
                '}';
    }
}
