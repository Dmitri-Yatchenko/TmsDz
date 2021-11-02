package com.tms.lesson1;

public class comparison {

    public static void main(String[] args) {
        int i1 = 19;
        int i2 = 17;
        System.out.println("Первое число: " + i1);
        System.out.println("Второе число: " + i2);
        if (i1 > i2){
            System.out.println("Первое число больше");
        }else if (i1 < i2){
            System.out.println("Второе число больше");
        }else {
            System.out.println("Числа равны");
        }
    }
}
