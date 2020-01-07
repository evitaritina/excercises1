import java.util.Scanner;

/**
 * The while and do-while loops → The smallest value
 * A user inputs a long number M. You need to find out what is the smallest long number n such that n! > M.
 */
public class WhileLoop5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        long b = scanner.nextLong();
        long a = 1L;
        long res = 1L;
        do {
            res = res * (a + 1);

            a++;

        } while (res <= b);
        if (b == 1) {
            a = 0L;
        }
        System.out.println(a);


    }
}
/*
public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        long number = scanner.nextLong();
        long res = 1;
        int mult = 1;

        while (res <= number) {
            mult++;
            res *= mult;
        }

        System.out.print(mult);
    }
 */