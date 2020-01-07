import java.util.*;
/**
 * Defining methods → Reversing strings
 * Reversing strings
 * Implement a method for reversing a given array of strings. The array can have any size.
 * The method may reverse and return the existing array or returns a new array.
 *
 * Example: the sequence of strings "java", "programming", "methods" is reversed as "methods", "programming", "java".
 * Sample Input 1: java programming methods
 * Sample Output 1: methods programming java
 */
public class DefiningMethods13 {
    public static String[] reverse(String... words) {
        // write your code here
        List<String> listOfWords = Arrays.asList(words);
        Collections.reverse(listOfWords);
        return  listOfWords.toArray(words);
    }

    /* Do not change code below */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] words = scanner.nextLine().split("\\s+");
        String[] reversed = reverse(words);
        Arrays.stream(reversed).forEach(e -> System.out.print(e + " "));
    }
}
/*
public class Main {

    public static String[] reverse(String... words) {
        String temp;
        for (int i = 0; i < words.length / 2; i++) {
            temp = words[i];
            words[i] = words[words.length - 1 - i];
            words[words.length - 1 - i] = temp;
        }
        return words;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] words = scanner.nextLine().split("\\s+");
        String[] reversed = reverse(words);
        Arrays.stream(reversed).forEach(e -> System.out.print(e + " "));
    }
}
 */