import java.util.Scanner;

/**
 * Branching statements → The sequence
 * Typical task for a job interview.
 * Write a program that prints a part of the sequence 1 2 2 3 3 3 4 4 4 4 5 5 5 5 5 ... (the number is repeated as many times, to what it equals to).
 * The input to the program is a positive integer n: the number of the elements of the sequence the program should print.
 * Output the sequence of numbers, written in a single line, space-separated.
 * <p>
 * For example, if n = 7, then the program should output 1 2 2 3 3 3 4.
 */
public class BranchingStatements16 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numberOfTheElements = scanner.nextInt();
        int counter = 1;
        for (int i = 1; i <= numberOfTheElements; i++) {
            int el = i;
            for (int j = 1; j <= el; j++) {
                if (counter > numberOfTheElements) {
                    break;
                }
                System.out.print(el + " ");
                counter++;
            }
        }
    }
}
/*
 public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        int current = 1;
        int count = 0;

        while (count != n) {
            for (int i = 0; i < current; i++) {
                System.out.print(current + " ");
                count += 1;

                if (count == n) {
                    break;
                }
            }
            current += 1;
        }
    }
 */
