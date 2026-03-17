import java.util.Stack;
import java.util.Queue;
import java.util.LinkedList;

public class PalindroneCheckerApp {

    // Main method - Entry point
    public static void main(String[] args) {

        // Input string
        String input = "radar";

        // Create Stack and Queue
        Stack<Character> stack = new Stack<>();
        Queue<Character> queue = new LinkedList<>();

        // Insert characters into both Stack and Queue
        for (int i = 0; i < input.length(); i++) {
            char ch = input.charAt(i);
            stack.push(ch);      // LIFO
            queue.add(ch);       // FIFO
        }

        // Flag to track palindrome
        boolean isPalindrome = true;

        // Compare elements using pop (stack) and dequeue (queue)
        while (!stack.isEmpty() && !queue.isEmpty()) {
            if (stack.pop() != queue.remove()) {
                isPalindrome = false;
                break;
            }
        }

        // Display result
        System.out.println("Input String : " + input);

        if (isPalindrome) {
            System.out.println("Result: It is a Palindrome.");
        } else {
            System.out.println("Result: It is NOT a Palindrome.");
        }

        // End message
        System.out.println("Program completed.");
    }
}