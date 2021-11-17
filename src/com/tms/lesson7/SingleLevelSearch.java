package com.tms.lesson7;

public class SingleLevelSearch implements Search{
    @Override
    public void SearchByName(Director director, String name) {
        for (Employee employee: director.employees) {
           if (employee.name.equals(name)){
               System.out.println("Сотрудник найден!");
           }
        }
    }
}
