import java.util.Scanner;

/**
 * Processing strings → Maximum sequence of the same characters
 * For a given string you need to find a length of the maximum sequence containing only same characters.
 * The input string could be empty.
 *
 * Sample Input 1: abcccdd
 * Sample Output 1: 3
 * Sample Input 2: abbbbccd
 * Sample Output 2: 4
 */

public class ProcessingStrings22 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        int counter = 1;
        int max = 1;
        if (input.length() == 0) { max = 0;}
        char[] array = new char[input.length()];
        for (int i = 0; i <input.length(); i++) {
            array[i] = input.charAt(i);
        }
        for(int i = 1; i < array.length; i++){
            if(array[i] == array[i-1]){
                counter = counter + 1;
                if(max < counter){ max = counter;}
            } else {counter = 1;}
        }
        System.out.print(max);
    }
}
/*
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        final Scanner scanner = new Scanner(System.in);

        final String s = scanner.nextLine();
        int maxCount = 0;
        int count = 0;
        char ch = s.length() != 0 ? s.charAt(0) : '\0';

        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == ch) {
                count += 1;
            } else {
                maxCount = Math.max(maxCount, count);
                ch = s.charAt(i);
                count = 1;
            }
        }

        System.out.println(Math.max(maxCount, count));
    }
}
 */