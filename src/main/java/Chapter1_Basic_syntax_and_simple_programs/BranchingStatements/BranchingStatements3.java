import java.util.ArrayList;
import java.util.Scanner;

/**
 * Branching statements → Even or odd
 * Given a sequence of natural numbers.
 * For each number of the sequence output "even" if the number is even, otherwise, "odd".
 * If the number is equal to 0, the program must stop reading and processing numbers.
 * Input data
 * A sequence of natural numbers, each number in a new line.
 * Output data
 * The sequence of words "even" and "odd". Each word in a new line.
 */
public class BranchingStatements3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> list = new ArrayList<Integer>();


        while (scanner.hasNext()) {
            int num = scanner.nextInt();
            if (num == 0) {

                break;
            } else {
                list.add(num);
            }
        }

        for (int el : list) {
            if (el % 2 == 0) {
                System.out.println("even");
            } else {
                System.out.println("odd");
            }
        }
    }
}

/*
public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num;

        while (scanner.hasNext()) {
            num = scanner.nextInt();
            if (num == 0) {
                break;
            }

            if (num % 2 == 0) {
                System.out.println("even");
            } else {
                System.out.println("odd");
            }
        }
    }
 */