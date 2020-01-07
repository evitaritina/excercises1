import java.util.Arrays;
import java.util.Scanner;

/**
 * Processing strings → Alphabetical order
 * Write a program that reads a string and output "true" only when the letters of the String are in alphabetical order, otherwise, "false".
 *
 * Assume the empty string is in alphabetical order.
 *
 * Note, string can contain only a single character.
 * Sample Input 1:  abc
 * Sample Output 1: true
 */
public class ProcessingStrings11 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        boolean asc = false;

        // convert input string to char array
        char tempArray[] = input.toCharArray();
        Arrays.sort(tempArray);
        String res = String.valueOf(tempArray);
        if(input.equalsIgnoreCase(res)){
            asc = true;
        }
        System.out.println(asc);
    }
}
/*
 public static void main(String[] args) {
        boolean flag = true;
        char prev = 0;
 
        for (char c : new Scanner(System.in).next().toCharArray()) {
            if (prev != 0 && c - 1 != prev) {
                flag = false;
                break;
            }
            prev = c;
        }
 
        System.out.println(flag);
    }
 */