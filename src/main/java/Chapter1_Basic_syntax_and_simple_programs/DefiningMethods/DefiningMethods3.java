import java.util.Scanner;
/**
 * Defining methods → Integer part of a number
 * Given the method named extractInt that takes a double value and returns an integer value.
 *
 * Write a body of the method. It should return only the integer part of the given value.
 *
 * Sample Input 1: 0.55
 * Sample Output 1: 0
 *
 * Sample Input 2: 3.12
 * Sample Output 2: 3
 */
public class DefiningMethods3 {
    public static int extractInt(double d) {
        // write your code here
        int res;
        res = (int) (d);
        return res;
    }

    /* Do not change code below */
    public static void main(String args[]) {
        final Scanner scanner = new Scanner(System.in);
        final double d = scanner.nextDouble();
        System.out.println(extractInt(d));
    }
}
/*
public class Main {

    public static int extractInt(double d) {
        return (int) d;
    }

    public static void main(String[] args) {
        final Scanner scanner = new Scanner(System.in);
        final double d = scanner.nextDouble();
        System.out.println(extractInt(d));
    }
}
 */