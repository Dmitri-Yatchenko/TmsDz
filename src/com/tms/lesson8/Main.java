package com.tms.lesson8;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        String[] arr = new String[5];
        Service service = new UserService();
        Scanner scanner = new Scanner(System.in);
        while (true) {
            String s = scanner.next();
            if (s.equals("exit")) {
                break;
            } else if (s.equals("get")) {
                try {
                    service.returnElement(arr);
                } catch (GettingAnEmptyEntryException ex) {
                    System.out.println("Ошибка получения пустой записи из памяти!");
                }
            } else {
                try {
                    service.addElement(arr, s);
                } catch (ArrayOverflowException ex) {
                    System.out.println("Ошибка переполнения памяти!");
                }
            }
        }

    }

}
