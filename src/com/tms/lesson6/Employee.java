package com.tms.lesson6;

public abstract class Employee extends Person{

    public Positions position;
    public int experience;
    public int tariffRate;

    public Employee(String name, String surname, Positions position, int experience, int tariffRate) {
        super(name, surname);
        this.position = position;
        this.experience = experience;
        this.tariffRate = tariffRate;
    }

    public abstract void establishAPosition(Positions position);

    public int calculationOfSalary(){
        return tariffRate * position.coefficient * experience;
    }

}
