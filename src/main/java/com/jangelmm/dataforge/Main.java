package com.jangelmm.dataforge;

/**
 *
 * @author jangel
 */
// In the Main class
public class Main {
    public static void main(String[] args) {
        ForgeQueue<Integer> queue = new ForgeQueue<>();
        
        queue.enqueue(10);
        queue.enqueue(20);
        queue.enqueue(30);
        
        System.out.println(queue.peekFront());
        System.out.println(queue.peekRear());
        
        System.out.println(queue.dequeue());
        System.out.println(queue.dequeue());
        System.out.println(queue.dequeue());
    }
}
