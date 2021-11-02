package com.tms.lesson2;

import java.util.Scanner;

public class months {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите месяц, например Июнь : ");
        String s = scanner.next();
        System.out.println("Вы ввели месяц " + s);

        if (s.equals("Декабрь") || s.equals("Январь") || s.equals("Февраль")){
            System.out.println("Зима");
        }else if (s.equals("Март") || s.equals("Апрель") || s.equals("Май")){
            System.out.println("Весна");
        }else if (s.equals("Июнь") || s.equals("Июль") || s.equals("Август")){
            System.out.println("Лето");
        }else if (s.equals("Сентябрь") || s.equals("Октябрь") || s.equals("Ноябрь")){
            System.out.println("Осень");
        }else {
            System.out.println("Введенное значение не соответствует предложенному." );
        }
    }
}
