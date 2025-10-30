import java.util.*;

public class NonPalindrome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a word: ");
        String word = sc.nextLine();
        String reverse = "";
        for(int i = word.length() - 1; i >= 0; i--) {
            reverse += word.charAt(i);
        }
        String newWord = word + reverse;
        System.out.println(newWord);
    }
}