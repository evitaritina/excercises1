package Chapter1_Basic_syntax_and_simple_programs.MultiDimensionalArray;

import java.util.Scanner;

/**
 * Multi-dimensional array → Spiral
 * Output the matrix of size n × n, filled by the integers from 1 to n^2
 * in a spiral, coming from the top left corner and twisted clockwise, as shown in the example (here n=5n=5).
 * <p>
 * Sample Input 1:
 * <p>
 * 5
 * Sample Output 1:
 * <p>
 * 1 2 3 4 5
 * 16 17 18 19 6
 * 15 24 25 20 7
 * 14 23 22 21 8
 * 13 12 11 10 9
 */
public class MultiDimensionalArray9 {

    static int num = 1;

    static void fillArrayDefault(int[][] array, int n) {


        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                array[i][j] = num;
                num++;
            }
        }
        num = 1;
    }

    static void outputArray(int[][] array) {
        for (int[] el : array) {
            for (int e : el) {
                System.out.print(e + " ");
            }
            System.out.println();
        }
    }

    // Function print matrix in spiral form
    static void convertToSpiral(int n) {
        int[][] arrayConverted = new int[n][n];
        int firstRowIndex = 0, firstColumnIindex = 0;
        /*  k - starting row index
            m - ending row index
            l - starting column index
            n - ending column index
            i - iterator
        */
        int lastRowIndex = n;

        int num1 = 1;
        while (firstRowIndex < lastRowIndex && firstColumnIindex < n) {

            // Print the first row from the remaining rows
            for (int i = firstColumnIindex; i < n; i++) {
                arrayConverted[firstRowIndex][i] = num1;
                System.out.print(arrayConverted[firstRowIndex][i] + " ");
                num1 = num1 + 1;
            }
            firstRowIndex++;


            // Print the last column from the remaining columns
            for (int i = firstRowIndex; i < lastRowIndex; i++) {
                arrayConverted[i][n - 1] = num1;
                System.out.print(arrayConverted[i][n - 1] + " ");
                num1 = num1 + 1;
            }
            n--;

            // Print the last row from the remaining rows */
            if (firstRowIndex < lastRowIndex) {
                for (int i = n - 1; i >= firstColumnIindex; i--) {
                    arrayConverted[lastRowIndex - 1][i] = num1;
                    System.out.print(arrayConverted[lastRowIndex - 1][i] + " ");
                    num1 = num1 + 1;
                }
                lastRowIndex--;
            }

            // Print the first column from the remaining columns */
            if (firstColumnIindex < n) {
                for (int i = lastRowIndex - 1; i >= firstRowIndex; i--) {
                    arrayConverted[i][firstColumnIindex] = num1;
                    System.out.print(arrayConverted[i][firstColumnIindex] + " ");
                    num1 = num1 + 1;
                }
                firstColumnIindex++;
            }

        }
        System.out.println();
        for (int[] el : arrayConverted) {
            for (int e : el) {
                System.out.print(e + " ");
            }
            System.out.println();
        }
    }


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[][] array = new int[n][n];
        int[][] arrayConverted = new int[n][n];
        fillArrayDefault(array, n);
        outputArray(array);
        convertToSpiral(n);


    }
}
/*
class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[][] spiral = new int[n][n];

        int value = 1;
        int minCol = 0;
        int maxCol = n - 1;
        int minRow = 0;
        int maxRow = n - 1;

        while (value <= n * n) {
            for (int i = minCol; i <= maxCol; i++) {
                spiral[minRow][i] = value;
                value++;
            }
            for (int i = minRow + 1; i <= maxRow; i++) {
                spiral[i][maxCol] = value;
                value++;
            }
            for (int i = maxCol - 1; i >= minCol; i--) {
                spiral[maxRow][i] = value;
                value++;
            }
            for (int i = maxRow - 1; i >= minRow + 1; i--) {
                spiral[i][minCol] = value;
                value++;
            }
            minCol++;
            minRow++;
            maxCol--;
            maxRow--;
        }

        for (int i = 0; i < spiral.length; i++) {
            for (int j = 0; j < spiral.length; j++) {
                System.out.print(spiral[i][j] + "\t");
            }
            System.out.println();
        }

    }
 */