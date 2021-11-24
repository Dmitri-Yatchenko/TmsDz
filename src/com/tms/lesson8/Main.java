package com.tms.lesson8;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Database db = new Database();
        Service service = new UserService();
        Scanner scanner = new Scanner(System.in);
        while (true) {
            String s = scanner.next();
            if (s.equals("exit")) {
                break;
            } else if (s.equals("get")) {
                try {
                    service.returnElement(db);
                } catch (GettingAnEmptyEntryException ex) {
                    System.out.println("Ошибка получения пустой записи из памяти!");
                }
            } else {
                try {
                    service.addElement(db, s);
                } catch (ArrayOverflowException ex) {
                    System.out.println("Ошибка переполнения памяти, максимальное количество элементов 5!");
                }
            }
        }

    }

}
