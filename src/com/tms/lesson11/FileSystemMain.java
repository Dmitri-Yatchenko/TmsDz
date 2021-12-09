package com.tms.lesson11;

import java.io.File;

public class FileSystemMain {
    public static void main(String[] args) {
        File file = new File("/Users/dmitri/Downloads");
        FileSystemService.printFileSystem(file);
    }
}
