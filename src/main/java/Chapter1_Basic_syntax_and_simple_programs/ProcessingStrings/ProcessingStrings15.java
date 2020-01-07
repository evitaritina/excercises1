import java.util.Scanner;

/**
 * Processing strings → Count the number of times two chars occur in a string
 * Write a program that counts the number of times that the two characters occur consecutively in a string.
 * The order of characters should be the same as in the input.
 *
 * Note, in the string "bbb" , the sequence "bb" occurs two times.
 * Input data format - The single input line contains a string and two characters.
 * Sample Input 1:
 * abcd b c
 * Sample Output 1:
 * 1
 *
 * Sample Input 2:
 * cbbb b b
 * Sample Output 2:
 * 2
 */
public class ProcessingStrings15 {
    public static void main(String[] args){
        int counter = 0;
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        String[] array = input.toString().split(" ");
        String text = array[0];
        String first = array[1].substring(0, 1) + array[2].substring(0, 1);
        if(text.contains(first)){
            int index = text.indexOf(first);
            while(index!=-1){
                counter = counter +1;
                text = text.substring(index+1);
                index = text.indexOf(first);
            }
        }

        System.out.println(counter);
    }
}
/*
 public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] lines = scanner.nextLine().split("\\s+");
        char[] chars = lines[0].toCharArray();
        int n = 0;

        for (int i = 0; i < chars.length; i++) {
            if (i + 1 == chars.length) {
                break;
            }
            if (chars[i] == lines[1].toCharArray()[0] && chars[i + 1] == lines[2].toCharArray()[0]) {
                n++;

            }
        }

        System.out.println(n);
    }
 */