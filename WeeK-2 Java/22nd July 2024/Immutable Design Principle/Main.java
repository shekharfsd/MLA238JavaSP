package com.mphasis.immutable;
public class Main {
    public static void main(String[] args) {
        // Creating an immutable Person object
        Person person1 = new Person("Vijay", 30);
        Person person2 = new Person("Shweta", 25);

        // Accessing the fields using getter methods
        System.out.println("Person 1: " + person1.getName() + ", Age: " + person1.getAge());
        System.out.println("Person 2: " + person2.getName() + ", Age: " + person2.getAge());

        // Attempting to change the state would require creating a new object
        // since the existing objects are immutable
        Person person3 = new Person("Venkat", 31); // New object with updated age

        // Displaying the new object
        System.out.println("Updated Person 1: " + person3.getName() + ", Age: " + person3.getAge());
    }
}
