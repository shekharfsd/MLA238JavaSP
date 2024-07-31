package com.mphasis.io;
import java.io.FileInputStream;
import java.io.IOException;

public class FileInputStreamExample {
    public static void main(String[] args) {
        try (FileInputStream fis = new FileInputStream("e://output.txt")) {
            int content;
            while ((content = fis.read()) != -1) {
                System.out.print((char) content); // Print each byte as a character
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
