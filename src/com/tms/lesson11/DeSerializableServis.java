package com.tms.lesson11;

import java.io.FileInputStream;
import java.io.ObjectInputStream;

public class DeSerializableServis {

    public static void main(String[] args) {

        try (ObjectInputStream objectInputStream = new ObjectInputStream(new FileInputStream("User.txt"))){
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
