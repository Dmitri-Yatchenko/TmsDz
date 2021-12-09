package com.tms.lesson11;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FileService {

    public static void main(String[] args) {

        try (BufferedReader br = new BufferedReader(new FileReader("file.txt"))) {
            String s = br.readLine();

            try (FileWriter fw1 = new FileWriter("text1.txt", true);
                 FileWriter fw2 = new FileWriter("text2.txt", true)) {

                boolean name1 = false;
                boolean name2 = false;
                while (s != null) {
                    if (s.contains("Имя1") || (name1 && !s.contains("Имя2"))) {
                        fw1.write(s + "\n");
                        name1 = true;
                        name2 = false;
                    } else if (s.contains("Имя2") || (name2 && !s.contains("Имя1"))) {
                        fw2.write(s + "\n");
                        name1 = false;
                        name2 = true;
                    }
                    s = br.readLine();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
