package com.tms.lesson12;

import java.util.List;

public class WithdrawalFromCollection implements Runnable {

    private List<Integer> list;

    public WithdrawalFromCollection(List<Integer> list) {
        this.list = list;
    }

    private void retrievingCollectionData() {

        while (true) {
            if (list.size() > 0) {
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                del();
                System.out.println("Текущий список: " + list.toString());
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            } else {
                try {
                    Thread.sleep(3000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
    }

    private synchronized void del(){
        int i = list.size() - 1;
        int element = list.get(i);
        list.remove(i);
        System.out.println("Изъят элемент: " + element);
    }

    @Override
    public void run() {
        retrievingCollectionData();
    }
}
