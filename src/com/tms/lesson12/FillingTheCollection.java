package com.tms.lesson12;

import java.util.List;

public class FillingTheCollection implements Runnable {

    private List<Integer> list;

    public FillingTheCollection(List<Integer> list) {
        this.list = list;
    }

    public void addObjects() {

        while (true) {
            if (list.size() > 9) {
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            } else {

                int i = (int) (Math.random() * 10);
                list.add(i);
                System.out.println("Вставлен элемент: " + i);
                System.out.println("Текущий список: " + list.toString());

                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
    }

    @Override
    public void run() {
        addObjects();
    }
}
