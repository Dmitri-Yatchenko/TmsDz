package com.tms.lesson11;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class SerializableServis {

    public static void main(String[] args) {

        User user = new User("Dmitri", 30, Gender.MALE);

        ObjectOutputStream objectOutputStream = null;
        try {
            FileOutputStream outputStream = new FileOutputStream("User.txt");
            objectOutputStream = new ObjectOutputStream(outputStream);
            objectOutputStream.writeObject(user);
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            try {
                objectOutputStream.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
