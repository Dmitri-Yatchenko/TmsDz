package com.tms.lesson10;


import java.util.Arrays;

public class MainArr {
    public static void main(String[] args) {

        int[] arr = new int[7];
        arr[0] = -7;
        arr[1] = 22;
        arr[2] = 19;
        arr[3] = 18;
        arr[4] = 20;
        arr[5] = 27;
        arr[6] = -9;

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

        System.out.println("Элементы массива начиная с 5:");
        Arrays.stream(arr)
                .skip(4)
                .forEach(System.out::println);



    }
}
