import java.util.Scanner;

/**
 * Defining methods → Find the max of three numbers
 * Given the method named getNumberOfMaxParam that takes three integer numbers.
 * It should return the number of the first max in the order of the method parameters.
 *
 * The first parameter has the number 1, the second one is 2, the third one is 3.
 *
 * Write a body of the method.
 * Sample Input 1: 12 3 12
 * Sample Output 1: 1
 */
//Failed test #2 of 11. Wrong answer
public class DefiningMethods15 {
    public static int getNumberOfMaxParam(int a, int b, int c) {

        int max = 1;

        if (b > a ){
            max = 2;
        } if(c > b && c > a){
            max = 3;
        }
        return max;
    }
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();

        System.out.println(getNumberOfMaxParam(a, b, c));
    }
}
