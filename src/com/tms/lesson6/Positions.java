package com.tms.lesson6;

public enum Positions {

    DIRECTOR(3),
    WORKER(2);
    public int coefficient;

    Positions(int coefficient) {
        this.coefficient = coefficient;
    }
}

