package com.tms.lesson8;

public class UserService implements Service {
    @Override
    public void addElement(Database db, String element) {


        boolean addedElement = false;
        String[] arr = db.arr;
        for (int i = 0; i < 5; i++) {
            if (arr[i] == null) {
                arr[i] = element;
                addedElement = true;
                break;
            }
        }

        if (addedElement == false) {
            throw new ArrayOverflowException();
        }

    }

    @Override
    public void returnElement(Database db) {

        boolean recordReceived = false;
        String[] arr = db.arr;
        for (int i = 4; i >= 0; i--) {
            if (arr[i] != null) {
                System.out.println(arr[i]);
                recordReceived = true;
                arr[i] = null;
                break;
            }
        }

        if (recordReceived == false) {
            throw new GettingAnEmptyEntryException();
        }

    }
}
