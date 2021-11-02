package com.tms.lesson2;

public class arrayChisin {
    public static void main(String[] args) {
        int[] mas = new int[]{1, 3, 6, 5, -9, 100};
        
        int min = 0;
        int max = 0;
        boolean b = true;

        for (int number: mas) {
            if (max < number){
                max = number;
            }
        }
        System.out.println("Максимальное число: " + max);

        for (int number: mas) {

            if (b){
                min = number;
                b = false;
            }

            if (min > number){
                min = number;
            }
        }
        System.out.println("Минимальное число: " + min);


    }
}
