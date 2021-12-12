package com.tms.lesson12;

import java.util.List;

public class FillingTheCollection implements Runnable {

    private List<Integer> list;

    public FillingTheCollection(List<Integer> list) {
        this.list = list;
    }

    private void addObjects() {

        while (true) {
            if (list.size() > 10) {
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            } else {
                add();
                System.out.println("Текущий список: " + list.toString());
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
    }

    private synchronized void add(){
        int i = (int) (Math.random() * 10);
        list.add(i);
        System.out.println("Вставлен элемент: " + i);
    }

    @Override
    public void run() {
        addObjects();
    }
}
