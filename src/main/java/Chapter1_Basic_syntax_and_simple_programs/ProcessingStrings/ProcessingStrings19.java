import java.util.Scanner;

/**
 * Processing strings → Double characters
 * Write a program that reads a string and then output another string with doubled characters.
 *
 * Sample Input 1: The
 * Sample Output 1: TThhee
 */
public class ProcessingStrings19 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        char[] array = input.toCharArray();
        for(char el : array){
            System.out.print(el+""+el);
        }

    }
}
/*
public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();

        for (int i = 0; i < str.length(); i++) {
            System.out.print(str.substring(i, i + 1) + str.substring(i, i + 1));
        }
    }
 */