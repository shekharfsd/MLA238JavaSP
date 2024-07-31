package com.mphasis.stack;

class LinkedListStack {
	
    private Node top;

    public LinkedListStack() {
        this.top = null;
    }

    // Push method to add an element to the stack
    public void push(int data) {
        Node newNode = new Node(data);
        newNode.next = top;
        top = newNode;
    }

    // Pop method to remove the top element from the stack
    public int pop() {
        if (isEmpty()) {
            System.out.println("Stack Underflow");
            return -1;
        }
        int poppedData = top.data;
        top = top.next;
        return poppedData;
    }

    // Peek method to see the top element without removing it
    public int peek() {
        if (isEmpty()) {
            System.out.println("Stack is empty");
            return -1;
        }
        return top.data;
    }

    // Method to check if the stack is empty
    public boolean isEmpty() {
        return top == null;
    }

    // Method to print the elements of the stack
    public void printStack() {
        if (isEmpty()) {
            System.out.println("Stack is empty");
            return;
        }
        Node current = top;
        while (current != null) {
            System.out.print(current.data + " ");
            current = current.next;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        LinkedListStack stack = new LinkedListStack();

        // Pushing elements onto the stack
        stack.push(10);
        stack.push(20);
        stack.push(30);
        stack.push(40);
        stack.push(50);

        // Printing the stack elements
        System.out.print("Stack: ");
        stack.printStack();

        // Popping an element from the stack
        System.out.println("Popped Element: " + stack.pop());

        // Peeking at the top element
        System.out.println("Top Element: " + stack.peek());

        // Checking if the stack is empty
        System.out.println("Is Stack Empty? " + stack.isEmpty());

        // Printing the stack elements after pop
        System.out.print("Stack after pop: ");
        stack.printStack();
    }
}
