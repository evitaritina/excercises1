import java.util.Scanner;
/**
 * Defining methods → Vowel or not
 * Implement a method for checking the given english letter is a vowel or not. The input may be in any case.
 *
 * Do not consider the letter 'y' as a vowel.
 * Examples
 * 1) isVowel('a') should be true
 * 2) isVowel('A') should be true
 * 3) isVowel('b') should be false
 */

public class DefiningMethods4 {
    public static boolean isVowel(char ch) {
        // write your code here

        char[] vowel = {'a', 'A', 'e', 'E', 'i', 'I', 'o', 'O', 'u', 'U'};
        for (char el : vowel) {
            if ( el == ch) {
                return true;
            }
        }

        return false;
    }

    /* Do not change code below */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        char letter = scanner.nextLine().charAt(0);
        System.out.println(isVowel(letter) ? "YES" : "NO");
    }
}
/*
public class Main {

    public static boolean isVowel(char ch) {
        char[] vowel = {'a', 'e', 'i', 'o', 'u'};
        ch = Character.toLowerCase(ch);

        for (int i = 0; i < vowel.length; i++) {
            if (ch == vowel[i]) {
                return true;
            }
        }

        return false;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        char letter = scanner.nextLine().charAt(0);
        System.out.println(isVowel(letter) ? "YES" : "NO");
    }
}
 */