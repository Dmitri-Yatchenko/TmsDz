package com.tms.lesson2;

public class bubbleSort {
    public static void main(String[] args) {

        int[] mas = new int[]{3, 6, 5, -9, 100};

        System.out.println("Первичный массив:");
        printMas(mas);

        for (int out = mas.length - 1; out >= 1; out--){
            for (int in = 0; in < out; in++){
                if(mas[in] > mas[in + 1]){
                    int dummy = mas[in];
                    mas[in] = mas[in+1];
                    mas[in+1] = dummy;
                }
            }
        }

        System.out.println("Массив сортировка по возростанию:");
        printMas(mas);
    }

    public static void printMas(int[] mas){
        for (int i = 0; i < mas.length; i++) {
            System.out.println(mas[i]);
        }
    }
}
