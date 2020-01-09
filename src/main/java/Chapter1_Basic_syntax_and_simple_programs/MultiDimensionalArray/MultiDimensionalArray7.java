package Chapter1_Basic_syntax_and_simple_programs.MultiDimensionalArray;

import java.util.Scanner;

/**
 * Multi-dimensional array → Swap the columns
 * Given a two-dimensional array (matrix) and the two numbers: i and j.
 * Swap the columns with indexes i and j within the matrix.
 * <p>
 * Input contains matrix dimensions n and m, not exceeding 100, then the elements of the matrix, then the indexes i and j.
 * <p>
 * Sample Input 1:
 * <p>
 * 3 4
 * 11 12 13 14
 * 21 22 23 24
 * 31 32 33 34
 * 0 1
 * Sample Output 1:
 * <p>
 * 12 11 13 14
 * 22 21 23 24
 * 32 31 33 34
 */
public class MultiDimensionalArray7 {

    static void swapColumns(int[][] array, int i, int n, int m) {
        for (int z = 0; z < i; z++) {
            int t = array[z][n];
            array[z][n] = array[z][m];
            array[z][m] = t;
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int i = scanner.nextInt();
        int j = scanner.nextInt();
        int[][] array = new int[i][j];
        for (int k = 0; k < i; k++) {
            for (int l = 0; l < j; l++) {
                array[k][l] = scanner.nextInt();
            }
        }
        int n = scanner.nextInt();
        int m = scanner.nextInt();

        swapColumns(array, i, n, m);

        for (int k = 0; k < i; k++) {
            for (int l = 0; l < j; l++) {
                System.out.print(array[k][l]+ " ");
            }
            System.out.println();
        }
    }
}

/*
public class Main {

    public static void main(String[] args) {
        final Scanner scanner = new Scanner(System.in);

        final int n = scanner.nextInt();
        final int m = scanner.nextInt();
        final int[][] matrix = new int[n][m];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                matrix[i][j] = scanner.nextInt();
            }
        }

        final int firstColumn = scanner.nextInt();
        final int secondColumn = scanner.nextInt();

        for (int i = 0; i < matrix.length; i++) {
            final int tmp = matrix[i][firstColumn];
            matrix[i][firstColumn] = matrix[i][secondColumn];
            matrix[i][secondColumn] = tmp;
        }

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }
}
 */