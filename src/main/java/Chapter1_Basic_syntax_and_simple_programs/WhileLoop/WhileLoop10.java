import java.util.Scanner;

/**
 * The while and do-while loops → The sum of elements
 * Find the sum of all elements of a sequence, ending with the number 0.
 * <p>
 * The number 0 itself is not included into the sequence and serves as a sign of cessation.
 */
public class WhileLoop10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int sum = 0;

        while (scanner.hasNext()) {
            int el = scanner.nextInt();
            if (el == 0) {
                break;

            } else {
                sum = sum + el;
            }
        }
        System.out.println(sum);
    }
}
/*
 public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int sum = 0;
        int number;

        do {
            number = scanner.nextInt();
            sum += number;
        } while (number != 0);

        System.out.println(sum);
    }
 */