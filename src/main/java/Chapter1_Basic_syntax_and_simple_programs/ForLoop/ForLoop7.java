/**
 * The for-loop → Maximum element divisible by 4
 * Given a sequence of natural numbers, not exceeding 30000. Find the maximum element divisible by 4.
 * The program receives the number of elements in the sequence and then the elements themselves as input.
 * In the sequence, there is always an element divisible by 4. The number of elements does not exceed 1000.
 * The program should print a single number: the maximum element of the sequence divisible by 4.
 */

import java.util.Scanner;

public class ForLoop7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int len = scanner.nextInt();
        int el = 4;


        for (int i = 0, n; i < len; i++) {
            n = scanner.nextInt();
            if (n % 4 == 0 && n > el) {
                el = n;
            }

        }
        /*
           Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int current_max = 0;
        int num;

        for (int i = 0; i < n; i++) {
            num = scanner.nextInt();
            if (num % 4 == 0 && num > current_max){
                current_max = num;
            }
        }
        System.out.println(current_max);
         */

        System.out.println(el);
    }
}
