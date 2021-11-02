package com.tms.lesson1;

public class division {

    public static void main(String[] args) {
        int i1 = 25;
        int i2 = 22;

        System.out.println(i1 + " / " + i2);

        int i3 = i1 % i2;
        if (i3 > 0) {
            System.out.println("Целая часть: " + (i1 / i2));
            System.out.println("Остаток от деления: " + i3);
        }

        int l = 9999;
        System.out.println("Число " + l + " состоит из:");
        int l1 = l / 1000;
        System.out.println(l1 + " тысяч;");
        int l2 = l % 1000;
        int l3 = l2 / 100;
        System.out.println(l3 + " сотен;");
        int l4 = l2 % 100;
        int l5 = l4 / 10;
        System.out.println(l5 + " десятков;");
        int l6 = l4 % 10;
        System.out.println(l6 + " единиц;");
    }


}
