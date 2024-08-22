package test;

import com.jangelmm.dataforge.list.ForgeChain;

/**
 * Test class for the ForgeChain class.
 * 
 * @author jangel
 */
public class TestForgeChain {
    public static void main(String[] args) {
        // Create a new ForgeChain list
        ForgeChain<Integer> chain = new ForgeChain<>();

        // Add elements to the list
        chain.addFirst(10);
        chain.addLast(20);
        chain.addLast(30);
        chain.addFirst(5);
        chain.addSortedUnique(15);  // Added in the correct position
        chain.addSortedUnique(25);  // Added in the correct position

        // Attempt to add a duplicate
        boolean addedDuplicate = chain.addSortedUnique(20);
        System.out.println("Was the duplicate (20) added? " + addedDuplicate);

        // Print the list
        System.out.println("Current list:");
        chain.traverse();

        // Remove elements
        System.out.println("\nRemoving the first element: " + chain.removeFirst());
        System.out.println("Removing the last element: " + chain.removeLast());
        System.out.println("Removing after 10: " + chain.removeAfter(10));

        // Print the list after removals
        System.out.println("\nList after removals:");
        chain.traverse();

        // Reverse the list
        chain.reverse();
        System.out.println("\nList after reversing:");
        chain.traverse();

        // Search for an element in the list
        int searchElement = 15;
        boolean containsElement = chain.contains(searchElement);
        System.out.println("\nDoes the list contain " + searchElement + "? " + containsElement);

        // Get the position of an element
        int position = chain.indexOf(15);
        System.out.println("\nPosition of 15 in the list: " + position);

        // Remove a specific element
        System.out.println("\nRemoving element 15: " + chain.remove(15));

        // Print the final list
        System.out.println("\nFinal list:");
        chain.traverse();

        // Clear the list
        chain.clear();
        System.out.println("\nIs the list empty after clearing? " + chain.isEmpty());
    }
}
