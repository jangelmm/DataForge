package test;

import com.jangelmm.dataforge.basics.ForgeQueue;

public class TestForgeQueue {
    public static void main(String[] args) {
        // Create a queue of integers
        ForgeQueue<Integer> queue = new ForgeQueue<>();

        // Enqueue elements
        System.out.println("Enqueueing elements:");
        queue.enqueue(10);
        queue.enqueue(20);
        queue.enqueue(30);

        // Peek front and rear elements
        System.out.println("Front element: " + queue.peekFront()); // Should print 10
        System.out.println("Rear element: " + queue.peekRear());  // Should print 30

        // Dequeue elements
        System.out.println("Dequeuing elements:");
        System.out.println(queue.dequeue()); // Should print 10
        System.out.println(queue.dequeue()); // Should print 20

        // Peek front and rear elements after dequeuing
        System.out.println("Front element: " + queue.peekFront()); // Should print 30
        System.out.println("Rear element: " + queue.peekRear());  // Should print 30

        // Dequeue the last element
        System.out.println(queue.dequeue()); // Should print 30

        // Check if the queue is empty
        System.out.println("Queue is empty: " + queue.isEmpty()); // Should print true
    }
}
