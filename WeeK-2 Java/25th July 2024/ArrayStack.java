package com.mphasis.stack;
public class ArrayStack {
    private int[] stack;
    private int top;
    private int capacity;

    // Constructor to initialize stack
    public ArrayStack(int size) {
        stack = new int[size];
        capacity = size;
        top = -1;
    }

    // Push method to add element to the stack
    public void push(int element) {
        if (isFull()) {
            System.out.println("Stack Overflow");
            return;
        }
        stack[++top] = element;
    }

    // Pop method to remove element from the stack
    public int pop() {
        if (isEmpty()) {
            System.out.println("Stack Underflow");
            return -1;
        }
        return stack[top--];
    }

    // Peek method to see the top element without removing it
    public int peek() {
        if (isEmpty()) {
            System.out.println("Stack is empty");
            return -1;
        }
        return stack[top];
    }

    // Method to check if the stack is empty
    public boolean isEmpty() {
        return top == -1;
    }

    // Method to check if the stack is full
    public boolean isFull() {
        return top == capacity - 1;
    }

    // Method to get the size of the stack
    public int size() {
        return top + 1;
    }

    // Method to print the elements of the stack
    public void printStack() {
        if (isEmpty()) {
            System.out.println("Stack is empty");
            return;
        }
        for (int i = 0; i <= top; i++) {
            System.out.print(stack[i] + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        ArrayStack stack = new ArrayStack(5);

        stack.push(10);
        stack.push(20);
        stack.push(30);
        stack.push(40);
        stack.push(50);

        // Attempt to push when stack is full
        stack.push(60); // This will show "Stack Overflow"

        // Print stack elements
        System.out.print("Stack: ");
        stack.printStack();

        // Pop elements from stack
        System.out.println("Popped Element: " + stack.pop());

        // Peek at the top element
        System.out.println("Top Element: " + stack.peek());

        // Check if stack is empty
        System.out.println("Is Stack Empty? " + stack.isEmpty());

        // Check if stack is full
        System.out.println("Is Stack Full? " + stack.isFull());

        // Get the size of the stack
        System.out.println("Stack Size: " + stack.size());
    }
}
