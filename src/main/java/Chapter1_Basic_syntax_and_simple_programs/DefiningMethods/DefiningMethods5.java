import java.util.Scanner;
/**
 * Defining methods → Calculating factorials
 * Write a method that calculates the factorial of a given number.
 * The factorial of n is calculated by the product of integer number from 1 to n (inclusive). The factorial of 0 is equal to 1.
 *
 * Sample Input 1: 0
 * Sample Output 1: 1
 * Sample Input 2: 5
 * Sample Output 2: 120
 */
public class DefiningMethods5 {
    public static long factorial(long n) {
        // write your code here
        long res = 1l;
        if(n == 0){ return 1;}
        else{
            for(int i = 2; i <= n; i++){
                res = res * i;
            }
            return res;
        }

    }

    /* Do not change code below */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        long n = Integer.parseInt(scanner.nextLine().trim());
        System.out.println(factorial(n));
    }
}
/*
public class Main {

    private static long factorial(long n) {
        long ans = 1L;

        if (n == 0L) {
            return ans;
        } else {
            for (long i = 1L; i <= n; i++) {
                ans = ans * i;
            }
            return ans;
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        long n = Integer.parseInt(scanner.nextLine().trim());
        System.out.println(factorial(n));
    }
}
 */