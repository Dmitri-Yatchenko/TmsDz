package com.tms.lesson5;


import java.util.Arrays;

public class MainWorkingWithArrays {
    public static void main(String[] args) {

        int[] arr = new int[]{1, 3, 6, 5, -9, 100};
        System.out.println("Первичный массив: ");
        System.out.println(Arrays.toString(arr));
        System.out.println("Отсортированный массив: ");
        WorkingWithArrays.sortingAnArray(arr);
        System.out.println(Arrays.toString(arr));
        System.out.println("Максимальный элемент в массиве: ");
        System.out.println(WorkingWithArrays.maximumArrayElement(arr));
        System.out.println("Индекс элемента 5 в массиве: ");
        System.out.println(WorkingWithArrays.arrayElementNumberByValue(arr, 5));
    }
}
