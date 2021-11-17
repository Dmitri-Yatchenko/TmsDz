package com.tms.lesson6;

public abstract class Employee extends Person{

    public Positions position;
    public int experience;
    public int tariffRate = 500;

    public Employee(String name, String surname, int experience, Positions position) {
        super(name, surname);
        this.experience = experience;
        this.position = position;

    }

    public abstract void establishAPosition(Positions position);

    public int calculationOfSalary(){
        return tariffRate * position.coefficient * experience;
    }

}
