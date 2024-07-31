package com.mphasis.queues;
public class Queue2 {
    private int[] arr; // Array to store queue elements
    private int front; // Front points to the front element in the queue
    private int rear;  // Rear points to the last element in the queue
    private int capacity; // Maximum capacity of the queue
    private int count;  // Current size of the queue

    // Constructor to initialize the queue
    public Queue2(int size) {
        arr = new int[size];
        capacity = size;
        front = 0;
        rear = -1;
        count = 0;
    }

    // Utility function to dequeue the front element
    public void dequeue() {
        // Check for queue underflow
        if (isEmpty()) {
            System.out.println("Underflow\nProgram Terminated");
            System.exit(-1);
        }

        System.out.println("Removing " + arr[front]);

        front = (front + 1) % capacity;
        count--;
    }

    // Utility function to add an item to the queue (O(1) time complexity)
    public void enqueue(int item) {
        // Check for queue overflow
        if (isFull()) {
            System.out.println("Overflow\nProgram Terminated");
            System.exit(-1);
        }

        System.out.println("Inserting " + item);

        rear = (rear + 1) % capacity;
        arr[rear] = item;
        count++;
    }

    // Utility function to add an item to the queue (O(N) time complexity)
    public void enqueueON(int item) {
        // Check for queue overflow
        if (isFull()) {
            System.out.println("Overflow\nProgram Terminated");
            System.exit(-1);
        }

        System.out.println("Inserting " + item + " in O(N) time");

        // Shift elements to the right
        for (int i = count; i > front; i--) {
            arr[i] = arr[i - 1];
        }

        arr[front] = item;
        rear = (rear + 1) % capacity;
        count++;
    }

    // Utility function to return the front element of the queue
    public int peek() {
        if (isEmpty()) {
            System.out.println("Underflow\nProgram Terminated");
            System.exit(-1);
        }
        return arr[front];
    }

    // Utility function to return the size of the queue
    public int size() {
        return count;
    }

    // Utility function to check if the queue is empty or not
    public boolean isEmpty() {
        return (size() == 0);
    }

    // Utility function to check if the queue is full or not
    public boolean isFull() {
        return (size() == capacity);
    }
}
