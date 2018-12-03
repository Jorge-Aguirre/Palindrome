import java.util.Scanner;
import java.util.ArrayDeque;

public class Palindrome {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Type a sentence: ");
        String sentence = sc.nextLine();

        System.out.println("The sentence: " + sentence + (isPalindrome(sentence) ? " is palindrome" : " is not palindrome"));
    }

    public static boolean isPalindrome(String sentence) {
        boolean isPalindrome;

        if (isPalindrome = !sentence.isEmpty()) {
            String internal = sentence.replaceAll("\\s", "").toLowerCase();
            ArrayDeque<Character> deque = new ArrayDeque<>();

            for (char c : internal.toCharArray()) {
                deque.push(c);
            }

            Character b, c;

            do {
                b = deque.pollFirst();
                c = deque.peekLast() != null ? deque.pollLast() : b;
            } while (b != null && (isPalindrome = b == c));
        }

        return isPalindrome;
    }
}
