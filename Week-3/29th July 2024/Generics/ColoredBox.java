package com.mphasis.generics2;
// Derived class that adds color functionality
class ColoredBox<T> extends Box<T> {
    private String color;

    // Method to set the color
    public void setColor(String color) {
        this.color = color;
    }

    // Method to get the color
    public String getColor() {
        return color;
    }
}
