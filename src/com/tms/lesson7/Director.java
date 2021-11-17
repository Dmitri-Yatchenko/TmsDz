package com.tms.lesson7;

import java.util.Arrays;

public class Director extends Employee{

    Employee[] employees = new Employee[0];
    //public Positions position;

    public Director(String name, String surname, int experience, int tariffRate) {
        super(name, surname, experience, Positions.DIRECTOR);
    }

    @Override
    public void establishAPosition(Positions position) {
        this.position = position;
    }

    public void addWorker(Employee emp) {
        employees = Arrays.copyOf(employees, employees.length + 1);
        int i = employees.length - 1;
        employees[i] = emp;
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
