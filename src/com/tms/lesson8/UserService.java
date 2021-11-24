package com.tms.lesson8;

public class UserService implements Service {
    @Override
    public void addElement(String[] arr, String element) {


        boolean addedElement = false;

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
    public void returnElement(String[] arr) {

        boolean recordReceived = false;

        for (int i = 4; i >= 0; i--) {
            if (arr[i] != null) {
                System.out.println(arr[i]);
                break;
            }
        }

        if (recordReceived == false) {
            throw new GettingAnEmptyEntryException();
        }

    }
}
