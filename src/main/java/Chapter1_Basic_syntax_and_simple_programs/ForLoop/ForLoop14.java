import java.util.Scanner;

/**
 * The for-loop → Fizz Buzz
 * Fizz Buzz is a classic programming problem. Here is its slightly modified version.
 * Write a program that takes the input of two integers: the beginning and the end of the interval
 * (both numbers belong to the interval).
 * <p>
 * The program should output the numbers from this interval,
 * but if the number is divisible by 3, you should output Fizz instead of it;
 * if the number is divisible by 5, output Buzz; and if it is divisible both by 3 and by 5, output FizzBuzz.
 * <p>
 * Output each number or the word on a separate line.
 */
public class ForLoop14 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int beg = scanner.nextInt();
        int end = scanner.nextInt();
String str1;
        for (int i = beg; i <= end; i++) {
            if (i % 5 == 0 && i % 3 == 0) {
                str1 =  "FizzBuzz";
            } else if (i % 5 == 0) {
                str1 = "Buzz";
            } else if (i % 3 == 0) {
               str1 = "Fizz";
            } else{
               str1 = Integer.toString(i);
            }

            System.out.println(str1);

        }

    }
}
/*
public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int begin = scanner.nextInt();
        int end = scanner.nextInt();

        for (int n = begin; n <= end; n++) {
            if (n % 3 == 0 && n % 5 == 0) {
                System.out.println("FizzBuzz");
            } else if (n % 3 == 0) {
                System.out.println("Fizz");
            } else if (n % 5 == 0) {
                System.out.println("Buzz");
            } else {
                System.out.println(n);
            }
        }
    }
 */