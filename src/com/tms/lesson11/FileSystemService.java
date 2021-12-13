package com.tms.lesson11;

import java.io.File;

public class FileSystemService {

    public static void printFileSystem(File file) {
        File[] files = file.listFiles();
        for (File f : files) {
            if (f.isDirectory()) {
                System.out.println(f.getName());
                printFileSystem(f);
            } else if (f.isFile()) {
                System.out.println(f.getName());
            }
        }
    }
}
