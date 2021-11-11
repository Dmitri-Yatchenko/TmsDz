package com.tms.lesson6;

public class Main {
    public static void main(String[] args) {

        Employee worker1 = new Worker("Олег", "Семенов", Positions.WORKER, 6, 2500);
        Employee worker2 = new Worker("Борис", "Петров", Positions.WORKER, 4, 2000);
        Employee worker3 = new Worker("Витя", "Халипов", Positions.WORKER, 10, 3000);
        Employee director1 = new Director("Дмитрий", "Ятченко", Positions.DIRECTOR, 10, 5000);

        System.out.println(worker1.getNameSurname() + " " + worker1.calculationOfSalary());
        System.out.println(worker2.getNameSurname() + " " + worker2.calculationOfSalary());
        System.out.println(worker3.getNameSurname() + " " + worker3.calculationOfSalary());
        System.out.println(director1.getNameSurname() + " " + director1.calculationOfSalary());

        ((Director)director1).addWorker(worker1);
        ((Director)director1).addWorker(worker2);
        System.out.println((Director)director1);

        Employee director2 = new Director("Виталий", "Александров", Positions.DIRECTOR, 7, 3500);
        ((Director)director2).addWorker(worker3);
        System.out.println((Director)director2);

        ((Director)director1).addWorker(director2);
        System.out.println((Director)director1);
    }
}
