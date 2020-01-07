
import java.util.Scanner;

/**
 * Processing strings → The longest word
 * In the given string find the first longest word and output it.
 *
 * Input data
 * Given a string in a single line. Words in the string are separated by a single space.
 *
 * Output data
 * Output the longest word. If there are several such words, you should output the one, which occurs earlier.
 *
 * Sample Input 1:
 * one two three four five six
 * Sample Output 1:
 * three
 */
public class ProcessingStrings8 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        String string = scanner.nextLine();
        String[] array = string.split(" ");
        int counter = 0;
        for(String el : array){
            if(el.length()> counter){
                counter = Integer.parseInt(String.valueOf(el.length()));
            }
        }

        for(String el1: array){
            if(Integer.parseInt(String.valueOf(el1.length())) == counter){
                System.out.println(el1);
                break;
            }
        }

    }
}
/*
  public static void main(String[] args) {
        String[] str = new Scanner(System.in).nextLine().split(" ");
        int elem = 0;

        for (int i = 1; i < str.length; ++i) {
            if (str[i].length() > str[elem].length()) {
                elem = i;
            }
        }

        System.out.println(str[elem]);
    }
 */