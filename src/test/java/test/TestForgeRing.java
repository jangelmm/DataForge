/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package test;

import com.jangelmm.dataforge.list.ForgeRing;

public class TestForgeRing {
    public static void main(String[] args) {
        ForgeRing<Integer> ring = new ForgeRing<>();

        // Insert elements at the end
        ring.insertAtEnd(10);
        ring.insertAtEnd(20);
        ring.insertAtEnd(30);
        System.out.println("After inserting 10, 20, 30 at the end:");
        ring.printData();  // Expected: 10, 20, 30

        // Insert element at the beginning
        ring.insertAtBeginning(5);
        System.out.println("\nAfter inserting 5 at the beginning:");
        ring.printData();  // Expected: 5, 10, 20, 30

        // Insert element at a specific position
        ring.insertAtPosition(25, 3);
        System.out.println("\nAfter inserting 25 at position 3:");
        ring.printData();  // Expected: 5, 10, 20, 25, 30

        // Insert before a specific element
        ring.insertBefore(15, 20);
        System.out.println("\nAfter inserting 15 before 20:");
        ring.printData();  // Expected: 5, 10, 15, 20, 25, 30

        // Insert after a specific element
        ring.insertAfter(35, 30);
        System.out.println("\nAfter inserting 35 after 30:");
        ring.printData();  // Expected: 5, 10, 15, 20, 25, 30, 35

        // Remove the first element
        System.out.println("\nRemoved first element: " + ring.removeFirst());
        ring.printData();  // Expected: 10, 15, 20, 25, 30, 35

        // Remove the last element
        System.out.println("\nRemoved last element: " + ring.removeLast());
        ring.printData();  // Expected: 10, 15, 20, 25, 30

        // Remove element at a specific position
        System.out.println("\nRemoved element at position 2: " + ring.removeAtPosition(2));
        ring.printData();  // Expected: 10, 15, 25, 30

        // Remove element before a specific element
        System.out.println("\nRemoved element before 25: " + ring.removeBefore(25));
        ring.printData();  // Expected: 15, 25, 30
    }
}
