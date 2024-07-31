package com.mphasis.coll.comparator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ComparatorExample {

	public static void main(String[] args) {
		
		Student s1= new Student("Ankit", 90);
		Student s2= new Student("Rohit", 80);
		Student s3= new Student("Jawed", 82);
		Student s4= new Student("Vikas", 86);
		
		
		List<Student> students = new ArrayList<Student>();
		
		students.add(s1);
		students.add(s2);
		students.add(s3);
		students.add(s4);
		
		System.out.println("original List "+ students);
		
		Collections.sort(students, new NameComparator());
		System.out.println("Sorted By Name "+ students);
		
		Collections.sort(students, new ScoreComparator());
		System.out.println("Sorted By Score "+ students);
		

	}

}
