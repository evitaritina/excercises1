package Chapter1_Basic_syntax_and_simple_programs.MultiDimensionalArray;
import java.util.Arrays;
import java.util.Scanner;

import static java.util.Arrays.*;

/**
 * Multi-dimensional array → Check sudoku
 * N-size sudoku is a game with a square table of N2 width and height divided into N2 smaller squares of N width and height.
 * In a solved state, each of this smaller squares, as well as each row and column of a full square, contains all numbers from 1 to N2 without repetition.
 *
 * Given a number N on the first line and a full sudoku table on the next N2 lines. Every line contains N2 integers.
 *
 * Your task is to determine whether this sudoku is solved or not. Output "YES" if this sudoku table is solved, otherwise "NO".
 *
 * N can be from 1 to 10.
 *
 * Sample Input 1:
 * 3
 * 5 8 9 6 7 4 2 1 3
 * 7 4 3 1 8 2 9 5 6
 * 1 2 6 9 5 3 8 7 4
 * 9 3 5 4 2 1 7 6 8
 * 4 1 2 8 6 7 3 9 5
 * 6 7 8 3 9 5 1 4 2
 * 8 6 4 2 1 9 5 3 7
 * 3 9 7 5 4 8 6 2 1
 * 2 5 1 7 3 6 4 8 9
 * Sample Output 1:  YES
 * Sample Input 2:
 * 2
 * 1 1 2 2
 * 1 1 2 2
 * 3 3 4 4
 * 3 3 4 4
 * Sample Output 2: NO
 * Sample Input 3:
 * 1
 * 1
 * Sample Output 3: YES
 */
public class MultiDimensionalArray13 {

/*
    public static void arrayOutput(int[][] array) {
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length; j++) {
                System.out.print(array[i][j] + " ");

            }
            System.out.println();
        }
    }
*/

    public static void main(String[] args) {

        String res = " YES";
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[][] array = new int[n * n][n * n];
        for (int i = 0; i < n * n; i++) {
            for (int j = 0; j < n * n; j++) {
                array[i][j] = scanner.nextInt();
            }
        }

        // generate result set
        final int[] generateNumberSet;
        generateNumberSet = new int[n * n];
        int counter = 1;
        for (int i = 0; i < generateNumberSet.length; i++) {
            generateNumberSet[i] = counter;
            counter = counter + 1;
        }


        //get rows numbers and compare with result set
        int[] rowNumbersSet = new int[array.length];

        //This for loop can be replaced by a foreach loop
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length; j++) {
                rowNumbersSet[j] = array[i][j];
            }

            sort(rowNumbersSet);
            //Unnecessary use of fully qualified name 'Arrays.equals' due to existing static import 'java.util.Arrays.*'
            res = !Arrays.equals(generateNumberSet, rowNumbersSet) ? "NO" : "YES";

            //This statement should have braces
            //Use equals() to compare strings instead of '==' or '!='
            if (res == "NO") break;
        }
//get columns numbers and compare with result set
        int[] columnNumbersSet = new int[array.length];
        //This for loop can be replaced by a foreach loop
        for (int i = 0; i < array.length; i++) {

            //his statement should have braces
            //Use equals() to compare strings instead of '==' or '!='
            if (res == "NO") break;
            for (int j = 0; j < array.length; j++) {
                columnNumbersSet[j] = array[j][i];
            }

            sort(columnNumbersSet);
            //Unnecessary use of fully qualified name 'Arrays.equals' due to existing static import 'java.util.Arrays.*'
            res = !Arrays.equals(generateNumberSet, columnNumbersSet) ? "NO" : "YES";
        }

        int[] square = new int[n * n];
        int iterator = 1;
        int c = 0;
        int d = 0;
        //Use equals() to compare strings instead of '==' or '!='
        while(res == "YES" && iterator <= n * n){

            int w = 0;
            for (int i = d; i < d + n; i++) {

                for (int j = c; j < c + n; j++) {

                    square[w] = array[i][j];
                    w++;
                }
            }
            sort(square);
            //Unnecessary use of fully qualified name 'Arrays.equals' due to existing static import 'java.util.Arrays.*'
            res = !Arrays.equals(generateNumberSet, square) ? "NO" : "YES";
            iterator++;
            c = c + n;
            if( c == n* n) {d = d + n;  c = 0;}
        }

        System.out.println(res);



    }

}
/*
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        int maxNum = n * n;

        int[][] table = new int[maxNum][maxNum];
        boolean solved = true;

        for (int row = 0; row < maxNum; row++) {
            for (int col = 0; col < maxNum; col++) {
                table[row][col] = scanner.nextInt();
            }
        }

        for (int row = 0; row < maxNum; row++) {
            for (int col = 0; col < maxNum; col++) {
                if (table[row][col] <= 0 || table[row][col] > maxNum) {
                    solved = false;
                }

                for (int i = 0; i < maxNum; i++) {
                    if (row != i && table[row][col] == table[i][col]) {
                        solved = false;
                    }

                    if (col != i && table[row][col] == table[row][i]) {
                        solved = false;
                    }
                }

                int startRow = row - (row % n);
                int startCol = col - (col % n);

                for (int r = startRow; r < startRow + n; r++) {
                    for (int c = startCol; c < startCol + n; c++) {
                        if ((row != r || col != c) && table[row][col] == table[r][c]) {
                            solved = false;
                        }
                    }
                }
            }
        }

        System.out.println(solved ? "YES" : "NO");
    }
    }
 */