package com.tms.lesson4;

import java.util.Arrays;

public class SumMinimumMaximum {
    public static void main(String[] args) {

        int[] mas = new int[]{1, 3, 6, 5, -9, 100};

        int min = 0;
        int max = 0;
        boolean b = true;

        for (int number : mas) {
            if (max < number) {
                max = number;
            }

            if (b) {
                min = number;
                b = false;
            }

            if (min > number) {
                min = number;
            }
        }

        System.out.println("Массив чисел: " + Arrays.toString(mas));
        System.out.println("Максимальное число: " + max);
        System.out.println("Минимальное число: " + min);
        System.out.println("Сумма максимального и минимального числа равна: " + (min + max));
    }
}
