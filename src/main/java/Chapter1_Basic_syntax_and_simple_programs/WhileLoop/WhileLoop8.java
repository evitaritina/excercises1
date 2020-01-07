import java.util.Scanner;

/**
 * The while and do-while loops → The sequence
 * Given a sequence of natural numbers, not exceeding 30000.
 * Find the maximum element divisible by 4. As input, the program gets the number of elements in the sequence,
 * and then the elements themselves. In the sequence, there is always an element divisible by 4.
 * The number of elements does not exceed 1000. The program should print a single number:
 * the maximum element of the sequence divisible by 4.
 */
public class WhileLoop8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int len = scanner.nextInt();
        int start = 0;
        int yep;
        int ans = 0;

        while (start < len) {
            yep = scanner.nextInt();
            start++;

            if (yep % 4 == 0 && yep > ans) {
                ans = yep;
            }
        }

        System.out.println(ans);
    }
}
