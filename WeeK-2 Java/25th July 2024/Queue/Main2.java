package com.mphasis.queues;
public class Main2 {
    public static void main(String[] args) {
        // Create a queue of capacity 5
        Queue2 q = new Queue2(5);

        // Test enqueue and dequeue operations
        q.enqueue(1);
        q.enqueue(2);
        q.enqueue(3);
        q.enqueue(4);

        System.out.println("Front element is: " + q.peek());
        q.dequeue();

        q.enqueue(5);

        System.out.println("Queue size is " + q.size());

        q.dequeue();
        q.dequeue();
        q.dequeue();
        q.dequeue();

        if (q.isEmpty()) {
            System.out.println("Queue is empty");
        } else {
            System.out.println("Queue is not empty");
        }

        // Test O(N) enqueue operation
        q.enqueueON(6);
        q.enqueueON(7);
        q.enqueueON(8);
        q.enqueueON(9);

        System.out.println("Front element after O(N) enqueues is: " + q.peek());
        System.out.println("Queue size after O(N) enqueues is " + q.size());
    }
}
