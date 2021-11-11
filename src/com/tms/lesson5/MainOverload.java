package com.tms.lesson5;

public class MainOverload {
    public static void main(String[] args) {

        Overload overload = new Overload();
        System.out.println(overload.addition(1));
        System.out.println(overload.addition(1, 2));
        System.out.println(overload.addition(1, 2, 3));
    }
}
