import java.util.Scanner;

/**
 * Branching statements → The integer barrier
 * Write a program that reads a sequence of integer numbers in a loop and adds up all numbers.
 * If a new number is equal to 0, the program must stop the loop and output the accumulated sum.
 * When the sum is equal or exceeded 1000 (the barrier), the program should also stop and output the value equal to sum - 1000.
 * <p>
 * Note, the input can contain extra numbers. Just ignore them.
 */
public class BranchingStatements17 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int res = 0;
        boolean calc = true;
        while (scanner.hasNextInt() && calc) {
            int num = scanner.nextInt();
            res = res + num;
            if (res >= 1000) {
                res = res - 1000;
                calc = false;
            }
            if (num == 0) {
                calc = false;
            }

        }
        System.out.println(res);

    }
}
/*
public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int input;
        int sum = 0;

        while ((input = scanner.nextInt()) != 0) {
            sum += input;
            if (sum >= 1000) {
                sum = sum - 1000;
                break;
            }
        }

        System.out.println(sum);
    }
}
 */