package Chapter1_Basic_syntax_and_simple_programs.MultiDimensionalArray;
import java.util.Scanner;

/**
 * Multi-dimensional array → Symmetric matrix
 * Given the number n, not exceeding 10, and a matrix of size n × n.
 *
 * Check whether this matrix is symmetric in relation to the main diagonal.
 * Output the word “YES”, if it is symmetric and the word “NO” otherwise.
 *
 * Sample Input 1:
 *
 * 3
 * 0 1 2
 * 1 2 3
 * 2 3 4
 * Sample Output 1:
 *
 * YES
 */
public class MultiDimensionalArray11 {
    static boolean checkSymmetric(int[][] array){
        boolean isSym = true;
        for(int i = 0; i < array.length; i++){
            for(int j = 0; j < array.length; j++){
                if(array[i][j] == array[j][i]){
                    isSym = true;
                } else {
                    isSym = false;
                    break;
                }
                isSym = array[i][j] == array[j][i] ? true : false;
            }
            if (isSym == false){break;}
        }
        String answ = isSym == true? "YES" : "NO";
        System.out.println(answ);
        return isSym;


    }
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[][] array = new int[n][n];
        for(int i = 0; i < n; i++){
            for(int j = 0; j < n; j++){
                array[i][j] = scanner.nextInt();
            }
        }
        checkSymmetric(array);



    }
}
/*
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int len = scanner.nextInt();
        int[][] numbers = new int[len][len];

        for (int i = 0; i < len; i++) {
            for (int j = 0; j < len; j++) {
                numbers[i][j] = scanner.nextInt();
            }
        }

        for (int i = 0; i < numbers.length; i++) {
            for (int j = i + 1; j < numbers.length; j++) {
                if (numbers[i][j] != numbers[j][i]) {
                    System.out.println("NO");
                    return;
                }
            }
        }

        System.out.println("YES");
    }
}
 */
/*
class Main {

    public static void main(String[] args) {
        final Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[][] m = new int[n][n];
        for (int i = 0; i < m.length; ++i) {
            for (int j = 0; j < m[i].length; j++) {
                m[i][j] = sc.nextInt();
            }
        }

        boolean isSymmetric = true;
        for (int i = 0; i < m.length && isSymmetric; i++) {
            for (int j = 0; j < m[i].length; j++) {
                if (m[i][j] != m[j][i]) {
                    isSymmetric = false;
                    break;
                }
            }
        }
        System.out.println(isSymmetric ? "YES" : "NO");
    }
}
 */