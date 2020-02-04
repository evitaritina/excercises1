package Chapter1_Basic_syntax_and_simple_programs.MultiDimensionalArray;
import java.util.Scanner;

/**
 * Multi-dimensional array → Maximum element in a matrix
 * Find the indexes of the initial appearance of the maximum element in a matrix.
 *
 * Input data format
 * On the input, the program receives the size of matrix n and m, and then n lines having m integer numbers in each.
 * n and m do not exceed 100.
 *
 * Output data format
 * Output two numbers: the row index and the column index, in which the greatest item in the two-dimensional array (matrix) is located.
 * If there are several such elements, output the one, which has the smaller row index;
 * and if row indexes are the same - the one having the smaller column index.
 *
 * Sample Input 1:
 * 3 4
 * 0 3 2 4
 * 2 3 5 5
 * 5 1 2 3
 * Sample Output 1:
 * 1 2
 * Sample Input 2:
 * 2 2
 * -3 -2
 * -2 -1
 * Sample Output 2:
 * 1 1
 */
public class MultiDimensionalArray12 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int m = scanner.nextInt();
        int[][] array = new int[n][m];
        for(int i = 0; i < n; i++){
            for(int j = 0; j < m; j++){
                array[i][j] = scanner.nextInt();
            }
        }
        int maxI = 0;
        int maxJ = 0;
        int maxValue = array[0][0];
        for(int i = 0; i < n; i++){

            if(array[i][0] > maxValue){
                maxI = i;
                maxJ = 0;
                maxValue = array[i][0];

            }

            for(int j = 1; j < m; j++){
                if(maxValue < array[i][j]){
                    maxI = i;
                    maxJ = j;
                    maxValue = array[i][j];
                }
            }

        }
        System.out.println(maxI +" " +maxJ);

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

        int iMax = 0;
        int jMax = 0;

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                if (matrix[iMax][jMax] < matrix[i][j]) {
                    iMax = i;
                    jMax = j;
                }
            }
        }

        System.out.println(iMax + " " + jMax);
    }
}
 */