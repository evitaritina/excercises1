import java.util.Scanner;

/**
 * Processing strings → Find the first occurrence of the word "the"
 * Write a program that takes a sentence as input and returns the index of the first occurrence of the word "the",
 * regardless of the capitalization. If there is no occurrence of it must output -1.
 *
 * For instance, if the sentence is “The apple is red.” the output should be 0, if the sentence is “I ate the red apple.”
 * the output should be 6, and if the sentence is “I love apples.” the output should be -1.
 *
 * Note, the and The are equal.
 * Sample Input 1: The apple is red.
 * Sample Output 1:  0
 * Sample Input 2: I ate the red apple.
 * Sample Output 2: 6
 */
public class ProcessingStrings12 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        int res = -1;
        int res1 = -1;
        int res2 = -1;
        if(input.contains("The") ) {
            res1 = input.indexOf("The");
        }
        if(input.contains("the") ) {
            res2 = input.indexOf("the");
        }

        if(res1 >= 0 && res2 >=0){
            res = res1 > res2 ? res2 : res1;
        } else if(res1 >= 0 && res2 < 0){
            res = res1;
        } else if(res1<0 && res2 >= 0){
            res = res2;
        }

        System.out.println(res);
    }
}
/*
public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        char[] s = scanner.nextLine().toLowerCase().toCharArray();

        for (int i = 0; i < s.length - 2; ++i) {
            if (s[i] == 't' && s[i + 1] == 'h' && s[i + 2] == 'e') {
                System.out.println(i);
                return;
            }
        }

        System.out.println(-1);
    }
 */