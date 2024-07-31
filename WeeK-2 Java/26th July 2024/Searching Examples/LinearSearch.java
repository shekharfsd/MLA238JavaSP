package com.mphasis.sorting;
public class LinearSearch {

    // Method to perform linear search
    public static int linearSearch(int[] arr, int target) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == target) {
                return i; // Target found, return the index
            }
        }
        return -1; // Target not found
    }

    // Method to print the array
    public static void printArray(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    // Main method to test the searching algorithm
    public static void main(String[] args) {
        int[] arr = {10, 20, 30, 40, 50, 60, 70};
        int target = 40;
        
        System.out.println("Array:");
        printArray(arr);

        int result = linearSearch(arr, target);
        if (result != -1) {
            System.out.println("Element " + target + " is present at index " + result + ".");
        } else {
            System.out.println("Element " + target + " is not present in the array.");
        }
    }
}
