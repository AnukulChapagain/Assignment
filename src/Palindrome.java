import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter your word: ");
        String Word = sc.nextLine();
        Word = Word.toLowerCase();

        Word = Word.replace("\\s", "");

        int length = Word.length();
        boolean isOddPalindrome = true;

        for (int i = 0; i < length / 2; i++) {
            if (Word.charAt(i) != Word.charAt(length - 1 - i)) {
                isOddPalindrome = false;
                break;
            }
        }

        // Display the result
        if (isOddPalindrome) {
            System.out.println("The string is an odd palindrome.");
        } else {
            System.out.println("The string is not an odd palindrome.");
        }
    }
}
