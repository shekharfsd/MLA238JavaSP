package com.mphasis.generics2;
// Generic base class
class Box<T> {
    private T item;

    // Method to set the item
    public void setItem(T item) {
        this.item = item;
    }

    // Method to get the item
    public T getItem() {
        return item;
    }
}
