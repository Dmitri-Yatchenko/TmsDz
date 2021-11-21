package com.tms.lesson7;

public class MultilevelSearch implements Search{
    @Override
    public void SearchByName(Director director, String name) {
        for (Employee employee: director.employees) {

            if (employee.name.equals(name)){
                System.out.println("Сотрудник найден!");
            }

            if (employee.position == Positions.DIRECTOR){
                SearchByName((Director)employee, name);
            }
        }
    }
}
