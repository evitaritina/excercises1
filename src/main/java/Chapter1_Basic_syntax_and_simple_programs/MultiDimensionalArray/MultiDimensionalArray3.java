import java.util.Scanner;

/**
 * Multi-dimensional array → Fill the matrix by numbers
 * Fill the matrix
 * Given the number n, not greater than 100. Create the matrix of size n×n and fill it by the following rule.
 * Numbers 0 should be stored on the primary diagonal.
 * The two diagonals, adjacent to the primary one, should contain numbers 1. The next two diagonals - numbers 2, etc.
 *
 * Sample Input 1: 5
 * Sample Output 1:
 * 0 1 2 3 4
 * 1 0 1 2 3
 * 2 1 0 1 2
 * 3 2 1 0 1
 * 4 3 2 1 0
 */
public class MultiDimensionalArray3 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int array[] [] = new int[n][n];

        for(int i = 0; i < n; i++){
            for(int j = 0; j < n; j++){
                int sum = Math.abs(i-j);
                array[i][j] = sum;
            }
        }
        for(int i = 0; i < n; i++){

            for(int j = 0; j < n; j++){
                System.out.print(array[i][j] + " ");
            }
            System.out.println();
        }

    }

}
/*
mport java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        final Scanner scanner = new Scanner(System.in);
        final int size = scanner.nextInt();
        final int[][] matrix = new int[size][size];

        for (int i = 0; i < size; i++) {
            for (int j = 0; i + j < size; j++) {
                matrix[j][i + j] = i;
                matrix[i + j][j] = i;
            }
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