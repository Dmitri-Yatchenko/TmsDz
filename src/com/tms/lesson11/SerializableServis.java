package com.tms.lesson11;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;

public class SerializableServis {

    public static void main(String[] args) {

        User user = new User("Dmitri", 30, Gender.MALE);

        try (ObjectOutputStream objectOutputStream = new ObjectOutputStream(new FileOutputStream("User.txt"))){
            objectOutputStream.writeObject(user);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
