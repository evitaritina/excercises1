import java.util.Scanner;

/**
 * Processing strings → Move the first N characters
 * Write a program that reads a string s and an int n, and then moves the first n characters of s to the end of the string.
 * The program must output the changed string. If n is greater than the length of the string, it must output the string unchanged.
 *
 * Note, the substring method can help you, but you may choose another way to solve the problem.
 *
 * Input data format
 * The single input line contains s and n separated by a space.
 */
public class ProcessingStrings4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        String[] array = input.split(" ");
        int size = 0;
        int n = 0;
        String word = "";
        for( int i=0; i<2; i++){
            word = array[0];
            size = word.length();
            n = Integer.parseInt(array[1]);
        }

        if(n < size){

            String sub1 = word.substring(0,n);
            String sub2 = word.substring(n);
            word = sub2 + sub1;

        }
        System.out.println(word);

    }

}
/*
public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String str = scanner.next();
        int offset = scanner.nextInt();

        if (offset < str.length()) {
            System.out.print(str.substring(offset) + str.substring(0, offset));
        } else {
            System.out.println(str);
        }
    }
 */