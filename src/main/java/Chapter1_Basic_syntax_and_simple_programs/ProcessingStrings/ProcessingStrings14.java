import java.util.Scanner;

/**
 * Processing strings → Number of occurrences
 * Write a program that finds the frequency of occurrences of substring in given string.
 * <p>
 * Input data format
 * The first input line contains a string, the second one contains a substring.
 * <p>
 * Sample Input 1: hello there
 * the
 * Sample Output 1:  1
 * Sample Input 2: hello yellow jello
 * ll
 * Sample Output 2:  3
 */
public class ProcessingStrings14 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        String substr = scanner.nextLine();
        int counter = 0;
        int index = input.indexOf(substr);

        while (index != -1) {
            counter++;
            input = input.substring(index + 1);
            index = input.indexOf(substr);


        }
        System.out.println(counter);
    }
}
/*
public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String str = scanner.nextLine();
        String str1 = scanner.nextLine();
        int count = 0;

        for (int i = 0; i < str.length(); i++) {
            if (str.indexOf(str1, i) >= 0) {
                count++;
                i = i + str.indexOf(str1, i);
            }
        }

        System.out.println(count);
    }
 */