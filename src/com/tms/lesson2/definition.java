package com.tms.lesson2;

import java.util.Scanner;

public class definition {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите одну из английских букв A, I, B, C : ");
        String s = scanner.next();
        System.out.println("Вы ввели букву " + s);

        if (s.equals("A") || s.equals("I")){
            System.out.println("Эта гласная буква.");
        }else if (s.equals("B") || s.equals("C")){
            System.out.println("Эта согласная буква.");
        }else {
            System.out.println("Введенное значение не соответствует предложенному." );
        }

        switch (s){
            case ("A"):
            case ("I"):
                System.out.println("Эта гласная буква.");
                break;
            case ("B"):
            case ("C"):
                System.out.println("Эта согласная буква.");
                break;
        }
    }
}
