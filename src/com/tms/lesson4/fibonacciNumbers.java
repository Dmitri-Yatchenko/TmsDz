package com.tms.lesson4;

import java.util.Arrays;

public class fibonacciNumbers {
    public static void main(String[] args) {

        int[] mas = new int[10];

        for (int i = 0; i < mas.length; i++) {

            if (i < 2) {
                mas[i] = i;
            } else {
                mas[i] = mas[i - 1] + mas[i - 2];
            }

        }
        System.out.println(Arrays.toString(mas));
    }
}
