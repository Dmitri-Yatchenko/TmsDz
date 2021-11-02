package com.tms.lesson2;

import java.util.Scanner;

public class output {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (true){
            System.out.print("Для закрытия программы введите exit: ");
            String s = scanner.next();
            if (s.equals("exit")){
                break;
            }
        }
    }
}
