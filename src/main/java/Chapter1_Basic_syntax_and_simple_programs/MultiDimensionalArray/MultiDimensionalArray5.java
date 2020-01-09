package Chapter1_Basic_syntax_and_simple_programs.MultiDimensionalArray;

import java.util.Scanner;

/**
 * Multi-dimensional array → Cinema
 * The cinema has n rows, each consisting of m seats (n and m do not exceed 20).
 * The two-dimensional matrix stores the information on the sold tickets,
 * number 1 means that the ticket for this place is already sold, the number 0 means that the place is available.
 * You want to buy k tickets to the neighbouring seats in the same row. Find whether it can be done.
 *
 * Input data format
 * On the input, the program gets the numbers n and m.
 * Next go n lines, each containing m numbers (0 or 1), separated by spaces.
 * Next goes the number k.
 *
 * Output data format
 * The program should output the row number in which there are k consecutive available seats.
 * If there are several such rows, output the number of the smallest such row.
 * If there is no such row, output the number 0.
 *
 * Sample Input 1:
 *
 * 3 4
 * 0 1 0 1
 * 1 0 0 1
 * 1 1 1 1
 * 2
 * Sample Output 1:
 *
 * 2
 */
public class MultiDimensionalArray5 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        boolean isAvailable = false;
        int n = scanner.nextInt();
        int m = scanner.nextInt();
        int array[][] = new int[n][m];
        for(int i=0; i<n; i++){
            for(int j = 0; j < m; j++){
                array[i][j] = scanner.nextInt();

            }
        }
        int k = scanner.nextInt();

        for(int i=0; i<n; i++){
            for(int j = 0; j < m; j++) {
                System.out.print(array[i][j] + " ");
            }
            System.out.println();
        }

        //  int freePlaces = 0;
        int row = 0;
        for(int i = 0; i < n; i++){
            int freePlaces = 0;
            if(isAvailable == true){break; }
            for(int j = 0; j < m; j++){
                if(array[i][j] == 0){
                    freePlaces = freePlaces +1;
                    if(freePlaces == k){
                        isAvailable = true;
                        //  System.out.println(row+1);
                        row = i + 1;
                        break;}
                } else {  freePlaces = 0;  }

            }

        }
        System.out.println(row);
    }
}
/*
import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[][] matrix = new int[scanner.nextInt()][scanner.nextInt()];
        for (int i = 0; i < matrix.length; ++i) {
            for (int j = 0; j < matrix[i].length; ++j) {
                matrix[i][j] = scanner.nextInt();
            }
        }

        int required = scanner.nextInt();
        int result = 0;

        for (int i = 0; i < matrix.length; ++i) {
            int count = 0;
            for (int j = 0; j < matrix[i].length; ++j) {
                if (matrix[i][j] == 0) {
                    ++count;
                    if (count == required) {
                        result = i + 1;
                        break;
                    }
                } else {
                    count = 0;
                }
            }
            if (result != 0) {
                break;
            }
        }

        System.out.println(result);
    }
}
 */