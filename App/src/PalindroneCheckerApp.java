public class PalindroneCheckerApp {

    // Main method - Entry point
    public static void main(String[] args) {

        // Input string
        String input = "level";

        // Convert string to character array
        char[] charArray = input.toCharArray();

        // Two-pointer variables
        int start = 0;
        int end = charArray.length - 1;

        // Flag to track palindrome status
        boolean isPalindrome = true;

        // Compare characters using two-pointer technique
        while (start < end) {
            if (charArray[start] != charArray[end]) {
                isPalindrome = false;
                break;
            }
            start++;
            end--;
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