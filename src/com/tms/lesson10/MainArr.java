package com.tms.lesson10;


import java.util.Arrays;

public class MainArr {

    public static void main(String[] args) {

        int[] arr = new int[]{-7, 22, 19, 18, 20, 27, -9};

        System.out.println("Массив: " + Arrays.toString(arr));
        System.out.println("_________________________________");

        int max = Arrays.stream(arr)
                .max()
                .getAsInt();
        System.out.println("Максимальное число: " + max);

        int min = Arrays.stream(arr)
                .min()
                .getAsInt();
        System.out.println("Минимальное число: " + min);
        System.out.println("_________________________________");

        int sum = Arrays.stream(arr)
                .filter(val -> val % 2 == 0)
                .sum();
        System.out.println("Сумма четных чисел: " + sum);
        System.out.println("_________________________________");

        System.out.println("Элементы массива начиная с 5:");
        Arrays.stream(arr)
                .skip(4)
                .forEach(System.out::println);
    }
}
