package com.tms.lesson5;

public class MultipleConstructors {
    private String s1;
    private String s2;

    MultipleConstructors(String s1){
        this(s1, "s2");
    }

    MultipleConstructors(String s1, String s2){
        this.s1 = s1;
        this.s2 = s2;
    }

    public String getS1() {
        return s1;
    }

    public String getS2() {
        return s2;
    }
}
