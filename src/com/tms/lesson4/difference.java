package com.tms.lesson4;

import java.util.Arrays;

public class difference {
    public static void main(String[] args) {

        int[] mas = new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

        int sumOfEven = 0;
        int theSumIsOdd = 0;

        for (int i = 0; i < mas.length; i++) {

            if (i % 2 == 0) {
                sumOfEven = sumOfEven + mas[i];
            } else {
                theSumIsOdd = theSumIsOdd + mas[i];
            }
        }

        System.out.println("Массив чисел: " + Arrays.toString(mas));
        System.out.println("Сумма чисел на четных местах: " + sumOfEven);
        System.out.println("Сумма чисел не на четных местах: " + theSumIsOdd);
        System.out.println("Разница сумм: " + (sumOfEven - theSumIsOdd));
    }
}
