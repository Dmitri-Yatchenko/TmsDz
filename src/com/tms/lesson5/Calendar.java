package com.tms.lesson5;

import java.util.Scanner;

public class Calendar {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите месяц, например JUNE : ");
        String s = scanner.next();
        System.out.println("Вы ввели месяц " + s);

        Months months = Months.valueOf(s);
        switch (months){
            case DECEMBER:
            case JANUARY:
            case FEBRUARY:
                System.out.println(Seasons.WINTER);
                break;
            case MARCH:
            case APRIL:
            case MAY:
                System.out.println(Seasons.SPRING);
                break;
            case JUNE:
            case JULY:
            case AUGUST:
                System.out.println(Seasons.SUMMER);
                break;
            case SEPTEMBER:
            case OCT0BER:
            case NOVEMBER:
                System.out.println(Seasons.AUTUMN);
                break;
        }

    }
}
