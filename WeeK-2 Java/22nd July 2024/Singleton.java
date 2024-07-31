package com.mphasis.dp.singleton;

public class Singleton {
    // Step 1: Create a private static instance of the class
    private static volatile Singleton instance;

    // Step 2: Make the constructor private so that this class cannot be
    // instantiated from outside this class
    private Singleton() {
        // Initialize any resources if needed
    }

    // Step 3: Provide a public static method to get the instance of the class
    public static Singleton getInstance() {
        if (instance == null) {
            synchronized (Singleton.class) {
                if (instance == null) {
                    // Create a new instance if it doesn't exist
                    instance = new Singleton();
                }
            }
        }
        return instance;
    }

    // Example method
    public void showMessage() {
        System.out.println("Hello, I am a Singleton!");
    }

    public static void main(String[] args) {
        // Get the only object available
        Singleton singleton = Singleton.getInstance();

        // Show the message
        singleton.showMessage();
    }
}
