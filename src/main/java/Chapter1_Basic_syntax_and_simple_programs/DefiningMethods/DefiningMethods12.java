import java.util.Scanner;
/**
 * Defining methods → Sum of numbers in the range
 * Implement a method sumInRange for calculating the sum of numbers in the range from (inclusive), to (exclusive).
 *
 * Sample Input 1: 1 2
 * Sample Output 1: 1
 * Sample Input 2: 5 5
 * Sample Output 2: 0
 * Sample Input 3: 10 15
 * Sample Output 3: 60
 */
public class DefiningMethods12 {

    /**
     * The method calculates the sum of integers in a given range
     *
     * @param from inclusive
     * @param to exclusive
     *
     * @return the sum (long)
     */
    public static long sumInRange(int from, int to) {
        // write your code here
        long res = 0L;
        for(int i = from; i < to; i++){
            res = res + i;
        }
        return res;
    }

    /* Do not change code below */
    public static void main(String[] args) {
        final Scanner scanner = new Scanner(System.in);

        int from = scanner.nextInt();
        int to = scanner.nextInt();

        System.out.println(sumInRange(from, to));
    }
}
/*
public class Main {

    /**
     * The method calculates the sum of integers in a given range
     *
     * @param from inclusive
     * @param to   exclusive
     * @return the sum (long)

public static long sumInRange(int from, int to) {
    long sum = 0;
    for (int i = from; i < to; ++i) {
        sum += i;
    }
    return sum;
}

    public static void main(String[] args) {
        final Scanner scanner = new Scanner(System.in);

        int from = scanner.nextInt();
        int to = scanner.nextInt();

        System.out.println(sumInRange(from, to));
    }
}
 */