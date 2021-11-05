package com.tms.lesson4;

import java.util.Arrays;

public class frequentNumber {

    public static void main(String[] args) {

        int[] mas = new int[]{4, 7, 4, 7, 5, 6, 7, 1, 7, 10};


        int maxNumber = 0;
        int maxNumberOfEntries = 0;

        for (int i = 0; i < mas.length; i++) {

            if (i == 0) {
                maxNumber = mas[i];
            }

            int number = mas[i];
            int numberOfEntries = 0;

            for (int j = i; j < mas.length; j++) {
                if (number == mas[j]) {
                    numberOfEntries = numberOfEntries + 1;
                }
            }

            if (numberOfEntries > maxNumberOfEntries) {
                maxNumberOfEntries = numberOfEntries;
                maxNumber = number;
            }

        }

        System.out.println("Массив чисел: " + Arrays.toString(mas));
        System.out.println("Максимальное вхождение числа: " + maxNumber + " в количестве: " + maxNumberOfEntries);

    }
}
