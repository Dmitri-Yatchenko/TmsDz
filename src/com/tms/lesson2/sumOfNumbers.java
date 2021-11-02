package com.tms.lesson2;

public class sumOfNumbers {
    public static void main(String[] args) {
        int i1 = 10;
        int i2 = 786;
        int summ = 0;
        for (int i3 = i1 + 1; i3 < i2; i3++){
            if (i3 % 3 == 0){
                summ = summ + i3;
            }
        }
        System.out.println("Сумма числе которые делятся на 3 и находятся между " + i1 + " и " + i2 + " = " + summ);
    }
}
