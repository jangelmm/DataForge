package test;

import com.jangelmm.dataforge.basics.ForgeStack;

public class TestForgeStack {
    public static void main(String[] args) {
        // Create a stack of integers
        ForgeStack<Integer> stack = new ForgeStack<>();

        // Push elements onto the stack
        System.out.println("Pushing elements onto the stack:");
        stack.push(10);
        stack.push(20);
        stack.push(30);

        // Peek the top element
        System.out.println("Top element: " + stack.peek()); // Should print 30

        // Traverse and print stack elements
        System.out.println("Stack elements:");
        stack.traverseStack(); // Should print 30, 20, 10

        // Pop elements from the stack
        System.out.println("Popping elements from the stack:");
        System.out.println(stack.pop()); // Should print 30
        System.out.println(stack.pop()); // Should print 20

        // Peek the top element after popping
        System.out.println("Top element: " + stack.peek()); // Should print 10

        // Pop the last element
        System.out.println(stack.pop()); // Should print 10

        // Check if the stack is empty
        System.out.println("Stack is empty: " + stack.isEmpty()); // Should print true
    }
}
