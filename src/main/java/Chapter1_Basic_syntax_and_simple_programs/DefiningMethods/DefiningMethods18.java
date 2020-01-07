import java.util.Scanner;
/**
 * Defining methods → The sign of a number
 * Write a method with the name sign that takes an int number and checks whether the number is negative, positive or zero.
 * The method should return -1, +1 or 0 respectively.
 *
 * Sample Input 1: 11
 * Sample Output 1: 1
 * Sample Input 2: 0
 * Sample Output 2: 0
 * Sample Input 3: -3
 * Sample Output 3: -1
 */
public class DefiningMethods18 {
    public static int sign(int number) {
        int res = 0;
        if(number == 0){ res = 0;
        } else if(number > 0){res = 1;
         } else if(number < 0) {
            res = -1;
        } return res;
           }

    /* Do not change code below */
  //  public static void main(String[] args) {
    public static void main(String args){
        final Scanner scanner = new Scanner(System.in);
        final int n = scanner.nextInt();
        System.out.println(sign(n));
    }
}
/*
public class Main {

    public static int sign(int number) {
        if (number > 0) {
            return 1;
        } else if (number < 0) {
            return -1;
        } else {
            return 0;
        }
    }

    public static void main(String[] args) {
        final Scanner scanner = new Scanner(System.in);
        final int n = scanner.nextInt();
        System.out.println(sign(n));
    }
}
 */