package test;

import com.jangelmm.dataforge.list.ForgeSequence;

public class TestForgeSort {
    public static void main(String[] args) {
        // Create an instance of ForgeSequence with Integer type
        ForgeSequence<Integer> sequence = new ForgeSequence<>();

        // Insert elements into the sequence
        sequence.insert(5);
        sequence.insert(2);
        sequence.insert(9);
        sequence.insert(1);
        sequence.insert(7);

        // Print the sequence in ascending order
        System.out.println("Sequence in ascending order:");
        sequence.printAscending();

        // Print the sequence in descending order
        System.out.println("\nSequence in descending order:");
        sequence.printDescending();

        // Search for an element in the sequence
        int searchElement = 9;
        System.out.println("\nIs " + searchElement + " in the sequence? " + sequence.contains(searchElement));

        // Remove the first element and print the sequence
        System.out.println("\nRemoving the first element: " + sequence.removeFirst());
        System.out.println("Sequence after removing the first element:");
        sequence.printAscending();

        // Remove the last element and print the sequence
        System.out.println("\nRemoving the last element: " + sequence.removeLast());
        System.out.println("Sequence after removing the last element:");
        sequence.printAscending();

        // Remove an element at a specific position and print the sequence
        int position = 1;
        System.out.println("\nRemoving the element at position " + position + ": " + sequence.removeAt(position));
        System.out.println("Sequence after removing the element at position " + position + ":");
        sequence.printAscending();
    }
}
