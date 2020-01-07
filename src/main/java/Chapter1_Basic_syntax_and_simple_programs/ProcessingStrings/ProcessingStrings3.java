import java.util.Scanner;

/**
 * Processing strings → Cutting out the middle of a string
 * Write a program that reads a string, and then outputs the string without its middle character when the length is odd,
 * and without the middle 2 characters when the length is even.
 */
public class ProcessingStrings3 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();
        int size = str.length();
        if(size >= 2 && size % 2 == 0){

            String sub1 = str.substring(0, size/2-1);
            String sub2 = str.substring(size/2+1, size);
            str = sub1 + sub2;

        }
        else{

            String sub1 = str.substring(0, size/2);
            String sub2 = str.substring(size/2+1, size);
            str = sub1 + sub2;

        }
        System.out.println(str);
    }
}
/*
public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char[] chars = (sc.nextLine()).toCharArray();

        if (chars.length % 2 == 0) {
            for (int i = 0; i < chars.length / 2 - 1; i++) {
                System.out.print(chars[i]);
            }
            for (int i = chars.length / 2 + 1; i < chars.length; i++) {
                System.out.print(chars[i]);
            }
        } else {
            for (int i = 0; i < (chars.length - 1) / 2; i++) {
                System.out.print(chars[i]);
            }
            for (int i = (chars.length - 1) / 2 + 1; i < chars.length; i++) {
                System.out.print(chars[i]);
            }
        }
    }
 */