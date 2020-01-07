import java.util.Scanner;

/**
 * Multi-dimensional array → Rotate a rectange array
 * Given a rectangle array n×m in size. Rotate it by 90 degrees clockwise, by recording the result into the new array m×n in size.
 * <p>
 * Input data format
 * Input the two numbers n and m, not exceeding 100, and then an array n×m in size.
 * <p>
 * Output data format
 * Output the resulting array. Separate numbers by a single space in the output.
 * <p>
 * Sample Input 1:
 * 3 4
 * 11 12 13 14
 * 21 22 23 24
 * 31 32 33 34
 * Sample Output 1:
 * 31 21 11
 * 32 22 12
 * 33 23 13
 * 34 24 14
 */
public class MultiDimensionalArray4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int m = scanner.nextInt();
        int[][] inputArray = new int[n][m];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                int val = (i + 1) * 10 + j + 1;
                inputArray[i][j] = val;
            }
        }

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                System.out.print(inputArray[i][j] + " ");
            }
            System.out.println();
        }
    }
}
//