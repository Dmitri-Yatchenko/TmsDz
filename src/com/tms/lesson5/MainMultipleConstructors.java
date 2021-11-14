package com.tms.lesson5;

public class MainMultipleConstructors {
    public static void main(String[] args) {
        MultipleConstructors multipleConstructors = new MultipleConstructors("s1");
        System.out.println(multipleConstructors.getS1() + " " + multipleConstructors.getS2());
    }
}
