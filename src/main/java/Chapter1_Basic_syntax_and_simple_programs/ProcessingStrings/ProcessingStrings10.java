import java.util.Scanner;

/**
 * Processing strings → Count the number of times "ab" occur in a string
 * Write a program that reads a string from the standard input and outputs the number of times that "ab" occurs in the string.
 *
 * Note, check how you program works, when the string ends with "ab".
 */
public class ProcessingStrings10 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        int counter = 0;
        char[] chars = input.toCharArray();
        for(int i = 0; i < input.length()-1; i++){

            if(chars[i] == 'a' && chars[i+1] == 'b'){
                counter = counter + 1;
            }
        }
        System.out.println(counter);
    }
}
/*
 public static void main(String[] args) {
        final Scanner scanner = new Scanner(System.in);

        final String s = scanner.next();
        int count = 0;

        for (int i = 0; i < s.length() - 1; i++) {
            if (s.charAt(i) == 'a' && s.charAt(i + 1) == 'b') {
                count += 1;
                i += 1;
            }
        }

        System.out.println(count);
 */