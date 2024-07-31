package com.mphasis.immutable;
public final class Person {
    private final String name;
    private final int age;

    // Constructor to initialize the fields
    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // Getter for name
    public String getName() {
        return name;
    }

    // Getter for age
    public int getAge() {
        return age;
    }
}
