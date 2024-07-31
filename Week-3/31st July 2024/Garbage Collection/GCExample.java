package com.mphasis.garbages;
public class GCExample {
    public static void main(String[] args) {
        // Create an object and print its reference
        MyClass obj = new MyClass("Object 1");
        System.out.println("Created: " + obj);

        // Make the object eligible for GC
        obj = null;
        
        // Suggest the JVM run garbage collection
        System.gc();
        
        // Wait for some time to allow GC to complete
        try {
            Thread.sleep(1*60*100);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        // Create another object
        MyClass obj2 = new MyClass("Object 2");
        System.out.println("Created: " + obj2);
        
        obj2= null;
        System.gc();
        
        
    }
}


