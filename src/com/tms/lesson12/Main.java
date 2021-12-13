package com.tms.lesson12;

import java.util.*;

public class Main {

    public static void main(String[] args) {

        List<Integer> list = new ArrayList<>();

        Runnable fillingTheCollection = new FillingTheCollection(list);
        Runnable withdrawalFromCollection = new WithdrawalFromCollection(list);

        Thread flow1 = new Thread(fillingTheCollection);
        Thread flow2 = new Thread(withdrawalFromCollection);

        flow1.start();
        flow2.start();
    }
}
