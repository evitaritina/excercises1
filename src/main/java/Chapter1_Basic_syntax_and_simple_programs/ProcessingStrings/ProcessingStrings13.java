import java.util.Scanner;

/**
 *Processing strings → Count the number of occurrences
 * Write a program that counts the number of occurrences of a given character in a string.
 *
 * Input data format
 * The single input line contains a string and a character separated by a space.
 * Sample Input 1: abcda a
 * Sample Output 1:  2
 */
public class ProcessingStrings13 {
    public  static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        String[] strar = input.split(" ");

        char[] ch = strar[1].toCharArray();
        char ch1 = ch[0];
        char[] array = strar[0].toCharArray();
        int counter = 0;
        for(char el: array){
            if(el == ch1){
                counter = counter +1;
            }
        }
        System.out.println(counter);
    }
}
/*
public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] text = scanner.nextLine().split("\\s+");
        int index = 0;

        for (int i = 0; i < text[0].length(); ++i) {
            if (text[0].charAt(i) == text[1].charAt(0)) {
                ++index;
            }
        }

        System.out.println(index);
    }
 */