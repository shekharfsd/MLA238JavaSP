package com.mphasis.io;

import java.io.FileOutputStream;
import java.io.IOException;

public class FileOutputStreamExample {
	public static void main(String[] args) {
		try (FileOutputStream fos = new FileOutputStream("e://output.txt")) {
			String content = "Hello, World!";
			fos.write(content.getBytes()); // Write bytes to the file
			System.out.println("Success");
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
