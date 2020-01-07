import java.util.Scanner;
/**
 * Defining methods → Composite numbers
 * Write a method that tests the given number is composite or not.
 * The composite number is a positive integer that has at least one divisor other than 1 and itself.
 *
 * The method should return a value of the boolean type.
 * Sample Input 1: 1
 * Sample Output 1: false
 * Sample Input 2: 2
 * Sample Output 2: false
 * Sample Input 3: 4
 * Sample Output 3: true
 */
public class DefiningMethods17 {
    public static boolean isComposite(long number) {
        // write your code here
        boolean res = false;
        int counter = 0;
        if(number == 1 || number ==2){res = false;}
        for(int i = 2; i < number; i++){
            if(number % i == 0){
                counter = counter +1;
            }
        }
        if (counter > 0){
            res = true;
        }

        return res;
    }

    /* Do not change code below */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        final long number = scanner.nextLong();
        System.out.println(isComposite(number));
    }
}
/*
public class Main {

    public static boolean isComposite(long number) {
        for (int i = 2; i < (int) Math.sqrt(number) + 1; i++) {
            if (number % i == 0) {
                return true;
            }
        }

        return false;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        final long number = scanner.nextLong();
        System.out.println(isComposite(number));
    }
}
 */