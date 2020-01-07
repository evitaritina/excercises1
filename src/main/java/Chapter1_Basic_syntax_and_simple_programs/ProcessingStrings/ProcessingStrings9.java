import java.util.Scanner;

/**
 * Processing strings → Palindrome
 * Write a program that reads a string and checks whether it is a palindrome, i.e. it reads the same both left-to-right and right-to-left.
 * The program must output “yes” if the string is a palindrome and “no” otherwise.
 */
public class ProcessingStrings9 {
    public static void main(String[] args){
        String polindrome = "no";
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        int size = input.length();
        String substr1 = "";
        String substr2 = "";

        if(size % 2 == 0 ){
            substr1 = input.substring(0, size/2);
            substr2 = input.substring(size/2, size);
            StringBuilder sb = new StringBuilder(substr2);
            substr2 = sb.reverse().toString();
            polindrome = substr1.equalsIgnoreCase(substr2) ? "yes" : "no";

        } else{
            substr1 = input.substring(0, size/2);
            substr2 = input.substring(size/2 + 1, size);
            StringBuilder sb = new StringBuilder(substr2);
            substr2 = sb.reverse().toString();
            polindrome = substr1.equalsIgnoreCase(substr2) ? "yes" : "no";
        }
        System.out.println(polindrome);
    }
}
/*
public static void main(String[] args) {
        char[] chars = new Scanner(System.in).nextLine().toCharArray();

        for (int i = 0; i < chars.length / 2; i++) {
            if (chars[i] != chars[chars.length - 1 - i]) {
                System.out.println("no");
                return;
            }
        }

        System.out.println("yes");
    }
 */