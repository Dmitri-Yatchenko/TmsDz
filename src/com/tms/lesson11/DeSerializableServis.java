package com.tms.lesson11;

import java.io.FileInputStream;
import java.io.ObjectInputStream;

public class DeSerializableServis {
    public static void main(String[] args) {

        try {
            FileInputStream fileInputStream = new FileInputStream("User.txt");
            ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);
            Object o = objectInputStream.readObject();
            if (o instanceof User) {
                User user = (User) o;
                System.out.println(user);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
