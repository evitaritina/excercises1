import java.util.Scanner;
/**
 * Defining methods → Raise to the power
 * Given the method power that takes two int numbers n and m.
 * The method should return the value of nm as a long value.
 *
 * Write a body of the method.
 * Sample Input 1: 4 3
 * Sample Output 1: 64
 * Sample Input 2: 5 0
 * Sample Output 2: 1
 * Sample Input 3: 10 10
 * Sample Output 3: 10000000000
 */
public class DefiningMethods16 {
    public static long power(int n, int m) {
        long res = n;
        if(m ==0){
            res = 1;
        }
        for(int i = 2; i <= m; i++){
            res = res * n;
        }
        return res;
    }

    /* Do not change code below */
    public static void main(String[] args) {
        final Scanner scanner = new Scanner(System.in);
        final int n = scanner.nextInt();
        final int m = scanner.nextInt();
        System.out.println(power(n, m));
    }
}
/*
public class Main {

    public static long power(int n, int m) {
        return (long) Math.pow(n, m);
    }

    public static void main(String[] args) {
        final Scanner scanner = new Scanner(System.in);

        final int n = scanner.nextInt();
        final int m = scanner.nextInt();

        System.out.println(power(n, m));
    }
}
 */