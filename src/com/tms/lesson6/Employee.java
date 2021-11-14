package com.tms.lesson6;

public abstract class Employee extends Person{

    public Positions position;
    public int experience;
    public int tariffRate = 500;

    public Employee(String name, String surname, int experience) {
        super(name, surname);
        this.experience = experience;

    }

    public abstract void establishAPosition(Positions position);

    public int calculationOfSalary(){
        return tariffRate * position.coefficient * experience;
    }

}
