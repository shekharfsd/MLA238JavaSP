package com.mphasis.generics2;
public class Main {
    public static void main(String[] args) {
        // Create a ColoredBox for Integer items
        ColoredBox<Integer> intBox = new ColoredBox<>();
        intBox.setItem(42);           // Set the item
        intBox.setColor("Blue");      // Set the color

        // Retrieve and print the item and color
        System.out.println("Item in intBox: " + intBox.getItem());
        System.out.println("Color of intBox: " + intBox.getColor());

        // Create a ColoredBox for String items
        ColoredBox<String> strBox = new ColoredBox<>();
        strBox.setItem("Generics");   // Set the item
        strBox.setColor("Green");     // Set the color

        // Retrieve and print the item and color
        System.out.println("Item in strBox: " + strBox.getItem());
        System.out.println("Color of strBox: " + strBox.getColor());
    }
}
