package com.mphasis.io;

import java.io.BufferedOutputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

public class FileBufferOutput {

	public static void main(String[] args) throws IOException {
		
		FileOutputStream fos= new FileOutputStream("e://welcome2.txt",true);
		BufferedOutputStream bos= new BufferedOutputStream(fos);
		Scanner s1= new Scanner(System.in);
		
		System.out.println("Enter Employee ID ");
		int empId= s1.nextInt();
		
		System.out.println("Enter Employee Name ");
		String empName= s1.next();
		
		String s2="Welcome "+ " "+ empName + " "+ "Your Emp Id is "+empId;
		
		bos.write(s2.getBytes());
		
		System.out.println("Data written in file");
		
		bos.close();

	}

}
