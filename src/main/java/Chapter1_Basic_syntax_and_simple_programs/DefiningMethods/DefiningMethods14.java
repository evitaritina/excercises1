import java.util.Scanner;
/**
 * Defining methods → Division
 * Given the method named divide that takes two long numbers and returns a double value.
 *
 * Write a body of the method. It should return the result of the division of the first argument by the second one.
 * It's guaranteed the second argument is not equal to zero.
 *
 * Sample Input 1: 500000000000 200000000000
 * Sample Output 1: 2.5
 */
public class DefiningMethods14 {
    public static double divide(long a, long b) {
        // write your code here

        return (double)  a / b;
    }

    /* Do not change code below */
    public static void main(String args[]) {
        final Scanner scanner = new Scanner(System.in);
        final long a = scanner.nextLong();
        final long b = scanner.nextLong();
        System.out.println(divide(a, b));
    }
}
