package Chapter1_Basic_syntax_and_simple_programs.MultiDimensionalArray;

import java.util.Scanner;

/**
 * Multi-dimensional array → The star figure
 * Given an odd number n, not exceeding 15. Create a two-dimensional array (matrix) from n×n elements,
 * by filling it with "." symbols (each element of the matrix is a string containing a single symbol).
 * Then fill the middle row of the matrix, the middle column, and the main and the secondary diagonals with the "*" symbols.
 * As a result, all "*"s in the array must form the star figure. Output this matrix; elements of the array should be space separated.
 *
 * Sample Input 1:
 *
 * 5
 * Sample Output 1:
 *
 *  * . * . *
 *  . * * * .
 *  * * * * *
 *  . * * * .
 *  * . * . *
 */
public class MultiDimensionalArray8 {
    static void rewriteStars(char array [][], int n){
        int mid = n / 2;
        for(int i = 0; i< n; i++){
            for(int j = 0; j < n; j++){
                if(i == mid || j == mid || i == j || (i + j) == n-1){
                    array[i][j] = '*';
                }
            }
        }


    }
    static void inputArray(char array[][], int n){
        for(int i = 0; i< n; i++){
            for(int j = 0; j < n; j++){
                array[i][j] = '.';
            }
        }
    }
    static void outputArray(char array[][]){
        //      for(int i = 0; i< array.length; i++){
        //          for(int j = 0; j < array.length; j++){
        //                     System.out.print(array[i][j]+ " ");
        //                   }
        //         System.out.println();
        //     }
        //for each loop
        for (char[] arr : array) {
            for (char v : arr) {
                System.out.print(" " + v);
            }
            System.out.println();
        }
    }

    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        char[][] array = new char[n][n];
        inputArray(array, n);
        rewriteStars(array, n);
        outputArray(array);

    }
}
/*
import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        final Scanner scanner = new Scanner(System.in);

        final int size = scanner.nextInt();
        final char[][] matrix = new char[size][size];
        for (int i = 0; i < matrix.length; i++) {
            Arrays.fill(matrix[i], '.');
        }

        for (int i = 0; i < matrix.length; i++) {
            matrix[i][i] = '*';
            matrix[i][matrix.length - 1 - i] = '*';
            matrix[i][matrix.length / 2] = '*';
            matrix[matrix.length / 2][i] = '*';
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