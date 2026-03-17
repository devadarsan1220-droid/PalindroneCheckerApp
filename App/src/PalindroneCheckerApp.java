import java.util.Stack;

public class PalindroneCheckerApp {

    // Main method - Entry point
    public static void main(String[] args) {

        // Input string
        String input = "madam";

        // Create a stack to store characters
        Stack<Character> stack = new Stack<>();

        // Push all characters into the stack
        for (int i = 0; i < input.length(); i++) {
            stack.push(input.charAt(i));
        }

        // Build reversed string using pop operation
        String reversed = "";
        while (!stack.isEmpty()) {
            reversed = reversed + stack.pop();
        }

        // Display original and reversed strings
        System.out.println("Original String : " + input);
        System.out.println("Reversed String : " + reversed);

        // Check palindrome
        if (input.equals(reversed)) {
            System.out.println("Result: It is a Palindrome.");
        } else {
            System.out.println("Result: It is NOT a Palindrome.");
        }

        // End message
        System.out.println("Program completed.");
    }
}