package com.mphasis.sorting;
public class BinarySearch {

    // Method to perform binary search
    public static int binarySearch(int[] arr, int target) {
        int low = 0;
        int high = arr.length - 1;

        while (low <= high) {
            int mid = low + (high - low) / 2;

            // Check if target is present at mid
            if (arr[mid] == target) {
                return mid;
            }

            // If target is greater, ignore the left half
            if (arr[mid] < target) {
                low = mid + 1;
            }
            // If target is smaller, ignore the right half
            else {
                high = mid - 1;
            }
        }

        // Target not found
        return -1;
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
        int target = 50;
        
        System.out.println("Array:");
        printArray(arr);

        int result = binarySearch(arr, target);
        if (result != -1) {
            System.out.println("Element " + target + " is present at index " + result + ".");
        } else {
            System.out.println("Element " + target + " is not present in the array.");
        }
    }
}
